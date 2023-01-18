package jpa.Repositories;

import jpa.Entities.Author;

import java.sql.SQLException;
import java.util.List;

public class AuthorRepo extends AbstractRepo<Author> {

    public AuthorRepo() throws SQLException, ClassNotFoundException {
        super();
    }

    @Override
    public void create(Author entity) throws SQLException, ClassNotFoundException {
        transaction.begin();
        manager.persist(entity);
        transaction.commit();
    }

    @Override
    public Author findById(int id) throws SQLException {
        return manager.find(Author.class,id);
    }

    @Override
    public List findByName(String name) throws SQLException {
        return null;
    }
}
