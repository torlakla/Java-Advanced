package Lab.IteratorsAndComparators.Book;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors) {
        this.setTitle(title);
        this.setYear(year);
        this.setAuthors(authors);
    }

    public String getTitle() {
        return this.title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return this.year;
    }

    private void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return this.authors;
    }

    private void setAuthors(String... authors) {
        this.authors = new ArrayList<>();
        for (String author : authors) {
            this.authors.add(author);
        }
    }

//    @Override
//    public int compareTo(Book other) {
//        int result = this.title.compareTo(other.title);
//        if(result==0){
//            result=Integer.compare(this.year,other.year);
//        }
//        return result;
//    }
}
