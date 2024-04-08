package com.example.crud.controller;

import com.example.crud.entity.Orden;
import com.example.crud.service.OrdenCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrdenCompraController {

    @Autowired
    OrdenCompraService service;

    @GetMapping("/ordenc/{id}")
    public ResponseEntity<Orden> getOrden(@PathVariable Long id){
        Orden orden = service.getOrden(id);
        return ResponseEntity.status(HttpStatus.OK).body(orden);
    }

    @PostMapping("/ordenc")
    public ResponseEntity<Orden> addOrden(@RequestBody Orden orden){
        Orden orden1 = service.addOrden(orden);
        return ResponseEntity.status(HttpStatus.OK).body(orden1);
    }

    @PutMapping("/ordenc/{id}")
    public ResponseEntity<Orden> updtOrden(@PathVariable Long id, @RequestBody Orden orden){
        Orden orden1 = service.updtOrden(id, orden);
        return ResponseEntity.status(HttpStatus.OK).body(orden1);
    }

}
