package com.hayalet.tourservice.repository;

import com.hayalet.tourservice.domain.BusinessCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessCustomerRepository extends JpaRepository<BusinessCustomer, Long> {
}
