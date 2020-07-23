package AUBO;

class Author{
	public String name;
	public String email;
	public char gender;
	

	public Author(String name, String email, char gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
}


public class Book {
	public String name;
	public double price;
	public int qty;
	Author author;
	
	
	public Author getAuthor() {
		return author;
	}

	public Book(String name,Author author,double price){
		super();
		this.name=name;
		this.price=price;
	}
	

	public Book(String name, double price, int qty, Author author) {
		super();
		this.name = name;
		this.price = price;
		this.qty = qty;
		this.author = author;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a=new Author("Swe zin","Swe@gmail.com",'f');
		Book b=new Book("Zin",1000,1,a);
		System.out.println("Author is \'"+a.name+"\'\t,"+a.email+"\t,"+a.gender);
		//System.out.println();
		System.out.println("Book is \'"+b.name+"\'\t,"+b.price+"\t,"+b.qty);
	}

}
