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
    private Color color;
    private Marca marca;
    private String tipoTraccion;
    private double velocidadMaxima;
    private String placa;

    public Carro() {
    }

    public Carro(Color color, Marca marca, String tipoTraccion, double velocidadMaxima, String placa) {
        this.color = color;
        this.marca = marca;
        this.tipoTraccion = tipoTraccion;
        this.velocidadMaxima = velocidadMaxima;
        this.placa = placa;
    }
    

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getTipoTraccion() {
        return tipoTraccion;
    }

    public void setTipoTraccion(String tipoTraccion) {
        this.tipoTraccion = tipoTraccion;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    
}
