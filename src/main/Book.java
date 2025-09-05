package main;

public class Book {
	String title, author, genre, ISBN;
	boolean isAvailable;

	public Book(String title, String author, String genre, String ISBN, boolean isAvailable) {
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.ISBN = ISBN;
		this.isAvailable = isAvailable;
	}
		
}
