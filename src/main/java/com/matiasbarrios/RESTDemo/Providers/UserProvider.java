package com.matiasbarrios.RESTDemo.Providers;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;

import org.springframework.stereotype.Service;

import com.matiasbarrios.RESTDemo.Interfaces.IUserProvider;
import com.matiasbarrios.RESTDemo.Models.User;

@Service 
public class UserProvider implements IUserProvider {

	private final static List<User> DB = new ArrayList<User>();
	@Override
	public List<User> getUsers() {
		return DB;
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return DB.stream()
				.filter(element -> element.getId() == id)
				.findFirst()
				.orElse(null);
	}

	@Override
	public void createUser(User u) {
		u.setId(new Random().ints(100000,10000000).findFirst().orElse(0));
		DB.add(u);
	}

}
