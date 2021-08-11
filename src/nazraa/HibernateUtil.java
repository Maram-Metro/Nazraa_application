
package nazraa;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
public class HibernateUtil {
    private static final SessionFactory sessionFactory;
    static {
        try {
             // loads configuration and mappings
            Configuration configuration = new Configuration().configure("/nazraa/hibernate.cfg.xml");
            ServiceRegistry serviceRegistry= new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            
            configuration.addAnnotatedClass(sgin.class);
            configuration.addAnnotatedClass(Profile.class);
            configuration.addAnnotatedClass(plantInfo.class);
            
            // builds a session factory from the service registry
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);  
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }   
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
