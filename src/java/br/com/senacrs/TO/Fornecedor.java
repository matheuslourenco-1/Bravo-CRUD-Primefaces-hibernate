package br.com.senacrs.TO;


public class Fornecedor  implements java.io.Serializable {

    //declaração das variaveis 
    
     private Integer idFornecedor;
     private String nomeFornecedor;
     private String cnpjFornecedor;
     private String contatoFornecedor;
     private Integer idCaminhao;

     public Fornecedor(){
         
     }
     //construtores
    public Fornecedor(String nomeFornecedor,  String cnpjFornecedor){
        this.nomeFornecedor = nomeFornecedor;
        this.cnpjFornecedor = cnpjFornecedor;
     }

    public Fornecedor( String nomeFornecedor, String cnpjFornecedor, Integer idCaminhao, String contatoFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
        this.cnpjFornecedor = cnpjFornecedor;
        this.contatoFornecedor = contatoFornecedor;
        this.idCaminhao = idCaminhao;
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

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getCnpjFornecedor() {
        return cnpjFornecedor;
    }

    public void setCnpjFornecedor(String cnpjFornecedor) {
        this.cnpjFornecedor = cnpjFornecedor;
    }

    public String getContatoFornecedor() {
        return contatoFornecedor;
    }

    public void setContatoFornecedor(String contatoFornecedor) {
        this.contatoFornecedor = contatoFornecedor;
    }

   
    

}
