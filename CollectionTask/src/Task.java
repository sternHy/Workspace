public class Task implements Comparable<Task> {
    private String name, des;
    private int prio;

    public Task(int p, String n, String d) throws prioOutOfRange {
        if (p < 1 || p > 5)
            throw new prioOutOfRange("The priority element you gave isn't between 1 and 5");
        prio = p;
        name = n;
        des = d;
    }

    @Override
    public int compareTo(Task t) {
        return ((Task) (t)).prio - prio;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Task) {
            return ((Task) (o)).name.equals(name);
        }
        return false;
    }

    @Override
    public String toString() {
        return name + ": \nDescription: " + des + "\nPriority:" + prio;
    }
}
