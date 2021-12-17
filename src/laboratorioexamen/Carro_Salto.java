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
public class Carro_Salto extends Carro{
    private int salto;

    public Carro_Salto(int salto, double velocidad, double porcentaje, String nombre, int vida, double ataque) {
        super(velocidad, porcentaje, nombre, vida, ataque);
        this.salto = salto;
    }

    public int getSalto() {
        return salto;
    }

    public void setSalto(int salto) {
        this.salto = salto;
    }
    
    
    
    
}
