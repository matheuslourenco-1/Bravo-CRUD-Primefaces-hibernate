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
    /*Construtor listar*/
    public List<Caminhao> listar(){
        List<Caminhao> caminhao = session.createCriteria(Caminhao.class).list();
        session.close();
        return caminhao;
    }
    /*Construtor remover*/
    public void remover(Object caminhao){
        session.beginTransaction();
        session.delete(caminhao);
        session.getTransaction().commit();
        session.close();
    }
    /*Construtor salvar*/
    public void salvar(Caminhao caminhao) {
        session.beginTransaction();
        session.saveOrUpdate(caminhao);
        session.getTransaction().commit();
        session.close();
    }
    
}
