function fnProcesaPaciente(comp){
    let id = comp.id;
    var escogido=id;
    window.location.href="http://localhost:8080/detalle/ola/ss/"+escogido;
    
}

function fnInicioSession(){
    var usuario = document.getElementById("user").value;
    var contra = document.getElementById("password").value;
    
    window.location.href="http://localhost:8080/inicio";
}
function envio(){
    window.location.href="http://localhost:8080/inicio";
}