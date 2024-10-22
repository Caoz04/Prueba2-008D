/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Bicicleta extends VehiculosElectricos {
    public String TipoFrenos;
    public int CapacidadBateriaEnKilometros;

    public Bicicleta() {
    }

    public Bicicleta(String TipoFrenos, int CapacidadBateriaEnKilometros) {
        this.TipoFrenos = TipoFrenos;
        this.CapacidadBateriaEnKilometros = CapacidadBateriaEnKilometros;
    }

    public String getTipoFrenos() {
        return TipoFrenos;
    }

    public void setTipoFrenos(String TipoFrenos) {
        this.TipoFrenos = TipoFrenos;
    }

    public int getCapacidadBateriaEnKilometros() {
        return CapacidadBateriaEnKilometros;
    }

    public void setCapacidadBateriaEnKilometros(int CapacidadBateriaEnKilometros) {
        this.CapacidadBateriaEnKilometros = CapacidadBateriaEnKilometros;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "TipoFrenos=" + TipoFrenos + ", CapacidadBateriaEnKilometros=" + CapacidadBateriaEnKilometros + '}';
    }
    
      public double calcularCosto(int yesono){
    double costo = VALOR_HORA_ALQUILER*yesono;
            
            if (CapacidadBateriaEnKilometros < 20) {
            costo *= 0.95;
             
   }
return costo;
     }

}
   
    
    

