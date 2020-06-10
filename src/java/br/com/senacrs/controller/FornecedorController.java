package br.com.senacrs.controller;

import br.com.senacrs.DAO.FornecedorDAO;
import br.com.senacrs.TO.Fornecedor;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.swing.JOptionPane;
import org.primefaces.event.RowEditEvent;


@ManagedBean
@SessionScoped
@ViewScoped
public class FornecedorController implements Serializable{
    private static final long serialVersionUID = 1L;
    private Fornecedor cliente = new Fornecedor();
     
    
    public Fornecedor getFornecedor() {
        return cliente;
    }
   

    public void setFornecedor(Fornecedor cliente) {
        this.cliente = cliente;
    }
    //Metodo Salvar
    public void salvar() throws SQLException{
        try{
            FornecedorDAO client = new FornecedorDAO();
            client.salvar(cliente);
            cliente = new Fornecedor();   
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!", JOptionPane.OK_OPTION);
        }
    }
    
    //metodo listar
    public List<Fornecedor> listar(){
        FornecedorDAO client = new FornecedorDAO();
        return client.listar();
    }
    //metodo excluir
    public void remover(Fornecedor cliente) throws SQLException{
        try{
            FornecedorDAO client = new FornecedorDAO();
            client.remover(cliente);
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!", JOptionPane.OK_OPTION);
        }
    }
    
    
}