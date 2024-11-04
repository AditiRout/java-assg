package firstProj;
import java.util.Date;

public class Book {
	private String isbn;
	private String title;
	private String author;
	private Date datePublished;
	
	public Book(String isbn,String title,String author,Date datePublished) {
		this.isbn=isbn;
		this.title=title;
		this.author=author;
		this.datePublished=datePublished;
	}
	
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Date getDatePublished() {
        return datePublished;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", datePublished=" + datePublished +
                '}';
    }
	
}
