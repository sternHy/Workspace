import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<Task>();
    }

    public int size() {
        return tasks.size();
    }

    public void clear() {
        tasks.clear();
    }

    public void addTask(Task t) {
        for (int i = 0; i < tasks.size(); i++) {
            if (t.compareTo(tasks.get(i)) > 0) {
                tasks.add(i, t);
                return;
            }
        }
        tasks.add(t);
    }

    public void remove(Task t) {
        tasks.remove(t);
    }

    public boolean contains(Task t) {
        return tasks.contains(t);
    }

    @Override
    public String toString() {
        String res = "(";
        for (Task t : tasks) {
            res += t.toString() + ", ";
        }
        return res + ")";
    }

    public void addTask4Reoven(Task t) {
        tasks.add(t);
        tasks.sort(null);
    }
}
