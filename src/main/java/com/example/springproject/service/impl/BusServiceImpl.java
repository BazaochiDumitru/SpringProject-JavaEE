package com.example.springproject.service.impl;

import com.example.springproject.model.Bus;
import com.example.springproject.repository.BusRepository;
import com.example.springproject.service.BusService;
import org.springframework.stereotype.Service;

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
}
