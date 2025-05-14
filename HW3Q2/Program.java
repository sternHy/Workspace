public class Program {
	
	public static void main(String[] args) {
        Showable[] showables = {
            new Person("Alice", 30),
            new Person("Bob", 25)
        };

        System.out.println("showAll");
        Utility.showAll(showables);

        Object[] mixed = {
            new Person("Charlie", 40),
            new Box("Books"),
            "string"
        };

        System.out.println("showAll");
        Utility.showAll(mixed);

        Object[] people = {
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 40)
        };

        System.out.println("search");
        System.out.println("Search for Bob(25): " + Utility.search(people, new Person("Bob", 25)));
        System.out.println("Search for Box: " + Utility.search(mixed, new Box("Books")));
        System.out.println("Search for string: " + Utility.search(mixed, "A simple string"));

        System.out.println("\n=== max ===");
        Object[] comp = {
            new Person("Avi", 22),
            new Person("Dana", 28),
            new Person("Lior", 26)
        };
        Object max = Utility.max(comp);
        System.out.println("Max (oldest person): " + max);

        Object[] badMax = {
            new Person("Alon", 21),
            new Box("Shoes")
        };
        System.out.println("Mixed types max (should be null): " + Utility.max(badMax));
    }

}
