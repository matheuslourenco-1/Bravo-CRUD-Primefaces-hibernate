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
     private Double pesoInicialCaminhao;
     private Double pesoFinalCaminhao;
     private Integer idMotorista;
     
     public Caminhao(){
         
     }

    public Caminhao(String placaCaminhao, Integer idMotorista, String modeloCaminhao, Double pesoInicialCaminhao, Double pesoFinalCaminhao) {
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

    public Double getPesoInicialCaminhao() {
        return pesoInicialCaminhao;
    }

    public void setPesoInicialCaminhao(Double pesoInicialCaminhao) {
        this.pesoInicialCaminhao = pesoInicialCaminhao;
    }

    public Double getPesoFinalCaminhao() {
        return pesoFinalCaminhao;
    }

    public void setPesoFinalCaminhao(Double pesoFinalCaminhao) {
        this.pesoFinalCaminhao = pesoFinalCaminhao;
    }

   
}