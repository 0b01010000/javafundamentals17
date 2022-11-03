public class CallBook {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3};

		Book[] books = {
			new Book("The Silent Patient", "Alex Michaelides", 100.0),
			new Book("Pet Sematary", "Stephen King", 70.0),
			null,
			new Book("Senhora", "José de Alencar", 50.0),
			new Book("O Ceifador", "Shusterman", 30.0)
		};

		System.out.println("===========");
		for (Book b : books) {
			if (b != null) {
				System.out.printf(" Title: %s %n Author: %s %n Price: %.2f%n", 
				b.getTitle(), b.getAuthor(), b.getPrice());
			} else {
				System.out.println("This item is empty.");
			}
			System.out.println("===========");
		}
	}
}