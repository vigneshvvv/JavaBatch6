package sample;

public class UserProfile {
	int id;
	String name;
	String subject;
	int mark;
	
	public UserProfile() {
		super();
	}
	
	public UserProfile(int id, String name, String subject, int mark) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.mark = mark;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "UserProfile [id=" + id + ", name=" + name + ", subject=" + subject + ", mark=" + mark + "]";
	}
	
	
	

}
