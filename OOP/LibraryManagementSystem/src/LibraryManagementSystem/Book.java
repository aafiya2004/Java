package LibraryManagementSystem;

public class Book {
	public int bookId;
	public String title;
	public String author;
	public boolean isAvailable=true;
	
	 Book(int bookId, String title, String author) {
		this.bookId=bookId;
		this.title=title;
		this.author=author;
		
	}
	 
	 public void displayDetails() {
		 System.out.println("Book ID: " +bookId);
		 System.out.println("Title: " +title);
		 System.out.println("Author: " +author);
		
	 }
		 
	 public void markAsIssued() {
		 isAvailable=false;
		System.out.println("Issued");
	 }
	 public void markAsReturned() {
		 isAvailable=true;
		System.out.println("Returned");
	 }
	 
	 }
	


