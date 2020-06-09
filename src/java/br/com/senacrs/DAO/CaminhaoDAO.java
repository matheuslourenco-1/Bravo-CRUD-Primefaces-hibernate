package br.com.senacrs.DAO;

import br.com.senacrs.TO.Caminhao;
import br.com.senacrs.util.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;

public class CaminhaoDAO {
    Session session;
    
    /*Iniciando a sessão com o banco*/
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
        try{        
            session.beginTransaction();
            session.delete(caminhao);
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
    public void salvar(Caminhao caminhao) {
        try{       
        session.beginTransaction();
        session.saveOrUpdate(caminhao);
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
