public class Box {
    private String inside;

    public Box(String i) {
        inside = i;
    }
    public String toString() {
        return "Box with: " + inside;
    }
    public boolean equals(Object o) {
        if (o instanceof Box) {
            Box b = (Box) o;
            return inside.equals(b.inside);
        }
        return false;
    }
}
