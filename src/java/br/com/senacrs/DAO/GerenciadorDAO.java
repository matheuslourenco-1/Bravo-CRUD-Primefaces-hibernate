package br.com.senacrs.DAO;

import br.com.senacrs.TO.Gerenciador;
import br.com.senacrs.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;


public class GerenciadorDAO {
    Session session;

    public GerenciadorDAO() {
        session = HibernateUtil.getSessionFactory().openSession();
    }
    /*Construtor listar*/
    public List<Gerenciador> listar(){
        List<Gerenciador> gerenciador = session.createCriteria(Gerenciador.class).list();
        session.close();
        return gerenciador;
    }
    /*Construtor remover*/
    public void remover(Object gerenciador){
        session.beginTransaction();
        session.delete(gerenciador);
        session.getTransaction().commit();
        session.close();
    }
    /*Construtor salvar*/
    public void salvar(Gerenciador gerenciador) {
        session.beginTransaction();
        session.saveOrUpdate(gerenciador);
        session.getTransaction().commit();
        session.close();
    }
    
}
