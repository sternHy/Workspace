
public class Program {

    public static void main(String[] args) {
        System.out.println("d");
        TaskManager tm = new TaskManager();
        System.out.println(tm.size());
        tm.addTask(new Task(1, "1", "hy"));
        System.out.println(tm.size());
        tm.addTask(new Task(3, "2", "hy"));
        tm.addTask(new Task(2, "3", "hy"));
        tm.addTask(new Task(5, "4", "hy"));
        System.out.println(tm);
        tm.clear();
        System.out.println(tm);
        tm.addTask4Reoven(new Task(4, "1", "hy"));
        System.out.println(tm);
    }
}
