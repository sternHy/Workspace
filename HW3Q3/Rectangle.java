public class Rectangle {
    private int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public boolean equals(Object other) {
        if (!(other instanceof Rectangle)) return false;
        Rectangle r = (Rectangle) other;
        return this.width == r.width && this.height == r.height;
    }

    public String toString() {
        return "Rectangle(" + width + "x" + height + ")";
    }
}