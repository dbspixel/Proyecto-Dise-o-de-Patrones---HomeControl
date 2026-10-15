/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homecontrol.observer;

import java.util.ArrayList;
import java.util.List;
public class SensorMovimiento implements Sujeto{

    private List<Observador> observadores = new ArrayList<>();
    
    @Override
    public void agregarObservador(Observador o) {
        observadores.add(o);
    }

    @Override
    public void notificar(String mensaje) {
        for(Observador o : observadores){
            o.actualizar(mensaje);
        }
    }
    
    public void detectar(){
        System.out.println("El sensor detecto un movimiento!");
        notificar("Moviemiento detectado!");
    }
    
}
