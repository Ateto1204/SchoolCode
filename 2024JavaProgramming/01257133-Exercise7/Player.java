public class Player {
	private String firstName;
	private String lastName;
	private long salary;

	public Player() {
		this("", "", 0); // call other constructor
	}

	public Player(String firstName, String lastName, long salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	// set first name
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// get first name
	public String getFirstName() {
		return firstName;
	}

	// set last name
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// get last name
	public String getLastName() {
		return lastName;
	}

	// set salary
	public void setSalary(long salary) {
		this.salary = salary;
	}

	// get salary
	public long getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Account [firstName=" + firstName + ", lastName=" + lastName + ", balance=" + salary + "]";
	}

}