package br.com.senacrs.DAO;

import br.com.senacrs.TO.Caminhao;
import br.com.senacrs.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;


public class CaminhaoDAO {
    Session session;

    public CaminhaoDAO() {
        session = HibernateUtil.getSessionFactory().openSession();
    }
    

    
    public List<Caminhao> listar(){
        List<Caminhao> caminhao = session.createCriteria(Caminhao.class).list();
        session.close();
        return caminhao;
    }
    public void remover(Object caminhao){
        session.beginTransaction();
        session.delete(caminhao);
        session.getTransaction().commit();
        session.close();
    }

    public void salvar(Caminhao caminhao) {
        session.beginTransaction();
        session.saveOrUpdate(caminhao);
        session.getTransaction().commit();
        session.close();
    }
    
}
