/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test;

import com.mycompany.test.clases.Carro;
import com.mycompany.test.clases.Marca;
import com.mycompany.test.clases.Color;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author samue
 */
public class Test {

    public static void main(String[] args) {
        
        //Pistas
        int contador = 0;
        contador++;
        contador = contador + 1;
        System.out.println("Contador " + contador );
        
        List<Marca> marcas = new ArrayList<>();
        marcas.add(new Marca("Mazda")); //0
        marcas.add(new Marca("Toyota"));  //1
        marcas.add(new Marca("Land Rover")); //2
        marcas.add(new Marca("Cheverolet")); //3
        marcas.add(new Marca("Mazda"));  //4
        
        List<Color> colores = new ArrayList<>();
        colores.add(new Color("Blanco"));
        colores.add(new Color("Rojo"));
        colores.add(new Color("Verde"));
        colores.add(new Color("Gris"));
        
        List<Carro> carros = new ArrayList<>();        
        carros.add( new Carro(colores.get(1), marcas.get(0), " 4x2", 50.5, " ABC123")); //0
        carros.add( new Carro(colores.get(1), marcas.get(1), " 4x4", 175.5, " XYZ123")); //1
        carros.add( new Carro(colores.get(1), marcas.get(2), " 4x4", 200.5, " TXM123"));  //2
        carros.add( new Carro(colores.get(2), marcas.get(3), " 4x2", 40.5, " TXM900"));  //3
        carros.add( new Carro(colores.get(2), marcas.get(3), " 4x2", 40.5, " TXM900"));  //4
        carros.add( new Carro(colores.get(3), marcas.get(0), " 4x2", 40.5, " TXM910"));   //5
        
        
        int contadorMazda = 0;
        int contadorToyota = 0;
        int contadorLand_Rover = 0;
        int contadorCheverolet = 0;
        
        int colorVerde = 0;
        int colorRojo = 0;
        int colorGris = 0;
        int colorBlanco = 0;
                
        

            
        System.out.println("\n\n\n" );
             
        int carrosConVelicidadMayorA100 = 0;
        int xyz = 0;
         for( int i = 0 ; i < carros.size(); i++ ) {
             System.out.println("indice " + i + " placa " + carros.get(i).getPlaca());
             
            
             String peligro = "No";
             if( carros.get(i).getVelocidadMaxima() >= 100 )
                 peligro = "Si";
             
             System.out.println("---------------------- Placa "+ carros.get(i).getPlaca() + "-----------------------" );
             System.out.println("Marca: " + carros.get(i).getMarca().getNombreMarca());
             System.out.println("Color:" + carros.get(i).getColor().getNombreColor());
             System.out.println("Tipo Tracción: " + carros.get(i).getTipoTraccion());
             System.out.println("Velocidad Máxima: " + carros.get(i).getVelocidadMaxima());
             System.out.println("Representa peligro: "  + peligro );
             System.out.println("----------------------------------------------------------");

             if(carros.get(i).getVelocidadMaxima() > 100)
                 carrosConVelicidadMayorA100++;
             if(carros.get(i).getVelocidadMaxima() < 100)
                 xyz++;

             if( carros.get(i).getMarca().getNombreMarca().compareToIgnoreCase("mazda") == 0 ) {
                contadorMazda++;
             }
             if( carros.get(i).getMarca().getNombreMarca().compareToIgnoreCase("Toyota") == 0 ) {
                contadorToyota++;
             }
             if( carros.get(i).getMarca().getNombreMarca().compareToIgnoreCase("Land Rover") == 0 ) {
                contadorLand_Rover++;
             }
             if( carros.get(i).getMarca().getNombreMarca().compareToIgnoreCase("Cheverolet") == 0 ) {
                contadorCheverolet++;
             }
             
             if( carros.get(i).getColor().getNombreColor().compareToIgnoreCase("Blanco") == 0 ) {
                colorBlanco++;
             }
             if( carros.get(i).getColor().getNombreColor().compareToIgnoreCase("Rojo") == 0 ) {
                colorRojo++;
             }
             if( carros.get(i).getColor().getNombreColor().compareToIgnoreCase("Verde") == 0 ) {
                colorVerde++;
             }
             if( carros.get(i).getColor().getNombreColor().compareToIgnoreCase("Gris") == 0 ) {
                colorGris++;
             }
             
      }
      System.out.println("Carros con velocidad mayor a 100 : " + carrosConVelicidadMayorA100);
      System.out.println("Carros con velocidad menor a 100 : " + xyz);
      
      
      System.out.println("Cantidad carros Blancos : " + colorBlanco);
      System.out.println("Cantidad carros Rojos : " + colorRojo);
      System.out.println("Cantidad carros Verdes : " + colorVerde);
      System.out.println("Cantidad carros Grises : " + colorGris);
    }
}
