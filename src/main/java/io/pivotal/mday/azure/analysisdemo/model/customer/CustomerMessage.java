/**
 * POJO to store customer messages with database annotations
 * 
 * @author Matt Day
 */
package io.pivotal.mday.azure.analysisdemo.model.customer;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.codec.digest.DigestUtils;

@Entity
public class CustomerMessage {
	@Id
	@GeneratedValue
	private Long id;

	private String name;
	@Lob
	private String message;
	@Temporal(TemporalType.DATE)
	private Date date;
	private Double sentiment;
	private String hash;

	public CustomerMessage() {
	}

	public CustomerMessage(String name, String message, Date date) {
		this.name = name;
		this.message = message;
		this.date = date;
		hash();
	}

	public CustomerMessage(String name, String message, Date date, Double sentiment) {
		this.name = name;
		this.message = message;
		this.date = date;
		this.sentiment = sentiment;
		hash();
	}

	private void hash() {
		this.hash = DigestUtils.sha1Hex(message);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getSentiment() {
		return sentiment;
	}

	public void setSentiment(Double sentiment) {
		this.sentiment = sentiment;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

}
