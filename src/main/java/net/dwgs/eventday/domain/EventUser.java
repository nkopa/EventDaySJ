package net.dwgs.eventday.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class EventUser {
	
private Long idEventUser;
private Event idEvent;
private User idUser;
//0 aktywny
//1 nie odpowiedzial na zaproszenie (twierdzaca-aktywny/przeczaco-odmowil udzialu)
//2 odmowil udzialu
//3 oczekuje na rekrutacje (twierdzaca-aktywny/przeczaca-odrzucony)
//4 odrzucony
private int idStatus;
private Date createTime;

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
public Long getIdEventUser() {
	return idEventUser;
}
public void setIdEventUser(Long idEventUser) {
	this.idEventUser = idEventUser;
}
public Event getIdEvent() {
	return idEvent;
}
public void setIdEvent(Event idEvent) {
	this.idEvent = idEvent;
}
public User getIdUser() {
	return idUser;
}
public void setIdUser(User idUser) {
	this.idUser = idUser;
}
public int getIdStatus() {
	return idStatus;
}
public void setIdStatus(int idStatus) {
	this.idStatus = idStatus;
}
@Temporal(TemporalType.DATE)
public Date getCreateTime() {
	return createTime;
}
public void setCreateTime(Date createTime) {
	this.createTime = createTime;
}
}
