/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test;

import com.mycompany.test.clases.Carro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author samue
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        List<Carro> carros = new ArrayList<>();
                
        carros.add( new Carro("Blanco", "Mazda", "4x2", 200.5, "ABC123"));
        carros.add( new Carro("Negra", "Toyota", "4x4", 175.5, "XYZ123"));
        carros.add( new Carro("Rojo", "Land Rover", "4x4", 200.5, "TXM123"));
   
      
        System.out.println("El total de carros es : " + carros.size() );
        
    
         carros.forEach((carro) -> {
             System.out.println("Placa " + carro.getPlaca() );
         });
    }
}
