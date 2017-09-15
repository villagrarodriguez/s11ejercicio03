/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s11ejecicio03;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S11ejecicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
        
    int positivo = 0;
    int negativo = 0;
    int contador = 0;
    int total = 0;
    // TODO code application logic here
        System.out.println("ingrese varios numero (cero para terminar )");
        int numero = input.nextInt();
        
        if (numero ==0){
            System.out.println("no se ingreso ningun numero");
            System.exit(1);
        }
        while (numero !=0){
            System.out.println("no es cero!");
            if (numero > 0){
            positivo++;
            
            }
            else {
            negativo++;
            }
            contador++;
            total += numero;
            numero = input.nextInt();
        }
        double promedio = total / contador;
        System.out.println("positivos" + positivo);
        System.out.println("negativos" + negativo);
        System.out.println("contador" + contador);
        System.out.println("promedio" + promedio);
    }
    
        // TODO code application logic here
    }
    

