/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Julian
 */
public class Alumno {
    
    private ArrayList<String> alumno;
    private ArrayList<Double> notas;

    public Alumno() {
        this.alumno = new ArrayList();
        this.alumno = new ArrayList(3);
    }

    public ArrayList<String> getAlumno() {
        return alumno;
    }

    public void setAlumno(ArrayList<String> alumno) {
        this.alumno = alumno;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

   
    
    
}
