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
public class Carro_Ataque extends Carro {
    private double ataqueE;
    private Random r = new Random();
    public Carro_Ataque(double velocidad, double porcentaje, String nombre, int vida, double ataque) {
        super(velocidad, porcentaje, nombre, vida, ataque);
        double AtaqueReal = super.getAtaque() *0.5 + r.nextInt((int) super.getAtaque() *1 +1);
        this.ataqueE= AtaqueReal;
        super.setAtaque(this.ataqueE+ataque);
    }

    public double getAtaqueE() {
        return ataqueE;
    }

    public void setAtaqueE(double ataqueE) {
        this.ataqueE = ataqueE;
    }

}
