package com.pollingstation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pollingstation.entity.PollingStation;
import com.pollingstation.model.PollingAndVoterTemplate;
import com.pollingstation.model.VoterEntity;
import com.pollingstation.service.PollingStationInterface;

@RestController
@RequestMapping("/polling_station")
public class PollingStationController {

	@Autowired
	PollingStationInterface service;
	
	@PostMapping(path="/save")
	public ResponseEntity<PollingStation> save(@RequestBody PollingStation station){
		PollingStation savedstation = service.savePollingStation(station);
		return new ResponseEntity<PollingStation>(savedstation,HttpStatus.OK);
	}
	
	@DeleteMapping(path="/id/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer polling_station_id){
		service.deletePollingStation(polling_station_id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@GetMapping("/id/{polling_station_id}")
	public ResponseEntity<PollingAndVoterTemplate> getDataBasedOnPollingStationId(@PathVariable("polling_station_id") Integer polling_station_id){
		PollingAndVoterTemplate response = new PollingAndVoterTemplate();
		PollingStation station = service.getPollingStationById(polling_station_id);
		
//		Get details of Polling station of given id
		response.setStation(station);
		List<VoterEntity> listofvoters = service.getListOfVotersByPollingStationId(polling_station_id);
		
//		Get all voters who have registered in a particular polling station
		response.setVoters(listofvoters);
		return new ResponseEntity<PollingAndVoterTemplate>(response,HttpStatus.OK);
	}
	
}
