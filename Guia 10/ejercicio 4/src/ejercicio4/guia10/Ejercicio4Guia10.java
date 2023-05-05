/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.guia10;

import ejercicio4.guia10.entidades.Pelicula;
import ejercicio4.guia10.servicio.PeliculaServicio;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Ejercicio4Guia10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliculaServicio ps = new PeliculaServicio();
        ArrayList<Pelicula> pelis;
        pelis = ps.crearPelicula();
        ps.mostrarPeliculas(pelis);
        ps.peliculaDuracion1(pelis);
        ps.peliculaDuracion2(pelis);
        ps.peliculaDuracion3(pelis);
        ps.ordenAlfa(pelis);
        ps.ordenDir(pelis);
    }
    }
    
