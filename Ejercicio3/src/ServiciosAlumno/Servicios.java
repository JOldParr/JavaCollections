/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiciosAlumno;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class Servicios {

    private Scanner leer = new Scanner(System.in);

    public void CrearAlumno(Alumno a) {
        System.out.println("Indique el nombre del pelao");
        String nombre = leer.nextLine();
        System.out.println("Indique la nota 1");
        Double nota1 = leer.nextDouble();
        System.out.println("Indique la nota 2");
        Double nota2 = leer.nextDouble();
        System.out.println("Indique la nota 3");
        Double nota3 = leer.nextDouble();
        ArrayList <String> nombreAlumno = new ArrayList();
        nombreAlumno.add(nombre);
        
    }
}
