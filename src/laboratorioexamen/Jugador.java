/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioexamen;

/**
 *
 * @author jcgol
 */
public class Jugador {
    private String nombre;
    private double vida;
    private double ataque;

    public Jugador(String nombre, double vida, double ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", vida=" + vida + ", ataque=" + ataque + '}';
    }
    
    
    
    
    
}
