package com.example.springproject.service.impl;

import com.example.springproject.exception.ResourceNotFoundException;
import com.example.springproject.model.Bus;
import com.example.springproject.repository.BusRepository;
import com.example.springproject.service.BusService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusServiceImpl implements BusService {

    private BusRepository busRepository;

    public BusServiceImpl(BusRepository busRepository) {
        super();
        this.busRepository = busRepository;
    }

    @Override
    public Bus saveBus(Bus bus) {
        return busRepository.save(bus);
    }

    @Override
    public List<Bus> getAll() {
        return busRepository.findAll();
    }

    @Override
    public Bus get(long id) {
        return busRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Bus", "id", id));
    }

    @Override
    public Bus update(Bus bus, long id) {
        Bus existingBus = busRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Bus", "id", id));
        existingBus.setNameBus(bus.getNameBus());
        existingBus.setColorBus(bus.getColorBus());
        existingBus.setMaxSpeed(bus.getMaxSpeed());
        existingBus.setMaxPlaces(bus.getMaxPlaces());
        existingBus.setNumberBus(bus.getNumberBus());
        busRepository.save(existingBus);
        return existingBus;
    }
}
