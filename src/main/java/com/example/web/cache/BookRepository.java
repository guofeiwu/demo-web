package com.example.web.cache;

public interface BookRepository {

    Book getByIsbn(String isbn);

}