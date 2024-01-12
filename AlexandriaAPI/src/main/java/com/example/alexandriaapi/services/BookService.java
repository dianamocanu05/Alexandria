package com.example.alexandriaapi.services;

import com.example.alexandriaapi.models.Book;
import com.example.alexandriaapi.repositories.BookRepository;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class BookService {


    @Autowired
    private BookRepository bookRepository;


    public void addBook(Book book){
        bookRepository.save(book);
    }

    public void addBooksFromCsv(String path) throws IOException {
        Reader reader = new FileReader(path);
        MappingIterator<Book> bookIter = new CsvMapper().readerWithTypedSchemaFor(Book.class).readValues(reader);
        List<Book> books = bookIter.readAll();

        for(Book book : books){
            bookRepository.save(book);
        }
    }

}
