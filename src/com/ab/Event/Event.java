package com.ab.Event;

import java.util.List;

import com.ab.Attendee.Attendee;

public class Event {

	 
    private int eventID;
    private String eventDescription;
    private String eventDate;
    private String location;
	private List <Attendee> attendees;
	
	
	
	public Event(int eventID, String eventDescription, String eventDate, String location) {
		this.eventID = eventID;
		this.eventDescription = eventDescription;
		this.eventDate = eventDate;
		this.location = location;
	}
	
	
	
	
	


	public int getEventID() {
		return eventID;
	}


	public void setEventID(int eventID) {
		this.eventID = eventID;
	}


	public String getEventDescription() {
		return eventDescription;
	}


	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}


	public String getEventDate() {
		return eventDate;
	}


	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public List<Attendee> getAttendees() {
		return attendees;
	}


	public void setAttendees(List<Attendee> attendees) {
		this.attendees = attendees;
	}


	@Override
	public String toString() {
		return "Event [eventID=" + eventID + ", eventDescription=" + eventDescription + ", eventDate=" + eventDate
				+ ", location=" + location + "]";
	} 
	


	 
   
	
}

