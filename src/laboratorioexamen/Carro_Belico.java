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
public class Carro_Belico extends Carro{
    private int vidasE;
    private Random r = new Random();
    public Carro_Belico(double velocidad, double porcentaje, String nombre, int vida, double ataque) {
        super(velocidad, porcentaje, nombre, vida, ataque);
        int extra = r.nextInt(10-1+1)+1;
        this.vidasE = extra;
        super.setVida(this.vidasE+vida);
    }

    public int getVidasE() {
        return vidasE;
    }

    public void setVidasE(int vidasE) {
        this.vidasE = vidasE;
    }
    
    
    
    
    
    
    
}
