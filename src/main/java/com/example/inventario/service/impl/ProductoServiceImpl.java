package com.example.inventario.service.impl;

import com.example.inventario.model.Producto;
import com.example.inventario.repository.ProductoRepository;
import com.example.inventario.service.ProductoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    private final ProductoRepository productoRepo;

    public ProductoServiceImpl(ProductoRepository productoRepo) {
        this.productoRepo = productoRepo;
    }

    @Override
    public List<Producto> listarTodos() {
        return productoRepo.findAll();
    }

    @Override
    public Producto obtenerPorId(Long id) {
        return productoRepo.findById(id).orElse(null);
    }

    @Override
    public Producto guardar(Producto producto) {
        return productoRepo.save(producto);
    }

    @Override
    public void eliminar(Long id) {
        productoRepo.deleteById(id);
    }
}
