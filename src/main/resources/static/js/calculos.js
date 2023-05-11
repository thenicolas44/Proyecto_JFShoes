function aumentarCantidad(){
    valor = document.getElementById("txtCantidad");
    if(valor.value < 10) valor.value++;
}

function disminuirCantidad(){
    valor = document.getElementById("txtCantidad");
    if (valor.value > 1)valor.value--;
}