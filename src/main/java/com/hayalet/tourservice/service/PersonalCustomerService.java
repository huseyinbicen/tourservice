package com.hayalet.tourservice.service;

import com.hayalet.tourservice.dto.request.CreatePersonalCustomerDTO;

public interface PersonalCustomerService {
    String savePersonalCustomer(CreatePersonalCustomerDTO createPersonalCustomerDTO);
}
