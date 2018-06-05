/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.*;

/**
 *
 * @author ESFOT
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\tBIBLIOTECA\n");
        System.out.println("Ingrese la opcion que desea: ");
        System.out.println("1: Ingresar nuevo libro.");
        System.out.println("2: Imprimir libros favoritos.");
        System.out.println("3: Contar libros de autor.");
        System.out.println("4: Salir.");
        int opc, i;
        Libro[] libros = new Libro[10];
        opc = scan.nextInt();
        do {

            switch (opc) {

                case 1:
                    System.out.println("Ingrese la información de los libros: ");
                    

                    for (i = 0; i < libros.length; i++) {

                        System.out.println("Titulo Libro " + (i+1) + ": ");
                        scan.nextLine();
                        String nombreLibro = scan.nextLine();

                        System.out.println("Año: ");

                        int anio = scan.nextInt();

                        System.out.println("Es uno de sus favoritos (true : SI ó false : NO): ");
                        boolean favorito = scan.nextBoolean();

                        System.out.println("Ingrese los datos del autor: ");
                        Autor[] autor = new Autor[1];

                        for (int j = 0; j < autor.length; j++) {
                            
                            System.out.println("Nombre:");
                            scan.nextLine();
                            scan.nextLine();
                            String nombreAutor = scan.nextLine();

                            System.out.println("Pais:");
                           
                            String pais = scan.nextLine();

                            autor[j] = new Autor(nombreAutor, pais);

                        }
                             libros[i] = new Libro(nombreLibro, anio, favorito, autor);
                             
                             System.out.println("Se ha ingresado el libro:");
                             System.out.println(libros[i]);
                             scan.nextLine();
                    }
                    if (libros.length == 10) {
                        System.out.println("LA BILIOTECA ESTA LLENA!");
                    }

                    break;
                    

                case 2:
                    break;

                case 3:
                    System.out.println("\tLISTA\n");
                   
                 
                    
                    break;

                default:
                    System.out.println("Opcion no válida!!");

            }
        } while (opc != 4);

    }

}
