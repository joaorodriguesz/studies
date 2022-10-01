//As arrow functions permitem ter um retorno implícito
//, que são valores retornados sem ter que usar a palavar return
import BotaoConclui from "./componentes/concluiTarefa.js";
import BotaoDeleta from "./componentes/deletaTarefa.js";

    const criarTarefa = (event) => {

        //preventDefault() impede que o evento padrão ocorra (ex.: seguir um link); event.
        event.preventDefault(); 
        const lista = document.querySelector('[data-list]');
        const input = document.querySelector('[data-form-input]');
        const valor = input.value;

        //adiconando elemtnos no DOM
        const tarefa = document.createElement('li');
        tarefa.classList.add('task')
        const conteudo = `<p class="content">${valor}</p>`;

        tarefa.innerHTML = conteudo;
        tarefa.appendChild(BotaoConclui());
        tarefa.appendChild(BotaoDeleta());
        lista.appendChild(tarefa);
        input.value = ' ';
    }

    const novaTarefa = document.querySelector('[data-form-button]');
    novaTarefa.addEventListener('click', criarTarefa);
