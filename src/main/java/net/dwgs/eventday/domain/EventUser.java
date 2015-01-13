package net.dwgs.eventday.domain;

import java.util.Date;

public class EventUser {
	
private int idEventUser;
private Event idEvent;
private User idUser;
//0 aktywny
//1 nie odpowiedzial na zaproszenie (twierdzaca-aktywny/przeczaco-odmowil udzialu)
//2 odmowil udzialu
//3 oczekuje na rekrutacje (twierdzaca-aktywny/przeczaca-odrzucony)
//4 odrzucony
private int idStatus;
private Date createTime;

public int getIdEventUser() {
	return idEventUser;
}
public void setIdEventUser(int idEventUser) {
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
public Date getCreateTime() {
	return createTime;
}
public void setCreateTime(Date createTime) {
	this.createTime = createTime;
}
}
