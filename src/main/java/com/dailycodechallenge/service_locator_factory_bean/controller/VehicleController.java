package com.dailycodechallenge.service_locator_factory_bean.controller;

import com.dailycodechallenge.service_locator_factory_bean.entiry.Vehicle;
import com.dailycodechallenge.service_locator_factory_bean.registry.ServiceRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

    @Autowired
    ServiceRegistry serviceRegistry;

    @PostMapping
    public Vehicle getServiceClassDetails(@RequestBody Vehicle vehicle)
    {
        return serviceRegistry.getService(vehicle.getVehicleType()).process(vehicle);
    }
}
