
public class User {
	
	private String name;
	private Calendar calendar;
	
	public User(String name) {
		this.name = name;
		this.calendar = new Calendar(this.name + "'s Calendar", this);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}
	
	public Calendar getCalendar() {
		return this.calendar;
	}
	
}
