/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homecontrol.principal;

import homecontrol.abstracciones.Dispositivo;
import homecontrol.automatizacion.Escena;
import homecontrol.automatizacion.GestorDeEscenas;
import homecontrol.automatizacion.HubCentral;
import homecontrol.fabrica.DispositivoFactory;
import homecontrol.observer.LuzAutomatica;
import homecontrol.observer.SensorMovimiento;
import homecontrol.state.EstadoApagado;
import homecontrol.state.IEstado;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n -- CREANDO DISPOSITIVOS CON FABRICA --");
        Dispositivo luz1 = DispositivoFactory.crearDispositivo("LUZ", "Luz Sala", "Sala");
        Dispositivo cerradura1 = DispositivoFactory.crearDispositivo("CERRADURA", "Cerradura Puerta", "Entrada");
        Dispositivo termostato1 = DispositivoFactory.crearDispositivo("TERMOSTATO", "Termostato Principal", "Pasillo");

        System.out.println("Configurando Hup central..");
        HubCentral hub = HubCentral.getInstancia();
        hub.agregarDispositivo(luz1);
        hub.agregarDispositivo(cerradura1);
        hub.agregarDispositivo(termostato1);
        
        System.out.println("\n -- CREANDO ESCENA CON BUILDER --");
        Escena modoNoche = new Escena.Builder("Modo Noche Personalizado")
                .conIntensidadLuces(10)
                .conTemperatura(18.0)
                .construir();
        
        System.out.println("Configuracion guardada: " + modoNoche.toString());

        System.out.println("\n --PROBANDO FACADE -- ");
        GestorDeEscenas escenas = new GestorDeEscenas();
        escenas.modoNoche();

        System.out.println("\n --PROBANDO OBSERVER-- ");
        SensorMovimiento sensor = new SensorMovimiento();
        LuzAutomatica luzAuto = new LuzAutomatica("Luz Pasillo ");
        
        sensor.agregarObservador(luzAuto);
        sensor.detectar();

        System.out.println("\n --PROBANDO STATE-- ");
        IEstado estado = new EstadoApagado();
        estado.manejarSolicitud();
    }
}

