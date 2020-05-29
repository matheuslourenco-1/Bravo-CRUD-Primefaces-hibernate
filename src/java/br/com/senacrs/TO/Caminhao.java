package br.com.senacrs.TO;

public class Caminhao  implements java.io.Serializable {

    //declaração das variaveis 
    
     private Integer idCaminhao;
     private String placaCaminhao;
     private String modeloCaminhao;
     private double pesoInicialCaminhao;
     private double pesoFinalCaminhao;

     public Caminhao(){
         
     }
     //construtores
    public Caminhao(String placaCaminhao,  String modeloCaminhao, double pesoInicialCaminhao, double pesoFinalCaminhao){
        this.placaCaminhao = placaCaminhao;
        this.modeloCaminhao = modeloCaminhao;
        this.pesoInicialCaminhao = pesoInicialCaminhao;
        this.pesoFinalCaminhao = pesoFinalCaminhao;
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

    public double getPesoInicialCaminhao() {
        return pesoInicialCaminhao;
    }

    public void setPesoInicialCaminhao(double pesoInicialCaminhao) {
        this.pesoInicialCaminhao = pesoInicialCaminhao;
    }

    public double getPesoFinalCaminhao() {
        return pesoFinalCaminhao;
    }

    public void setPesoFinalCaminhao(double pesoFinalCaminhao) {
        this.pesoFinalCaminhao = pesoFinalCaminhao;
    }
}
