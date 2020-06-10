package br.com.senacrs.TO;


import java.util.Date;

public class Gerenciador  implements java.io.Serializable {

    //declaração das variaveis 
     private Integer idGerenciador;
     private String gerenciador_nomeFornecedor;
     private String gerenciador_placaCaminhao;
     private String gerenciador_nomeMotorista;
     private Date gerenciador_horarioEntrada;
     private Integer idMotorista;
     private Integer idCaminhao;
     private Integer idFornecedor;
     
     public Gerenciador(){
         
     }

    public Gerenciador(String gerenciador_nomeFornecedor, String gerenciador_placaCaminhao, String gerenciador_nomeMotorista, Date gerenciador_horarioEntrada) {
        this.gerenciador_nomeFornecedor = gerenciador_nomeFornecedor;
        this.gerenciador_placaCaminhao = gerenciador_placaCaminhao;
        this.gerenciador_nomeMotorista = gerenciador_nomeMotorista;
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

    public String getGerenciador_nomeFornecedor() {
        return gerenciador_nomeFornecedor;
    }

    public void setGerenciador_nomeFornecedor(String gerenciador_nomeFornecedor) {
        this.gerenciador_nomeFornecedor = gerenciador_nomeFornecedor;
    }

    public String getGerenciador_placaCaminhao() {
        return gerenciador_placaCaminhao;
    }

    public void setGerenciador_placaCaminhao(String gerenciador_placaCaminhao) {
        this.gerenciador_placaCaminhao = gerenciador_placaCaminhao;
    }

    public String getGerenciador_nomeMotorista() {
        return gerenciador_nomeMotorista;
    }

    public void setGerenciador_nomeMotorista(String gerenciador_nomeMotorista) {
        this.gerenciador_nomeMotorista = gerenciador_nomeMotorista;
    }

    public Date getGerenciador_horarioEntrada() {
        return gerenciador_horarioEntrada;
    }

    public void setGerenciador_horarioEntrada(Date gerenciador_horarioEntrada) {
        this.gerenciador_horarioEntrada = gerenciador_horarioEntrada;
    }

   
}