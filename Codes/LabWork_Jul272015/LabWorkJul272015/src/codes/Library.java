package codes;

public class Library {

	private Book [] books;
	
	public Library(int num){
		books = new Book [num];
	}
	
	public void addBook(int index, Book b){
		if(index < books.length){
			books[index] = b;
		}
	}
	
	public Book findBook(String title){
		Book b = null;
		
		for(int i = 0; i < books.length; i++){
			if(books[i] != null && books[i].getTitle().equals(title)){
				b = books[i];
			}
		}
		
		return b;
	}
	
	public Book getBook(int index){
		Book b = null;
		
		if(index < books.length){
			b = books[index];
		}
		
		return b;
	}
	
	public void removeBook(int index){
		if(index < books.length){
			books[index] = null;
		}
	}
	
	public void displayBooks(){
		for(int i = 0; i < books.length; i++){
			if(books[i] != null){
				System.out.println(books[i]);
			}
		}
	}
}