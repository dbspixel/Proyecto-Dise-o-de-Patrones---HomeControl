/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homecontrol.fabrica;

import homecontrol.abstracciones.Dispositivo;
import homecontrol.dispositivos.*;
public class DispositivoFactory {
    public static Dispositivo crearDispositivo(String tipo, String nombre, String ubicacion){
        switch (tipo.toUpperCase()) {
            case "LUZ":
                return new LuzIntenligente(nombre, ubicacion);
            case "CERRADURA":
                return new CerraduraInteligente(nombre, ubicacion);
            case "TERMOSTATO":
                return new Termostato(nombre, ubicacion);
            default:
                System.out.println("Tipo no valido");
                return null;
        }
    }
}
