/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Dato;

/**
 *
 * @author Minerva Verdugo Ruiz
 */
public class Jcalendar {

    private String dia;
    private String mes;
    private String año;

    public Jcalendar(String dia, String mes, String año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
    
}