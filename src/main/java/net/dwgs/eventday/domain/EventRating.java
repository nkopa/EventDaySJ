package net.dwgs.eventday.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class EventRating {
private Long idEventRating;
private User idUser;
private Event idEvent;
private int rating;
private Date createTime;

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
public Long getIdEventRating() {
	return idEventRating;
}
public void setIdEventRating(Long idEventRating) {
	this.idEventRating = idEventRating;
}
public User getIdUser() {
	return idUser;
}
public void setIdUser(User idUser) {
	this.idUser = idUser;
}
public Event getIdEvent() {
	return idEvent;
}
public void setIdEvent(Event idEvent) {
	this.idEvent = idEvent;
}
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}
@Temporal(TemporalType.DATE)
public Date getCreateTime() {
	return createTime;
}
public void setCreateTime(Date createTime) {
	this.createTime = createTime;
}
}
