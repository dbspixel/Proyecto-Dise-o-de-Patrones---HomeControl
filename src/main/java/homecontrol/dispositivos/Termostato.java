/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homecontrol.dispositivos;

import homecontrol.abstracciones.Dispositivo;
import homecontrol.abstracciones.IMedible;
public class Termostato extends Dispositivo implements IMedible{

    private double temperatura = 24.0;
    
    public Termostato(String nombre, String ubicacion) {
        super(nombre, ubicacion);
    }

    @Override
    public double medir() {
        return temperatura;
    }

    @Override
    public void ejecutarAccion() {
        System.out.println(getNombre() + " midiendo: " + medir() + "°C");
    }
    
}
