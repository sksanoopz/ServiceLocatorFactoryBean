package com.dailycodechallenge.service_locator_factory_bean.registry;

import com.dailycodechallenge.service_locator_factory_bean.entiry.Vehicle;

public interface AdapterService<T> {
    public Vehicle process(T request);
}
