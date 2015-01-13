package net.dwgs.eventday.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class StatusComment {
	
private int idStatusComment;
private User idInspector;
//0 dostepny
//1 zablokowany
private int idStatus;
private Date createTime;

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
public int getIdStatusComment() {
	return idStatusComment;
}
public void setIdStatusComment(int idStatusComment) {
	this.idStatusComment = idStatusComment;
}
public User getIdInspector() {
	return idInspector;
}
public void setIdInspector(User idInspector) {
	this.idInspector = idInspector;
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
