public class Contact { 
	private String title;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String image;


	public Contact(String title, String firstName, String lastName, String email, String phoneNumber, String image) 
	{
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.image = image;
	}
	public String title() {
		return title;
	}

	public void settitle(String title) {
		this.title = title;
	}
	public String image() {
		return image;
	}

	public void setimage(String image) {
		this.image = image;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {return title();}
	
}
