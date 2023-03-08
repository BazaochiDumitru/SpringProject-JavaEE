package com.example.springproject.service;

import com.example.springproject.model.Bus;

import java.util.List;

public interface BusService {
    Bus saveBus(Bus bus);
    List<Bus> getAll();
}
