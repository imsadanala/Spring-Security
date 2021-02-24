package com.ss.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ss.dto.User;

@Repository
public class UserService {

	List<User> usersList;

	{
		usersList = new ArrayList<>();
		usersList.add(new User(1, "A", new Date()));
		usersList.add(new User(2, "B", new Date()));
		usersList.add(new User(3, "C", new Date()));
	}

	public List<User> findAll() {
		return usersList;
	}

	public User add(User user) {
		if (user.getId() == null) {
			user.setId(usersList.size() + 1);
		}
		usersList.add(user);
		return user;
	}

	public User findById(Integer id) {
		return usersList.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
	}

	public List<User> deleteById(Integer userId) {
		usersList.removeIf(user -> user.getId().equals(userId));
		return usersList;
	}
}
