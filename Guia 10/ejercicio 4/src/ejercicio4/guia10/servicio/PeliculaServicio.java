/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.guia10.servicio;

import ejercicio4.guia10.entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PeliculaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");


    public ArrayList<Pelicula> crearPelicula() {
        ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
        String op = "s";
        Pelicula pelicula;
        do {
            System.out.println("Ingrese el titulo ");
            String titulo = leer.next();
            System.out.println("Ingrese el director ");
            String director = leer.next();
            System.out.println("Ingrese la duración ");
            int duracion = leer.nextInt();
            pelicula = new Pelicula(titulo, director, duracion);
            System.out.println("Quiere ingresar otra pelicula ? (s/n)");
            op = leer.next();
            listaPeliculas.add(pelicula);
        } while (op.equalsIgnoreCase("s"));
        return listaPeliculas;
    }

    public void mostrarPeliculas(ArrayList<Pelicula> listapeliculas) {
        for (Pelicula pelicula : listapeliculas) {
            System.out.println(pelicula);

        }
    }

    public void peliculaDuracion1(ArrayList<Pelicula> listapeliculas) {
        for (Pelicula pelicula : listapeliculas) {
            if (pelicula.getDuracion() >= 1) {
                System.out.println(pelicula);
            }
        }
    }

    public void peliculaDuracion2(ArrayList<Pelicula> listaPeliculas) {
        listaPeliculas.sort(Pelicula.compararPelicula);
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula);
        }
        System.out.println();
    }

    public void peliculaDuracion3(ArrayList<Pelicula> listaPeliculas) {
        Collections.reverse(listaPeliculas);
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula);
        }
        System.out.println();
    }

    public void ordenAlfa(ArrayList<Pelicula> listaPeliculas) {
        listaPeliculas.sort(Pelicula.ordenAlfab);
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula);

        }
    }

    public void ordenDir(ArrayList<Pelicula> listaPeliculas) {
        listaPeliculas.sort(Pelicula.ordenDire);
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula);
}
    }
}
