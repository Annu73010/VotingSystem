package com.voting.votes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.voting.votes.entity.VoterEntity;

@Repository
public interface VoterRepo extends JpaRepository<VoterEntity,Integer>{
	
}
