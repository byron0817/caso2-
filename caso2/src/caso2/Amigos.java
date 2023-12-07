/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso2;

/**
 *
 * @author sombr
 */
public class Amigos {
    public String nombre;
    public double montDebe;
    public double montCobrar;

    public friends (String nombre) {
        this.nombre = nombre;
        this.montDebe = 0.0;
        this.montCobrar = 0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMontDebe() {
        return montDebe;
    }

    public void setMontDebe(double montDebe) {
        this.montDebe = montDebe;
    }

    public double getMontCobrar() {
        return montCobrar;
    }

    public void setMontCobrar(double montCobrar) {
        this.montCobrar = montCobrar;
    
}
