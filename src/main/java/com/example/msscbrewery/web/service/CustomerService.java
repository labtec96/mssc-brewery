package com.example.msscbrewery.web.service;

import com.example.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by ch on 2020-07-12
 */
public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

}
