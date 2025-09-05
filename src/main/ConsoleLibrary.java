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
					default:
						System.out.println("Invalid Input. Try again.");
						break;
				}
			}
		}
	}
	
	public static void BookDatabaseGenerate() {
		books.add(new Book("The Silent Forest", "Anna Reyes", "Mystery", "978-0-321-54325-01", true));
		books.add(new Book("Echoes of Tomorrow", "Michael Cruz", "Science Fiction", "978-0-321-54325-02", true));
		books.add(new Book("Shadows of the Past", "Lara Mendoza", "Thriller", "978-0-321-54325-03", true));
		books.add(new Book("Whispers in the Wind", "David Tan", "Romance", "978-0-321-54325-04", true));
		books.add(new Book("The Final Dawn", "Carlos Dizon", "Fantasy", "978-0-321-54325-05", true));

		books.add(new Book("Beneath the Waves", "Isabel Santos", "Adventure", "978-0-321-54325-06", true));
		books.add(new Book("The Forgotten Kingdom", "Jose Ramirez", "Historical Fiction", "978-0-321-54325-07", true));
		books.add(new Book("Fragments of Light", "Catherine Lopez", "Drama", "978-0-321-54325-08", true));
		books.add(new Book("Into the Abyss", "Robert Chua", "Horror", "978-0-321-54325-09", true));
		books.add(new Book("The Painted Sky", "Elaine Villanueva", "Romance", "978-0-321-54325-10", true));

		books.add(new Book("Stormbreak", "Victor Lim", "Fantasy", "978-0-321-54325-11", true));
		books.add(new Book("A Dance with Time", "Patricia Ocampo", "Science Fiction", "978-0-321-54325-12", true));
		books.add(new Book("Silent Tears", "Maria Gomez", "Drama", "978-0-321-54325-13", true));
		books.add(new Book("The Iron Empire", "Gabriel Flores", "Fantasy", "978-0-321-54325-14", true));
		books.add(new Book("Broken Chains", "Sofia Ramos", "Historical Fiction", "978-0-321-54325-15", true));

		books.add(new Book("Rise of the Phoenix", "Daniel Yu", "Adventure", "978-0-321-54325-16", true));
		books.add(new Book("Whispering Shadows", "Angela Co", "Mystery", "978-0-321-54325-17", true));
		books.add(new Book("The Hidden Path", "Francis Cruz", "Thriller", "978-0-321-54325-18", true));
		books.add(new Book("Chasing Starlight", "Olivia Bautista", "Romance", "978-0-321-54325-19", true));
		books.add(new Book("Edge of Eternity", "Leonardo Navarro", "Science Fiction", "978-0-321-54325-20", true));

		books.add(new Book("Blood and Honor", "Ricardo Salazar", "Historical Fiction", "978-0-321-54325-21", true));
		books.add(new Book("The Ivory Tower", "Monica Gutierrez", "Drama", "978-0-321-54325-22", true));
		books.add(new Book("Midnight Chase", "Alfredo Ramos", "Thriller", "978-0-321-54325-23", true));
		books.add(new Book("Wings of Fire", "Clarissa David", "Fantasy", "978-0-321-54325-24", true));
		books.add(new Book("Lost Horizons", "Julian Perez", "Adventure", "978-0-321-54325-25", true));

		books.add(new Book("The Crimson Sea", "Stephanie Torres", "Romance", "978-0-321-54325-26", true));
		books.add(new Book("A World Apart", "Benjamin Tan", "Science Fiction", "978-0-321-54325-27", true));
		books.add(new Book("Secrets and Lies", "Diana Morales", "Mystery", "978-0-321-54325-28", true));
		books.add(new Book("Ashes of War", "Fernando Castillo", "Historical Fiction", "978-0-321-54325-29", true));
		books.add(new Book("The Frozen Throne", "Camille Garcia", "Fantasy", "978-0-321-54325-30", true));

		books.add(new Book("Dreamcatcher", "Arthur Reyes", "Drama", "978-0-321-54325-31", true));
		books.add(new Book("Steel and Stone", "Rafael Santos", "Adventure", "978-0-321-54325-32", true));
		books.add(new Book("The Silver Lining", "Beatriz Cruz", "Romance", "978-0-321-54325-33", true));
		books.add(new Book("Voices of the Dead", "Hector Lim", "Horror", "978-0-321-54325-34", true));
		books.add(new Book("Tides of Destiny", "Christina Yu", "Fantasy", "978-0-321-54325-35", true));

		books.add(new Book("Dark Horizons", "Edgar Ramos", "Thriller", "978-0-321-54325-36", true));
		books.add(new Book("The Glass Prison", "Sophia De Leon", "Drama", "978-0-321-54325-37", true));
		books.add(new Book("Kingdom of Ash", "Miguel Bautista", "Fantasy", "978-0-321-54325-38", true));
		books.add(new Book("Beyond the Stars", "Janine Rivera", "Science Fiction", "978-0-321-54325-39", true));
		books.add(new Book("Whispers of the Sea", "Oliver Tan", "Romance", "978-0-321-54325-40", true));

		books.add(new Book("The Darkened Veil", "Paula Jimenez", "Mystery", "978-0-321-54325-41", true));
		books.add(new Book("Torn Realities", "Christian Ramos", "Science Fiction", "978-0-321-54325-42", true));
		books.add(new Book("Fallen Grace", "Natalie Cruz", "Drama", "978-0-321-54325-43", true));
		books.add(new Book("The Eternal Flame", "Oscar Fernandez", "Fantasy", "978-0-321-54325-44", true));
		books.add(new Book("Silent Watcher", "Ivy Castillo", "Thriller", "978-0-321-54325-45", true));

		books.add(new Book("The Golden Compass", "Aaron Villanueva", "Adventure", "978-0-321-54325-46", true));
		books.add(new Book("Shattered Dreams", "Gloria Mendoza", "Drama", "978-0-321-54325-47", true));
		books.add(new Book("Legends of Valor", "Marco Dela Cruz", "Fantasy", "978-0-321-54325-48", true));
		books.add(new Book("Voices in the Dark", "Andrea Soriano", "Mystery", "978-0-321-54325-49", true));
		books.add(new Book("The Last Horizon", "Anthony Lopez", "Science Fiction", "978-0-321-54325-50", true));

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
				System.out.println("You entered invalid input. Try again.");
				continue;
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
	                               " | Genre: " + search.genre);
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
