package codes;

public class Member {

	private int id;
	private String name;
	private int [] books;
	
	public Member(int id, String name){
		this.id = id;
		this.name = name;
		books = new int [2];
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getBooks() {
		return books;
	}

	public void setBooks(int[] books) {
		this.books = new int [2];
		
		for(int i = 0; i < books.length; i++){
			this.books[i] = books[i];
		}
	}
}