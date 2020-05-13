package com.computacion9.clase4;

import java.io.Serializable;

public class User implements Serializable {
	
	private static final long serialVersionUID = -2245886338205563022L;
	
	protected int Id;
	protected String Name;
	protected String Password;
	protected String Firstname;
	protected String Lastname;
	
	public User(int id, String name, String password, String firstname, String lastname) {
		super();
		Id = id;
		Name = name;
		Password = password;
		Firstname = firstname;
		Lastname = lastname;
	}
	
	public User(int id, String name, String password) {
		super();
		Id = id;
		Name = name;
		Password = password;
	}
	
	
}
