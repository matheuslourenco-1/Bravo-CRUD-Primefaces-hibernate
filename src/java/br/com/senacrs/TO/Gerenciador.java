package br.com.senacrs.TO;


import java.util.Date;

public class Gerenciador  implements java.io.Serializable {

    //declaração das variaveis 
     private Integer idGerenciador;
     private Date gerenciador_horarioEntrada;
     private Integer idMotorista;
     private Integer idCaminhao;
     private Integer idFornecedor;
     
     public Gerenciador(){
         
     }

    public Gerenciador(Date gerenciador_horarioEntrada) {
        this.gerenciador_horarioEntrada = gerenciador_horarioEntrada;
    }

    public Gerenciador(Integer idMotorista, Integer idCaminhao, Integer idFornecedor) {
        this.idMotorista = idMotorista;
        this.idCaminhao = idCaminhao;
        this.idFornecedor = idFornecedor;
    }

    public Integer getIdMotorista() {
        return idMotorista;
    }

    public void setIdMotorista(Integer idMotorista) {
        this.idMotorista = idMotorista;
    }

    public Integer getIdCaminhao() {
        return idCaminhao;
    }

    public void setIdCaminhao(Integer idCaminhao) {
        this.idCaminhao = idCaminhao;
    }

    public Integer getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(Integer idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    
    
    
    public Integer getIdGerenciador() {
        return idGerenciador;
    }

    public void setIdGerenciador(Integer idGerenciador) {
        this.idGerenciador = idGerenciador;
    }

    public Date getGerenciador_horarioEntrada() {
        return gerenciador_horarioEntrada;
    }

    public void setGerenciador_horarioEntrada(Date gerenciador_horarioEntrada) {
        this.gerenciador_horarioEntrada = gerenciador_horarioEntrada;
    }

   
}