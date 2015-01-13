package net.dwgs.eventday.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Category {
	
private Long idCategory;
private User idAdmin;
private String name;
private Date createTime;
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
public Long getIdCategory() {
	return idCategory;
}
public void setIdCategory(Long idCategory) {
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
