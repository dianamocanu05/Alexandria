package jpa.Repositories;

import jpa.Entities.BookAuthor;
import jpa.Entities.BookCategory;

import java.sql.SQLException;
import java.util.List;

public class BookCategoriesRepo extends AbstractRepo<BookCategory>{

    public BookCategoriesRepo() throws SQLException, ClassNotFoundException{
        super();
    }

    @Override
    public void create(BookCategory entity) throws SQLException, ClassNotFoundException {
        transaction.begin();
        manager.persist(entity);
        transaction.commit();
    }
    @Override
    public BookCategory findById(int id) throws SQLException, ClassNotFoundException {
        return manager.find(BookCategory.class,id);
    }

    @Override
    public List findByName(String name) throws SQLException {
        return null;
    }
}
