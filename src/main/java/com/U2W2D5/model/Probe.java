package com.U2W2D5.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Probe extends Subject{
	
	private Long id;
	private double lat;
	private double lon;
	private int smokeLvl;
	
	public final int smokeLimit = 3;

	public Probe(Long id, double lat, double lon) {
		super();
		this.id = id;
		this.lat = lat;
		this.lon = lon;
		this.smokeLvl = 0;
	}
	
	public int getSmokeLevel() {
		return smokeLvl;
	}
	
	public void setSmokeLvl(int smokeLvl) {
		this.smokeLvl = smokeLvl;
		
		if (smokeLvl >= smokeLimit) {
			super.notifyObservers();
		}
	}

}
