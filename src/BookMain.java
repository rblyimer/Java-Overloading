import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList <Book> books = new ArrayList <Book> ();
        
        Book num1 = new Book("Hamlet", 135, 1603);
        Book num2 = new Book("Othello", 125, 1622);
        Book num3 = new Book("Macbeth", 192, 1623);
        books.add(num1); books.add(num2); books.add(num3);

        while(true) {
            System.out.println("Enter a Book title, number of pages, and pulication year: ");
            System.out.println("Entering nothing will stop the loop: ");
            System.out.println("Book Title: ");
            String title = in.nextLine();
            if(title.isBlank()) {
                break;
            }
            System.out.println("Number of pages: ");
            int numOfPages = Integer.parseInt(in.nextLine());
            System.out.println("Publication year: ");
            int publicationYear = Integer.parseInt(in.nextLine());
            Book data = new Book(title, numOfPages, publicationYear);
            books.add(data);
        }
        System.out.print("Enter 'name' to print just the Book title or 'everything' to print all the information ");
        System.out.print("\nWhat information will be printed? ");
        String input;
        while(true) {
            input = in.nextLine();
            if(!input.equalsIgnoreCase("everything") && !input.equalsIgnoreCase("name")) {
                System.out.print("invalid input: please enter only 'name' or 'everything': ");
            } else {
                break;
            }
        }
        for(int i = 0; i < books.size(); i++) {
            if(input.equalsIgnoreCase("everything")) {
                System.out.println(books.get(i).toString());
            } else {
                System.out.println(books.get(i).getTitle());
            }
        }
        in.close();
    }
}