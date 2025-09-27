"use strict";

const displayNone = function(el) {
  el.style.display = "none";
}

// Função para limpar campos de input
const limparCampos = function (el) {
  el.value = "";
};

// Função para estilizar o elemento passado e mostrar a mensagem desejada
const messageUser = function (el, message, typeMessage) {
  el.style.color = `${typeMessage === "success" ? "green" : "red"}`;
  el.style.fontWeight = "500";
  el.textContent = message;
  return el;
};

// Utility Functions
function showPage(pageId) {
  // Hide all containers
  document.querySelectorAll(".container").forEach((container) => {
    container.style.display = "none";
  });
  // Show the selected container
  document.getElementById(pageId).style.display = "block";
}

function validateEmail(email) {
  const re = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  return re.test(email);
}

function validatePassword(password) {
  const hasLength = password.length >= 8;
  const hasUpper = /[A-Z]/.test(password);
  const hasNumber = /[0-9]/.test(password);
  const hasSpecial = /[!@#$%^&*]/.test(password);

  document.getElementById("lengthCheck").classList.toggle("valid", hasLength);
  document.getElementById("upperCheck").classList.toggle("valid", hasUpper);
  document.getElementById("numberCheck").classList.toggle("valid", hasNumber);
  document.getElementById("specialCheck").classList.toggle("valid", hasSpecial);

  return hasLength && hasUpper && hasNumber && hasSpecial;
}

// Event Listeners
document
  .getElementById("forgotPasswordForm")
  .addEventListener("submit", function (e) {
    e.preventDefault();

    const email = document.getElementById("recoveryEmail").value;
    const errorElement = document.getElementById("recoveryEmailError");
    const successElement = document.getElementById("recoverySuccess");

    if (!validateEmail(email)) {
      errorElement.style.display = "block";
      successElement.style.display = "none";
      return;
    }

    errorElement.style.display = "none";
    successElement.style.display = "block";

    setTimeout(() => {
      showPage("loginPage");
    }, 2000);
  });

document
  .getElementById("registerForm")
  .addEventListener("submit", function (e) {
    e.preventDefault();

    const name = document.getElementById("fullName").value;
    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value;
    const confirmPassword = document.getElementById("confirmPassword").value;

    let hasError = false;

    displayNone(document.getElementById("nameError"));
    displayNone(document.getElementById("emailError"))
    displayNone(document.getElementById("passwordError"))

    if (name.length < 3) {
      document.getElementById("nameError").style.display = "block";
      hasError = true;
      return;
    }

    if (!validateEmail(email)) {
      document.getElementById("emailError").style.display = "block";
      hasError = true;
      return;
    }

    if (!validatePassword(password)) {
      document.getElementById("passwordError").style.display = "block";
      document.getElementById("passwordError").textContent = "Senha inválida";
      hasError = true;
      return;
    }

    if (password !== confirmPassword) {
      document.getElementById("passwordError").style.display = "block";
      hasError = true;
      return;
    }

    document.getElementById("registerSuccess").style.display = "block";

    setTimeout(() => {
      showPage("loginPage");
      limparCampos(document.getElementById("fullName"));
      limparCampos(document.getElementById("email"));
      limparCampos(document.getElementById("password"));
      limparCampos(document.getElementById("confirmPassword"));
      displayNone(document.getElementById("registerSuccess"))
    }, 2000);
  });

document.querySelector(".btn--login").addEventListener("click", function (e) {
  e.preventDefault();

  const user = document.querySelector(".input--user-login").value;
  const password = document.querySelector(".input--password-login").value;
  const message = document.querySelector(".subtitle");

  // Validação de login e senha
  user === "admin" && password === "1234"
    ? messageUser(message, "Login bem sucedido!", "success") &&
      setTimeout(() => showPage("registerProduct"), 2000)
    : messageUser(message, "Usuário ou senha incorretos", "error");
});

document
  .querySelector(".btn--cadastro-produto")
  .addEventListener("click", function (e) {
    e.preventDefault();

    // Pega os produtos já salvos ou cria um array vazio
    const produtos = JSON.parse(localStorage.getItem("produtos")) || [];

    // Pega os valores dos inputs
    const nomeProduto = document.querySelector(".input--nome-produto").value;
    const precoProduto = Number(
      document.querySelector(".input--preco-produto").value
    );
    const quantidadeProduto = Number(
      document.querySelector(".input--estoque-produto").value
    );
    const messageEl = document.querySelector(".subtitle--produto");

    // Validação simples
    if (!nomeProduto || !precoProduto || !quantidadeProduto)
      return messageUser(messageEl, "Os campos não pode ficar vázio", "error");

    if (nomeProduto.length < 3)
      return messageUser(messageEl, "Nome de produto inválido", "error");

    if (precoProduto < 0)
      return messageUser(messageEl, "Preço inválido", "error");

    messageUser(messageEl, "Produto Cadastrado com sucesso", "success");

    // Adiciona produto ao array
    produtos.push({
      nome: nomeProduto,
      preco: precoProduto,
      quantidade: quantidadeProduto,
    });

    // Salva no localStorage
    localStorage.setItem("produtos", JSON.stringify(produtos));

    // Limpa os inputs
    document.querySelector(".input--nome-produto").value = "";
    document.querySelector(".input--preco-produto").value = "";
    document.querySelector(".input--estoque-produto").value = "";

    setTimeout(() => {
      // Mostra produtos na tela
      const lista = document.querySelector(".lista-produtos");
      lista.innerHTML = "";
      produtos.forEach((p, index) => {
        const li = document.createElement("li");
        li.style.listStyle = "none";
        li.textContent = `${p.nome} - R$${p.preco} - Qtd: ${p.quantidade}`;

        // Botão excluir
        const btnExcluir = document.createElement("button");
        btnExcluir.textContent = "Excluir";
        // btnExcluir.style.marginLeft = '10px';
        btnExcluir.addEventListener("click", () => {
          produtos.splice(index, 1); // remove do array
          localStorage.setItem("produtos", JSON.stringify(produtos)); // atualiza localStorage
          li.remove(); // remove da tela
        });

        li.appendChild(btnExcluir);
        lista.appendChild(li);
      });
    }, 2000);
  });
