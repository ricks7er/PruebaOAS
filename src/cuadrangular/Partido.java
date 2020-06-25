/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrangular;
import java.util.Random;

/**
 *
 * @author jrort
 */
public class Partido {
    Equipo A,B;
    int golesA, golesB;
    char resultado;
    
    public Partido(Equipo A, Equipo B){
        this.A=A;
        this.B=B;
    }

    public int getGolesA() {
        return golesA;
    }

    public void setGolesA() {
        this.golesA = new Random().nextInt(6);
    }

    public int getGolesB() {
        return golesB;
    }

    public void setGolesB() {
        this.golesB = new Random().nextInt(6);
    }

    public char getResultado() {
        return resultado;
    }

    public void setResultado() {
        if(this.golesA==this.golesB){
            this.resultado='X';
        }
        else{
            if(this.golesA>this.golesB){
                this.resultado='A';
            }
            else{
                this.resultado='B';
            }
        }
    }
    
    
    
}
