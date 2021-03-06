package com.hayalet.tourservice.repository;

import com.hayalet.tourservice.domain.PersonalCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalCustomerRepository extends JpaRepository<PersonalCustomer, Long> {
    PersonalCustomer findOneByMailAndPhone(String mail, String phone);
}
