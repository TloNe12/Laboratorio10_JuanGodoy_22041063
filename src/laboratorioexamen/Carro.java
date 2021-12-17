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
public class Carro {
    private double velocidad;
    private double porcentaje;
    private String nombre;
    private int vida;
    private double ataque;

    public Carro(double velocidad, double porcentaje, String nombre, int vida, double ataque) {
        this.velocidad = velocidad;
        this.porcentaje = porcentaje;
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }

    public Carro() {
    }

    
    
    
    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
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

    public void setVida(int vida) {
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
        return "Carros{" + "velocidad=" + velocidad + ", porcentaje=" + porcentaje + ", nombre=" + nombre + ", vida=" + vida + ", ataque=" + ataque + '}';
    }
    
    
    
    
}
