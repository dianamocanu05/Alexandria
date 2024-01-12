package com.example.alexandriaapi.services;

import com.example.alexandriaapi.models.Book;
import com.example.alexandriaapi.models.BookCategory;
import com.example.alexandriaapi.models.Category;
import com.example.alexandriaapi.repositories.BookCategoryRepository;
import com.example.alexandriaapi.repositories.BookRepository;
import com.example.alexandriaapi.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Map;


@Service
public class BookService {


    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private BookCategoryRepository bookCategoryRepository;


    public int addBook(Book book){
        return bookRepository.save(book);
    }

    public void addBooksFromCsv(String path) throws IOException {
        CSVParser parser = new CSVParser(path);
        Map<Book, List<String>> books = parser.parse();

        for(Map.Entry<Book, List<String>> entry : books.entrySet()){
            Book book = entry.getKey();
            List<String> categories = entry.getValue();

            int bookId = addBook(book);
            for(String category : categories){
                Category categoryObj = categoryRepository.findByName(category);
                if(categoryObj == null){
                    categoryObj  = categoryRepository.save(new Category(category));
                }
                bookCategoryRepository.save(new BookCategory(book, categoryObj));
            }
        }
    }

}
