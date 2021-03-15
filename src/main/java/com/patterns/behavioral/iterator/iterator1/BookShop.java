package com.patterns.behavioral.iterator.iterator1;

import config.Log4jPropertiesConfiguration;
import org.junit.jupiter.api.Tag;

import java.util.ArrayList;
import java.util.List;

@Tag("database")// Es una etiqueta para que en la clase SuiteTest podamos definir que se ejecuten las clases
                // o métodos que queramos seleccionandolos por etiqueta "@Tag"
public class BookShop implements IBookShop{

    // estructura datos interna
    List<Book> books;

    // constructor
    public BookShop(){
        books = new ArrayList<>();
    }

    // metodo para guardar datos en la estructura interna
    public void addBook(Book book){
        if(book != null)
            books.add(book);
    }

    // metodo que obtiene un libro en concreto
    public Object getOne(int index) {
        return books.get(index - 1);
    }

    // metodo que devuelve el tamaño de la librería
    public int getSize() {

        Log4jPropertiesConfiguration.logger.debug("getSize(): " + books.size());
        return books.size();
    }

    // iterador para recuperar elementos de la estructura interna
    @Override
    public CustomIterator iterator() {
        return new BookShopIterator();
    }

    // crear iterador
    private class BookShopIterator implements CustomIterator{

        int currentIndex = 0;

        @Override
        public boolean hasNext() {
            if (this.currentIndex >= books.size()) {
                return false;
            }else{
                return true;
            }

        }

        @Override
        public Object next() {

            if(books.isEmpty())
                return false;

            return books.get(currentIndex++);
        }


    }
}
