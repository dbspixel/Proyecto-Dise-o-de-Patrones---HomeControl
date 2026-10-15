/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homecontrol.abstracciones;

/**
 *
 * @author Administrator
 */
public abstract class Dispositivo {
    String nombre;
    String ubicacion;

    public Dispositivo(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }
    
    public abstract void ejecutarAccion();

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }
    
}
