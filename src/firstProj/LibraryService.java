package firstProj;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryService {
    private Map<String, Library> libraryMap;

   
    public LibraryService() {
        libraryMap = new HashMap<>();
    }

    
    public void addLibrary(Library library) {
        libraryMap.put(library.getName(), library);
    }

    
    public List<Book> getBooksByLibraryName(String libraryName) {
        Library library = libraryMap.get(libraryName);
        if (library != null) {
            return library.getBooks();
        }
        return Collections.emptyList(); 
    }

    public static void main(String[] args) {
        
        List<Book> books = Arrays.asList(
            new Book("978-0134685991", "Effective Java", "Joshua Bloch", new Date()),
            new Book("978-0596009205", "Head First Design Patterns", "Eric Freeman", new Date()),
            new Book("978-0132350884", "Clean Code", "Robert C. Martin", new Date()),
            new Book("978-0201616224", "The Pragmatic Programmer", "Andrew Hunt", new Date()),
            new Book("978-0137081073", "Java Concurrency in Practice", "Brian Goetz", new Date()),
            new Book("978-0596007737", "Java Generics and Collections", "Maurice Naftalin", new Date()),
            new Book("978-0134494166", "Java Performance", "Scott Oaks", new Date()),
            new Book("978-1492056248", "Spring in Action", "Craig Walls", new Date()),
            new Book("978-0135166307", "Modern Java in Action", "Raoul-Gabriel Urma", new Date()),
            new Book("978-0134685991", "Java: The Complete Reference", "Herbert Schildt", new Date())
        );

        // Create two libraries
        Library library1 = new Library("Central Library", "John Doe", books.subList(0, 5));
        Library library2 = new Library("City Library", "Jane Smith", books.subList(5, 10));

        
        LibraryService libraryService = new LibraryService();

        
        libraryService.addLibrary(library1);
        libraryService.addLibrary(library2);

        
        System.out.println("Books in Central Library:");
        for (Book book : libraryService.getBooksByLibraryName("Central Library")) {
            System.out.println(book);
        }

        System.out.println("\nBooks in City Library:");
        for (Book book : libraryService.getBooksByLibraryName("City Library")) {
            System.out.println(book);
        }
    }
}