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