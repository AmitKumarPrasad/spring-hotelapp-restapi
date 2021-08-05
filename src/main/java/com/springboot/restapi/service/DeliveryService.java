package com.springboot.restapi.service;

import com.springboot.restapi.models.Delivery;

public interface DeliveryService {

	void updateDelivery(Delivery delivery);

	void deleteDelivery(int deliveryId);

	Delivery getDeliveryById(int deliveryId);

	Delivery getDeliveryByPartner(String patnerName);
}
