package com.example.crud.controller;

import com.example.crud.entity.Producto;
import com.example.crud.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductoController {

    @Autowired
    ProductoService service;

    @GetMapping("/prod/{id}")
    public ResponseEntity<Producto> getProd(@PathVariable Long id){
        Producto producto = service.getProducto(id);
        return ResponseEntity.status(HttpStatus.OK).body(producto);
    }

    @PostMapping("/prod")
    public ResponseEntity<Producto> addPrd(@RequestBody Producto producto){
        Producto producto1 = service.addProducto(producto);
        return ResponseEntity.status(HttpStatus.OK).body(producto1);
    }

    @PutMapping("/prod/{id}")
    public ResponseEntity<Producto> updtPrd(@PathVariable Long id, @RequestBody Producto producto){
        Producto producto1 = service.updtProducto(id, producto);
        return ResponseEntity.status(HttpStatus.OK).body(producto1);
    }
}
