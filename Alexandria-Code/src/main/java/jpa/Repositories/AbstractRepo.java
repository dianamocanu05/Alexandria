

package jpa.Repositories;

import jpa.PersistenceSetup;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.sql.SQLException;
import java.util.List;


public abstract class AbstractRepo<T> {
    protected EntityManager manager;
    protected EntityTransaction transaction;

    protected AbstractRepo() throws SQLException, ClassNotFoundException {
        manager = PersistenceSetup.getInstance().getEntityManagerFactory().createEntityManager();
        transaction = manager.getTransaction();
    }

    public abstract void create(T entity) throws SQLException, ClassNotFoundException;


    public abstract T findById(int id) throws SQLException, ClassNotFoundException;


    public abstract List findByName(String name) throws SQLException;
}
