package net.dwgs.eventday.domain;

import java.awt.image.BufferedImage;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class User {
	
	private Long idUser;
	private Address idAddress;	
	//0 - mezczyzna
	//1 - kobieta
	private boolean idSex;//chyba ze wolicie gender ;P	
	//0 - osoba publiczna
	//1 - osoba prywatna
	private int idAccountType;
	private String login;
	private String email;
	private String password;
	private String name;
	private String surname;
	private Date birthday;	
	private String interests;//albo w postacilisty	
	private BufferedImage profileImage;
	private Date createTime;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public Address getIdAddress() {
		return idAddress;
	}
	public void setIdAddress(Address idAddress) {
		this.idAddress = idAddress;
	}
	public boolean isIdSex() {
		return idSex;
	}
	public void setIdSex(boolean idSex) {
		this.idSex = idSex;
	}
	public int getIdAccountType() {
		return idAccountType;
	}
	public void setIdAccountType(int idAccountType) {
		this.idAccountType = idAccountType;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getInterests() {
		return interests;
	}
	public void setInterests(String interests) {
		this.interests = interests;
	}
	public BufferedImage getProfileImage() {
		return profileImage;
	}
	public void setProfileImage(BufferedImage profileImage) {
		this.profileImage = profileImage;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
}
