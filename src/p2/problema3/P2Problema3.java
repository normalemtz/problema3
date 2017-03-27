/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2.problema3;
import java.util.Scanner;
/**
 *
 * @author normaledezma
 */
public class P2Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Matriz();
       
    }
    
public static int solicitaEntero(){
        Scanner tecl = new Scanner (System.in);
        int varEntera = 0;
        boolean flag;
        
        do{
        try{
        varEntera = tecl.nextInt();
        flag=false;
    }catch (Exception ex){
            System.out.println("Introdujo una variable incorrecta ");
            flag=true;
            tecl.nextLine();
    } 
  } while (flag); 
    return varEntera;
    }

public static int[][] Matriz(){
    int var1, var2;
    Scanner tecl = new Scanner (System.in);
    System.out.println("Introduzca el tamaño del arreglo");
    int [ ] [ ] arreglo;
    System.out.print("\nIntroduzca cuantas filas tendra el arreglo: ");
	var1=solicitaEntero ();
        System.out.print("Introduzca cuantas columnas tendra el arreglo: ");
	var2=solicitaEntero();
	arreglo = new int [var1] [var2];
        
        for (int i=0; i<arreglo.length; i++){
            for (int j= 0; j<arreglo[i].length; j++){
                System.out.print("Introduzca valores para la posición ("+i+" , "+j+") : ");
                arreglo[i][j]= solicitaEntero();
            }
        }
        System.out.println("\nEl contenido del arreglo es:");
            for(int i=0; i<arreglo.length; i++){
                for (int j=0; j<arreglo[i].length; j++){
                    System.out.print("["+arreglo[i][j]+"]");
                    if (j+2>arreglo[i].length){
                        System.out.println("\t");
                    }  
                }
            }
            
        System.out.println("\nEn * es igual a: ");    
              for (int i = 0; i < arreglo.length; i++){
            System.out.println();
            for (int j = 0; j < arreglo[0].length; j++){
                for(int k=1;k<=arreglo[i][j];k++){
                    System.out.print("*");
                }
                if(!(j==(arreglo[0].length-1)))System.out.print(" - ");
            }
            System.out.print("\n");
        }
    return arreglo;
    }
  }