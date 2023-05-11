function fnProcesaPaciente(comp){
    let id = comp.id;
    var escogido=id;
    window.location.href="http://localhost:8080/detalle/ola/ss/"+escogido;
}

function finInicioSession(){
    var usuario = document.getElementById("user").value;
    window.alert("Bienvenido "+usuario);
}