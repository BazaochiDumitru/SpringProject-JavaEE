package com.example.springproject.controller;

import com.example.springproject.model.Bus;
import com.example.springproject.repository.BusRepository;
import com.example.springproject.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spring/buses")
public class BusController {
    private BusService busService;

    public BusController(BusService busService) {
        super();
        this.busService = busService;
    }

    // facem metoda de creare
    @PostMapping
    public ResponseEntity<Bus> create(@RequestBody Bus bus) {
        return new ResponseEntity<Bus>(busService.saveBus(bus), HttpStatus.CREATED);
    }
}
