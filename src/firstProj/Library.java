package firstProj;

import java.util.List;

public class Library {
    private String name;
    private String librarianName;
    private List<Book> books;

    // Constructor
    public Library(String name, String librarianName, List<Book> books) {
        this.name = name;
        this.librarianName = librarianName;
        this.books = books;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getLibrarianName() {
        return librarianName;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", librarianName='" + librarianName + '\'' +
                ", books=" + books +
                '}';
    }
}