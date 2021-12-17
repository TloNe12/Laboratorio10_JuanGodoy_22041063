/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioexamen;

import java.util.Random;

/**
 *
 * @author jcgol
 */
public class Carro_Malvado extends Carro {

    private int vidaM;
    private int ataqueM;

    public Carro_Malvado(double velocidad, double porcentaje, String nombre, int vida, double ataque) {
        super(velocidad, porcentaje, nombre, vida, ataque);
        super.setVida(setVidaM());
        super.setAtaque(setAtaqueM());

    }

    public int getVidaM() {
        return vidaM;
    }

    public int setVidaM() {
        Random r = new Random();
        int valorDado = 1000 + r.nextInt(5000+1);
        return valorDado;
    }

    public int getAtaqueM() {
        return ataqueM;
    }

    public int setAtaqueM() {
        Random r = new Random();
        int valorDado = 300 + r.nextInt(700+1);
        return valorDado;
    }

    
    
    
    
    
    
    
}
