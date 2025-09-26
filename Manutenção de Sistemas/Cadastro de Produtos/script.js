'use strict'

// Função para estilizar o elemento passado e mostrar a mensagem desejada
const messageUser = function(el, message, typeMessage) {
    el.style.color = `${typeMessage === 'success' ? 'green' : 'red'}`;
    el.style.fontWeight = '500';
    el.textContent = message;
}

// Utility Functions
function showPage(pageId) {
  // Hide all containers
  document.querySelectorAll('.container').forEach(container => {
    container.style.display = 'none';
  });
  // Show the selected container
  document.getElementById(pageId).style.display = 'block';
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
  
  document.getElementById('lengthCheck').classList.toggle('valid', hasLength);
  document.getElementById('upperCheck').classList.toggle('valid', hasUpper);
  document.getElementById('numberCheck').classList.toggle('valid', hasNumber);
  document.getElementById('specialCheck').classList.toggle('valid', hasSpecial);
  
  return hasLength && hasUpper && hasNumber && hasSpecial;
}

// Event Listeners
document.getElementById('forgotPasswordForm').addEventListener('submit', function(e) {
  e.preventDefault();
  const email = document.getElementById('recoveryEmail').value;
  const errorElement = document.getElementById('recoveryEmailError');
  const successElement = document.getElementById('recoverySuccess');
  
  if (!validateEmail(email)) {
    errorElement.style.display = 'block';
    successElement.style.display = 'none';
    return;
  }
  
  errorElement.style.display = 'none';
  successElement.style.display = 'block';
  
  setTimeout(() => {
    showPage('loginPage');
  }, 2000);
});

document.getElementById('registerForm').addEventListener('submit', function(e) {
  e.preventDefault();
  const name = document.getElementById('fullName').value;
  const email = document.getElementById('email').value;
  const password = document.getElementById('password').value;
  const confirmPassword = document.getElementById('confirmPassword').value;
  
  let hasError = false;
  
  if (name.length < 3) {
    document.getElementById('nameError').style.display = 'block';
    hasError = true;
    return
  }

  if(!validateEmail(email)) {
    document.getElementById('emailError').style.display = 'block';
    hasError = true;
    return
  }

  if (!validatePassword(password)) {
    document.getElementById('passwordError').style.display = 'block';
    document.getElementById('passwordError').textContent = 'Senha inválida';
    hasError = true;
    return
  }

  if (password !== confirmPassword) {
    document.getElementById('passwordError').style.display = 'block';
    document.getElementById('passwordError').textContent = 'Digite senhas iguais';
    hasError = true;
    return
  }

  document.getElementById('registerSuccess').style.display = 'block'

  setTimeout(() => {
    showPage('loginPage');
  }, 2000);

});

document.querySelector('.btn--login').addEventListener('click', function(e) {
    e.preventDefault();

    const user = document.querySelector('.input--user-login').value;
    const password = document.querySelector('.input--password-login').value;
    const message = document.querySelector('.subtitle');

    // if (!user && !password) return messageUser(message, 'Usuário ou senha incorretos', 'error')

    // Validação de login e senha 
    user === 'admin' && password === '1234' ? messageUser(message, 'Login bem sucedido!', 'success') : messageUser(message, 'Usuário ou senha incorretos', 'error');
})