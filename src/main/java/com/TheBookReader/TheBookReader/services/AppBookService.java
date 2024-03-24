package com.TheBookReader.TheBookReader.services;


import com.TheBookReader.TheBookReader.dtos.requests.BookSearchRequest;
import com.TheBookReader.TheBookReader.dtos.responses.BookSearchResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AppBookService implements BookService{

    @Override
    public BookSearchResponse search(BookSearchRequest request) {

        return null;
    }
}
