package com.techlabs.behaviour.statedesign;

public class Package {
	PackageState state = new Ordered();

	public PackageState getState() {
		return state;
	}

	public void setState(PackageState state) {
		this.state = state;
	}
	public void prevState() {
		state.previous(this);
	}
	public void currState() {
		state.currentstatus();
	}
	
	
	public void nextState() {
		state.next(this);
	}

}
