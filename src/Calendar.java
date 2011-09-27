import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Calendar {
	
	private List<Event> events = new LinkedList<Event>();
	private String name;
	private User owner;
	
	public Calendar(String name, User owner) {
		this.name = name;
		this.owner = owner;
	}
	
	public void addEvent(String name, Date start, Date end, boolean isPublic) {
		Event event = new Event(name, start, end, isPublic);
		addEvent(event);
	}
	
	public void addEvent(Event event) {
		events.add(event);
	}
	
	public void removeEvent(Event event) {
		events.remove(event);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public User getOwner() {
		return this.owner;
	}
	
	public Iterator<Event> getEventIterator(Date date) {
		return getEventIterator(this, date);
	}
	
	public Iterator<Event> getEventIterator(Calendar calendar, Date date) {
		return getEventList(calendar, date).iterator();
	}
	
	public List<Event> getEventList(Date date) {
		return getEventList(this, date);
	}
	
	public List<Event> getEventList(Calendar calendar, Date date) {
		List<Event> events = new LinkedList<Event>();
		for(Event event: calendar.events) {
			if(event.getEnd().after(date) && (event.getIsPublic() || this.owner.equals(calendar.owner))) {
				events.add(event);
			}
		}
		return events;
	}
	
	
	public int GetNumberOfEvents() {
		return this.events.size();
	}
	
	public void ShowEvents(Date date) {
		ShowEvents(this, date);
	}
	
	public void ShowEvents(Calendar calendar, Date date) {
		System.out.println(this.owner.getName() + " requests events from calendar \"" + calendar.getName() + "\" owned by " + calendar.getOwner().getName() + ":");
		Iterator<Event> iterator = getEventIterator(calendar, date);
		Event event = null;
		while(iterator.hasNext()) {
			event = iterator.next();
			System.out.println("Name: " + event.getName());
			System.out.println("Start: " + event.getStart().toString());
			System.out.println("End: " + event.getEnd().toString());
			System.out.println();
		}
		System.out.println("---");
		System.out.println();
	}
	
}
