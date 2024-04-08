package com.example.crud.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="ordenes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orden {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ordenId;
    private LocalDate fecha;
    private Double total;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "orden_producto", joinColumns = @JoinColumn(name = "orden_id"), inverseJoinColumns = @JoinColumn(name = "producto_id"))
    private List<Producto> productos;
}
