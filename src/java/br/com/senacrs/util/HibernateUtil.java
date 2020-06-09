package br.com.senacrs.util;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

public class HibernateUtil {

    private static final SessionFactory sessionFactory ;
    
    static {
        try {
            // Crie o SessionFactory a partir do padrão (hibernate.cfg.xml) 
            // arquivo de configuração.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Aqui ele registra a exceção de erro. 
            System.err.println("Falha na criação do SessionFactory inicial." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
