import java.util.Iterator;

public class FolderItr implements Iterator<File> {
    private int i;
    private File[] files;

    public FolderItr(File[] f) {
        files = f;
        i = 0;
    }

    @Override
    public File next() {
        return files[i++];
    }

    @Override
    public boolean hasNext() {
        return i != files.length - 1;
    }
}
