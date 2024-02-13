package Controlador;

import lombok.Data;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * The type Hibernate util.
 *
 * @author Pedro Rollán García
 */
@Data
public class hibernateUtil {

  private static SessionFactory sessionFactory = buildSessionFactory();

  /**
   * Build session factory session factory.
   *
   * @return the session factory
   */
  public static SessionFactory buildSessionFactory() {
    Configuration configuration = new Configuration();
    configuration.configure(
      "hibernate.cfg.xml");
    return configuration.buildSessionFactory();
  }

  public static SessionFactory getSessionFactory() {
    return sessionFactory;
  }

}
