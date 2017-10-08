package com.designpatterns.structural.adapter;

public class UKAdapter extends UKPlugConnector {

	private ItalianPlugConnector plug;
	
	public UKAdapter(ItalianPlugConnector plug) {
		this.plug = plug;
	}

	public ItalianPlugConnector getPlug() {
		return plug;
	}
	public void setPlug(ItalianPlugConnector plug) {
		this.plug = plug;
	}

}
