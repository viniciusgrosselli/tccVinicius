/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Vinicius
 */
public class GerarEntityManager {

    private static EntityManagerFactory factory;

    private GerarEntityManager() {
        factory = Persistence.createEntityManagerFactory("HelpDeskModelPU");
    }

    public static EntityManagerFactory getFactory() {
        return factory;
    }

    public static EntityManager getEntityManager(){
        return factory.createEntityManager();
    }





    public static GerarEntityManager getInstance() {
        return GerarEntityManagerHolder.INSTANCE;
    }

    private static class GerarEntityManagerHolder {
        private static final GerarEntityManager INSTANCE = new GerarEntityManager();
    }

 }
