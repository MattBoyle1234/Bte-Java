
public class Book {
	
	public Object title;
	String author;

	public Book(String string) {
	this.title=string;
	this.author ="unknown author";
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Object getTitle() {
		return title;
	}

}
