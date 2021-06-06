package activities;


abstract class Book{
	 String title;
	abstract void setTitle(String S); 
public String getTitle() {
	return title;
}
}
 class Mybook extends Book{
	public  void setTitle(String S) {
		title=S;
	}

	}
	

public class Activity5 {
	public static void main(String[] args) {
		
	Mybook Dictionary=new Mybook();
	
	String title="English Distictinory";
	Dictionary.setTitle(title);
	
	System.out.println("The name ofthe book is :"+Dictionary.getTitle());
		
	}

}
