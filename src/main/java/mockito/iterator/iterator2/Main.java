package mockito.iterator.iterator2;


import config.Log4jPropertiesConfiguration;
import mockito.iterator.iterator1.Book;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("5656435", "Hawkins", 2021 );
        Book book2 = new Book("124234fdfg", "Tolle", 1997 );
        Book book3 = new Book("42536357657", "David", 1500 );

        BookShop books = new BookShop();
        books.addBook(book1);
        books.addBook(book2);
        books.addBook(book3);


        Iterator<Book> iterador = books.iterator();
        while (iterador.hasNext()){
            Book book = iterador.next();
            Log4jPropertiesConfiguration.logger.debug(book);
        }
        Log4jPropertiesConfiguration.logger.debug("---------------");
        for (Book book: books) {
            Log4jPropertiesConfiguration.logger.debug(book);
        }
    }
}
