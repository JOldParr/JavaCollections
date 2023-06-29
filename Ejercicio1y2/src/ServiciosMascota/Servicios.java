/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiciosMascota;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class Servicios {

    private ArrayList<String> mascotas;
    private Scanner leer;

    public Servicios() {
        this.mascotas = new ArrayList();
        this.leer = new Scanner(System.in);
    }

    public void CrearRazas() {
        System.out.println("Indíque el nombre de la raza");
        String Raza = leer.nextLine();
        mascotas.add(Raza);
        
        System.out.println("¿Desea agregar más razas?");
        System.out.println("SI o NO");
        if (leer.nextLine().equalsIgnoreCase("SI")) {
            CrearRazas();
        } else {
            MostrarRazas();
        }
        leer.close();
    }

    public void MostrarRazas() {
        System.out.println("Estas son las razas agregadas");
        for (String Raza : mascotas) {
            System.out.println(Raza);
        }
    }
    
    public void Iterador(){
        System.out.println("Indique la raza de perro a eliminar");
        Iterator iterador = mascotas.iterator();
        mascotas.remove(leer.nextLine());
            MostrarRazas();
    }

}
