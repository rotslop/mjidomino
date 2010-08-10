/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Dato;
import Dato.Usuario;
import java.util.Calendar;
/**
 *
 * @author Minerva Verdugo Ruiz
 */
public class Partida {

private String nickname;
private String ID;
private Jcalendar fechaactual;
private Jcalendar fechainicio;
private ListaFicha listaservidor[];
private ListaFicha listausuario[];
private ListaFicha listapote[];

    public Partida(String nickname, String ID, Jcalendar fechaactual, Jcalendar fechainicio, ListaFicha[] listaservidor, ListaFicha[] listausuario, ListaFicha[] listapote) {
        this.nickname = nickname;
        this.ID = ID;
        this.fechaactual = fechaactual;
        this.fechainicio = fechainicio;
        this.listaservidor = listaservidor;
        this.listausuario = listausuario;
        this.listapote = listapote;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Jcalendar getFechaactual() {
        return fechaactual;
    }

    public void setFechaactual(Jcalendar fechaactual) {
        this.fechaactual = fechaactual;
    }

    public Jcalendar getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Jcalendar fechainicio) {
        this.fechainicio = fechainicio;
    }

    public ListaFicha[] getListapote() {
        return listapote;
    }

    public void setListapote(ListaFicha[] listapote) {
        this.listapote = listapote;
    }

    public ListaFicha[] getListaservidor() {
        return listaservidor;
    }

    public void setListaservidor(ListaFicha[] listaservidor) {
        this.listaservidor = listaservidor;
    }

    public ListaFicha[] getListausuario() {
        return listausuario;
    }

    public void setListausuario(ListaFicha[] listausuario) {
        this.listausuario = listausuario;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }



    
   //}
}
