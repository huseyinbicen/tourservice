package com.hayalet.tourservice.repository;

import com.hayalet.tourservice.domain.BusinessCreditCardInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessCreditCardInfoRepository extends JpaRepository<BusinessCreditCardInfo, Long> {
}
