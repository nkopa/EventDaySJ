package net.dwgs.eventday.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class EventStatus {
	
private Long idEventStatus;
private Event idEvent;
//0 aktywny
//1 usuniety
//2 zablokowany
private int idStatus;
private User idInspector;
private Date createTime;

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
public int getStatus_id() {
	return idStatus;
}
public void setStatus_id(int status_id) {
	this.idStatus = status_id;
}
public Long getIdEventStatus() {
	return idEventStatus;
}
public void setIdEventStatus(Long idEventStatus) {
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
@Temporal(TemporalType.DATE)
public Date getCreateTime() {
	return createTime;
}
public void setCreateTime(Date createTime) {
	this.createTime = createTime;
}
}
