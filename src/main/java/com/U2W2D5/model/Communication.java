package com.U2W2D5.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Communication {
	
	private static final Logger logger = LoggerFactory.getLogger(Communication.class);
	
	public void sendInfo(Long id, double lat, double lon, int smokeLvl) {
		logger.info("Probe " + id + " at coords: " + lat + ", " + lon + " has a smoke level of: " + smokeLvl);
	}

}
