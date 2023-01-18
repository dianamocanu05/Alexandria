package jpa.Repositories;

import jpa.Entities.Author;
import jpa.Entities.Category;

import java.sql.SQLException;
import java.util.List;

public class CategoryRepo extends AbstractRepo<Category>{

    public CategoryRepo() throws SQLException, ClassNotFoundException {
        super();
    }

    @Override
    public void create(Category entity) throws SQLException, ClassNotFoundException {
        transaction.begin();
        manager.persist(entity);
        transaction.commit();
    }

    @Override
    public Category findById(int id) throws SQLException {
        return manager.find(Category.class,id);
    }

    @Override
    public List findByName(String name) throws SQLException {
        return null;
    }
}
