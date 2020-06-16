package br.com.senacrs.TO;


import java.util.Date;

public class Gerenciador  implements java.io.Serializable {

    //declaração das variaveis 
     private Integer idGerenciador;
     private Date gerenciador_horarioEntrada;
     private String gerenciador_classificacao;
     private Integer idMotorista;
     private Integer idCaminhao;
     private Integer idFornecedor;
     private Caminhao placaCaminhao;
     public Gerenciador(){
         
     }

    public Gerenciador(String gerenciador_classificacao, Date gerenciador_horarioEntrada) {
        this.gerenciador_horarioEntrada = gerenciador_horarioEntrada;
        this.gerenciador_classificacao = gerenciador_classificacao;
    }

    public Gerenciador(Integer idMotorista, Integer idCaminhao, Integer idFornecedor) {
        this.idMotorista = idMotorista;
        this.idCaminhao = idCaminhao;
        this.idFornecedor = idFornecedor;
    }
        public Caminhao getPlacaCaminhao() {
        return placaCaminhao;
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

    public String getGerenciador_classificacao() {
        return gerenciador_classificacao;
    }

    public void setGerenciador_classificacao(String gerenciador_classificacao) {
        this.gerenciador_classificacao = gerenciador_classificacao;
    }
    

    public Date getGerenciador_horarioEntrada() {
        return gerenciador_horarioEntrada;
    }

    public void setGerenciador_horarioEntrada(Date gerenciador_horarioEntrada) {
        this.gerenciador_horarioEntrada = gerenciador_horarioEntrada;
    }

   
}