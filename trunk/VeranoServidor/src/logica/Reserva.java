/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

/**
 *
 * @author Minerva Verdugo Ruiz
 */
public class Reserva {
    private String Nombre;
    private int Id;

    public Reserva(String Nombre, int Id) {
        this.Nombre = Nombre;
        this.Id = Id;
    }

    public Reserva(){
        this.Nombre= "";
        this.Id=0;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }



}
