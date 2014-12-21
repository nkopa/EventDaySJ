package net.dwgs.eventday.domain;

import java.awt.image.BufferedImage;
import java.util.Date;

public class User {
	//0 - osoba publiczna
	//1 - osoba prywatna
	private boolean accountType;
	
	private String name;
	private String surname;
	private Date birthday;
	
	//0 - mezczyzna
	//1 - kobieta
	private boolean sex;//chyba ze wolicie gender ;P
	private String login;
	private String email;
	private String password;
	private Address address;
	
	//zainteresowania
	private String interests;//albo w postaci listy
	
	//zdjęcie profilowe
	private BufferedImage profileImage;

	
	//GET/SET ATRYBUTY
	public boolean isAccountType() {
		return accountType;
	}

	public void setAccountType(boolean accountType) {
		this.accountType = accountType;
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

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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
}
