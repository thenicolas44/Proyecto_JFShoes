function validarLogin(event){
    var urlActual = window.location.href;
    //alert(urlActual.substring());
    if(urlActual.charAt(urlActual.length-1) === '/'){
        window.location.href="http://localhost:8080/login/"
    }

    event.preventDefault();
}