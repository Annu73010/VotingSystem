package com.pollingstation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pollingstation.entity.PollingStation;

@Repository
public interface PollingStationRepo extends JpaRepository<PollingStation,Integer>{
	
}
