/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package homecontrol.observer;

/**
 *
 * @author Administrator
 */
public interface Sujeto {
    void agregarObservador(Observador o);
    void notificar(String mensaje);
}
