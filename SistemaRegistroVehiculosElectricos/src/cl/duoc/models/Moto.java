/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Moto extends VehiculosElectricos {
    public int CapacidadBateria;
    public boolean ModoEco;

    public Moto() {
    }

    public Moto(int CapacidadBateria, boolean ModoEco) {
        this.CapacidadBateria = CapacidadBateria;
        this.ModoEco = ModoEco;
    }

    public int getCapacidadBateria() {
        return CapacidadBateria;
    }

    public void setCapacidadBateria(int CapacidadBateria) {
        this.CapacidadBateria = CapacidadBateria;
    }

    public boolean isModoEco() {
        return ModoEco;
    }

    public void setModoEco(boolean ModoEco) {
        this.ModoEco = ModoEco;
    }

    @Override
    public String toString() {
        return "Moto{" + "CapacidadBateria=" + CapacidadBateria + ", ModoEco=" + ModoEco + '}';
    }
      public double calcularCosto(int yesono){
    double costo = VALOR_HORA_ALQUILER*yesono;
            
            if (ModoEco == true) {
            costo *= 1.08;
             
   }
return costo;
     }
    
}
