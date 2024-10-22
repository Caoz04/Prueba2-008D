/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class RegistroVehiculos {
    private List<VehiculosElectricos>registroVehiculos = new ArrayList<>();
    
    public RegistroVehiculos(){
        registroVehiculos = new ArrayList<>();
    }
    public void agregarVehiculo(VehiculosElectricos agregado){
    registroVehiculos.add(agregado);
    System.out.println("Vehiculo Agregado Exitosamente");
    }
  public void listarVehiculos(){
      for (VehiculosElectricos agregado : registroVehiculos){
          System.out.println("Vehiculos Totales" + registroVehiculos.size());
      }
  }
}
