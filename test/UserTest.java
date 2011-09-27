
public class UserTest {

	private User user;
	
	public UserTest() {
		createUser();
	}
	
	public void createUser() {
		this.user = new User("Sepp");
		assert this.user != null;
	}
	
	public void testUser() {
		User u = new User ("Hans");
		assert u != null;
		assert u.getCalendar() != null;
	}
	
	public void testGetName() {
		assert this.user.getName() == "Sepp";
	}
	
	public void testSetName() {
		this.user.setName("Fritz");
		assert this.user.getName() == "Fritz";
	}
	
	public void testGetCalendar() {
		assert this.user.getCalendar() != null;
	}
	
	public void testSetCalendar() {
		Calendar calendar = new Calendar("", this.user);
		this.user.setCalendar(calendar);
		assert this.user.getCalendar().equals(calendar);
	}
	
	
}
