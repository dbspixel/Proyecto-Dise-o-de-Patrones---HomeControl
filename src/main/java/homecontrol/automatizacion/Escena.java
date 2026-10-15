/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homecontrol.automatizacion;

/**
 *
 * @author Administrator
 */
public class Escena {
    private String nombre;
    private int intensidadLuces;       
    private double temperaturaObjetivo;    

    private Escena() {}

    public String getNombre() { 
        return nombre; 
    }
    public int getIntensidadLuces() { 
        return intensidadLuces; 
    }
    public double getTemperaturaObjetivo() { 
        return temperaturaObjetivo; 
    }

    @Override
    public String toString() {
        return "Escena: " + nombre + 
               " | Luces: " + intensidadLuces + 
               " | Temp: " + temperaturaObjetivo;
    }

    public static class Builder {
        private Escena escena;

        public Builder(String nombre) {
            escena = new Escena();
            escena.nombre = nombre;
            escena.intensidadLuces = 100;
            escena.temperaturaObjetivo = 22.0;
        }

        public Builder conIntensidadLuces(int intensidad) {
            escena.intensidadLuces = intensidad;
            return this;
        }

        public Builder conTemperatura(double temperatura) {
            escena.temperaturaObjetivo = temperatura;
            return this;
        }

        public Escena construir() {
            return escena;
        }
    }
}
