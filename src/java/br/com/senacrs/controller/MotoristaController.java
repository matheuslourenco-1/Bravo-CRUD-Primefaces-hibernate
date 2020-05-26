package br.com.senacrs.controller;

import br.com.senacrs.DAO.FornecedorDAO;
import br.com.senacrs.TO.Fornecedor;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class MotoristaController implements Serializable{
    private static final long serialVersionUID = 1L;
    private Fornecedor cliente = new Fornecedor();
    
    
    
    public Fornecedor getFornecedor() {
        return cliente;
    }

    public void setFornecedor(Fornecedor cliente) {
        this.cliente = cliente;
    }
    //Metodo Salvar
    public void salvar(){
        FornecedorDAO client = new FornecedorDAO();
        client.salvar(cliente);
        cliente = new Fornecedor();
    }
    //metodo listar
    public List<Fornecedor> listar(){
        FornecedorDAO client = new FornecedorDAO();
        return client.listar();
    }
    //metodo excluir
    public void remover(Fornecedor cliente){
        FornecedorDAO client = new FornecedorDAO();
        client.remover(cliente);
    }
    
}