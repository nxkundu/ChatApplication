package com.nxkundu.client.main;

import com.nxkundu.client.service.ClientService;

/**
 * 
 * @author nxkundu
 *
 */
public class Main {
	
	public static void main(String[] args) {
		
		ClientService service = new ClientService();
		service.login("nxkundu1@gmail.com");
		service.sendPacket("nxkundu2@gmail.com");
	}

}
