package com.dailycodechallenge.service_locator_factory_bean.service;

import com.dailycodechallenge.service_locator_factory_bean.entiry.Vehicle;
import com.dailycodechallenge.service_locator_factory_bean.registry.AdapterService;
import org.springframework.stereotype.Service;

@Service("Bus")
public class BusService implements AdapterService {

    @Override
    public Vehicle process(Object request) {
        Vehicle vehicle = (Vehicle) request;
        vehicle.setServiceClass(this.getClass().getSimpleName().concat(".java"));
        return vehicle;
    }
}