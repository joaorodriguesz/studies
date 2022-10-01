function route(event) {
    if((event.target.text == 'Próximo') && !isValid('#form')){
        return alert('Preencha os campos em destaque!');
    }
    //monitora o evento gerado
    event = event || window.event;
    //tira a propriedade padrao dele
    event.preventDefault();
    //adiciona uma entrada na pilha de historico do navegador
    //URL para onde a tag âncora aponta
    window.history.pushState({}, "", event.target.href);
    handleLocation();
};

const routes = {
    404: "/pages/404.html",
    "/": "/pages/login.html",
    "/home": "/pages/home.html",
    "/cadastro": "/pages/cadastro.html",
    "/favoritos": "/pages/favoritos.html",
    "/senha": "/pages/senha.html",
};

function headleLocation(){
    const path = window.location.pathname;
    const route = routes[path] || routes[404];
    const html = route.text();
    document.getElementById("main-page").innerHTML = html;
};


