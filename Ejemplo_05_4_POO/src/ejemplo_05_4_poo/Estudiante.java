/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_05_4_poo;

/**
 *
 * @author USER 17
 */
public class Estudiante {
    //atributos
    private String nombre;
    private String codigo;
    Edad ed; // en años, meses y dias es un onjetro 
    
    //constructores

    public Estudiante() {
    }

    public Estudiante(String nombre, String codigo, Edad ed) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.ed = ed;
    }
    
    //metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Edad getEd() {
        return ed;
    }

    public void setEd(Edad ed) {
        this.ed = ed;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", codigo=" + codigo + ", ed=" + ed + '}';
    }
    
    
}
