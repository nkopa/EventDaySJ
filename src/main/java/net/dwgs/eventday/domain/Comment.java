package net.dwgs.eventday.domain;

import java.util.Date;

public class Comment {
	
private int idComment;
private User idUser;
private Event idEvent;
private StatusComment idStatusComment;
private String describe;
private Date createTime;

public int getIdComment() {
	return idComment;
}
public void setIdComment(int idComment) {
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
public Date getCreateTime() {
	return createTime;
}
public void setCreateTime(Date createTime) {
	this.createTime = createTime;
}

}
