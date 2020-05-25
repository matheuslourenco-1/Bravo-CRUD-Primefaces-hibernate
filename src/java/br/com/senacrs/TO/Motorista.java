package br.com.senacrs.TO;

public class Motorista  implements java.io.Serializable {

    //declaração das variaveis 
    
     private Integer idMotorista;
     private String nomeMotorista;
     private String cnpjMotorista;
     private String contatoMotorista;

     public Motorista(){
         
     }
     //construtores
    public Motorista(String nomeMotorista,  String cnpjMotorista){
        this.nomeMotorista = nomeMotorista;
        this.cnpjMotorista = cnpjMotorista;
     }

    public Motorista( String nomeMotorista, String cnpjMotorista, String contatoMotorista) {
        this.nomeMotorista = nomeMotorista;
        this.cnpjMotorista = cnpjMotorista;
        this.contatoMotorista = contatoMotorista;
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

    public String getCnpjMotorista() {
        return cnpjMotorista;
    }

    public void setCnpjMotorista(String cnpjMotorista) {
        this.cnpjMotorista = cnpjMotorista;
    }

    public String getContatoMotorista() {
        return contatoMotorista;
    }

    public void setContatoMotorista(String contatoMotorista) {
        this.contatoMotorista = contatoMotorista;
    }

   
    

}
