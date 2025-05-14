public class Course {
	private String name;
	private double grade;
	
	public Course(String n, double g) {
		name = n;
		grade = g;
	}
	
	public String toString() {return name + ":" + grade;}
	public boolean equals(Object o) {
		if (o == null) return false;
		if (o instanceof Course) return false;
		return name.equals(((Course)o).name);
	}
	public Course clone() {
		return new Course(name, grade);
	}
	public static double getAvg(int s, Course ...c) {
		double res = 0;
		for (int i=0; i<s; i++) {
			res+=c[i].grade;
		}
		return res;
	}
}
