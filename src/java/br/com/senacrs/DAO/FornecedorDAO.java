package br.com.senacrs.DAO;

import br.com.senacrs.TO.Fornecedor;
import br.com.senacrs.util.HibernateUtil;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;

public class FornecedorDAO {
    Session session;
    
    /*Iniciando a sessão com o banco*/
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
    public void remover(Object fornecedor) throws SQLException{
        try{        
            session.beginTransaction();
            session.delete(fornecedor);
            session.getTransaction().commit();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!", JOptionPane.OK_OPTION);
        } finally {
            if(session != null && session.isOpen()){
                session.close();
            }
        }
    }
    
    /*Construtor salvar*/
    public void salvar(Fornecedor fornecedor) throws SQLException{
        try{       
        session.beginTransaction();
        session.saveOrUpdate(fornecedor);
        session.getTransaction().commit();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!", JOptionPane.OK_OPTION);
        } finally {
            if(session != null && session.isOpen()){
                session.close();
            }
        }
    }
    
}
