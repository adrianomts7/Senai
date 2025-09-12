'use strict';

function msgError(classHtml, mensagem) {
   const mensagemErr = document.querySelector(classHtml);
   mensagemErr.style.color = 'red';
   mensagemErr.style.fontWeight = '500';
   mensagemErr.innerHTML = mensagem;
   return mensagemErr;
}

function pegandoValores(idHtml) {
    return document.getElementById(idHtml).value;
}

// Erro 1 - Função de Cálculo
function fixCalc(e) {
    e.preventDefault();

    // Pegando os dados do formulario;  
    const input1 = Number(document.querySelector('.input--calculo-1').value);
    const input2 = Number(document.querySelector('.input--calculo-2').value);
    
    const result = input1 + input2;
    document.querySelector(".resultado--calc").innerText = "Resultado correto: " + result;
    
    document.querySelector('.input--calculo-1').value = '';
    document.querySelector('.input--calculo-2').value = '';
    
}

// Erro 2 - Validação de Formulário
function fixFormValidation(date, description, responsible) {

    // Erro intencional de validação - campos não são obrigatórios corretamente
    const form = document.getElementById("maintenance-form");
        
    if (!date && !description && !responsible) {
        // document.querySelector('.validacao--form').innerHTML = 'Os campos não podem ficar vázio';  
        msgError('.validacao--form', 'Os campos não podem ficar vázio');
        return false
    }

    if (!date) {
        msgError('.validacao--form', 'Digite uma data válida');
        return false;  
    }

    if (!description) {  
        msgError('.validacao--form', 'Descriçãoo não pode ficar vázia');
        return false
    }

    if (description.length < 10) {
        msgError('.validacao--form', 'Descrição inválida');   
        return false;
    }

    if (!responsible) {
        msgError('.validacao--form', 'Digite o seu nome');
        return false;
    }

    return true
}

// Gerar relatório de manutenção
function generateReport() {
    
    // const date = document.getElementById("date").value;
    // const description = document.getElementById("description").value;
    const date = pegandoValores('date');
    const description = pegandoValores('description');
    const responsible = pegandoValores('responsible');
    console.log(date, responsible, description);
    
    if(fixFormValidation(date, description, responsible)) {
        const report = `Relatório de Manutenção
        Data: ${date}
        Tipo de Manutenção: Corretiva
        Descrição: ${description}
        Responsável: ${responsible}`;
    
        alert(report);
    }

}

function limparCampos() {
    document.getElementById("date").value = '';
    document.getElementById("description").value = '';
    document.getElementById("responsible").value = '';
}
