package com.springboot.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.restapi.models.Delivery;
import com.springboot.restapi.models.Hotel;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Integer> {

	// Derived Queries
	Delivery findByPartnerName(String partnerName);

}
