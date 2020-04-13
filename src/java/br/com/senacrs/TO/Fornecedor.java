package br.com.senacrs.TO;

public class Fornecedor  implements java.io.Serializable {


     private Integer idFornecedor;
     private String nomeFornecedor;
     private String cnpjFornecedor;
     private String contatoFornecedor;

     public Fornecedor(){
         
     }
    public Fornecedor(String nomeFornecedor,  String cnpjFornecedor){
        this.nomeFornecedor = nomeFornecedor;
        this.cnpjFornecedor = cnpjFornecedor;
     }

    public Fornecedor( String nomeFornecedor, String cnpjFornecedor, String contatoFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
        this.cnpjFornecedor = cnpjFornecedor;
        this.contatoFornecedor = contatoFornecedor;
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
