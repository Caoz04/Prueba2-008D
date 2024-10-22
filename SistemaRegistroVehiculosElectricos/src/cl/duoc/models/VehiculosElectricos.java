/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public abstract class VehiculosElectricos implements ReglasVehiculos {
    public  String CodigoUnico;
    public boolean Mantenimiento;

    public VehiculosElectricos() {
    }

    public VehiculosElectricos(String CodigoUnico, boolean Mantenimiento) {
        this.CodigoUnico = CodigoUnico;
        this.Mantenimiento = Mantenimiento;
    }

    public String getCodigoUnico() {
        return CodigoUnico;
    }

    public void setCodigoUnico(String CodigoUnico) {
        this.CodigoUnico = CodigoUnico;
    }

    public boolean isMantenimiento() {
        return Mantenimiento;
    }

    public void setMantenimiento(boolean Mantenimiento) {
        this.Mantenimiento = Mantenimiento;
    }

    @Override
    public abstract String toString() ;
    
      
    
}
