'use strict';

function msgError(classHtml, mensagem) {
   const mensagemErr = document.querySelector(classHtml);
   mensagemErr.style.color = 'red';
   mensagemErr.style.fontWeight = '600';
   mensagemErr.style.margin = '1rem'
   mensagemErr.innerHTML = mensagem;
   return mensagemErr;
}

function msgSuccess(classHtl, mensagem) {
    const mensagemSuccess = document.querySelector(classHtl);
    mensagemSuccess.style.color = '#2b8a3e';
    mensagemSuccess.style.fontWeight = '600';
    mensagemSuccess.style.margin = '1rem'
    mensagemSuccess.innerHTML = mensagem;
    return mensagemSuccess;
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

    if (!input1 && !input2) return msgError('.resultado--calc', 'Os campos da soma, não podem ficar vázio');

    else if(!input1) return msgError('.resultado--calc', 'Digite o primeiro número válido');

    else if (!input2) return msgError('.resultado--calc', 'Digite o segundo número válido');

    
    const result = input1 + input2;
    msgSuccess('.resultado--calc', `O resultado do calculo: ${result}`)

    document.querySelector('.input--calculo-1').value = '';
    document.querySelector('.input--calculo-2').value = '';
    
}

// Erro 2 - Validação de Formulário
function fixFormValidation(date, description, responsible) {

    const form = document.getElementById("maintenance-form");
        
    if (!date && !description && !responsible) {
        msgError('.resultado--form', 'Os campos não podem ficar vázio');
        return false;
    } 
    
    else if (!date) {
        msgError('.resultado--form', 'Digite uma data válida');
        return false;
    }
        
    else if (!description) {
        msgError('.resultado--form', 'Descriçãoo não pode ficar vázia');
        return false;
    }   

    else if (description.length < 10) {
        msgError('.resultado--form', 'Descrição inválida');   
        return false;
    }
  
    else if (!responsible) {
        msgError('.resultado--form', 'Digite o seu nome');
        return false
    } 

    return true
}

// Gerar relatório de manutenção
function generateReport() {
    
    const date = pegandoValores('date');
    const description = pegandoValores('description');
    const responsible = pegandoValores('responsible');
    const typeMaintenance = pegandoValores('error-type')
    
    if(fixFormValidation(date, description, responsible, typeMaintenance)) {
        const report = `Relatório de Manutenção
        Data: ${date}
        Tipo de Manutenção: ${typeMaintenance}
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
