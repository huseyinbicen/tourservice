package com.hayalet.tourservice.service.impl;

import com.hayalet.tourservice.api.response.ResponseOfGet;
import com.hayalet.tourservice.domain.PersonalCustomer;
import com.hayalet.tourservice.dto.request.CreatePersonalCustomerDTO;
import com.hayalet.tourservice.repository.PersonalCustomerRepository;
import com.hayalet.tourservice.service.PersonalCustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonalCustomerServiceImpl implements PersonalCustomerService {
    @Autowired
    private PersonalCustomerRepository personalCustomerRepository;

    @Override
    public String savePersonalCustomer(CreatePersonalCustomerDTO createPersonalCustomerDTO) {
        String result = "";
        try{
            if (isExists(createPersonalCustomerDTO.getMail(),createPersonalCustomerDTO.getPhone())) {
                ModelMapper mapper = new ModelMapper();
                PersonalCustomer personalCustomer = mapper.map(createPersonalCustomerDTO,PersonalCustomer.class);
                Long id = personalCustomerRepository.saveAndFlush(personalCustomer).getId();
                if (id != 0)
                    result = "Succesfull";
            }
            else
                result = " The row alredy exists!";
        }catch (Exception e){
            System.out.println(e.getMessage().toString());
            result = "Failed" + e.getMessage();
        }
        return result;
    }

    private Boolean isExists(String mail, String phone){
        PersonalCustomer personalCustomer = personalCustomerRepository.findOneByMailAndPhone(mail,phone);
        if (personalCustomer == null){
            return true;
        }
        return false;
    }
}
