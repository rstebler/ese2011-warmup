
public class Main {
	public static void main(String[] args) {
		
		UserTest userTest = new UserTest();
		userTest.testUser();
		userTest.testGetName();
		userTest.testSetName();
		userTest.testGetCalendar();
		userTest.testSetCalendar();

		CalendarTest calendarTest = new CalendarTest();
		calendarTest.testGetName();
		calendarTest.testSetName();
		calendarTest.testGetOwner();
		calendarTest.testGetEventList();
		calendarTest.testGetEventIterator();
		calendarTest.testAddEvent();
		calendarTest.testAddEvent2();
		calendarTest.testRemoveEvent();
		
		EventTest eventTest = new EventTest();
		eventTest.testGetName();
		eventTest.testSetName();
		eventTest.testGetIsPublic();
		eventTest.testSetIsPublic();
		eventTest.testGetStart();
		eventTest.testSetStart();
		eventTest.testGetEnd();
		eventTest.testSetEnd();
	}

}