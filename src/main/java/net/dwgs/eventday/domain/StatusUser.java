package net.dwgs.eventday.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.crypto.Data;
@Entity
public class StatusUser {
	
private Long idUserStatus;
private User idUser;
private User idInspector;
//0 aktywny
//1 usuniety
//2 zablokowany
private int idStatus;
//0 user
//1 admin
private int idPrivilage;
private Data modifyTime;

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
public Long getIdUserStatus() {
	return idUserStatus;
}
public void setIdUserStatus(Long idUserStatus) {
	this.idUserStatus = idUserStatus;
}
public User getIdUser() {
	return idUser;
}
public void setIdUser(User idUser) {
	this.idUser = idUser;
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
public int getIdPrivilage() {
	return idPrivilage;
}
public void setIdPrivilage(int idPrivilage) {
	this.idPrivilage = idPrivilage;
}
public Data getModifyTime() {
	return modifyTime;
}
public void setModifyTime(Data modifyTime) {
	this.modifyTime = modifyTime;
}

}
