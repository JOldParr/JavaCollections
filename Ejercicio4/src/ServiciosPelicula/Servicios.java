/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiciosPelicula;

import Entidad.Pelicula;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Julian
 */
public class Servicios {

    private ArrayList<Pelicula> ListaPeliculas;

    public Servicios() {
        this.ListaPeliculas = new ArrayList();
    }

    public Pelicula crearPelicula() {
        Pelicula p = new Pelicula();
        String Titulo = JOptionPane.showInputDialog("Indique el título de la pelicula");
        p.setTitulo(Titulo);
        String Director = JOptionPane.showInputDialog("Indique el Director de la pelicula");
        p.setDirector(Director);
        double Horas = Double.parseDouble(JOptionPane.showInputDialog("Indique las horas de la pelicula"));
        p.setHoras(Horas);
        ListaPeliculas.add(p);
        return p;
    }

    public void buclePelicula() {
        crearPelicula();
        String Titulo = JOptionPane.showInputDialog("¿Desea agregar más películas? SI ó NO");
        if (Titulo.equalsIgnoreCase("si")) {
            buclePelicula();
        } else {
            mostrarPeliculas();
        }
    }

    public void mostrarPeliculas() {
        System.out.println("Estos son las películas agregadas");
        for (Pelicula aux : ListaPeliculas) {
            System.out.println(aux);
        }
    }
    
    public void mostrarPeliculasMayor1h(){
        System.out.println("Estas son las películas con una duración mayor a 1 Hora");
        
    }
    
    
    
}
