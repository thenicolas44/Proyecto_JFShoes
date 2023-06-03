function actualizarFecha() {
    // Obtener la fecha actual
    var fechaActual = new Date();

    // Obtener datos con Formato
    var hora = fechaActual.getHours();
    var minutos = fechaActual.getMinutes();
    var segundos = fechaActual.getSeconds();
    var dia = fechaActual.getDate();
    var anio = fechaActual.getFullYear();

    // Obtener el nombres
    var diasSemana = ['Domingo', 'Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes', 'Sábado'];
    var nombreDia = diasSemana[fechaActual.getDay()];

    var meses = ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio' , 'Agosto' , 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'];
    var nomMes = meses[(fechaActual.getDay()+1)];

    // Dando fromato
    var horForm = (hora < 10 ? '0' : '') + hora;
    var minForm = (minutos < 10 ? '0' : '') + minutos;
    var segForm = (segundos < 10 ? '0' : '') + segundos;
    var diaForm = (dia < 10 ? '0' : '') + dia;

    // Dando formato
    var hora = horForm + ':' + minForm + ':' + segForm; 
    var fecha = nombreDia + ' ' + diaForm + ' de ' + nomMes + ' del ' + anio;
   
    // Asignacion a las ID
    document.getElementById('horaForm').textContent = hora;
    document.getElementById('fechaForm').textContent = fecha;
}

// Actualizacion por segundo
setInterval(actualizarFecha, 1000);

// uso de la funcion
actualizarFecha();