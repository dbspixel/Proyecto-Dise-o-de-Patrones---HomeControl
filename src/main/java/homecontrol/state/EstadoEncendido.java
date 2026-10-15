/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homecontrol.state;

/**
 *
 * @author Administrator
 */
public class EstadoEncendido implements IEstado{

    @Override
    public void manejarSolicitud() {
        System.out.println("La luz esta encendida. Apagando sistema.");
    }
    
}
