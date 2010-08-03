/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectoverano;

/**
 *
 * @author Minerva Verdugo Ruiz
 */
public class Ficha {

 private int fichaServidor;
 private int fichaMaquina;
 private ListaFichaServidor listficha[];
 private ListaFichaUsuario listusuario[];

    public Ficha(int fichaServidor, int fichaMaquina, ListaFichaServidor[] listficha, ListaFichaUsuario[] listusuario) {
        this.fichaServidor = fichaServidor;
        this.fichaMaquina = fichaMaquina;
        this.listficha = listficha;
        this.listusuario = listusuario;
    }

    public int getFichaMaquina() {
        return fichaMaquina;
    }

    public void setFichaMaquina(int fichaMaquina) {
        this.fichaMaquina = fichaMaquina;
    }

    public int getFichaServidor() {
        return fichaServidor;
    }

    public void setFichaServidor(int fichaServidor) {
        this.fichaServidor = fichaServidor;
    }

    public ListaFichaServidor[] getListficha() {
        return listficha;
    }

    public void setListficha(ListaFichaServidor[] listficha) {
        this.listficha = listficha;
    }

    public ListaFichaUsuario[] getListusuario() {
        return listusuario;
    }

    public void setListusuario(ListaFichaUsuario[] listusuario) {
        this.listusuario = listusuario;
    }

public void MoverFicha (){
    RandonFicha R= new RandonFicha();

}

public void CrearFicha (){

    Ficha f;





}
}
