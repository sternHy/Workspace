public class Person implements Showable, Comparable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void show() {
        System.out.println("Person: " + name + ", Age: " + age);
    }
    public int compareTo(Object o) {
        if (o instanceof Person) {
        	Person p = (Person)o;
        	if (this.age > p.age) return 1;
        	if (this.age == p.age) return 0;
        }
        return -1;
    	
    }
    public String toString() {
        return name + " (" + age + ")";
    }
    public boolean equals(Object o) {
        if (o instanceof Person) {
            Person p = (Person) o;
            return name.equals(p.name) && age == p.age;
        }
        return false;
    }
}