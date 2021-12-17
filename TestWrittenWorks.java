package labproject7.writtenworks;

public class TestWrittenWorks {

	
	public static void main (String[] args) {
		Novel n = new Novel("Harry Potter", "JK Rowling", 1998, "Fantasy", 13);
		ShortStory s = new ShortStory("Hamlet", "Shakespeare", 1500, "Fiction", 9, true);
		
		System.out.println(n.toString());
		System.out.println();
		System.out.println(s.toString());
		
	}
	
	
}
