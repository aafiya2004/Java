package LibraryManagementSystem;
import java.util.*;

public class Main {
	
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	
     
     Library l=new Library();
     int choice;
     
	 do {
	 System.out.println("--------LIBRARY MANAGEMENT SYSTEM----------");
	 System.out.println("1. Add Book");
     System.out.println("2. Display All Books");
     System.out.println("3. Issue a Book");
     System.out.println("4. Return a Book");
     System.out.println("5. Exit");
     System.out.print("Enter your choice: ");
     choice = sc.nextInt();
     sc.nextLine();
	 
	 switch (choice) {
     case 1:
    	 System.out.println("Enter Book Id: ");
    	  int id = sc.nextInt();
    	  sc.nextLine(); 
          System.out.print("Enter Title: ");
          String title = sc.nextLine();
          System.out.print("Enter Author: ");
          String author = sc.nextLine();
          Book newBook = new Book(id, title, author);
          l.addBook(newBook);
          break;
          
     case 2: 
    	 l.displayAllBooks();
    	 break;
     case 3:
    	System.out.println("Enter Book ID: ");
    	int bookid=sc.nextInt();
    	l.issueBook(bookid);
         break;
     case 4:
    	 System.out.println("Enter Book ID: ");
    	 int returnid=sc.nextInt();
    	 l.returnBook(returnid);
    	 break;
     case 5: 
    	 System.out.println("Exiting the application");
    	 break;
     default:
         System.out.println("❌ Invalid choice. Please enter between 1 to 5.");
 }

	 }
 while (choice != 5);

 sc.close();
    	
    	 
	  }
}
