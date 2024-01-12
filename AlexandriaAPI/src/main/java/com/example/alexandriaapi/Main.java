package com.example.alexandriaapi;

import com.example.alexandriaapi.enums.ALL_CATEGS;
import com.example.alexandriaapi.models.Book;
import com.example.alexandriaapi.services.CSVParser;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        CSVParser csvParser = new CSVParser("D:\\Alexandria\\AlexandriaAPI\\data\\desk_books.csv");
        Map<Book, List<String>> bookListMap = csvParser.parse();
    }
}
