/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;
import Dato.ListaUsuario;
import Dato.ListaPartida;

/**
 *
 * @author Javy
 */
public class Datos
{
    private static ListaUsuario listadoDeUsuario = null;
    private static ListaPartida listadoDePartidas = null;
    private int numero=0;

    private Datos()
    {
    }

    public static void generarInstancia()
    {
        if (listadoDeUsuario == null)
            listadoDeUsuario = new ListaUsuario();
        if (listadoDePartidas == null)
            listadoDePartidas = new ListaPartida();

    }

    public static ListaUsuario getListadoDeUsuario() {
        return listadoDeUsuario;
    }

    public static ListaPartida getListadoDePartidas() {
        return listadoDePartidas;
    }

    public static void ImprimirLista(){
        listadoDeUsuario.ImprimirColeccion();
    }



}
