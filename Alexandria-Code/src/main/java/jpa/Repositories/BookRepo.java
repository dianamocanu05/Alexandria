package jpa.Repositories;

import jpa.Entities.Author;
import jpa.Entities.Book;

import java.sql.SQLException;
import java.util.List;

public class BookRepo extends AbstractRepo<Book>{
    public BookRepo() throws SQLException, ClassNotFoundException {
        super();
    }

    @Override
    public void create(Book entity) throws SQLException, ClassNotFoundException {
        transaction.begin();
        manager.persist(entity);
        transaction.commit();
    }


    @Override
    public Book findById(int id) throws SQLException {
        return manager.find(Book.class,id);
    }

    @Override
    public List findByName(String name) throws SQLException {
        return null;
    }
}
