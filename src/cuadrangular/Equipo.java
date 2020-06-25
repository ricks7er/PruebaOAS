/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrangular;

/**
 *
 * @author jrort
 */
public class Equipo {
    private char nombre;
    private int puntos;
    private int golesAFavor;
    private int golesEnContra;

    public Equipo(char nombre) {
        this.nombre = nombre;
        this.puntos=0;
        this.golesAFavor=0;
        this.golesEnContra=0;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = this.puntos+puntos;
    }

    public int getGolesAFavor() {
        return golesAFavor;
    }

    public void setGolesAFavor(int golesAFavor) {
        this.golesAFavor = this.golesAFavor+golesAFavor;
    }

    public int getGolesEnContra() {
        return golesEnContra;
    }

    public void setGolesEnContra(int golesEnContra) {
        this.golesEnContra = this.golesEnContra+golesEnContra;
    }

    public char getNombre() {
        return nombre;
    }
    
    
}
