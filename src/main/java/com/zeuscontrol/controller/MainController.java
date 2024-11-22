package com.zeuscontrol.controller;

import com.zeuscontrol.model.Producto;
import com.zeuscontrol.repository.ProductoRepository;

public class MainController {
    public static void main(String[] args) {
        ProductoRepository repo = new ProductoRepository();

        try {
            // Crear un producto
            repo.agregarProducto(new Producto(0, "Chicle", 50, 5.75));

            // Leer productos
            repo.listarProductos().forEach(producto ->
                    System.out.println(producto.getId() + " - " + producto.getNombre() + " - " + producto.getCantidad() + " - " + producto.getPrecio())
            );

            // Actualizar un producto
            repo.actualizarProducto(new Producto(1, "Gomitas", 100, 10.50));

            // Eliminar un producto
            repo.eliminarProducto(1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
