package labproject7.writtenworks;

//Novel.java: Subclass of WrittenWork

public class Novel extends WrittenWork {

 private String genre;
 private int chapters;

 // constructors:
 public Novel(String title, String author, int year, String genre, int chapters) {
    super(title, author, year);
    setGenre(genre);
    setChapters(chapters);
     
 }

public String getGenre() {
	return genre;
}

public void setGenre(String genre) {
	this.genre = genre;
}

public int getChapters() {
	return chapters;
}

public void setChapters(int chapters) {
	this.chapters = chapters;
}

@Override
public String toString() {
	return super.toString() +  "genre: " + genre + "\nchapters: " + chapters;
}

 

}

