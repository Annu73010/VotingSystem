package com.pollingstation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="polling_station")
public class PollingStation {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private int polling_station_id;
	@Column
	private String name;
	@Column
	private String address;
	
	public int getPolling_station_id() {
		return polling_station_id;
	}
	public void setPolling_station_id(int polling_station_id) {
		this.polling_station_id = polling_station_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
