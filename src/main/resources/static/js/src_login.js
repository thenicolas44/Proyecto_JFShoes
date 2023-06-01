function fnProcesaPaciente(comp){
    let id = comp.id;
    var escogido=id;
    window.location.href="http://localhost:8080/detalle/ola/ss/"+escogido;
}

function fnInicioSession(){
    var usuario = document.getElementById("user").value;
    var contra = document.getElementById("password").value;
    window.location.href="http://localhost:8080/detalle/"+usuario+"/"+contra+"/1";
}

function fnMostrarValue(){
    var valor = document.getElementById("id_tipo").value;
    window.alert(valor);
}