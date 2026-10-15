/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homecontrol.observer;

/**
 *
 * @author Administrator
 */
public class LuzAutomatica implements Observador {

    public String nombre;

    public LuzAutomatica(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void actualizar(String mensaje) {
        System.out.println(nombre + "se encendio automaticamente por: " + mensaje);
    }
}
