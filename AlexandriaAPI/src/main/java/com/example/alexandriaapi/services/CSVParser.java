package com.example.alexandriaapi.services;

import com.example.alexandriaapi.enums.ALL_CATEGS;
import com.example.alexandriaapi.enums.ReadingStatus;
import com.example.alexandriaapi.models.Book;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CSVParser {

    private String path;
    public CSVParser(String path){
        this.path = path;
    }


    public Map<Book, List<String>> parse() throws IOException {
        Map<Book, List<String>> books = new HashMap<>();

        BufferedReader reader = new BufferedReader(new FileReader(this.path));
        String line = null;
        int lineCount = -1;
        while ((line = reader.readLine()) != null) {
            if(lineCount != -1){
                String[] bookInfo = line.split(",");
                String title = bookInfo[0];
                String authorName = bookInfo[1];
                int nPages = Integer.parseInt(bookInfo[2]);
                String publisher = bookInfo[3];
                String language = bookInfo[4];
                String dateAcquired = bookInfo[5];
                ReadingStatus readingStatus = ReadingStatus.valueOf(bookInfo[6]);

                Book book = new Book(title, authorName);
                book.setnPages(nPages);
                book.setPublisher(publisher);
                book.setLanguage(language);
                book.setDateAcquired(dateAcquired);
                book.setReadingStatus(readingStatus);


                String[] categoriesStr = bookInfo[7].split(";");
                List<String> categories = new ArrayList<>(List.of(categoriesStr));


                books.put(book, categories);
            }
            lineCount++;
        }
        System.out.println("[CSVParser] Parsed " + lineCount + " book entries from " + path);
        return books;
    }
}
