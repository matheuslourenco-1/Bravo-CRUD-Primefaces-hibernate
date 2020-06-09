package br.com.senacrs.controller;

import br.com.senacrs.DAO.GerenciadorDAO;
import br.com.senacrs.TO.Gerenciador;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.swing.JOptionPane;


@ManagedBean
@SessionScoped
public class GerenciadorController implements Serializable{
    private static final long serialVersionUID = 1L;
    private Gerenciador cliente = new Gerenciador();
    
    
    
    public Gerenciador getGerenciador() {
        return cliente;
    }

    public void setGerenciador(Gerenciador cliente) {
        this.cliente = cliente;
    }
    //Metodo Salvar
    public void salvar() throws SQLException{
        try{
            GerenciadorDAO client = new GerenciadorDAO();
            client.salvar(cliente);
            cliente = new Gerenciador();   
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!", JOptionPane.OK_OPTION);
        }
    }
    //metodo listar
    public List<Gerenciador> listar(){
        GerenciadorDAO client = new GerenciadorDAO();
        return client.listar();
    }
    //metodo excluir
    public void remover(Gerenciador cliente) throws SQLException{
        try{
            GerenciadorDAO client = new GerenciadorDAO();
            client.remover(cliente);
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!", JOptionPane.OK_OPTION);
        }
    }
    
}