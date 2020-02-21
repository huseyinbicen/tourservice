package com.hayalet.tourservice.repository;

import com.hayalet.tourservice.domain.TourVehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TourVehicleRepository extends JpaRepository<TourVehicle, Long> {
}
