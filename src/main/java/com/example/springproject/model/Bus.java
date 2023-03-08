package com.example.springproject.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "bus")
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nameBus")
    private String nameBus;

    @Column(name = "colorBus")
    private String colorBus;

    @Column(name = "maxSpeed")
    private Integer maxSpeed;

    @Column(name = "maxPlaces")
    private Integer maxPlaces;

    @Column(name = "numberBus")
    private Integer numberBus;
}
