package net.dwgs.eventday.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Comment {
	
private Long idComment;
private User idUser;
private Event idEvent;
private StatusComment idStatusComment;
private String describe;
private Date createTime;

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
public Long getIdComment() {
	return idComment;
}
public void setIdComment(Long idComment) {
	this.idComment = idComment;
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
public StatusComment getIdStatusComment() {
	return idStatusComment;
}
public void setIdStatusComment(StatusComment idStatusComment) {
	this.idStatusComment = idStatusComment;
}
public String getDescribe() {
	return describe;
}
public void setDescribe(String describe) {
	this.describe = describe;
}
@Temporal(TemporalType.DATE)
public Date getCreateTime() {
	return createTime;
}
public void setCreateTime(Date createTime) {
	this.createTime = createTime;
}

}
