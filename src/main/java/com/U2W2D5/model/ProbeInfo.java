package com.U2W2D5.model;

import lombok.Data;

@Data
public class ProbeInfo {
	private final Long id;
	private final double lat;
	private final double lon;
	private final int smokeLvl;

}
