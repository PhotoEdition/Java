/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.clases;

/**
 *
 * @author samue
 */
public class Carro {
    private String color;
    private String marca;
    private String tipoTraccion;
    private double velicidadMaxima;
    private String placa;

    public Carro() {
    }

    public Carro(String color, String marca, String tipoTraccion, double velicidadMaxima, String placa) {
        this.color = color;
        this.marca = marca;
        this.tipoTraccion = tipoTraccion;
        this.velicidadMaxima = velicidadMaxima;
        this.placa = placa;
    }
    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoTraccion() {
        return tipoTraccion;
    }

    public void setTipoTraccion(String tipoTraccion) {
        this.tipoTraccion = tipoTraccion;
    }

    public double getVelicidadMaxima() {
        return velicidadMaxima;
    }

    public void setVelicidadMaxima(double velicidadMaxima) {
        this.velicidadMaxima = velicidadMaxima;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    
}
