package jpa.Application;

import jpa.Entities.*;
import jpa.Repositories.AuthorRepo;
import jpa.Repositories.BookAuthorsRepo;
import jpa.Repositories.BookRepo;
import jpa.Repositories.CategoryRepo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UploadMethods {

    public void viaConsole(String title, String subtitle, String series, int pages, String publisher, int yearOfPublication, List<String> authorsList, List<String> categoriesList) throws SQLException, ClassNotFoundException {
        Book book = new Book(title, subtitle, series, pages, publisher, yearOfPublication);
        BookRepo bookRepo = new BookRepo();
        bookRepo.create(book);
        System.out.println(book.getId());
//        List<Author> authors = new ArrayList<>();
//        AuthorRepo authorRepo = new AuthorRepo();
//        BookAuthorsRepo bookAuthorsRepo = new BookAuthorsRepo();
//        for(String authorName : authorsList){
//            String[] name = authorName.trim().split("\\s+");
//            Author author = new Author(name[0], name[1]);
//            authorRepo.create(author);
//
//            authors.add(author); //first_name, last_name
//        }
//
//
//        List<Category> categories = new ArrayList<>();
//        CategoryRepo categoryRepo = new CategoryRepo();
//        for(String categoryName : categoriesList){
//            Category category = new Category(categoryName);
//            categoryRepo.create(category);
//            categories.add(category);
//        }
//
//        List<BookAuthor> bookAuthors = new ArrayList<>();
//        List<BookCategory> bookCategories = new ArrayList<>();
    };

    public Book viaJson(){return null;};

    public Book viaCSV(){return null;};
}
