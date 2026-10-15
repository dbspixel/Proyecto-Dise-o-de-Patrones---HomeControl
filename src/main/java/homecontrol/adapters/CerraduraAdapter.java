/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homecontrol.adapters;

import homecontrol.abstracciones.Dispositivo;
import homecontrol.abstracciones.IBloqueable;
import homecontrol.legacy.CerraduraViejaLegacy;
public class CerraduraAdapter extends Dispositivo implements IBloqueable{

    private CerraduraViejaLegacy cerraduraVieja = new CerraduraViejaLegacy();
    
    public CerraduraAdapter() {
        super("Cerradura Vieja", "Entrada Principal ");
    }

    @Override
    public void ejecutarAccion() {
        bloquear();
    }

    @Override
    public void bloquear() {
        cerraduraVieja.girarLlave();
        System.out.println("Cerradura bloqueada ");
    }

    @Override
    public void desbloquear() {
        cerraduraVieja.girarLlave();
        System.out.println("Cerradura desbloqueada ");
    }
    
}
