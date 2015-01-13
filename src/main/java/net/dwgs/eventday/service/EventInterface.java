package net.dwgs.eventday.service;

import java.util.List;

import net.dwgs.eventday.domain.Event;
import net.dwgs.eventday.domain.User;

public interface EventInterface {
	void addEvent(Event event);
	List<Event> getAllEvents();
	void deleteEvent(Event event);
	Event findEvent (Event event);
	Event findEventById(long id);
	
	List<Event> getEventsByUser(User user);
	void addComment(Event event, User user);
	void joinEvent(Event event, User user);
	void rejectEvent(Event event, User user);
}
