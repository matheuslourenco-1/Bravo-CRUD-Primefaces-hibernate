package br.com.senacrs.TO;


public class Gerenciador  implements java.io.Serializable {

    //declaração das variaveis 
    

     private Integer idGerenciador;
     private String nomeFornecedor;
     private String placaCaminhao;
     private String nomeMotorista;
     private String cnhMotorista;

     
     public Gerenciador(){
         
     }

    public Gerenciador(String nomeFornecedor, String placaCaminhao, String nomeMotorista, String cnhMotorista) {
        this.nomeFornecedor = nomeFornecedor;
        this.placaCaminhao = placaCaminhao;
        this.nomeMotorista = nomeMotorista;
        this.cnhMotorista = cnhMotorista;
    }

    public Integer getIdGerenciador() {
        return idGerenciador;
    }

    public void setIdGerenciador(Integer idGerenciador) {
        this.idGerenciador = idGerenciador;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getPlacaCaminhao() {
        return placaCaminhao;
    }

    public void setPlacaCaminhao(String placaCaminhao) {
        this.placaCaminhao = placaCaminhao;
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
   
}