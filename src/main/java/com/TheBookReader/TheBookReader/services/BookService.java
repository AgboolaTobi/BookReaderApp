package com.TheBookReader.TheBookReader.services;

import com.TheBookReader.TheBookReader.dtos.requests.BookSearchRequest;
import com.TheBookReader.TheBookReader.dtos.responses.BookSearchResponse;

public interface BookService {
    BookSearchResponse search(BookSearchRequest request);
}
