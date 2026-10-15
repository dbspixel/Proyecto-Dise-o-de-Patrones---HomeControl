/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homecontrol.dispositivos;

import homecontrol.abstracciones.Dispositivo;
import homecontrol.abstracciones.IBloqueable;
public class CerraduraInteligente extends Dispositivo implements IBloqueable{

    public CerraduraInteligente(String nombre, String ubicacion) {
        super(nombre, ubicacion);
    }

    @Override
    public void ejecutarAccion() {
        bloquear();
    }

    @Override
    public void bloquear() {
         System.out.println(getNombre() + "bloqueada");
    }

    @Override
    public void desbloquear() {
         System.out.println(getNombre() + "desbloqueada");
    }
    
}
