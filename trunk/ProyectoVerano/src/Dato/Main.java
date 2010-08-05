/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Dato;
import Logico.Usuario;

/**
 *
 * @author Javy
 */
public class Main
{
    public static void main(String [] args)
    {



        ListaUsuario miListaTS = new ListaUsuario();

        miListaTS.agregarElemento(new Usuario("Ricardonick", "Casanova", "Profesor"));
        miListaTS.agregarElemento(new Usuario("Glorianick", "Tarrio", "Coordinadora"));
        miListaTS.agregarElemento(new Usuario("Susananick", "Garcia", "Directora"));
        miListaTS.agregarElemento(new Usuario("Evelenirnick", "Barreto", "Profesora"));
        miListaTS.agregarElemento(new Usuario("Evelenirnick", "Barreto", "Profesora"));

        miListaTS.imprimirColeccion();

        miListaTS.removerElemento(new Usuario("Ricardonick", "Casanova", "Profesor"));

        miListaTS.imprimirColeccion();
    }
}



