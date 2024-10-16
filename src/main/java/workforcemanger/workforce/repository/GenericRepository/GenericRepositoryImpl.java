package workforcemanger.workforce.repository.GenericRepository;

import workforcemanger.workforce.configuration.JpaEntityManagerFactory;
import workforcemanger.workforce.repository.Repository;

import javax.persistence.EntityManager;

public class GenericRepositoryImpl implements Repository {
    private JpaEntityManagerFactory emf;
    public GenericRepositoryImpl(JpaEntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public <T> T create(T t) {
            EntityManager em = emf.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(t);
            em.getTransaction().commit();
            em.close();
            return t;
        } catch (Exception e) {
            e.printStackTrace();
            if (em.isOpen()){
                em.getTransaction().rollback();
                em.close();
            }
        }
        return t;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public <T> T update(T t) {
        EntityManager em = emf.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(t);
            em.getTransaction().commit();
            em.close();
            return t;
        } catch (Exception e) {
            e.printStackTrace();
            if (em.isOpen()){
                em.getTransaction().rollback();
                em.close();
            }
        }
        return t;
    }

    @Override
    public <T> T get(T t) {
        return null;
    }
}
