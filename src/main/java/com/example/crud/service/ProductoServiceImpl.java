package com.example.crud.service;

import com.example.crud.entity.Producto;
import com.example.crud.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl implements ProductoService{
    @Autowired
    ProductoRepository repository;

    @Override
    public Producto getProducto(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Producto addProducto(Producto producto) {
        return repository.save(producto);
    }

    @Override
    public Producto updtProducto(Long id, Producto producto) {
        Producto producto1 = repository.findById(id).get();
        producto1.setCodigo(producto.getCodigo());
        producto1.setDescripcion(producto.getDescripcion());
        producto1.setPrecio(producto.getPrecio());

        return repository.save(producto1);
    }
}
