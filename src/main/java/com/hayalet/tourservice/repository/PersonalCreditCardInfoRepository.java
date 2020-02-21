package com.hayalet.tourservice.repository;

import com.hayalet.tourservice.domain.PersonalCreditCardInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalCreditCardInfoRepository extends JpaRepository<PersonalCreditCardInfo, Long> {
}
