package com.example.inventario.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private String codigoBarra;

    private Integer stock;
    private Integer stockMinimo;

    private BigDecimal precioCompra;
    private BigDecimal precioVenta;

    private LocalDate fechaVencimiento;

    // Getters y Setters
}