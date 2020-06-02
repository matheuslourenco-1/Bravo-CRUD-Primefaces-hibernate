package br.com.senacrs.DAO;

import br.com.senacrs.TO.Fornecedor;
import br.com.senacrs.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;


public class FornecedorDAO {
    Session session;

    public FornecedorDAO() {
        session = HibernateUtil.getSessionFactory().openSession();
    }
    /*Construtor listar*/
    public List<Fornecedor> listar(){
        List<Fornecedor> fornecedor = session.createCriteria(Fornecedor.class).list();
        session.close();
        return fornecedor;
    }
    /*Construtor remover*/
    public void remover(Object fornecedor){
        session.beginTransaction();
        session.delete(fornecedor);
        session.getTransaction().commit();
        session.close();
    }
    /*Construtor salvar*/
    public void salvar(Fornecedor fornecedor) {
        session.beginTransaction();
        session.saveOrUpdate(fornecedor);
        session.getTransaction().commit();
        session.close();
    }
    
}
