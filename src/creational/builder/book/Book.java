package creational.builder.book;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title, author;
    private int pages;
    List<String> chapters;
    private Book(Builder b) {
        title = b.title;
        author = b.author;
        pages = b.pages;
        chapters = b.chapters;
    }

    public void inSach() {
        System.out.println("Tieu de: " + title);
        System.out.println("Tac gia: " + author);
        System.out.println("Tong so trang: " + pages);
        System.out.println("Cac chuong: ");
        for(var c:chapters)
            System.out.println("\t" + c);
    }


    static public class Builder {
        private String title, author;
        private int pages;
        List<String> chapters;

        public Builder buildBook(String title, String author, int pages) {
            this.title = title;
            this.author = author;
            this.pages = pages;
            this.chapters = new ArrayList<>();

            return this;
        }

        public Builder addChapter(String chapter) {
            chapters.add(chapter);

            return this;
        }

        public Book build() {
            return new Book(this);
        }

    }
}
