package com.designpatterns.structural.adapter;

public class AdapterTest {

	public static void main(String[] args) {
		
		ItalianPlugConnector italianPlugConnector = new ItalianPlugConnector();
		italianPlugConnector.giveElectricity();
		
		
		UKAdapter ukAdapter = new UKAdapter(italianPlugConnector);
		ukAdapter.giveElectricity();
		
	}

}
