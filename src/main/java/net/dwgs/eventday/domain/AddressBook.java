package net.dwgs.eventday.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class AddressBook {
private int idAddressBook;
//0 aktualny
//1 usuniety
//(2 zablokowany)
private Long idStatus;
private User idUserOwner;
private User idUser;
private Date createTime;
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
public int getIdAddressBook() {
	return idAddressBook;
}
public void setIdAddressBook(int idAddressBook) {
	this.idAddressBook = idAddressBook;
}
public Long getIdStatus() {
	return idStatus;
}
public void setIdStatus(Long idStatus) {
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
