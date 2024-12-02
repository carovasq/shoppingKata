package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    void bookHasAnAuthorAndDescription(){
        Book book = new Book("Libro", 10, "author", "description");


        //Nombre y precio
        assertEquals("author", book.getAuthor());
        assertEquals("description", book.getDescription());
    }
}