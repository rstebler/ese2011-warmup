import java.util.Date;

public class Event {
	
	private boolean isPublic = false;
	private String name;
	private Date start;
	private Date end;
	
	public Event(String name, Date start, Date end, boolean isPublic) {
		this.name = name;
		this.start = start;
		this.end = end;
		this.isPublic = isPublic;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setStart(Date start) {
		this.start = start;
	}
	
	public Date getStart() {
		return this.start;
	}
	
	public void setEnd(Date end) {
		this.end = end;
	}
	
	public Date getEnd() {
		return this.end;
	}
	
	public void setIsPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}
	
	public boolean getIsPublic() {
		return this.isPublic;
	}

}
