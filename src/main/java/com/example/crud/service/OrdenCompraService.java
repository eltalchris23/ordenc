package com.example.crud.service;

import com.example.crud.entity.Orden;

public interface OrdenCompraService {

    Orden getOrden (Long id);
    Orden addOrden (Orden orden);

    Orden updtOrden (Long id, Orden orden);
}
