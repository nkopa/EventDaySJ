package net.dwgs.eventday.domain;

import java.util.Date;

public class Category {
	
private int idCategory;
private User idAdmin;
private String name;
private Date createTime;

public int getIdCategory() {
	return idCategory;
}
public void setIdCategory(int idCategory) {
	this.idCategory = idCategory;
}
public User getIdAdmin() {
	return idAdmin;
}
public void setIdAdmin(User idAdmin) {
	this.idAdmin = idAdmin;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getCreateTime() {
	return createTime;
}
public void setCreateTime(Date createTime) {
	this.createTime = createTime;
}

}