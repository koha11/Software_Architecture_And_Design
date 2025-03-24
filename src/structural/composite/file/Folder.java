package structural.composite.file;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile {
    List<AbstractFile> files;

    public Folder(String name) {
        super(name);
        this.files = new ArrayList<>();;
    }

    @Override
    public String getStringTreeFolder(int tier) {
        StringBuilder res = new StringBuilder();

        res.append(this.name);

        for (var file : files) {
            res.append("\n").append("\t".repeat(tier)).append(file.getStringTreeFolder(tier+1));
        }

        return res.toString();
    }

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public AbstractFile addFile(AbstractFile f) {
        if(!files.contains(f))
        {
            files.add(f);
            f.path = this.path + "\\" + f.path;
            return this;
        }

        return this;
    }

    @Override
    public void removeFile(AbstractFile f) {
        if(files.contains(f))
        {
            files.remove(f);
        }
        else
            return;

    }
}
