package net.dwgs.eventday.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import net.dwgs.eventday.domain.User;

@Stateless
//do uzupelnienia - ma korzystac z bazy
public class UserManager implements UserInterface{

	@PersistenceContext
	EntityManager em;
	
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		user.setIdUser(null);
		em.persist(user);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User findUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUserById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
