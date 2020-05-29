package br.com.senacrs.controller;

import br.com.senacrs.DAO.CaminhaoDAO;
import br.com.senacrs.TO.Caminhao;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


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
    public void salvar(){
        CaminhaoDAO client = new CaminhaoDAO();
        client.salvar(cliente);
        cliente = new Caminhao();
    }
    //metodo listar
    public List<Caminhao> listar(){
        CaminhaoDAO client = new CaminhaoDAO();
        return client.listar();
    }
    //metodo excluir
    public void remover(Caminhao cliente){
        CaminhaoDAO client = new CaminhaoDAO();
        client.remover(cliente);
    }
    
}