package com.pollingstation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pollingstation.entity.PollingStation;
import com.pollingstation.model.VoterEntity;
import com.pollingstation.repository.PollingStationRepo;

@Service
public class PollingStationService implements PollingStationInterface {

	@Autowired
	PollingStationRepo repo;
	
	@Autowired
	RestTemplate template;
	
	@Override
	public PollingStation savePollingStation(PollingStation station) {
		return repo.save(station);
	}

	@Override
	public void deletePollingStation(Integer polling_station_id) {
		repo.deleteById(polling_station_id);
	}

	@Override
	public PollingStation getPollingStationById(Integer polling_station_id) {
		return repo.findById(polling_station_id).get();
	}

	@Override
	public List<VoterEntity> getListOfVotersByPollingStationId(Integer polling_station_id) {
		return template.getForObject("http://VOTER-SERVICE/voter/id"+polling_station_id, List.class);
	}
	
}
