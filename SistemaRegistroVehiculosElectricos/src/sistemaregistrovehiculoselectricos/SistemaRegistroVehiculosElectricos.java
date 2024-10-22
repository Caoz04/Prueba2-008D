/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaregistrovehiculoselectricos;

import java.util.Scanner;


        
/**
 *
 * @author Cetecom
 */
public class SistemaRegistroVehiculosElectricos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
  
    
 
    
 
    Scanner entrada = new Scanner(System.in);
    int opcion = 0;
    while (opcion!=4) 
        System.out.println("Seleccionar Vehiculo");
        System.out.println("Agregar Vehiculo");
        System.out.println("Alquilar Vehiculo");
        System.out.println("Salir");
         
        opcion= entrada.nextInt();
        switch(opcion){
            case 1:
             System.out.println(""); 
             break;
            case 2:
              System.out.println(""); 
              break;  
            case 3:
              System.out.println("");
              break;
            case 4:
              System.out.println("Saliste exitosamente");
                break;
        }
    }
}
                 

