package com.U2W2D5.model;

public class ControlCenter implements ControlCenterInterface{
	
	private Communication comm;
	
	public ControlCenter () {
		this.comm = new Communication();
	}
	
	@Override
	public void checkForFire(ProbeInfo pbInfo) {
		comm.sendInfo(pbInfo.getId(), pbInfo.getLat(), pbInfo.getLon(), pbInfo.getSmokeLvl());
	}

}
