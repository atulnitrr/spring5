package com.atul.spring5.respositories;

import com.atul.spring5.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRespository extends CrudRepository<Book, Long> {
}
