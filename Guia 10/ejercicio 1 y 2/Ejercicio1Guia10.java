/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.guia10;

import java.util.*;
/*import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;*/

/**
 *
 * @author Usuario
 */
public class Ejercicio1Guia10 {

    /**
     Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ArrayList <String> perro = new ArrayList();
        String raza = "";
        String opcion = "";
        
        do{
            System.out.println("Ingrese una raza de perro");
            raza = leer.next();
            perro.add(raza);
            System.out.println("Quiere ingresar otra raza?");
            opcion = leer.next();
        }while(opcion.equalsIgnoreCase("Si"));
        
        for (String mostrar : perro) {
            System.out.println(mostrar);
        }
        
        /*Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.*/
        
        System.out.println("Ingrese una raza de perro");
        String respuesta = leer.next();
        
        Collections.sort(perro); // El sort debe ir antes del iterator
        Iterator <String> razaI = perro.iterator();
        boolean encontrado = false;
        while(razaI.hasNext()){
            if(razaI.next().equalsIgnoreCase(respuesta)){
                razaI.remove();
                encontrado = true;
            }
        }
        
        if(encontrado){
            System.out.println("El perro se elimino de la lista");
        }else{
            System.out.println("El perro no se encuentra en la lista");
        }
        
        razaI = perro.iterator();
        
        while(razaI.hasNext()){
            System.out.println(razaI.next() + " ");
        }
        
    }
    
}
