/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Julian
 */
public class Pelicula {
    
    private String Titulo;
    private String Director;
    private double Horas; 

    public Pelicula() {
    }

    public Pelicula(String Titulo, String Director, double horas) {
        this.Titulo = Titulo;
        this.Director = Director;
        this.Horas = Horas;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public double getHoras() {
        return Horas;
    }

    public void setHoras(double Horas) {
        this.Horas = Horas;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "Titulo=" + Titulo + ", Director=" + Director + ", horas=" + Horas + '}';
    }
    
    
    
}
