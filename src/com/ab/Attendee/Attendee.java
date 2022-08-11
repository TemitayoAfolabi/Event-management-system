package com.ab.Attendee;

import java.util.List;

public class Attendee {

	 private String firstName;
	 private String lastName;
	 private int attendeeId;
	public Attendee(String firstName, String lastName, int attendeeId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.attendeeId = attendeeId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAttendeeId() {
		return attendeeId;
	}
	
	public void setAttendeeId(int attendeeId) {
		this.attendeeId = attendeeId;
	}

	@Override
	public String toString() {
		return "Attendee [firstName=" + firstName + ", lastName=" + lastName + ", attendeeId=" + attendeeId + "]";
	}
	
	
	   
	List<Attendee> attendeeList1; 
	List<Attendee> attendeeList2;
	List<Attendee> attendeeList3;
	List<Attendee> attendeeList4;
	List<Attendee> attendeeList5;
	
}
