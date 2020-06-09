package br.com.senacrs.controller;

import br.com.senacrs.DAO.MotoristaDAO;
import br.com.senacrs.TO.Motorista;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.swing.JOptionPane;


@ManagedBean
@SessionScoped
public class MotoristaController implements Serializable{
    private static final long serialVersionUID = 1L;
    private Motorista cliente = new Motorista();
    
    
    
    public Motorista getMotorista() {
        return cliente;
    }

    public void setMotorista(Motorista cliente) {
        this.cliente = cliente;
    }
    //Metodo Salvar
    public void salvar() throws SQLException{
        try{
            MotoristaDAO client = new MotoristaDAO();
            client.salvar(cliente);
            cliente = new Motorista();   
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!", JOptionPane.OK_OPTION);
        }
    }
    //metodo listar
    public List<Motorista> listar(){
        MotoristaDAO client = new MotoristaDAO();
        return client.listar();
    }
    //metodo excluir
    public void remover(Motorista cliente) throws SQLException{
        try{
            MotoristaDAO client = new MotoristaDAO();
            client.remover(cliente);
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!", JOptionPane.OK_OPTION);
        }
    }
    
}