package creational.builder.book;

public class MainBook {
    public static void main(String[] args) {
        Book b = new Book.Builder()
                .buildBook(
                "Sach hay", "Anh Khoa", 12
        )
                .addChapter("Chuong 0: 0 bit noi j")
                .addChapter("Chuong 1: 1 2 3 dzo")
                .build();

        b.inSach();
    }
}
