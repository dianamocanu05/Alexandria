DROP TABLE IF EXISTS categories;
CREATE TABLE categories(
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT
);


DROP TABLE IF EXISTS books;
CREATE TABLE books(
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    title TEXT,
    subtitle TEXT,
    series TEXT,
    pages INTEGER,
    publisher TEXT,
    year_of_publication INTEGER
);


DROP TABLE IF EXISTS authors;
CREATE TABLE authors(
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    first_name TEXT,
    last_name TEXT
);

DROP TABLE IF EXISTS books_authors;
CREATE TABLE books_authors(
    book_id INTEGER NOT NULL,
    author_id INTEGER NOT NULL,
    FOREIGN KEY (book_id) REFERENCES books(id),
    FOREIGN KEY (author_id) REFERENCES authors(id),
    PRIMARY KEY(book_id, author_id)
);

DROP TABLE IF EXISTS books_categories;
CREATE TABLE books_categories(
    book_id INTEGER NOT NULL,
    category_id INTEGER NOT NULL,
    FOREIGN KEY (book_id) REFERENCES books(id),
    FOREIGN KEY (category_id) REFERENCES categories(id),
    PRIMARY KEY (book_id, category_id)
);
