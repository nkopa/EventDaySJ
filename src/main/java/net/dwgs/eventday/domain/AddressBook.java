package net.dwgs.eventday.domain;

import java.util.Date;

public class AddressBook {
private int idAddressBook;
//0 aktualny
//1 usuniety
//(2 zablokowany)
private int idStatus;
private User idUserOwner;
private User idUser;
private Date createTime;

public int getIdAddressBook() {
	return idAddressBook;
}
public void setIdAddressBook(int idAddressBook) {
	this.idAddressBook = idAddressBook;
}
public int getIdStatus() {
	return idStatus;
}
public void setIdStatus(int idStatus) {
	this.idStatus = idStatus;
}
public User getIdUserOwner() {
	return idUserOwner;
}
public void setIdUserOwner(User idUserOwner) {
	this.idUserOwner = idUserOwner;
}
public User getIdUser() {
	return idUser;
}
public void setIdUser(User idUser) {
	this.idUser = idUser;
}
public Date getCreateTime() {
	return createTime;
}
public void setCreateTime(Date createTime) {
	this.createTime = createTime;
}
}
