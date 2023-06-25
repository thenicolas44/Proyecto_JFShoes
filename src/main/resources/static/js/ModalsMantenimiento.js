(function(){
    var listaBotonesEditar = document.querySelectorAll(".editarProducto");
    listaBotonesEditar.forEach(item =>{
        item.addEventListener("click", e =>{
            document.getElementById('id').value = item.dataset.id;
            document.getElementById('cboCategoria').value = item.dataset.categoria;
            document.getElementById('txtNombre').value = item.dataset.nombre;
            document.getElementById('txtPrecio').value = item.dataset.precio;
            document.getElementById('txtDescripcion').value = item.dataset.descripcion;
            document.getElementById('txtTalla').value = item.dataset.talla;
            document.getElementById('txtColor').value = item.dataset.color;
            new bootstrap.Modal(document.getElementById('modalEditarProducto')).show();
        });
    });
})();

(function(){
    var listaBotonesEditar = document.querySelectorAll(".editarCategoria");
    listaBotonesEditar.forEach(item =>{
        item.addEventListener("click", e =>{
            document.getElementById('id').value = item.dataset.id;
            document.getElementById('txtSexo').value = item.dataset.sexo;
            document.getElementById('txtTemporada').value = item.dataset.temporada;
            document.getElementById('txtModelo').value = item.dataset.modelo;
            document.getElementById('txtOcacion').value = item.dataset.ocacion;
            new bootstrap.Modal(document.getElementById('modalEditarCategoria')).show();
        });
    });
})();

(function(){
    var listaBotonesEditar = document.querySelectorAll(".editarUsuario");
    listaBotonesEditar.forEach(item =>{
        item.addEventListener("click", e =>{
            document.getElementById('id').value = item.dataset.id;
            document.getElementById('txtNombre').value = item.dataset.nombre;
            document.getElementById('txtApellido').value = item.dataset.apellido;
            document.getElementById('txtCorreo').value = item.dataset.correo;
            document.getElementById('txtContrasenia').value = item.dataset.contrasenia;
            document.getElementById('txtNickname').value = item.dataset.nickname;
            document.getElementById('txtIdentificacion').value = item.dataset.identificacion;
            document.getElementById('txtTipoIdentificacion').value = item.dataset.tipoIdentificacion;
            document.getElementById('txtTipoUsuario').value = item.dataset.tipoUsuario;
            new bootstrap.Modal(document.getElementById('modalEditarUsuario')).show();
        });
    });
})();

function fnLimpiarProducto(){
    window.location.href = "http://localhost:8080/producto/";
}

function fnLimpiarCategoria(){
    window.location.href = "http://localhost:8080/categoria/";
}

