package persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class EntityManagerUtil {

    static EntityManagerFactory emf = null;

    public static EntityManager getEntityManager() {
        if (emf == null) {
            try {
                emf =
                        Persistence.createEntityManagerFactory("HelpDeskModelPU");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return emf.createEntityManager();
    }
}
