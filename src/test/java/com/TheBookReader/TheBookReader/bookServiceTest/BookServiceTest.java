package com.TheBookReader.TheBookReader.bookServiceTest;

import com.TheBookReader.TheBookReader.dtos.requests.BookSearchRequest;
import com.TheBookReader.TheBookReader.dtos.responses.BookSearchResponse;
import com.TheBookReader.TheBookReader.services.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTest {

    @Autowired
    private BookService bookService;


    @Test
    public void bookSearchTest(){

        BookSearchRequest request = new BookSearchRequest();

        request.setTitle("Monsters");

        BookSearchResponse response = bookService.search(request);





    }

}
