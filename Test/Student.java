public class Student {
	private int id;
	private Course[] courses;
	private int counter = 0;
	
	public Student(int i, Course ...c) {
		id = i;
		courses = new Course[3];
		for (Course j:c) {
			addCourse(j);
		}
	}
	
	public void addCourse(Course c) {
		try {
			courses[counter++] = c;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			Course[] tmp = new Course[courses.length * 2];
			for (int i=0; i<courses.length; i++) {
				 tmp[i] = courses[i];
			}
			tmp[counter++] = c;
			courses = tmp;
			System.out.println("The courses array ran out of space, I doubled it's length and added the course");
		}
	}
	
	public double calculateAvarage() {
		try {
			return Course.getAvg(counter, courses)/counter;
		}
		catch (ArithmeticException e) {
			System.out.println("You have zero courses");
			return 0;
		}
	}
	
	private Course findCourse(Course c) {
		for (int i=0; i<counter; i++) {
			if (courses[i].equals(c)) return c.clone();
		}
		return null;
	}
	
	public void findCourseAndPrint(Course c) {
		System.out.println(findCourse(c));
	}
}
