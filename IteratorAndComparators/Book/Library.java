package Lab.IteratorsAndComparators.Book;

import java.util.Arrays;
import java.util.Iterator;

public class Library implements Iterable<Book> {
    private Book[] books;

    public Library(Book... books) {
        this.books = books;
    }
    public Iterator<Book> iterator(){
        return Arrays.stream(books).iterator();
    }

//    @Override
//    public Iterator<Book> iterator() {
//        return new LibIterator();
//    }
//
//    private final class LibIterator implements Iterator<Book> {
//        private int counter = 0;
//
//        @Override
//        public boolean hasNext() {
//            if (this.counter < books.length) {
//                return true;
//            }
//            return false;
//        }
//
//        @Override
//        public Book next() {
//            return books[counter++];
//        }
//    }
}
