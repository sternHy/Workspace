public class File implements Cloneable {
    private String name;
    private String content;

    public File(String name, String content) {
        this.name = name;
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (!(o instanceof File))
            return false;
        File f = (File) o;
        return name.equals(f.name) && content.length() == f.content.length();
    }

    @Override
    public File clone() {
        return new File(name, content);
    }
}
