package br.com.senacrs.DAO;

import br.com.senacrs.TO.Gerenciador;
import br.com.senacrs.util.HibernateUtil;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;

public class GerenciadorDAO {
    Session session;
    
    /*Iniciando a sessão com o banco*/
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
    public void remover(Object gerenciador) throws SQLException{
        try{        
            session.beginTransaction();
            session.delete(gerenciador);
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
    public void salvar(Gerenciador gerenciador) throws SQLException{
        try{       
        session.beginTransaction();
        session.saveOrUpdate(gerenciador);
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
