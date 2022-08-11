
import java.util.ArrayList;
import java.util.Scanner;

import com.ab.Attendee.Attendee;
import com.ab.Event.Event;

public class MainMenu {

	public static void main(String[] args) {

		
		Attendee a1 = new Attendee ("Temitayo", "Afolabi", 01);
		Attendee a2 = new Attendee ("Bolu", "Fola", 02);
		Attendee a3 = new Attendee ("Ore", "Ola", 03);
		Attendee a4 = new Attendee ("Ini", "Okonye", 04);
		Attendee a5 = new Attendee ("Katy", "Perry", 05);
		Attendee a6 = new Attendee ("John", "Legend", 06);
		Attendee a7 = new Attendee ("Noon", "Pew", 07);
		Attendee a8 = new Attendee ("James", "Harrison", 8);
		Attendee a9 = new Attendee ("Katerine", "Eunice", 9);
		Attendee a10 = new Attendee ("Andy", "Murray", 010);
		Attendee a11 = new Attendee ("Micheal", "Chen", 011);
		Attendee a12 = new Attendee ("Kemi", "Jordan", 012);
		Attendee a13 = new Attendee ("Charlie", "Green", 013);
		Attendee a14 = new Attendee ("Mary", "Richard", 014);
		Attendee a15 = new Attendee ("Chris", "Green", 015);
		
		ArrayList<Attendee> attendeeList1 = new ArrayList<>();
		ArrayList<Attendee> attendeeList2 = new ArrayList<>();
		ArrayList<Attendee> attendeeList3 = new ArrayList<>();
		ArrayList<Attendee> attendeeList4 = new ArrayList<>();
		ArrayList<Attendee> attendeeList5 = new ArrayList<>();
		
		attendeeList1.add(a1);
		attendeeList1.add(a2);
		attendeeList1.add(a3);
		attendeeList1.add(a4);
		attendeeList2.add(a5);
		attendeeList2.add(a6);
		attendeeList2.add(a7);
		attendeeList3.add(a8);
		attendeeList3.add(a9);
		attendeeList3.add(a10);
		attendeeList4.add(a11);
		attendeeList4.add(a12);
		attendeeList4.add(a13);
		attendeeList5.add(a14);
		attendeeList5.add(a15);
		
		
//Using ArrayList to display Event	
		Event e1 = new Event (50, "Cochella", "20-1-2023", " Canada");
	    Event e2 = new Event (51, "AfroNation", "05-03-2023", " New York");
	    Event e3 = new Event (52, "EuroVision", "14-05-2023", " Madrid");
	    Event e4 = new Event (53, "Grammys", "27-09-2023", " London");
        Event e5 = new Event (54, "Emmys", "08-11-2023", " Lagos");
		
		ArrayList<Event> events = new ArrayList<>();
		
		events.add(e1);
		events.add(e2);
		events.add(e3);
		events.add(e4);
		events.add(e5);
		
		
		

		e1.setAttendees(attendeeList5);
		e2.setAttendees(attendeeList4);
		e3.setAttendees(attendeeList3);
		e4.setAttendees(attendeeList2);
		e5.setAttendees(attendeeList1);
	
	
		  
	//Display Menu	  
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("1.List all the events in the system");
		System.out.println("2.List an individual event");
		System.out.println("3. Edit an event ");
		System.out.println("4. Delete an event");
		System.out.println("5. List the attendees attending an event");
		System.out.println("6. Add an attendee to an event");
		System.out.println("7. Delete an attendee from an event");
		System.out.println("8.Exit the Application");
        System.out.println("Enter your choice");
        
        
		String choice; 
		String choice1; 
		String choice3;
		String choice4;
		
		//case 1: . List All Events 
		
		choice =  s1.next();
		
		switch(choice){
		
			case "1":
		
				for (Event e: events){
					
			
					System.out.println(e);
		}
		
		break;
		
		
		
		//Case 2: list an individual event     
		
		
		case "2":
		
		System.out.println("Enter event ID");
		
		
		choice1 = s1.next();
		 
		switch(choice1) {
			

			case "50":
			System.out.println (e1);
			break;
		
			case "51":
			System.out.println (e2);
			break;
	
			case "52":
			System.out.println (e3);
			break;
		
			case "53":
			System.out.println (e4);
			break;
		
			case "54":
			System.out.println (e5);
			
		}
			break;
			
			
		//Case 3: Edit an event
		
		case "3":
		
	
		
		
		
		//case 4: . Delete an event
		
	
		case "4":
		
		System.out.println("Enter event ID");
		
		choice3 = s1.next();
		
		switch(choice3) {
			case "50":
			events.remove(0);
			System.out.println ("Event removed");
			break;
			
			case "51":
			events.remove(1);
			System.out.println ("Event removed");
			break;
			
			case "52":
			events.remove(2);
			System.out.println ("Event removed");
			break;
			
			case "53":
			events.remove(3);
			System.out.println ("Event removed");
			break;
			
			case "54":
			events.remove(4);
			System.out.println ("Event removed");
			
		}
			break;
			
		
		//case 5: List the attendees attending an event
		

		case "5":
			
		System.out.println("Enter event ID");
		
		choice4 = s1.next();
		
		switch (choice4) {
		case "50":
			System.out.println(e1.getAttendees());
			break;
			
		case "51":
			System.out.println(e2.getAttendees());
			break;
		
		case "52":
			System.out.println(e3.getAttendees());
			break;
			
		case "53":
			System.out.println(e4.getAttendees());
			break;
			
		case "54":
			System.out.println(e5.getAttendees());
			break;
		}
			
		
			
			
		}	
			
			
			
			
			
		}	
	}


