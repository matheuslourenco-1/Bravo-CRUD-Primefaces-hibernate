package br.com.senacrs.TO;

public class Caminhao  implements java.io.Serializable {

    //declaração das variaveis 
    
     private Integer idCaminhao;
     private String nomeCaminhao;
     private String cnpjCaminhao;
     private String contatoCaminhao;

     public Caminhao(){
         
     }
     //construtores
    public Caminhao(String nomeCaminhao,  String cnpjCaminhao){
        this.nomeCaminhao = nomeCaminhao;
        this.cnpjCaminhao = cnpjCaminhao;
     }

    public Caminhao( String nomeCaminhao, String cnpjCaminhao, String contatoCaminhao) {
        this.nomeCaminhao = nomeCaminhao;
        this.cnpjCaminhao = cnpjCaminhao;
        this.contatoCaminhao = contatoCaminhao;
    }

    public Integer getIdCaminhao() {
        return idCaminhao;
    }

    public void setIdCaminhao(Integer idCaminhao) {
        this.idCaminhao = idCaminhao;
    }

    public String getNomeCaminhao() {
        return nomeCaminhao;
    }

    public void setNomeCaminhao(String nomeCaminhao) {
        this.nomeCaminhao = nomeCaminhao;
    }

    public String getCnpjCaminhao() {
        return cnpjCaminhao;
    }

    public void setCnpjCaminhao(String cnpjCaminhao) {
        this.cnpjCaminhao = cnpjCaminhao;
    }

    public String getContatoCaminhao() {
        return contatoCaminhao;
    }

    public void setContatoCaminhao(String contatoCaminhao) {
        this.contatoCaminhao = contatoCaminhao;
    }

   
    

}
