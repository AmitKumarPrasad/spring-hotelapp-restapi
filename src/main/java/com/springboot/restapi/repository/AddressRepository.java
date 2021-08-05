package com.springboot.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.restapi.models.Address;
import com.springboot.restapi.models.Hotel;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
