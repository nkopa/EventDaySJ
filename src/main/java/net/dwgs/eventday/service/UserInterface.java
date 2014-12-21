package net.dwgs.eventday.service;

import java.util.List;

import net.dwgs.eventday.domain.User;

//wstepna wersja, do poprawki
public interface UserInterface {
	void addUser(User user);
	List<User> getAllUsers();
	void deleteUser(User user);
	User findUser(User user);
	User findUserById(long id);
}
