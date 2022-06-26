package com.sha.springbootbooksellermaven.repository;

import com.sha.springbootbooksellermaven.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Long>
{
}
