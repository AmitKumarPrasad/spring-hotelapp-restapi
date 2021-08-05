package com.springboot.restapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springboot.restapi.models.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Integer> {

	// Derived Queries
	// List<Menu> findByHotelHotelName(String hotelName);

	// JPQL Query
	// @Query("FROM Menu m INNER JOIN m.hotel h WHERE h.hotelName=?1")
	// List<Menu> findByHotel(String hotelName);

	// native query
	@Query(value = "select * from menu m inner join hotel h on m.hotel_id=h.hotel_id where h.hotel_name=?1", nativeQuery = true)
	List<Menu> findByHotel(String hotelName);
}
