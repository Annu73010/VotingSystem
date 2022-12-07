package com.pollingstation.model;

import java.util.List;

import com.pollingstation.entity.PollingStation;

public class PollingAndVoterTemplate {

	private PollingStation station;
	private List<VoterEntity> voters;
	
	public PollingStation getStation() {
		return station;
	}
	public void setStation(PollingStation station) {
		this.station = station;
	}
	public List<VoterEntity> getVoters() {
		return voters;
	}
	public void setVoters(List<VoterEntity> voters) {
		this.voters = voters;
	}
	
}
