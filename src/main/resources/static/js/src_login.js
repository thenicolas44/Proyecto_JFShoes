function fnProcesaPaciente(comp){
    var ruta = window.location.pathname;
    var segmentos = ruta.split("/");
    var rutaDeseada = "/" + segmentos[2] + "/" + segmentos[3];
    let id = comp.id;
    var escogido=id;
    /*
    window.alert(ruta+escogido);
    */
    window.location.href="http://localhost:8080/jf-store/detalle"+rutaDeseada+"/"+escogido;
    
}

function fnDetalle(identificador){
    let id = identificador.id;
    var ruta = window.location.pathname;
    var segmentos = ruta.split("/");
    var rutaDeseada ="/" + segmentos[3];
    
    if(segmentos[2]=="catalogo" && !isNaN(segmentos[3])){
        window.location.href="http://localhost:8080/jf-store/detalle/" + id +"/" + segmentos[3] ;
    }
    if(segmentos[1]=="jf-store" && !isNaN(segmentos[2])){
        window.location.href="http://localhost:8080/jf-store/detalle/" + id +"/" + segmentos[2] ;
    }
    else{
        window.location.href="http://localhost:8080/jf-store/detalle/" + id +"/";
    }
    
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

function fnRegistrate(){
    window.location.href="http://localhost:8080/login/registrar";
}