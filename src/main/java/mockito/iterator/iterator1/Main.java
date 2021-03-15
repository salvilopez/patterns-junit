package mockito.iterator.iterator1;

import config.Log4jPropertiesConfiguration;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("5656435", "Hawkins", 2021 );
        Book book2 = new Book("124234fdfg", "Tolle", 1997 );
        Book book3 = new Book("42536357657", "David", 1500 );

        BookShop books = new BookShop();
        books.addBook(book1);
        books.addBook(book2);
        books.addBook(book3);

        CustomIterator iterador = books.iterator();
        while (iterador.hasNext()){
            Book book = (Book) iterador.next();
            Log4jPropertiesConfiguration.logger.debug(book);
        }




    }
}
