/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maincarro;

/**
 *
 * @author USUARIO
 */
public class Carro {
    private String modelo;
    private String color;
    private boolean pinturaMetalizada;
    private String placa;
    private String tipoCarro;
    private int anoFabricacion;
    private String modalidadSeguro;

    // Constructor
    public Carro(String modelo, String color, boolean pinturaMetalizada, String placa, String tipoCarro,
                 int anoFabricacion, String modalidadSeguro) {
        this.modelo = modelo;
        this.color = color;
        this.pinturaMetalizada = pinturaMetalizada;
        this.placa = placa;
        this.tipoCarro = tipoCarro;
        this.anoFabricacion = anoFabricacion;
        this.modalidadSeguro = modalidadSeguro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPinturaMetalizada() {
        return pinturaMetalizada;
    }

    public void setPinturaMetalizada(boolean pinturaMetalizada) {
        this.pinturaMetalizada = pinturaMetalizada;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipoCarro() {
        return tipoCarro;
    }

    public void setTipoCarro(String tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(int anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    public String getModalidadSeguro() {
        return modalidadSeguro;
    }

    public void setModalidadSeguro(String modalidadSeguro) {
        this.modalidadSeguro = modalidadSeguro;
    }

    
}

