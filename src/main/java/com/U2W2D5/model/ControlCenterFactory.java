package com.U2W2D5.model;

public class ControlCenterFactory {
	
	public static ControlCenterInterface createControlCenter() {
		return new ControlCenter();
	}

}
