function fnProcesaPaciente(comp){
    var ruta = window.location.pathname;
    var segmentos = ruta.split("/");
    var rutaDeseada = "/" + segmentos[2] + "/" + segmentos[3];
    let id = comp.id;
    var escogido=id;
    /*
    window.alert(ruta+escogido);
    */
    window.location.href="http://localhost:8080/detalle"+rutaDeseada+"/"+escogido;
    
}

function fnInicioSession(){
    var usuario = document.getElementById("user").value;
    var contra = document.getElementById("password").value;
    window.location.href="http://localhost:8080/login/"+usuario+"/"+contra;
}

function fnMostrarValue(){
    var valor = document.getElementById("id_tipo").value;
    window.alert(valor);
}