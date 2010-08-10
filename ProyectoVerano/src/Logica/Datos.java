/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;
import Dato.ListaUsuario;

/**
 *
 * @author Javy
 */
public class Datos
{
    private static ListaUsuario listadoDeUsuario = null;

    private Datos()
    {
    }

    public static void generarInstancia()
    {
        if (listadoDeUsuario == null)
            listadoDeUsuario = new ListaUsuario();
    }

    public static ListaUsuario getListadoDeUsuario() {
        return listadoDeUsuario;
    }

    public static void ImprimirLista(){
        listadoDeUsuario.ImprimirColeccion();
    }



}
