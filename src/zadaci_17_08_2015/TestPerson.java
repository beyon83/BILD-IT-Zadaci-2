package zadaci_17_08_2015;

public class TestPerson {

	public static void main(String[] args) {
		
		/** Instantiate objects */
		Person person = new Person("Pero Peric", "Petrovo 74317", "555-5555-5555", "test@email.com");
		Person student = new Student("Marko Markovic", "Dobojska 22b", "333-3333-3333", "marko@mail.com", "junior");
		Person employee = new Employee("Ivan Ivanovic", "Petrovo 74317", "555-5555-5555", "test@email.com", "Office", "1500$");
		Person faculty = new Faculty("Zivko Zivkovic", "Petrovo 74317", "555-5555-5555", "test@email.com", "Office", "1400$", 8, "Teacher");
		Person staff = new Staff("Drago Dragic", "Petrovo 74317", "555-5555-5555", "test@email.com", "Office", "1000$", "Housekeeper");
		
		/** Display results */
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
		
	}

}
