package com.hayalet.tourservice.repository;

import com.hayalet.tourservice.domain.MyCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository  extends JpaRepository <MyCard, Long> {
}
