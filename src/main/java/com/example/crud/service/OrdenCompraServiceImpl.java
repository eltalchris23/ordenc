package com.example.crud.service;

import com.example.crud.entity.Orden;
import com.example.crud.repository.OrdenCompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdenCompraServiceImpl implements OrdenCompraService{

    @Autowired
    OrdenCompraRepository repository;

    @Override
    public Orden getOrden(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Orden addOrden(Orden orden) {
        return repository.save(orden);
    }

    @Override
    public Orden updtOrden(Long id, Orden orden) {
        Orden ordenUpt = repository.findById(id).get();
        ordenUpt.setFecha(orden.getFecha());
        ordenUpt.setProductos(orden.getProductos());
        ordenUpt.setTotal(orden.getTotal());
        return repository.save(ordenUpt);
    }
}
