public class Book {
	private String title;
	private String author;
	private Double price;

	Book() {

	}

	Book(String title, String author, Double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public Double getPrice() {
		return price;
	}
}