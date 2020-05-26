package br.com.senacrs.DAO;

import br.com.senacrs.TO.Motorista;
import br.com.senacrs.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;


public class MotoristaDAO {
    Session session;

    public MotoristaDAO() {
        session = HibernateUtil.getSessionFactory().openSession();
    }
    

    
    public List<Motorista> listar(){
        List<Motorista> motorista = session.createCriteria(Motorista.class).list();
        session.close();
        return motorista;
    }
    public void remover(Object motorista){
        session.beginTransaction();
        session.delete(motorista);
        session.getTransaction().commit();
        session.close();
    }

    public void salvar(Motorista motorista) {
        session.beginTransaction();
        session.saveOrUpdate(motorista);
        session.getTransaction().commit();
        session.close();
    }
    
}
