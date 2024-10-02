package com.boot.customer.api.mapper;

import com.boot.customer.api.dto.CustomerDto;
import com.boot.customer.api.entities.Customer;

public class CustomerMapper {
    public static CustomerDto toDto(Customer customer) {
        CustomerDto dto = new CustomerDto();
        return dto;
    }

    public static Customer toEntity(CustomerDto dto) {
        Customer customer = new Customer();
        return customer;
    }
}
