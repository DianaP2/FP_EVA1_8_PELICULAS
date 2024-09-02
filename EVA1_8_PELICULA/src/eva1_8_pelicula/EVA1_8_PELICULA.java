package EVA1_8_PELICULA;

import java.util.Scanner;


/**
 *
 * @Diana Sanchez
 */
public class EVA1_8_PELICULA {
    public static void main(String[] args) {
        String nombre;
        String genero;
        int duracion;
        String repar; 
        String clasi;
        
        Scanner peli;
        peli=new Scanner(System.in);
        
        System.out.println("Nombre de la pelicula");
        nombre=peli.nextLine();
        System.out.println("Genero de la pelicula");
        genero=peli.nextLine();
        System.out.println("Duracion de la peli en segundos");
        duracion=peli.nextInt();
       
        peli.nextLine(); //Se pone si hay problemas despues del nextInt
        
        System.out.println("Reparto de la peli");
        repar=peli.nextLine();
        System.out.println("Clasificacion de la pelicula");
        clasi=peli.nextLine();
        
        System.out.println("El nombre de la pelicula es: " + nombre);
        System.out.println("El genero de la pelicula es: " + genero);
        System.out.println("La duracion de la pelicula es: " + duracion);
        System.out.println("El reparto de la pelicula es: " + repar);
        System.out.println("La clasificacion es: " + clasi);
    }
    
}