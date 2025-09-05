package main;

import java.util.*;

public class ConsoleLibrary {
	static Scanner scanner = new Scanner(System.in);
	static int menuSelection;
	static boolean hasSelectedMenu = false;
	static ArrayList<Book> books = new ArrayList<>();
	
	

	public static void main(String[] args) {
		BookDatabaseGenerate();
		while (true) {
			while(!hasSelectedMenu) {
				MenuPrompt();
				menuSelection = validNumberInput(scanner, ">> ");
				switch (menuSelection) {
					case 1: 
						hasSelectedMenu = true;
						viewBooks();
						break;
					case 2:
						System.exit(0);
						System.out.println("Thank you for using the program.");
				}
			}
		}
	}
	
	public static void BookDatabaseGenerate() {
		books.add(new Book("Book1", "Book1 - Author", "Book1 - Genre", "978-0-321-54325-1", true));
		books.add(new Book("Book2", "Book2 - Author", "Book2 - Genre", "978-0-321-54325-2", true));
		books.add(new Book("Book3", "Book3 - Author", "Book3 - Genre", "978-0-321-54325-3", true));
	}
	
	
	public static void MenuPrompt() {
		System.out.println("===================================");
		System.out.println("\t  LIBRARY CONSOLE");
		System.out.println("===================================");
		System.out.println(" [1] View Books\n");
		System.out.println(" [2] Exit");
		System.out.println();
	}
	
	public static int validNumberInput(Scanner sc, String prompt) {
		int num;
		System.out.printf(prompt);
		while (true) {
			try {
				String sNum = sc.nextLine().trim();
				num = Integer.parseInt(sNum);
				break;
			}catch(NumberFormatException e) {
				System.out.println("You entered invalid input. Try again.");
			}
		}
		return num;
	}
	

	public static void searchBook(Scanner sc) {
	    boolean bookFound = false;
	    String searchString = sc.nextLine().trim().toLowerCase();

	    if (searchString.equals("0")) {
	        System.out.println("Thank you for using the program.");
	        System.exit(0);
	    }
	    for (Book search : books) {
	        if (search.title.toLowerCase().contains(searchString) ||
	            search.author.toLowerCase().contains(searchString) ||
	            search.ISBN.toLowerCase().contains(searchString) ||
	            search.genre.toLowerCase().contains(searchString)) {

	            bookFound = true;
	            System.out.println("Result(s): " + search.title +
	                               " | Author: " + search.author +
	                               " [Genre] " + search.genre);
	        }
	    }

	    if (!bookFound) {
	        System.out.println("Book not found.");
	    }
	}

	
	public static void viewBooks() {
		System.out.println("===================================");
		System.out.println("\t  BOOKS CATALOG");
		System.out.println("===================================");
		
		for (Book b : books ) {
			if (b.isAvailable == true) {
				System.out.println("ISBN: " + b.ISBN +
						"| Title: " + b.title + 
						"| Author: " + b.author +
						"| Genre: " + b.genre + 
						"| Available: Yes"
						); 
			} else if (b.isAvailable == false)  {
				System.out.println("ISBN: " + b.ISBN +
						"| Title: " + b.title + 
						"| Author: " + b.author +
						"| Genre: " + b.genre + 
						"| Available: No"
						);
			}
		}
		System.out.println();
		while (true) {
			System.out.printf("Search bar (0 to exit): " );
			searchBook(scanner);
		}
	}
	
	
}
