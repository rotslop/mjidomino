/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectoverano;

/**
 *
 * @author Minerva Verdugo Ruiz
 */
public class Partida {
private int ID;
private Usuario elusuario;
private int numpartida;
private boolean partidaganada;

    public Partida(int ID, Usuario elusuario, int numpartida, boolean partidaganada) {
        this.ID = ID;
        this.elusuario = elusuario;
        this.numpartida = numpartida;
        this.partidaganada = partidaganada;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Usuario getElusuario() {
        return elusuario;
    }

    public void setElusuario(Usuario elusuario) {
        this.elusuario = elusuario;
    }

    public int getNumpartida() {
        return numpartida;
    }

    public void setNumpartida(int numpartida) {
        this.numpartida = numpartida;
    }

    public boolean isPartidaganada() {
        return partidaganada;
    }

    public void setPartidaganada(boolean partidaganada) {
        this.partidaganada = partidaganada;
    }



    public void ValidarPartida (Usuario U){ //Valida si el usuario escribio correctamente sus datos

    }

    public void CrearPartida (Usuario U){

    }

    public void GuardaPartida (Usuario U){// solo guarda una partida

    }


//    public boolean PartidaTerminada(Usuario U)
//    {
//        boolean Registrado;
//
//
//
//
//        return Registrado;
//    }
}
