package com.example.crud.service;

import com.example.crud.entity.Producto;

public interface ProductoService {

    Producto getProducto(Long id);
    Producto addProducto(Producto producto);
    Producto updtProducto(Long id, Producto producto);
}
