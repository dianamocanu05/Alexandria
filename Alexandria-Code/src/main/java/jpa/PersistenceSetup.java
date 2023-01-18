package jpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceSetup {

    private static PersistenceSetup instance;
    private final EntityManagerFactory entityManagerFactory;

    private PersistenceSetup() {
        entityManagerFactory = Persistence.createEntityManagerFactory("movies-unit");
    }


    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }


    public static PersistenceSetup getInstance() {
        if (instance == null) {
            instance = new PersistenceSetup();
        }
        return instance;
    }
}
