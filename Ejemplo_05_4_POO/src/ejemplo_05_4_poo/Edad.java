/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_05_4_poo;

/**
 *
 * @author USER 17
 */
public class Edad {
    //atributos
    private int as; //edad en años
    private int mm; // edad en meses
    private int dd;  // edad en dias

    public Edad() {
    }

    public Edad(int as, int mm, int dd) {
        this.as = as;
        this.mm = mm;
        this.dd = dd;
    }
    
//metodos
    public int getAs() {
        return as;
    }

    public void setAs(int as) {
        this.as = as;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getDd() {
        return dd;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }

    @Override
    public String toString() {
        return "Edad{" + "as=" + as + ", mm=" + mm + ", dd=" + dd + '}';
    }
    
    
}