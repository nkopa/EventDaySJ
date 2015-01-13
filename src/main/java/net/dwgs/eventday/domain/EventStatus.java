package net.dwgs.eventday.domain;

import java.util.Date;

public class EventStatus {
	
private int idEventStatus;
private Event idEvent;
//0 aktywny
//1 usuniety
//2 zablokowany
private int idStatus;
private User idInspector;
private Date createTime;


public int getStatus_id() {
	return idStatus;
}
public void setStatus_id(int status_id) {
	this.idStatus = status_id;
}
public int getIdEventStatus() {
	return idEventStatus;
}
public void setIdEventStatus(int idEventStatus) {
	this.idEventStatus = idEventStatus;
}
public User getIdInspector() {
	return idInspector;
}
public void setIdInspector(User idInspector) {
	this.idInspector = idInspector;
}
public Event getIdEvent() {
	return idEvent;
}
public void setIdEvent(Event idEvent) {
	this.idEvent = idEvent;
}
public Date getCreateTime() {
	return createTime;
}
public void setCreateTime(Date createTime) {
	this.createTime = createTime;
}
}
