package com.ibm.springmvc.cache.repo;

import com.ibm.springmvc.cache.model.Book;

public interface BookRepository {
    
    Book getByIsbn(String isbn);
    
}
