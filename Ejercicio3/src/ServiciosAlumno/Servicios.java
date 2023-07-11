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

    private Scanner leerInt;
    private Scanner leerString;
    private ArrayList<Alumno> ListaAlumnos;

    public Servicios() {
        this.leerInt = new Scanner(System.in);
        this.leerString = new Scanner(System.in);
        this.ListaAlumnos = new ArrayList();
    }

    public Alumno crearAlumno() {
        Alumno a = new Alumno();
        System.out.println("Indique el nombre del pelao");
        String nombre = leerString.nextLine();
        System.out.println("Indique la nota 1");
        int nota1 = leerInt.nextInt();
        System.out.println("Indique la nota 2");
        int nota2 = leerInt.nextInt();
        System.out.println("Indique la nota 3");
        int nota3 = leerInt.nextInt();

        ArrayList<Integer> Notas = new ArrayList(3);
        Notas.add(nota1);
        Notas.add(nota2);
        Notas.add(nota3);

        a.setNombre(nombre);
        a.setNotas(Notas);
        ListaAlumnos.add(a);

        return a;
    }

    public void bucleAlumno() {
        crearAlumno();
        System.out.println("¿Desea agregar más alumnos?");
        if (leerString.nextLine().equalsIgnoreCase("si")) {
            bucleAlumno();
        } else {
            mostrarAlumnos();
        }
    }

    public void mostrarAlumnos() {
        System.out.println("Estos son los pelaos agregados");
        for (Alumno aux : ListaAlumnos) {
            System.out.println(aux);
        }
    }

    public void buscarAlumno() {
        
        System.out.println("Indique el nombre del alumno que quiere buscar");
        String alumnoBuscar = leerString.nextLine();
        int cont = 0;
        int index = 0;
        boolean SiExiste = false;
        Alumno AlumnoBuscado = new Alumno();
        for (Alumno aux : ListaAlumnos) {
            cont++;
            if (aux.getNombre().equalsIgnoreCase(alumnoBuscar)) {
                index = cont;
                AlumnoBuscado = aux;
                SiExiste=true;
            }
            
        }
        if (SiExiste == false) {
            System.out.println("No se encontro el pelao, intentelo otra vez");
            buscarAlumno();
        } else {
            System.out.println("alumno encontrado en la posición " + index
                    + " de " + ListaAlumnos.size());
            notaFinal(AlumnoBuscado);
        }

    }

    public void notaFinal(Alumno aux) {
        int suma = 0;
        for (int i = 0; i < aux.getNotas().size(); i++) {
            suma += aux.getNotas().get(i);
        }
        System.out.println("El alumno " + aux.getNombre()
                + " tiene un promedio de " + (double) (suma / 3) + " en sus notas");
    }

}
