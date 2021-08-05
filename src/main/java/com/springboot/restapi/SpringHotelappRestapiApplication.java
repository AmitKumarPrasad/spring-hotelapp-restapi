package com.springboot.restapi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.restapi.models.Address;
import com.springboot.restapi.models.Delivery;
import com.springboot.restapi.models.Hotel;
import com.springboot.restapi.models.Menu;
import com.springboot.restapi.service.DeliveryService;
import com.springboot.restapi.service.HotelService;
import com.springboot.restapi.service.MenuService;

@SpringBootApplication
public class SpringHotelappRestapiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringHotelappRestapiApplication.class, args);
	}

	@Autowired
	private HotelService service;

	@Autowired
	private MenuService menuService;

	@Autowired
	private DeliveryService delService;

	@Override
	public void run(String... args) throws Exception {
		Address address = new Address("JP Nagar", "Banglore", 411044, "KAR");
		Menu menu1 = new Menu("Idli", 50);
		Menu menu2 = new Menu("Dosha", 20);
		Set<Menu> menuList = new HashSet<>(Arrays.asList(menu1, menu2));
		Delivery delivery1 = delService.getDeliveryByPartner("ubber");
		Set<Delivery> deliveryList = new HashSet<>(Arrays.asList(delivery1));
		Hotel hotel = new Hotel("The Shanthos ", address, menuList, deliveryList);
		service.addHotel(hotel);

		/*
		 * Hotel hotel = service.getHotelById(1); System.out.println(hotel);
		 * hotel.getAddress().setCity("Mumbai"); service.updateHotel(hotel); hotel =
		 * service.getHotelById(1); System.out.println(hotel);
		 */

		/*
		 * service.getHotelsByCity("Bangalore").stream().forEach((h)->System.out.println
		 * (h.getHotelName()+h.getAddress().getCity())); System.out.println();
		 * 
		 * service.getHotelsByLocation("JP Nagar").stream().forEach((h)->System.out.
		 * println(h.getHotelName()+h.getMenuList()));
		 */
		/*
		 * service.getHotelsByMenu("Idli").stream() .forEach((h) ->
		 * System.out.println(h.getHotelName() + " " + h.getAddress().getStreetName()));
		 * System.out.println();
		 * 
		 * service.getHotelsByDelivery("Swiggy").stream() .forEach((h) ->
		 * System.out.println(h.getHotelName() + " " + h.getAddress().getStreetName()));
		 */

		/*
		 * service.getHotelsByLocationAndMenu("JP Nagar", "Idli") .forEach((h) ->
		 * System.out.println(h.getHotelName() + " " + h.getAddress().getCity()));
		 */
		menuService.getMenusByHotel("ABC").forEach((m) -> System.out.println(m.getMenuName() + " " + m.getPrice()));
	}

}
