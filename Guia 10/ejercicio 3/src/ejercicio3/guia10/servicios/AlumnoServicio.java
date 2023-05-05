/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.guia10.servicios;

import ejercicio3.guia10.entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AlumnoServicio {
    private ArrayList<Alumno> alumnos = new ArrayList<>();
    Scanner leer = new Scanner(System.in);
    public void crearAlumnos(){


        String op= "s";
        do {
            Alumno alumno = new Alumno();
            ArrayList<Integer> notas = new ArrayList<>();
            System.out.println("Ingrese el nombre del alumno");
            alumno.setNombre(leer.next());
            System.out.println("Ingrese la primer nota:");
            notas.add(leer.nextInt());
            System.out.println("Ingrese la segunda nota:");
            notas.add(leer.nextInt());
            System.out.println("Ingrese la tercer nota:");
            notas.add(leer.nextInt());
            alumno.setNotas(notas);
            alumnos.add(alumno);
            System.out.println("Desea ingresar otro alumno:(s/n)");
            op= leer.next();

        }while ( op.equalsIgnoreCase("s"));

    }
    public void mostrarAlumnos(){
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }
    public void notaFinal(){
        System.out.println("Ingresar el nombre del alumno para calcular la nota final:");
        String nombre = leer.next();
        int promedio = 0;
        int suma = 0;
        boolean encontrado = false;
        for (Alumno alumno : alumnos) {
            if(alumno.getNombre().equalsIgnoreCase(nombre)){
                for (int i = 0; i < alumno.getNotas().size(); i++) {
                    suma = suma + alumno.getNotas().get(i);
                }
                promedio = (suma/3);
                System.out.println("El promedio final es: + " + promedio);;
                encontrado = true;

            }

        }
        if(!encontrado){
            System.out.println("El alumno no se encuentra en la lista");
        }
    }
}
