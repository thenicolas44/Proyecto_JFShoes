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
const contenedorProductos = document.getElementById('contenedor-productos');

// Calcula el ancho total del contenedor de productos
const anchoTotal = contenedorProductos.scrollWidth;

// Establece la posición inicial del desplazamiento
let scrollPosition = 0;

// Función para mover automáticamente la barra deslizadora
function moveSlider() {
  // Incrementa la posición de desplazamiento
  scrollPosition += 200; // Ajusta la cantidad de desplazamiento según tus necesidades

  // Verifica si la posición de desplazamiento ha alcanzado el final
  if (scrollPosition >= anchoTotal) {
    // Reinicia la posición de desplazamiento al principio
    scrollPosition = 0;
  }

  // Aplica el desplazamiento al contenedor de productos
  contenedorProductos.scrollLeft = scrollPosition;
}

// Intervalo para el desplazamiento automático
setInterval(moveSlider, 3000); // Ajusta el intervalo de tiempo según tus necesidades

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

function fnrevaluar(){
    var input = document.getElementById("tipo_user");
    input.value = "Cliente";
}
function fnMostrarValue(){
    var valor = document.getElementById("tipo_user").value;
    window.alert(valor);
}

function fnRegistrate(){
    window.location.href="http://localhost:8080/login/registrar";
}

function fnRegistroAdmin(){
    window.location.href = "http://localhost:8080/login/jf-registro";
}

function aplicarFiltros() {
    var checkboxes = document.querySelectorAll('.filtro input[type="checkbox"]');
    var genero = document.querySelector('input[name="genero"]:checked').id;
    var productos = document.getElementsByClassName("producto");
  
    var filtrosSeleccionados = [];
    for (var i = 0; i < checkboxes.length; i++) {
      if (checkboxes[i].checked) {
        filtrosSeleccionados.push(checkboxes[i].value);
      }
    }
  
    for (var i = 0; i < productos.length; i++) {
      var producto = productos[i];
      var tieneFiltro = false;
  
      for (var j = 0; j < filtrosSeleccionados.length; j++) {
        if (producto.classList.contains(filtrosSeleccionados[j])) {
          tieneFiltro = true;
          break;
        }
      }
  
      if (
        (filtrosSeleccionados.length === 0 || tieneFiltro) &&
        (genero === "todos" || producto.dataset.genero === genero)
      ) {
        producto.style.display = "block";
      } else {
        producto.style.display = "none";
      }
    }
  }
