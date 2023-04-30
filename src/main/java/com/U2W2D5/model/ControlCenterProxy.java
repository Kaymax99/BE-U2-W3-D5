package com.U2W2D5.model;

public class ControlCenterProxy implements ControlCenterInterface{
	
	private ControlCenterInterface ctrlInterface;

	public ControlCenterProxy () {
		ctrlInterface = ControlCenterFactory.createControlCenter();
	}
	
	@Override
	public void checkForFire(ProbeInfo probeInfo) {
		// TODO Auto-generated method stub
		ctrlInterface.checkForFire(probeInfo);
	}

}
