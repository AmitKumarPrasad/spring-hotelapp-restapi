package com.springboot.restapi.service;

import java.util.List;

import com.springboot.restapi.models.Menu;

public interface MenuService {

	List<Menu> getMenusByHotel(String hotelName);

}
