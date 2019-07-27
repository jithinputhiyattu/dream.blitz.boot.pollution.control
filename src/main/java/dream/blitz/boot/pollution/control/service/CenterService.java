package dream.blitz.boot.pollution.control.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dream.blitz.boot.pollution.control.jpa.Center;
import dream.blitz.boot.pollution.control.repository.CenterRepository;

@Service
public class CenterService {
	
	@Autowired
	
	CenterRepository centerRepository;

	public List<Center> findAll() {
		return (List<Center>) centerRepository.findAll();
	}

}
