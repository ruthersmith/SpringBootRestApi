package io.ruthersmith.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Talk {
	
	@Id @GeneratedValue
	private int id;
	private String name;
	private String speaker;
	private String venue;
	private String duration;
	
	
	public Talk() {}
	
	public Talk(int id, String name, String speaker, String venue, String duration) {
		super();
		this.id = id;
		this.name = name;
		this.speaker = speaker;
		this.venue = venue;
		this.duration = duration;
	}
	
	public Talk(String name, String speaker, String venue, String duration) {
		this.name = name;
		this.speaker = speaker;
		this.venue = venue;
		this.duration = duration;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpeaker() {
		return speaker;
	}
	public void setSpeaker(String speaker) {
		this.speaker = speaker;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
}
