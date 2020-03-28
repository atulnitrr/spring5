package com.atul.spring5.bootstrap;

import com.atul.spring5.entity.Author;
import com.atul.spring5.entity.Book;
import com.atul.spring5.respositories.AuthorRepository;
import com.atul.spring5.respositories.BookRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private AuthorRepository authorRepository;
    private BookRespository bookRespository;

    @Autowired
    public BootstrapData(AuthorRepository authorRepository, BookRespository bookRespository) {
        this.authorRepository = authorRepository;
        this.bookRespository = bookRespository;
    }

    @Override
    public void run(String... args) throws Exception {
        final Author author = new Author("atul", "kumar");
        final Book book = new Book("Demand ", "12345");
        author.getBooks().add(book);
        book.getAuthors().add(author);

        bookRespository.save(book);
        authorRepository.save(author);

        System.out.println("started in repo");

        System.out.println("book count " + bookRespository.count());

    }
}
