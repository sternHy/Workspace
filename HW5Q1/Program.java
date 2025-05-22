public class Program {
    public static void main(String[] args) {
        List myList = new List("TestList");

        // Insert at front
        myList.insertAtFront("C");
        myList.insertAtFront("B");
        myList.insertAtFront("A");
        myList.print(); // Expected: A, B, C

        // Insert at back
        myList.insertAtBack("D");
        myList.insertAtBack("E");
        myList.print(); // Expected: A, B, C, D, E

        // Remove from front
        Object removedFront = myList.removeFromFront();
        System.out.println("Removed from front: " + removedFront);
        myList.print(); // Expected: B, C, D, E

        // Remove from back
        Object removedBack = myList.removeFromBack();
        System.out.println("Removed from back: " + removedBack);
        myList.print(); // Expected: B, C, D

        // Add at position
        myList.addAt(1, "X");
        myList.print(); // Expected: B, X, C, D

        // Remove at position
        Object removedAt = myList.removeAt(2);
        System.out.println("Removed at index 2: " + removedAt);
        myList.print(); // Expected: B, X, D

        // Convert to array
        Object[] array = myList.toArray();
        System.out.print("List as array: ");
        for (Object obj : array) {
            System.out.print(obj + " ");
        }
        System.out.println();

        // Show list
        System.out.println("Show:");
        myList.show(); // Should print: B, X, D

        // Show list in reverse
        System.out.println("Show in reverse:");
        myList.showRev(); // Should print: D, X, B

        // toString
        System.out.println("List toString: " + myList.toString());

    }
}
