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
			MenuPrompt();
			while(!hasSelectedMenu) {
				menuSelection = validNumberInput(scanner, ">> ");
				switch (menuSelection) {
					case 1: 
						hasSelectedMenu = true;
						viewBooks();
						break;
					case 2:
						System.exit(0);
						System.out.println("Thank you for using the program.");
					default:
						System.out.println("\nInvalid Input. Try again.");
						break;
				}
			}
		}
	}
	
	public static void BookDatabaseGenerate() {
		books.add(new Book("The Silent Forest", "Anna Reyes", "Mystery", "9780321543251", true));
		books.add(new Book("Echoes of Tomorrow", "Michael Cruz", "Science Fiction", "9780321543252", true));
		books.add(new Book("Shadows of the Past", "Lara Mendoza", "Thriller", "9780321543253", true));
		books.add(new Book("Whispers in the Wind", "David Tan", "Romance", "9780321543254", true));
		books.add(new Book("The Final Dawn", "Carlos Dizon", "Fantasy", "9780321543255", true));

		books.add(new Book("Beneath the Waves", "Isabel Santos", "Adventure", "9780321543256", true));
		books.add(new Book("The Forgotten Kingdom", "Jose Ramirez", "Historical Fiction", "9780321543257", true));
		books.add(new Book("Fragments of Light", "Catherine Lopez", "Drama", "9780321543258", true));
		books.add(new Book("Into the Abyss", "Robert Chua", "Horror", "9780321543259", true));
		books.add(new Book("The Painted Sky", "Elaine Villanueva", "Romance", "9780321543250", true));

		books.add(new Book("Stormbreak", "Victor Lim", "Fantasy", "97803215432511", true));
		books.add(new Book("A Dance with Time", "Patricia Ocampo", "Science Fiction", "97803215432512", true));
		books.add(new Book("Silent Tears", "Maria Gomez", "Drama", "97803215432513", true));
		books.add(new Book("The Iron Empire", "Gabriel Flores", "Fantasy", "97803215432514", true));
		books.add(new Book("Broken Chains", "Sofia Ramos", "Historical Fiction", "97803215432515", true));

		books.add(new Book("Rise of the Phoenix", "Daniel Yu", "Adventure", "97803215432516", true));
		books.add(new Book("Whispering Shadows", "Angela Co", "Mystery", "97803215432517", true));
		books.add(new Book("The Hidden Path", "Francis Cruz", "Thriller", "97803215432518", true));
		books.add(new Book("Chasing Starlight", "Olivia Bautista", "Romance", "97803215432519", true));
		books.add(new Book("Edge of Eternity", "Leonardo Navarro", "Science Fiction", "97803215432520", true));

		books.add(new Book("Blood and Honor", "Ricardo Salazar", "Historical Fiction", "97803215432521", true));
		books.add(new Book("The Ivory Tower", "Monica Gutierrez", "Drama", "97803215432522", true));
		books.add(new Book("Midnight Chase", "Alfredo Ramos", "Thriller", "97803215432523", true));
		books.add(new Book("Wings of Fire", "Clarissa David", "Fantasy", "97803215432524", true));
		books.add(new Book("Lost Horizons", "Julian Perez", "Adventure", "97803215432525", true));

		books.add(new Book("The Crimson Sea", "Stephanie Torres", "Romance", "97803215432526", true));
		books.add(new Book("A World Apart", "Benjamin Tan", "Science Fiction", "97803215432527", true));
		books.add(new Book("Secrets and Lies", "Diana Morales", "Mystery", "97803215432528", true));
		books.add(new Book("Ashes of War", "Fernando Castillo", "Historical Fiction", "97803215432529", true));
		books.add(new Book("The Frozen Throne", "Camille Garcia", "Fantasy", "97803215432530", true));

		books.add(new Book("Dreamcatcher", "Arthur Reyes", "Drama", "97803215432531", true));
		books.add(new Book("Steel and Stone", "Rafael Santos", "Adventure", "97803215432532", true));
		books.add(new Book("The Silver Lining", "Beatriz Cruz", "Romance", "97803215432533", true));
		books.add(new Book("Voices of the Dead", "Hector Lim", "Horror", "97803215432534", true));
		books.add(new Book("Tides of Destiny", "Christina Yu", "Fantasy", "97803215432535", true));

		books.add(new Book("Dark Horizons", "Edgar Ramos", "Thriller", "97803215432536", true));
		books.add(new Book("The Glass Prison", "Sophia De Leon", "Drama", "97803215432537", true));
		books.add(new Book("Kingdom of Ash", "Miguel Bautista", "Fantasy", "97803215432538", true));
		books.add(new Book("Beyond the Stars", "Janine Rivera", "Science Fiction", "97803215432539", true));
		books.add(new Book("Whispers of the Sea", "Oliver Tan", "Romance", "97803215432540", true));

		books.add(new Book("The Darkened Veil", "Paula Jimenez", "Mystery", "97803215432541", true));
		books.add(new Book("Torn Realities", "Christian Ramos", "Science Fiction", "97803215432542", true));
		books.add(new Book("Fallen Grace", "Natalie Cruz", "Drama", "97803215432543", true));
		books.add(new Book("The Eternal Flame", "Oscar Fernandez", "Fantasy", "97803215432544", true));
		books.add(new Book("Silent Watcher", "Ivy Castillo", "Thriller", "97803215432545", true));

		books.add(new Book("The Golden Compass", "Aaron Villanueva", "Adventure", "97803215432546", true));
		books.add(new Book("Shattered Dreams", "Gloria Mendoza", "Drama", "97803215432547", true));
		books.add(new Book("Legends of Valor", "Marco Dela Cruz", "Fantasy", "97803215432548", true));
		books.add(new Book("Voices in the Dark", "Andrea Soriano", "Mystery", "97803215432549", true));
		books.add(new Book("The Last Horizon", "Anthony Lopez", "Science Fiction", "97803215432550", true));


	}
	
	
	public static void MenuPrompt() {
		System.out.println("===================================");
		System.out.println("\t  LIBRARY CONSOLE");
		System.out.println("===================================\n");
		System.out.println(" [1] View Books\n");
		System.out.println(" [2] Exit");
		System.out.println();
	}
	
	public static int validNumberInput(Scanner sc, String prompt) {
		int num;
		while (true) {
			System.out.printf(prompt);
			try {
				String sNum = sc.nextLine().trim();
				num = Integer.parseInt(sNum);
				break;
			}catch(NumberFormatException e) {
				System.out.println("\nYou entered invalid input. Try again.");
				continue;
			}
		}
		return num;
	}
	

	public static void searchBook(Scanner sc) {
	    boolean bookFound = false;
	    String searchString = sc.nextLine().trim().toLowerCase();
	    
	    if (searchString.isEmpty()) {
	    	System.out.println("Search bar cannot be blank.");
	    	return;
	    }

	    if (searchString.equals("0")) {
	        System.out.println("Thank you for using the program.");
	        System.exit(0);
	    }
	    
	    System.out.println("Results for: " + searchString);
	    for (Book search : books) {
	        if (search.title.toLowerCase().contains(searchString) ||
	            search.author.toLowerCase().contains(searchString) ||
	            search.ISBN.toLowerCase().contains(searchString) ||
	            search.genre.toLowerCase().contains(searchString)) {

	            bookFound = true;
	            System.out.println("Title: " + search.title +
	                               " | Author: " + search.author +
	                               " | Genre: " + search.genre +
	            					"| ISBN: " +search.ISBN);
	        }
	    }
	    System.out.println();
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
				System.out.println("Title: " + b.title +
						" | Author: " + b.author + 
						" | Genre: " + b.genre +
						" | ISBN: " + b.ISBN + 
						" | Available: Yes"
						); 
			} else if (b.isAvailable == false)  {
				System.out.println("Title: " + b.title +
						" | Author: " + b.author + 
						" | Genre: " + b.genre +
						" | ISBN: " + b.ISBN + 
						" | Available: No"
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
