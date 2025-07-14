package LibraryManagementSystem;
import java.util.ArrayList;

public class Library {
	ArrayList<Book> list=new ArrayList<>();
	
	public void addBook(Book book) {
		list.add(book);
		System.out.println("The book is added to the library");
	}
	public void displayAllBooks() {
		for(Book book : list) {
		book.displayDetails();			
		}
						
	}
	public void issueBook(int bookId) {
		for(Book book: list) {
			if(bookId==book.bookId)
			{
				if(book.isAvailable) {
					book.isAvailable=false;
				
					System.out.println("Book issued successfully");
				}
				else {
					System.out.println("Issue failed");
				}
			
			}
			else {
				System.out.println("Book not found");
			}
		
		}
		
	
	}
	public void returnBook(int bookId) {
		for(Book book:list) {
			if(bookId==book.bookId) {
				if(!book.isAvailable) {
					System.out.println("Book returned successfully");
					book.isAvailable=true;
				}
				else {
					System.out.println("The book was not issued");
				}
			}
			else {
				System.out.println("The book is not eligible for return");
			}
		}
	
	
		
	}
	

}
