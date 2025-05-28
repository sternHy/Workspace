public class Data {
    private int info;

    public Data(int info) {
        this.info = info;
    }

    public void show() {
        System.out.println(info);
    }

    public int compare(Data d) {
        if (this.info < d.info)
            return -1;
        else
            return 1;
    }
}