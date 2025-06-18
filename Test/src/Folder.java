import java.util.Iterator;

public class Folder implements Cloneable, Iterable<File> {
    private File[] files;
    private int counter;

    public Folder(int size) {
        files = new File[size];
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (!(o instanceof Folder))
            return false;
        Folder f = (Folder) o;
        if (counter != f.counter)
            return false;
        for (int i = 0, posi = -1; i < counter; i++, posi = -1) {
            for (int j = 0; j < counter; j++) {
                if (files[i].equals(f.files[j]))
                    posi = j;
            }
            if (posi == -1)
                return false;
            else {
                f.files[posi] = null;
            }
        }
        return true;
    }

    @Override
    public Object clone() {
        Folder res = new Folder(files.length);
        for (int i = 0; i < counter; i++) {
            res.files[i] = files[i].clone();
        }
        return res;
    }

    @Override
    public Iterator iterator() {
        return new FolderItr(files);
    }
}
