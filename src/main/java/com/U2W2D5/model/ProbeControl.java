package com.U2W2D5.model;

public class ProbeControl implements Observer {
	
	private final Long id;
	
	private ControlCenterInterface ctrlCenter;
	
	public ProbeControl (Long id, ControlCenterInterface ctrlCenter) {
		this.id = id;
		this.ctrlCenter = ctrlCenter;
	}
	
	private ProbeInfo createProbeInfo(Probe probe) {
		return new ProbeInfo(probe.getId(), probe.getLat(), probe.getLon(), probe.getSmokeLvl());
	}
	
	@Override
	public void update(Subject probe) {
		ProbeInfo info = createProbeInfo((Probe)probe);
		ctrlCenter.checkForFire(info);
	}
	
	public Long getId() {
		return id;
	}

}
