package com.pollingstation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pollingstation.entity.PollingStation;
import com.pollingstation.model.VoterEntity;


public interface PollingStationInterface {

	PollingStation savePollingStation(PollingStation station);

	void deletePollingStation(Integer polling_station_id);

	PollingStation getPollingStationById(Integer polling_station_id);

	List<VoterEntity> getListOfVotersByPollingStationId(Integer polling_station_id);
	
}
