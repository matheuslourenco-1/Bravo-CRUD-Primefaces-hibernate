package br.com.senacrs.controller;

import br.com.senacrs.DAO.CaminhaoDAO;
import br.com.senacrs.TO.Caminhao;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.swing.JOptionPane;


@ManagedBean
@SessionScoped
public class CaminhaoController implements Serializable{
    private static final long serialVersionUID = 1L;
    private Caminhao cliente = new Caminhao();
    
    
    
    public Caminhao getCaminhao() {
        return cliente;
    }

    public void setCaminhao(Caminhao cliente) {
        this.cliente = cliente;
    }
    //Metodo Salvar
    public void salvar() throws SQLException{
        try{
            CaminhaoDAO client = new CaminhaoDAO();
            client.salvar(cliente);
            cliente = new Caminhao();   
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!", JOptionPane.OK_OPTION);
        }
    }
    //metodo listar
    public List<Caminhao> listar(){
        CaminhaoDAO client = new CaminhaoDAO();
        return client.listar();
    }
    //metodo excluir
    public void remover(Caminhao cliente) throws SQLException{
        try{
            CaminhaoDAO client = new CaminhaoDAO();
            client.remover(cliente);
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!", JOptionPane.OK_OPTION);
        }
    }    
}