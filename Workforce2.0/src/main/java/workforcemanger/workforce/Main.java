package workforcemanger.workforce;

import workforcemanger.workforce.configuration.JpaEntityManagerFactory;
import workforcemanger.workforce.entity.User;

import javax.persistence.EntityManager;

public class Main {
    public static void main(String[] args) {
        EntityManager em = JpaEntityManagerFactory.getEntityManager();
        em.getTransaction().begin();
        User user = new User();
        user.setUserName("mouad");
        user.setEmail("mouad@example.com");
        em.persist(user);
        em.getTransaction().commit();
        em.close();
    }
}
