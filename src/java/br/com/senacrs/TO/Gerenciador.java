package br.com.senacrs.TO;


public class Gerenciador  implements java.io.Serializable {

    //declaração das variaveis 
    

     private Integer idGerenciador;
     private String gerenciador_cnpjFornecedor;
     private String gerenciador_placaCaminhao;
     private String gerenciador_nomeMotorista;

     
     public Gerenciador(){
         
     }

    public Gerenciador(String gerenciador_cnpjFornecedor, String gerenciador_placaCaminhao, String gerenciador_nomeMotorista) {
        this.gerenciador_cnpjFornecedor = gerenciador_cnpjFornecedor;
        this.gerenciador_placaCaminhao = gerenciador_placaCaminhao;
        this.gerenciador_nomeMotorista = gerenciador_nomeMotorista;
    }

    public Integer getIdGerenciador() {
        return idGerenciador;
    }

    public void setIdGerenciador(Integer idGerenciador) {
        this.idGerenciador = idGerenciador;
    }

    public String getGerenciador_cnpjFornecedor() {
        return gerenciador_cnpjFornecedor;
    }

    public void setGerenciador_cnpjFornecedor(String gerenciador_cnpjFornecedor) {
        this.gerenciador_cnpjFornecedor = gerenciador_cnpjFornecedor;
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

   
}