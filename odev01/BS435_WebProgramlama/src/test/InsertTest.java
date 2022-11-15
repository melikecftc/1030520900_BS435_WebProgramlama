package org.example.WebProgramlama;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class InsertTest {
    private EntityManagerFactory factory;
    private EntityManager em;

    @BeforeEach
    public void init() {
        factory = Persistence.createEntityManagerFactory("Hibernate");
        em = factory.createEntityManager();
    }

    @AfterEach
    public void tearDown() {
        em.close();
        factory.close();
    }

    private boolean persistInATransaction(Object obj) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            em.persist(obj);
            tx.commit();
        } catch (Exception e) {
            System.out.println("FAILED TRANSACTION: " + e.toString());
            tx.rollback();
            return false;
        }

        return true;
    }


    @Test
    public void insertCIFTCI() {

        CIFTCI ciftci = new CIFTCI();
        ciftci.setciftciAdi("Serdal");
        ciftci.setciftciSoyadi("Çiftçi");

        boolean persisted = persistInATransaction(ciftci);
        assertTrue(persisted);
    }

    @Test
    public void insertURUN() {

        URUN urun = new URUN();
        urun.seturunAdi("Mısır");
        urun.seturunMiktari(10000);

        boolean persisted = persistInATransaction(urun);
        assertTrue(persisted);
    }

    @Test
    public void insertTUCCAR() {

        TUCCAR tuccar = new TUCCAR();
        tuccar.settuccarAdi("Ali");
        tuccar.settuccarTelefon(05555555555);
        tuccar.setalisMiktari(10000);

        boolean persisted = persistInATransaction(tuccar);
        assertTrue(persisted);

        TUCCAR tuccar1 = new TUCCAR();
        tuccar1.settuccarAdi("Ali");
        tuccar1.settuccarTelefon(05555555555);
        tuccar1.setalisMiktari(10000);

        boolean persisted2 = persistInATransaction(tuccar);
        assertTrue(persisted2);

    }



}
