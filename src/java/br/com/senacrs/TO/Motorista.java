package br.com.senacrs.TO;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

public class Motorista  implements java.io.Serializable {

    //declaração das variaveis 
    
     private Integer idMotorista;
     private String nomeMotorista;
     private String cnhMotorista;
     private Set moto = new HashSet(0);
    // private Set<Caminhao> caminhao = new HashSet<Caminhao>();
     public Motorista(){
         
     }
     //construtores
    public Motorista(String nomeMotorista,  String cnhMotorista, Set moto){
        this.nomeMotorista = nomeMotorista;
        this.cnhMotorista = cnhMotorista;
        this.moto = moto;
     }
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "moto")
    public Set getMoto() {
        return this.moto;
    }

    public void setMoto(Set moto) {
        this.moto = moto;
    }

    public Integer getIdMotorista() {
        return idMotorista;
    }

    public void setIdMotorista(Integer idMotorista) {
        this.idMotorista = idMotorista;
    }

    public String getNomeMotorista() {
        return nomeMotorista;
    }

    public void setNomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }

    public String getCnhMotorista() {
        return cnhMotorista;
    }

    public void setCnhMotorista(String cnhMotorista) {
        this.cnhMotorista = cnhMotorista;
    }

   /* public Set<Caminhao> getCaminhao() {
        return caminhao;
    }

    public void setCaminhao(Set<Caminhao> caminhao) {
        this.caminhao = caminhao;
    }*/
    
}