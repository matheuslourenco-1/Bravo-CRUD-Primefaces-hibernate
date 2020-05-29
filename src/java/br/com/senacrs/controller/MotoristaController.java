package br.com.senacrs.controller;

import br.com.senacrs.DAO.MotoristaDAO;
import br.com.senacrs.TO.Motorista;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


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
    public void salvar(){
        MotoristaDAO client = new MotoristaDAO();
        client.salvar(cliente);
        cliente = new Motorista();
    }
    //metodo listar
    public List<Motorista> listar(){
        MotoristaDAO client = new MotoristaDAO();
        return client.listar();
    }
    //metodo excluir
    public void remover(Motorista cliente){
        MotoristaDAO client = new MotoristaDAO();
        client.remover(cliente);
    }
    
}