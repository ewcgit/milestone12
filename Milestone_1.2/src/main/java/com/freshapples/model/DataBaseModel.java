package com.freshapples.model;

import java.util.ArrayList;

/* 
 * Temp class DataBaseModel models a database that stores
 * UserModel type data populated from the RegisterModel
 * */

public class DataBaseModel {
	
	private ArrayList<UserModel> users; // ArrayList used to store various types of variables.
	
	public DataBaseModel() {
		users = new ArrayList<UserModel>();
		
		// Hardcoded example.
		UserModel user1 = new UserModel("Jakin", "Rogel", "2538851975", "jakinrogel@gmail.com", "Jakin", "CodingMasteroftheNight");
		UserModel user2 = new UserModel("Jakin", "Rogel", "2538851975", "jakinrogel@gmail.com", "JakinRogel", "CodingMasteroftheNight");
		
		addUser(user1);
		addUser(user2);
	}
	
	public void addUser(UserModel user) {
		users.add(user);
	}
	
	public ArrayList<UserModel> dataBase() {
		return users;
	}
}
