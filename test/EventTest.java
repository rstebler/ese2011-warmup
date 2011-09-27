import java.util.Date;


public class EventTest {
	
	private Event event;
	
	public EventTest() {
		createEvent();
	}
	
	public void createEvent() {
		this.event = new Event("EventTest", new Date(), new Date(), false);
	}
	
	public void testGetName() {
		assert this.event.getName() == "EventTest";
	}
	
	public void testSetName() {
		this.event.setName("NewEventTest");
		assert this.event.getName() == "NewEventTest";
	}
	
	public void testGetIsPublic() {
		assert this.event.getIsPublic() == false;
	}
	
	public void testSetIsPublic() {
		this.event.setIsPublic(true);
		assert this.event.getIsPublic() == true;
	}
	
	public void testGetStart() {
		assert this.event.getStart() != null;
	}
	
	public void testSetStart() {
		Date date = new Date();
		this.event.setStart(date);
		assert this.event.getStart().equals(date);
	}
	
	public void testGetEnd() {
		assert this.event.getEnd() != null;
	}
	
	public void testSetEnd() {
		Date date = new Date();
		this.event.setEnd(date);
		assert this.event.getEnd().equals(date);
	}

}
