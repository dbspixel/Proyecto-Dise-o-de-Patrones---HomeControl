/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homecontrol.dispositivos;

import homecontrol.abstracciones.Dispositivo;
import homecontrol.abstracciones.IEncendible;
public class LuzIntenligente extends Dispositivo implements IEncendible {

    public LuzIntenligente(String nombre, String ubicacion) {
        super(nombre, ubicacion);
    }

    @Override
    public void ejecutarAccion() {
        encender();
    }

    @Override
    public void encender() {
        System.out.println(getNombre() + "encendida.");
    }

    @Override
    public void apagar() {
        System.out.println(getNombre() + "apagada");
    }
    
}
