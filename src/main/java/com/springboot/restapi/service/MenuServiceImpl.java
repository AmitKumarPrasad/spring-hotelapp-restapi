package com.springboot.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.restapi.models.Menu;
import com.springboot.restapi.repository.MenuRepository;

@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuRepository menuRepository;

	@Override
	public List<Menu> getMenusByHotel(String hotelName) {

		return menuRepository.findByHotel(hotelName);
	}

}
