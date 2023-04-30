package com.U2W2D5.runner;

import com.U2W2D5.model.ControlCenterProxy;
import com.U2W2D5.model.Probe;
import com.U2W2D5.model.ProbeControl;

public class Runner {
	
	private static ControlCenterProxy ctrl1;
	private static ControlCenterProxy ctrl2;
	
	private static ProbeControl probeCtrl1;
	private static ProbeControl probeCtrl2;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Probe p1 = new Probe(1l, 342.1, 897.2);
		Probe p2 = new Probe(2l, 826.7, 125.3);
		p2.setSmokeLvl(4);
		
		ctrl1 = new ControlCenterProxy();
		ctrl2 = new ControlCenterProxy();
		probeCtrl1 = new ProbeControl(1l, ctrl1);
		probeCtrl2 = new ProbeControl(2l, ctrl2);
		
		p1.addObserver(probeCtrl1);
		p2.addObserver(probeCtrl2);
		
		if(p1.getSmokeLevel() > p1.smokeLimit) {
			System.out.println("Warning, waring, fire within probe 1's building.");
			probeCtrl1.update(p1);
		} else if(p2.getSmokeLevel() > p2.smokeLimit) {
			System.out.println("Warning, waring, fire within probe 2's building.");
			probeCtrl1.update(p2);
		}		
		
	}
	

}
