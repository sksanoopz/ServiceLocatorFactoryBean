package com.dailycodechallenge.service_locator_factory_bean.registry;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface  ServiceRegistry {
    public <T> AdapterService<T> getService(String serviceName);
}
