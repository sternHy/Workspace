public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object other) {
        if (!(other instanceof Point)) return false;
        Point p = (Point) other;
        return this.x == p.x && this.y == p.y;
    }

    public String toString() {
        return "Point(" + x + "," + y + ")";
    }
}