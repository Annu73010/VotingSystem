package com.voting.votes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import com.voting.votes.entity.VoterEntity;
import com.voting.votes.repository.VoterRepo;

@Service
public class VoterService implements VoterServiceInterface{

	@Autowired
	VoterRepo repo;
	
	@Override
	public VoterEntity saveVoter(VoterEntity voter) {	
		VoterEntity savedvoter = repo.save(voter);
		return savedvoter;
}

	@Override
	public List<VoterEntity> allVoters() {
		return repo.findAll();
	}

	@Override
	public void deleteVoterById(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public VoterEntity voterById(Integer id) {
		return repo.findById(id).get();
	}

	@Override
	public VoterEntity updateVoter(VoterEntity voter) {
	
		return repo.save(voter);
	}


	
	
	
}
