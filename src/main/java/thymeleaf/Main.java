package thymeleaf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import thymeleaf.config.WebAppConfig;
import thymeleaf.model.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(WebAppConfig.class);
    EntityManagerFactory managerFactory =
        applicationContext.getBean("emf", EntityManagerFactory.class);

        EntityManager entityManager = managerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        entityManager.persist(new Student("Dilbara","dilbara@gmail.com"));

        entityManager.getTransaction().commit();

        entityManager.close();
        managerFactory.close();
    }
}
