package com.springboot.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.restapi.models.Delivery;
import com.springboot.restapi.repository.DeliveryRepository;
@Service
@Transactional
public class DeliveryServiceImpl implements DeliveryService {

	@Autowired
	private DeliveryRepository delRepo;

	@Override
	public void updateDelivery(Delivery delivery) {
		delRepo.save(delivery);

	}

	@Override
	public void deleteDelivery(int deliveryId) {
		delRepo.deleteById(deliveryId);

	}

	@Override
	@Transactional
	public Delivery getDeliveryById(int deliveryId) {

		return delRepo.findById(deliveryId).get();
	}

	@Override
	@Transactional
	public Delivery getDeliveryByPartner(String partnerName) {

		return delRepo.findByPartnerName(partnerName);
	}

}
