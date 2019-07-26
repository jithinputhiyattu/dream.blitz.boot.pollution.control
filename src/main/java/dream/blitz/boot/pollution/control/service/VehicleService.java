package dream.blitz.boot.pollution.control.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import dream.blitz.boot.pollution.control.jpa.Vehicle;
import dream.blitz.boot.pollution.control.repository.VehicleRepository;

public class VehicleService {
	@Autowired
	VehicleRepository vehicleRepository;

	Vehicle getVehicleById(UUID id) {
		return vehicleRepository.findById(id).get();
	}

	Vehicle getVehicleByNumber(String number) {
		return vehicleRepository.findByNumber(number).get();
	}
	
	Vehicle getVehicleByMobile(String mobile) {
		return vehicleRepository.findByMobile(mobile).get();
	}


}
