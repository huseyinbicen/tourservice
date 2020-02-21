package com.hayalet.tourservice.api.controller;
import com.hayalet.tourservice.api.response.ResponseOfGet;
import com.hayalet.tourservice.dto.request.CreatePersonalCustomerDTO;
import com.hayalet.tourservice.service.PersonalCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.EmptyStackException;

@RestController
public class EnterpriseApiController {
    @Autowired
    private PersonalCustomerService personalCustomerService;

    @GetMapping("/onboarding/test")
    public ResponseOfGet<String> getAllEmployees() {
        return new ResponseOfGet<>("Hüseyin");
    }


    //Response Entity
    // Response BoDY
//    @GetMapping
//    @PostMapping
//    @DeleteMapping
//    @PutMapping
//    @PatchMapping
    @PostMapping(value = "/onboarding/personal/customer/create", consumes = {MediaType.ALL_VALUE})
    public ResponseOfGet<String> createPersonalCustomer(CreatePersonalCustomerDTO createPersonalCustomerDTO) {
        return new ResponseOfGet<>(this.personalCustomerService.savePersonalCustomer(createPersonalCustomerDTO));
    }
}
