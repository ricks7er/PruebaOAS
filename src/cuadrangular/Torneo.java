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
public class Torneo {
    Equipo A;
    Equipo B;
    Equipo C;
    Equipo D;

    public Torneo() {
        A = new Equipo('A');
        B = new Equipo('B');
        C = new Equipo('C');
        D = new Equipo('D');
    }

    public void setFechaUno() {
        Partido partido1 = new Partido(A, B);
        //System.out.println(partido1.hashCode());
        partido1.setGolesA();
        partido1.setGolesB();
        partido1.setResultado();
        A.setGolesAFavor(partido1.getGolesA());
        A.setGolesEnContra(partido1.getGolesB());
        B.setGolesAFavor(partido1.getGolesB());
        B.setGolesEnContra(partido1.getGolesA());
        if (partido1.getResultado() == 'A') {
            A.setPuntos(3);
            B.setPuntos(0);
        }
        if (partido1.getResultado() == 'B') {
            A.setPuntos(0);
            B.setPuntos(3);
        }
        if (partido1.getResultado() == 'X') {
            A.setPuntos(1);
            B.setPuntos(1);
        }
        Partido partido2 = new Partido(C, D);
        //System.out.println(partido2.hashCode());
        partido2.setGolesA();
        partido2.setGolesB();
        partido2.setResultado();
        C.setGolesAFavor(partido2.getGolesA());
        C.setGolesEnContra(partido2.getGolesB());
        D.setGolesAFavor(partido2.getGolesB());
        D.setGolesEnContra(partido2.getGolesA());
        if (partido2.getResultado() == 'A') {
            C.setPuntos(3);
            D.setPuntos(0);
        }
        if (partido2.getResultado() == 'B') {
            C.setPuntos(0);
            D.setPuntos(3);
        }
        if (partido2.getResultado() == 'X') {
            C.setPuntos(1);
            D.setPuntos(1);
        }
        System.out.println(A.getNombre() + " " + A.getPuntos() + " " + A.getGolesAFavor() + " " + A.getGolesEnContra());
        System.out.println(B.getNombre() + " " + B.getPuntos() + " " + B.getGolesAFavor() + " " + B.getGolesEnContra());
        System.out.println(C.getNombre() + " " + C.getPuntos() + " " + C.getGolesAFavor() + " " + C.getGolesEnContra());
        System.out.println(D.getNombre() + " " + D.getPuntos() + " " + D.getGolesAFavor() + " " + D.getGolesEnContra()+"\n");
    }

    public void setFechaDos() {
        Partido partido1 = new Partido(A, C);
        partido1.setGolesA();
        partido1.setGolesB();
        partido1.setResultado();
        A.setGolesAFavor(partido1.getGolesA());
        A.setGolesEnContra(partido1.getGolesB());
        C.setGolesAFavor(partido1.getGolesB());
        C.setGolesEnContra(partido1.getGolesA());
        if (partido1.getResultado() == 'A') {
            A.setPuntos(3);
            C.setPuntos(0);
        }
        if (partido1.getResultado() == 'B') {
            A.setPuntos(0);
            C.setPuntos(3);
        }
        if (partido1.getResultado() == 'X') {
            A.setPuntos(1);
            C.setPuntos(1);
        }
        Partido partido2 = new Partido(B, D);
        partido2.setGolesA();
        partido2.setGolesB();
        partido2.setResultado();
        B.setGolesAFavor(partido2.getGolesA());
        B.setGolesEnContra(partido2.getGolesB());
        D.setGolesAFavor(partido2.getGolesB());
        D.setGolesEnContra(partido2.getGolesA());
        if (partido2.getResultado() == 'A') {
            B.setPuntos(3);
            D.setPuntos(0);
        }
        if (partido2.getResultado() == 'B') {
            B.setPuntos(0);
            D.setPuntos(3);
        }
        if (partido2.getResultado() == 'X') {
            B.setPuntos(1);
            D.setPuntos(1);
        }
        System.out.println(A.getNombre() + " " + A.getPuntos() + " " + A.getGolesAFavor() + " " + A.getGolesEnContra());
        System.out.println(B.getNombre() + " " + B.getPuntos() + " " + B.getGolesAFavor() + " " + B.getGolesEnContra());
        System.out.println(C.getNombre() + " " + C.getPuntos() + " " + C.getGolesAFavor() + " " + C.getGolesEnContra());
        System.out.println(D.getNombre() + " " + D.getPuntos() + " " + D.getGolesAFavor() + " " + D.getGolesEnContra()+"\n");
    }

    public void setFechaTres() {
        Partido partido1 = new Partido(A, D);
        partido1.setGolesA();
        partido1.setGolesB();
        partido1.setResultado();
        A.setGolesAFavor(partido1.getGolesA());
        A.setGolesEnContra(partido1.getGolesB());
        D.setGolesAFavor(partido1.getGolesB());
        D.setGolesEnContra(partido1.getGolesA());
        if (partido1.getResultado() == 'A') {
            A.setPuntos(3);
            D.setPuntos(0);
        }
        if (partido1.getResultado() == 'B') {
            A.setPuntos(0);
            D.setPuntos(3);
        }
        if (partido1.getResultado() == 'X') {
            A.setPuntos(1);
            D.setPuntos(1);
        }
        Partido partido2 = new Partido(C, B);
        partido2.setGolesA();
        partido2.setGolesB();
        partido2.setResultado();
        C.setGolesAFavor(partido2.getGolesA());
        C.setGolesEnContra(partido2.getGolesB());
        B.setGolesAFavor(partido2.getGolesB());
        B.setGolesEnContra(partido2.getGolesA());
        if (partido2.getResultado() == 'A') {
            C.setPuntos(3);
            B.setPuntos(0);
        }
        if (partido2.getResultado() == 'B') {
            C.setPuntos(0);
            B.setPuntos(3);
        }
        if (partido2.getResultado() == 'X') {
            C.setPuntos(1);
            B.setPuntos(1);
        }
        System.out.println(A.getNombre() + " " + A.getPuntos() + " " + A.getGolesAFavor() + " " + A.getGolesEnContra());
        System.out.println(B.getNombre() + " " + B.getPuntos() + " " + B.getGolesAFavor() + " " + B.getGolesEnContra());
        System.out.println(C.getNombre() + " " + C.getPuntos() + " " + C.getGolesAFavor() + " " + C.getGolesEnContra());
        System.out.println(D.getNombre() + " " + D.getPuntos() + " " + D.getGolesAFavor() + " " + D.getGolesEnContra()+"\n");
    }
}
