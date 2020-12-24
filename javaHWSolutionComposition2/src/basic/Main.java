package basic;

public class Main {

	public static void main(String[] args) {
		// initiate the author object
		Author gal = new Author("Gal Matalon", "Netanya");

		// initiate the Book objects with the author
		Book javaBook = new Book("Java for QA", 2000, gal);
		Book seleniumBook = new Book("Selenium for QA", 4000, gal);

		// print the author of the book
		String theBookName = javaBook.getName();
		String theAuthorName = javaBook.getAuthor().getName();
		System.out.println("The author of " + theBookName + " is " + theAuthorName);

		// You can write everything in one line
		System.out.println("The author of " + seleniumBook.getName() + " is " + seleniumBook.getAuthor().getName());

		// Instead of getting the author and then getting his name
		// call a method to get the author name
		System.out.println("The author of " + seleniumBook.getName() + " is " + seleniumBook.whoIsTheAuthor());
	}

}
