package jpa.Repositories;

import jpa.Entities.Book;
import jpa.Entities.BookAuthor;

import java.sql.SQLException;
import java.util.List;

public class BookAuthorsRepo extends AbstractRepo<BookAuthor> {
    public BookAuthorsRepo() throws SQLException, ClassNotFoundException{
        super();
    }

    @Override
    public void create(BookAuthor entity) throws SQLException, ClassNotFoundException {
        transaction.begin();
        manager.persist(entity);
        transaction.commit();
    }
    @Override
    public BookAuthor findById(int id) throws SQLException, ClassNotFoundException {
        return manager.find(BookAuthor.class,id);
    }

    @Override
    public List findByName(String name) throws SQLException {
        return null;
    }
}
