package com.springboot.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.restapi.models.Hotel;
import com.springboot.restapi.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public void addHotel(Hotel hotel) {
		hotelRepository.save(hotel);

	}

	@Override
	public void updateHotel(Hotel hotel) {
		hotelRepository.save(hotel);

	}

	@Override
	public Hotel getHotelById(int hotelId) {

		return hotelRepository.findById(hotelId).get();
	}

	@Override
	public void deleteHotel(int hotelId) {
		hotelRepository.deleteById(hotelId);

	}

	@Override
	public List<Hotel> getHotelsByCity(String city) {

		return hotelRepository.findByAddressCity(city);
	}

	@Override
	public List<Hotel> getHotelsByMenu(String menuName) {

		return hotelRepository.getHotelsByMenu(menuName);
	}

	@Override
	public List<Hotel> getHotelsByDelivery(String patnerName) {

		return hotelRepository.getHotelsByDelivery(patnerName);
	}

	@Override
	public List<Hotel> getHotelsByLocation(String location) {
		return hotelRepository.findByAddressStreetName(location);
	}

	@Override
	public List<Hotel> getHotelsByLocationAndMenu(String location, String menuName) {

		return hotelRepository.getHotelsByLocationAndMenu(location, menuName);
	}

}
