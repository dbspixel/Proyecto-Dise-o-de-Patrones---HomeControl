/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homecontrol.automatizacion;

import homecontrol.abstracciones.Dispositivo;
import java.util.ArrayList;
import java.util.List;
public class HubCentral {
    private static HubCentral instancia;
    private List<Dispositivo> dispositivos = new ArrayList<>();
    
    //Singleton
    private HubCentral(){}
    
    public static HubCentral getInstancia(){
        if(instancia == null){
            instancia = new HubCentral();
        }
        return instancia;
    }
    
    public void agregarDispositivo(Dispositivo d){
        dispositivos.add(d);
    }
    
    public void ejecutarTodo(){
        System.out.println("--Hub cental ejecutando todo--");
        for(Dispositivo d : dispositivos){
            d.ejecutarAccion();
        }
    }
}
