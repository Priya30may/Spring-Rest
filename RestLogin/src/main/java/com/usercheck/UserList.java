package com.usercheck;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import com.userlogin.User;

@Service
public class UserList implements Check {

	List<User> users;

	public UserList() {
		users = new ArrayList<>();
		users.add(new User("Patrick", "A1235678"));
		users.add(new User("Swetha", "Zcdecf45"));
		users.add(new User("Ritish", "Slmnyr4567"));
		users.add(new User("Akshay", "Prgfdr333"));
		users.add(new User("Siva", "Password123"));
		users.add(new User("Priyanka", "Pass123456"));
		users.add(new User("Srividya", "lalalla33"));
		users.add(new User("Dinesh", "Pass12678"));
	}

	@Override
	public String check(User u1) {
		for (User u : users)
			{
		  if(u.getUserName().matches(u1.getUserName()))
		  {
			  if(u.getPassword().matches(u1.getPassword())) 
					return  "Valid User"; 
		  }
			}
		return "Invalid User";
	}

}
