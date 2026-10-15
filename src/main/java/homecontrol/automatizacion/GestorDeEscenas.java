/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homecontrol.automatizacion;


public class GestorDeEscenas {
    private HubCentral hub = HubCentral.getInstancia();
    
    public void modoNoche() {
        System.out.println("Activando modo noche.");
        hub.ejecutarTodo();
    }
    
    public void modoDia(){
        System.out.println("Activando modo dia.");
        hub.ejecutarTodo();
    }
}
