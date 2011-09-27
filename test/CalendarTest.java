import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class CalendarTest {
	
	private User owner;
	private Calendar calendar;
	private Event event;
	
	public CalendarTest() {
		this.owner = new User("Sepp");
		this.event = new Event("NewEvent", new Date(), new Date(), false);
		createCalendar();
	}
	
	public void createCalendar() {
		this.calendar = new Calendar("Sepp", owner);
		assert this.calendar != null;
	}
	
	public void testGetName() {
		assert this.calendar.getName() == "Sepp";
	}
	
	public void testSetName() {
		this.calendar.setName("CalendarName");
		assert this.calendar.getName() == "CalendarName";
	}
	
	public void testGetOwner() {
		assert this.calendar.getOwner().equals(owner);
	}
	
	public void testGetEventList() {
		User u1 = new User("User1");
		User u2 = new User("User2");
		List<Event> events;
		Date start = null;
		Date end = null;
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
		
		try {
			start = dateFormat.parse("2011-09-21 21:15:00 +0200");
			end = dateFormat.parse("2011-09-23 21:17:00 +0200");
		} catch (ParseException e) {
			System.out.println("Invalid date!");
			e.printStackTrace();
			System.exit(0);
		}
				
		u1.getCalendar().addEvent("PublicEvent1", start, end, true);
		u1.getCalendar().addEvent("PrivateEvent1", start, end, false);
		u1.getCalendar().addEvent("PublicEvent2", start, end, true);
		
		events = u1.getCalendar().getEventList(start);
		assert events != null;
		assert events.size() == 3;
		
		events = u2.getCalendar().getEventList(u1.getCalendar(), start);
		assert events != null;
		assert events.size() == 2;
	}
	
	public void testGetEventIterator() {
		assert this.calendar.getEventIterator(this.calendar, new Date()) != null;
	}
	
	public void testAddEvent() {
		this.calendar.addEvent("NewEvent", new Date(), new Date(), false);
		assert this.calendar.GetNumberOfEvents() == 1;
	}
	
	public void testAddEvent2() {
		int temp = this.calendar.GetNumberOfEvents();
		this.calendar.addEvent(this.event);
		assert this.calendar.GetNumberOfEvents() == temp+1;
	}
	
	public void testRemoveEvent() {
		int temp = this.calendar.GetNumberOfEvents();
		this.calendar.removeEvent(this.event);
		assert this.calendar.GetNumberOfEvents() == temp-1;
	}

}
