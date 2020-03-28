package com.atul.spring5.bootstrap;

import com.atul.spring5.entity.Author;
import com.atul.spring5.entity.Book;
import com.atul.spring5.entity.Publisher;
import com.atul.spring5.respositories.AuthorRepository;
import com.atul.spring5.respositories.BookRespository;
import com.atul.spring5.respositories.PublisherRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.servlet.http.PushBuilder;

@Component
public class BootstrapData implements CommandLineRunner {

    private AuthorRepository authorRepository;
    private BookRespository bookRespository;
    private PublisherRespository publisherRespository;

    @Autowired
    public BootstrapData(AuthorRepository authorRepository, BookRespository bookRespository, PublisherRespository publisherRespository) {
        this.authorRepository = authorRepository;
        this.bookRespository = bookRespository;
        this.publisherRespository = publisherRespository;
    }




    @Override
    public void run(String... args) throws Exception {

        System.out.println("started in repo");
        final Publisher publisher = new Publisher("peng", "new work", "123");



        final Author author = new Author("atul", "kumar");
        final Book book = new Book("Demand ", "12345");
        author.getBooks().add(book);
        book.getAuthors().add(author);

        bookRespository.save(book);
        authorRepository.save(author);

        System.out.println("book count " + bookRespository.count());


        publisher.getBooks().add(book);
        publisherRespository.save(publisher);
        System.out.println("publisher count " + publisherRespository.count());

    }
}
