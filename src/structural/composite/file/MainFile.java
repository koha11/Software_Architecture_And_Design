package structural.composite.file;

public class MainFile {
    public static void main(String[] args) {
        var folder1 = new Folder("D:");
        var folder2 = new Folder("TaiLieu");
        var folder3 = new Folder("Design Pattern");
        var file1 = new File("CreationalPattern.pptx");
        var file2 = new File("StructuralPattern.pptx");
        var folder4 = new Folder("Lap Trinh Java");
        var file3 = new Folder("LapTrinhJavaCoBan.docx");
        var file4 = new Folder("LapTrinhJavaNangCao.pdf");
        var file5 = new Folder("NgonNguLapTrinhC.pdf");
        var folder5 = new Folder("LapTrinhThietBiDiDong");
        var file6 = new Folder("CoBan.pptx ");
        var file7 = new Folder("NangCao.pptx");

        folder1.addFile(folder2);

        folder2
                .addFile(folder3)
                .addFile(folder4)
                .addFile(file5)
                .addFile(folder5);

        folder3.addFile(file1)
                .addFile(file2);

        folder4.addFile(file3)
                .addFile(file4);


        folder5.addFile(file6)
                .addFile(file7);

        System.out.println(folder1.getStringTreeFolder(1));
        System.out.println(file7.getPath());

        System.out.println(folder4.getStringTreeFolder(1));
    }
}
