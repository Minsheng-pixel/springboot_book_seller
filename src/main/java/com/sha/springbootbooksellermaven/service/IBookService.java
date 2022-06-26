package com.sha.springbootbooksellermaven.service;

import com.sha.springbootbooksellermaven.model.Book;

import java.util.List;

public interface IBookService
{
    Book saveBook(Book book);

    void deleteBook(Long id);

    List<Book> findAllBooks();
}
