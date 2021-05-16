package com.kirana.myKiranaapp.entity;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		try {
			//create object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			//read json file and map to java pojo
			Information theInformation = mapper.readValue(new File("src/main/resources/json/inventory2inventory.json.json"), Information.class);
			System.out.println("first item =" + theInformation.getItem());
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}

	}

}
