package workforcemanger.workforce.repository.Employee;

import workforcemanger.workforce.configuration.JpaEntityManagerFactory;
import workforcemanger.workforce.entity.Employee;

import javax.persistence.EntityManager;
import java.sql.SQLException;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    EntityManager em = JpaEntityManagerFactory.getEntityManager();
    @Override
    public <T> T create(T t) {
        if (t instanceof Employee) {
            try {
                em.getTransaction().begin();
                em.persist(t);
                em.getTransaction().commit();
                return t;
            } catch (Exception e) {
                if (em.getTransaction().isActive()) {
                    em.getTransaction().rollback();
                }
                e.printStackTrace();
            }
        }
        return null;
    }


    @Override
    public boolean delete(int id) {
      try {
          em.getTransaction().begin();
          Employee employee = em.find(Employee.class, id);
          em.remove(employee);
          em.getTransaction().commit();
          return true;
      }catch (Exception e) {
          if (em.getTransaction().isActive()) {
              em.getTransaction().rollback();
          }
          e.printStackTrace();
      }
      return false;
    }

    @Override
    public <T> T update(T t) {
        if (t instanceof Employee) {
            try {
                em.getTransaction().begin();
                Employee employee = em.find(Employee.class, ((Employee) t).getId());
                if (employee != null) {
                    em.merge(t);
                    em.getTransaction().commit();
                    return t;
                } else {
                    throw new RuntimeException("Employee not found for ID: " + ((Employee) t).getId());
                }
            } catch (Exception e) {
                if (em.getTransaction().isActive()) {
                    em.getTransaction().rollback();
                }
                throw new RuntimeException("Error updating employee", e);
            }
        }
        throw new IllegalArgumentException("Unsupported entity type: " + t.getClass().getSimpleName());
    }

    @Override
    public <T> T get(T t) {
        return null;
    }
}
