package structural.composite.file;

public class File extends AbstractFile {
    public File(String name) {
        super(name);
    }

    @Override
    public String getStringTreeFolder() {
        return name;
    }

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public AbstractFile addFile(AbstractFile f) {
        return null;
    }

    @Override
    public void removeFile(AbstractFile f) {

    }
}
