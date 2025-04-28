package structural.composite.file;

abstract public class AbstractFile {
    String name, path;
    String prefix = " ";

    public AbstractFile(String name) {
        this.name = name;
        this.path = name;
    }

    public abstract String getStringTreeFolder();
    public abstract String getPath();
    public abstract AbstractFile addFile(AbstractFile f);

    public abstract void removeFile(AbstractFile f);
}
