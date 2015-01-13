package net.dwgs.eventday.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EventCategory {
	
private int idEventCategory;
private Event idEvent;
private int idCategory;

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
public int getIdEventCategory() {
	return idEventCategory;
}
public void setIdEventCategory(int idEventCategory) {
	this.idEventCategory = idEventCategory;
}
public Event getIdEvent() {
	return idEvent;
}
public void setIdEvent(Event idEvent) {
	this.idEvent = idEvent;
}
public int getIdCategory() {
	return idCategory;
}
public void setIdCategory(int idCategory) {
	this.idCategory = idCategory;
}
}
