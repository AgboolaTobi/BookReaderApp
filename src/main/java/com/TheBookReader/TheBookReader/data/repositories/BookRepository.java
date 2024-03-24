package com.TheBookReader.TheBookReader.data.repositories;

import com.TheBookReader.TheBookReader.data.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Long, Book> {


}
