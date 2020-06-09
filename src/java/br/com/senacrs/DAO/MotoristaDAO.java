package br.com.senacrs.DAO;

import br.com.senacrs.TO.Motorista;
import br.com.senacrs.util.HibernateUtil;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;

public class MotoristaDAO {
    Session session;
    
    /*Iniciando a sessão com o banco*/
    public MotoristaDAO() {
        session = HibernateUtil.getSessionFactory().openSession();
    }
    /*Construtor listar*/
    public List<Motorista> listar(){
        List<Motorista> motorista = session.createCriteria(Motorista.class).list();
        session.close();
        return motorista;
    }
    /*Construtor remover*/
    public void remover(Object motorista) throws SQLException{
        try{        
            session.beginTransaction();
            session.delete(motorista);
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
    public void salvar(Motorista motorista) throws SQLException{
        try{       
        session.beginTransaction();
        session.saveOrUpdate(motorista);
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
