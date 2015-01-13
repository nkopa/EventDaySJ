package net.dwgs.eventday.domain;

import javax.xml.crypto.Data;

public class StatusUser {
	
private int idUserStatus;
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

public int getIdUserStatus() {
	return idUserStatus;
}
public void setIdUserStatus(int idUserStatus) {
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
