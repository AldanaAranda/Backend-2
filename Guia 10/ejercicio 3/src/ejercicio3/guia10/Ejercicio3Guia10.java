/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.guia10;

import ejercicio3.guia10.servicios.AlumnoServicio;

/**
 *
 * @author Usuario
 */
public class Ejercicio3Guia10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnoServicio as = new AlumnoServicio();
        as.crearAlumnos();
        as.mostrarAlumnos();
        as.notaFinal();
    }
    
}
