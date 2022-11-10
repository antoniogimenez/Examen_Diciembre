/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_diciembre;

import java.util.Scanner;

/**
 *
 * @author antonio.gimenez
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        
        int []lista = {2,-1,5,2,-3,2,0,6,-2,2};
        
        System.out.println("--- La lista de numeros es ---");
        for (int i = 0; i < lista.length; i++) {
            System.out.print("|"+lista[i]);
        }
        System.out.println("|");
        
        //CALCULAMOS EL MAXIMO
        int num=0;
        for (int i = 0; i < lista.length; i++) {
            if(lista[i]>num){
                num=lista[i];
            }
        }
        System.out.println("El maximo de la lista de numeros es: "+num);
        
        //CALCULAMOS LA SUMA DE LOS VALORES POSITIVOS
        int suma=0;
        for (int i = 0; i < lista.length; i++) {
            if(lista[i]>0){
                suma=lista[i]+suma;
            }
        }
        System.out.println("La suma de los numeros positivos es: "+suma);
        //PEDIR VALOR Y VER LAS REPETICIONES
        int numero, contador=0;
        System.out.println("Dime un numero: ");
        numero = Integer.parseInt(s.nextLine());
        
        for (int i = 0; i < lista.length; i++) {
           if(lista[i]==numero){
               contador++;
           }
        }
        System.out.println("El numero de repeticiones del numero es: "+contador);
    }
    
}
