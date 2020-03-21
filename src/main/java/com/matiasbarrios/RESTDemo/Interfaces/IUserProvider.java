package com.matiasbarrios.RESTDemo.Interfaces;
import java.util.List;

import com.matiasbarrios.RESTDemo.Models.User;

public interface IUserProvider {
	List<User> getUsers();
	User getUserById(int id);
	void createUser(User u);
}
