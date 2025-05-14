
public class ListIndexOutOfBound extends RuntimeException {

    public ListIndexOutOfBound() {
        this("list");
    }

    public ListIndexOutOfBound(String name) {
        super(name + " is empty ");
    }
}
