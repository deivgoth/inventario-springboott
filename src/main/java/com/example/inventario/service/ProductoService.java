package com.example.inventario.service;

import com.example.inventario.model.Producto;
import java.util.List;

public interface ProductoService {
    List<Producto> listarTodos();

    Producto obtenerPorId(Long id);

    Producto guardar(Producto producto);

    void eliminar(Long id);
}
