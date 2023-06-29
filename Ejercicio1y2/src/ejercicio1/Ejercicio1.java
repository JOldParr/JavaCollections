/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import ServiciosMascota.Servicios;

/**
 *
 * @author Julian
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Programa para agregar razas de perros");
        Servicios sm = new Servicios();
        sm.CrearRazas();//muestra perros también
        sm.Iterador();//muestre perros tambien
        
    }
    
}
