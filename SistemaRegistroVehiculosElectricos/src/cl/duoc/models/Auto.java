/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Auto extends VehiculosElectricos {
    public int CantidadPasajeros;
    public boolean AutoPilot;

    public Auto() {
    }

    public Auto(int CantidadPasajeros, boolean AutoPilot) {
        this.CantidadPasajeros = CantidadPasajeros;
        this.AutoPilot = AutoPilot;
    }

    public int getCantidadPasajeros() {
        return CantidadPasajeros;
    }

    public void setCantidadPasajeros(int CantidadPasajeros) {
        this.CantidadPasajeros = CantidadPasajeros;
    }

    public boolean isAutoPilot() {
        return AutoPilot;
    }

    public void setAutoPilot(boolean AutoPilot) {
        this.AutoPilot = AutoPilot;
    }

    @Override
    public String toString() {
        return "Auto{" + "CantidadPasajeros=" + CantidadPasajeros + ", AutoPilot=" + AutoPilot + '}';
    }
      public double calcularCosto(int yesono){
    double costo = VALOR_HORA_ALQUILER*yesono;
            
            if (AutoPilot ==true) {
            costo *= 1.10;
             
   }
return costo;
     }

   
    
    
    
    
    
}
