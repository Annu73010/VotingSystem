package com.voting.votes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.voting.votes.entity.VoterEntity;
import com.voting.votes.service.VoterServiceInterface;

@RestController
@RequestMapping("/voter")
public class VoterController {

	@Autowired
	VoterServiceInterface service;
	
	@PostMapping(path="/save")
	public ResponseEntity<VoterEntity> save(@RequestBody VoterEntity voter){
		VoterEntity savedvoter = service.saveVoter(voter);
		return new ResponseEntity<VoterEntity>(savedvoter,HttpStatus.OK);
	}
	
	@GetMapping(path="/all")
	public ResponseEntity<?> getAllVoters(){
		List<VoterEntity> listvoter = service.allVoters();
		return new ResponseEntity<>(listvoter,HttpStatus.OK);	
	}
	
	@GetMapping(path="/id/{id}")
	public ResponseEntity<VoterEntity> getVoterById(@PathVariable("id") Integer id){
		VoterEntity voter = service.voterById(id);
		return new ResponseEntity<>(voter,HttpStatus.OK);	
	}

	@DeleteMapping(path="/id/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable("id") Integer id){
		service.deleteVoterById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PutMapping(path="/update")
	public ResponseEntity<VoterEntity> update(@RequestBody VoterEntity voter){
		VoterEntity savedvoter = service.updateVoter(voter);
		return new ResponseEntity<VoterEntity>(savedvoter,HttpStatus.OK);
	}
}
