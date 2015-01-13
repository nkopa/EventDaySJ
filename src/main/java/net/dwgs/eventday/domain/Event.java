package net.dwgs.eventday.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Event {

private	Long idEvent; 
private User idAuthor;
//0 publiczny
//1 prywatny
private int idAccess; 
//0 wstęp wolny
//1 rekrutacja
private int idRecruitment; 
private Address idAddress;
private String title;
private String drivingDirections;
private int capacity;
private String describe;
private String regulations; //tu pewnie url do pdf
private String dressCode;
private int price;
private int contactNumber;
private String contactEmail; 
private Date createTime;

private Date eventStartDate;
private String eventStartHour;
private Date eventStopDate;
private String eventStopHour;

private Date recruitmentStartDate;
private String recruitmentStartHour;
private Date recruitmentStopDate;
private String recruitmentStopHour;

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
public Long getIdEvent() {
	return idEvent;
}
public void setIdEvent(Long idEvent) {
	this.idEvent = idEvent;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDrivingDirections() {
	return drivingDirections;
}
public void setDrivingDirections(String drivingDirections) {
	this.drivingDirections = drivingDirections;
}
public int getCapacity() {
	return capacity;
}
public void setCapacity(int capacity) {
	this.capacity = capacity;
}
public String getDescribe() {
	return describe;
}
public void setDescribe(String describe) {
	this.describe = describe;
}
public String getRegulations() {
	return regulations;
}
public void setRegulations(String regulations) {
	this.regulations = regulations;
}
public String getDressCode() {
	return dressCode;
}
public void setDressCode(String dressCode) {
	this.dressCode = dressCode;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getContactNumber() {
	return contactNumber;
}
public void setContactNumber(int contactNumber) {
	this.contactNumber = contactNumber;
}
public String getContactEmail() {
	return contactEmail;
}
public void setContactEmail(String contactEmail) {
	this.contactEmail = contactEmail;
}
public User getIdAuthor() {
	return idAuthor;
}
public void setIdAuthor(User idAuthor) {
	this.idAuthor = idAuthor;
}
public Date getCreateTime() {
	return createTime;
}
public void setCreateTime(Date createTime) {
	this.createTime = createTime;
}
public int getIdAccess() {
	return idAccess;
}
public void setIdAccess(int idAccess) {
	this.idAccess = idAccess;
}
public int getIdRecruitment() {
	return idRecruitment;
}
public void setIdRecruitment(int idRecruitment) {
	this.idRecruitment = idRecruitment;
}
public Address getIdAddress() {
	return idAddress;
}
public void setIdAddress(Address idAddress) {
	this.idAddress = idAddress;
}
public Date getEventStartDate() {
	return eventStartDate;
}
public void setEventStartDate(Date eventStartDate) {
	this.eventStartDate = eventStartDate;
}
public String getEventStartHour() {
	return eventStartHour;
}
public void setEventStartHour(String eventStartHour) {
	this.eventStartHour = eventStartHour;
}
public Date getEventStopDate() {
	return eventStopDate;
}
public void setEventStopDate(Date eventStopDate) {
	this.eventStopDate = eventStopDate;
}
public String getEventStopHour() {
	return eventStopHour;
}
public void setEventStopHour(String eventStopHour) {
	this.eventStopHour = eventStopHour;
}
public Date getRecruitmentStartDate() {
	return recruitmentStartDate;
}
public void setRecruitmentStartDate(Date recruitmentStartDate) {
	this.recruitmentStartDate = recruitmentStartDate;
}
public String getRecruitmentStartHour() {
	return recruitmentStartHour;
}
public void setRecruitmentStartHour(String recruitmentStartHour) {
	this.recruitmentStartHour = recruitmentStartHour;
}
public Date getRecruitmentStopDate() {
	return recruitmentStopDate;
}
public void setRecruitmentStopDate(Date recruitmentStopDate) {
	this.recruitmentStopDate = recruitmentStopDate;
}
public String getRecruitmentStopHour() {
	return recruitmentStopHour;
}
public void setRecruitmentStopHour(String recruitmentStopHour) {
	this.recruitmentStopHour = recruitmentStopHour;
}

}
