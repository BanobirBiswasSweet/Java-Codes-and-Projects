package codes;

public class MemberMain {

	public static void main(String[] args) {

		Book [] books = new Book [4];
		books[0] = new Book(1, "C programming", "Schieldt", false);
		books[1] = new Book(2, "C++ programming", "Schieldt", false);
		books[2] = new Book(3, "C# programming", "Schieldt", false);
		books[3] = new Book(4, "Java programming", "Schieldt", false);
		
		Member [] members = new Member [2];
		members[0] = new Member(101, "Member 1");
		members[0].setBooks(new int [] {1, 2});
		members[1] = new Member(201, "Member 2");
		members[1].setBooks(new int [] {3, 4});
		
		for(int i = 0; i < members.length; i++){
			Member temp =members[i];
			int [] memberBooks = temp.getBooks();
			
			System.out.println(temp.getName());
			
			for(int j = 0; j < books.length; j++){
				if(books[j] != null && (books[j].getId() == memberBooks[0] || books[j].getId() == memberBooks[1])){
					System.out.println(books[j].getTitle());
					System.out.println(books[j].getAuthor());
				}
			}
		}
	}
}