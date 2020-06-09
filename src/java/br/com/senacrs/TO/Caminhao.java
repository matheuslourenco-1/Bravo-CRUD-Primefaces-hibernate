package br.com.senacrs.TO;

/**
 *
 * @author mlour
 */
public class Caminhao implements java.io.Serializable {

    //declaração das variaveis 
    
     private Integer idCaminhao;
     private String placaCaminhao;
     private String modeloCaminhao;
     private String pesoInicialCaminhao;
     private String pesoFinalCaminhao;
     private Integer idMotorista;
     
     public Caminhao(){
         
     }

    public Caminhao(String placaCaminhao, Integer idMotorista, String modeloCaminhao, String pesoInicialCaminhao, String pesoFinalCaminhao) {
        this.placaCaminhao = placaCaminhao;
        this.modeloCaminhao = modeloCaminhao;
        this.pesoInicialCaminhao = pesoInicialCaminhao;
        this.pesoFinalCaminhao = pesoFinalCaminhao;
        this.idMotorista = idMotorista;
    }
    
    public Integer getIdMotorista() {
        return idMotorista;
    }

    /*Getters e Setters*/
    public void setIdMotorista(Integer idMotorista) {
        this.idMotorista = idMotorista;
    }

    public Integer getIdCaminhao() {
        return idCaminhao;
    }

    public void setIdCaminhao(Integer idCaminhao) {
        this.idCaminhao = idCaminhao;
    }

    public String getPlacaCaminhao() {
        return placaCaminhao;
    }

    public void setPlacaCaminhao(String placaCaminhao) {
        this.placaCaminhao = placaCaminhao;
    }

    public String getModeloCaminhao() {
        return modeloCaminhao;
    }

    public void setModeloCaminhao(String modeloCaminhao) {
        this.modeloCaminhao = modeloCaminhao;
    }

    public String getPesoInicialCaminhao() {
        return pesoInicialCaminhao;
    }

    public void setPesoInicialCaminhao(String pesoInicialCaminhao) {
        this.pesoInicialCaminhao = pesoInicialCaminhao;
    }

    public String getPesoFinalCaminhao() {
        return pesoFinalCaminhao;
    }

    public void setPesoFinalCaminhao(String pesoFinalCaminhao) {
        this.pesoFinalCaminhao = pesoFinalCaminhao;
    }

   
}