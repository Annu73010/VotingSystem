package com.voting.votes.service;

import java.util.List;

import com.voting.votes.entity.VoterEntity;

public interface VoterServiceInterface {

	VoterEntity saveVoter(VoterEntity voter);

	List<VoterEntity> allVoters();

	void deleteVoterById(Integer id);

	VoterEntity voterById(Integer id);

	VoterEntity updateVoter(VoterEntity voter);


	
	
}
