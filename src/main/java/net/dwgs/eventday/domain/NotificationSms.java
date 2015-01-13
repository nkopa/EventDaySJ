package net.dwgs.eventday.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NotificationSms {
	private Long idNotificationSms;
	private User idUser;
	private Event idEvent;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getIdNotificationSms() {
		return idNotificationSms;
	}
	public void setIdNotificationSms(Long idNotificationSms) {
		this.idNotificationSms = idNotificationSms;
	}
	public User getIdUser() {
		return idUser;
	}
	public void setIdUser(User idUser) {
		this.idUser = idUser;
	}
	public Event getIdEvent() {
		return idEvent;
	}
	public void setIdEvent(Event idEvent) {
		this.idEvent = idEvent;
	}
}
