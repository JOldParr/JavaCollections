/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import Entidad.Alumno;
import ServiciosAlumno.Servicios;

/**
 *
 * @author Julian
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Servicios s = new Servicios();
        s.bucleAlumno();
        s.buscarAlumno();
    }
    
}
