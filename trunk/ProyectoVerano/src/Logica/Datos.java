/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Dato.ListaUsuario;
import Dato.ListaPartida;
import Dato.ListaFicha;
import Dato.ArchivoXml;
import Dato.Usuario;
import Dato.Partida;
import Dato.ListaFicha;

import java.util.*;

//     public static boolean CargarPartida (String nickname,String ID)
//   {
//       //String ID=String.valueOf(Datos.)
//       Partida laPartida = new Partida (nickname,ID);
//       if( Datos.getListadoDePartidas().BuscarElemento(laPartida)){
//           //llamo al xml de las fichas para cargar
//           // llamo al xml de la partida
//        return(Datos.getListadoDePartidas().BuscarElemento(laPartida));
//       }
//       return(false);
//   }
//          public static boolean GuardarPartida (String nickname,String ID)
//   {
//       //String ID=String.valueOf(Datos.)
//       Partida laPartida = new Partida (nickname,ID);
//       if( Datos.getListadoDePartidas().BuscarElemento(laPartida)){
//           //llamo al xml de las fichas para cargar
//           // llamo al xml de la partida
//        return(Datos.getListadoDePartidas().BuscarElemento(laPartida));
//       }
//       return(false);
//   }
// Procedimientos de Fichas
/**
 *
 * @author Javy
 */
public class Datos {

    private static ListaUsuario listadoDeUsuario = null;
    private static ListaPartida listadoDePartidas = null;
    private static ListaFicha listadeFichasPote = null;
    private static ListaFicha listadeFichasUsuario = null;
    private static ListaFicha listadeFichasServidor = null;
    public static int ID = 0;

    private Datos() {
    }
// Inicializo mis listas

    public static void generarInstancia() {
        if (listadoDeUsuario == null) {
            listadoDeUsuario = new ListaUsuario();
        }
        if (listadoDePartidas == null) {
            listadoDePartidas = new ListaPartida();
        }
        if (listadeFichasPote == null) {
            listadeFichasPote = new ListaFicha();
        }
        listadeFichasPote.CrearFichas();
    }

    // <Procedimientos de Get>
    public static ListaUsuario getListadoDeUsuario() {
        return listadoDeUsuario;
    }

    public static ListaFicha getListadeFichasPote() {
        return listadeFichasPote;
    }

    public static ListaFicha getListadeFichasServidor() {
        return listadeFichasServidor;
    }

    public static ListaFicha getListadeFichasUsuario() {
        return listadeFichasUsuario;
    }

    public static int getID() {
        return ID;
    }

     public static ListaPartida getListadoDePartidas() {
        return listadoDePartidas;
    }

// </Procedimientos de Get>

// <Procedimientos de Imprimir>
    public static void ImprimirListaUsuario() {
        listadoDeUsuario.ImprimirColeccion();
    }

    public static void ImprimirListaPartidas() {
        listadoDePartidas.ImprimirColeccion();
    }

    public static void ImprimirListaFichas(){
        System.out.println("Fichas Pote");
        listadeFichasPote.ImprimirColeccion();
        System.out.println("Fichas Servidor");
        listadeFichasServidor.ImprimirColeccion();
        System.out.println("Fichas Usuario");
        listadeFichasUsuario.ImprimirColeccion();
    }

    // </Procedimientos de Imprimir>

    // <Usuario>
   public static boolean RegistrarUsuario(String nickname, String clave, String nombre, String apellido,String fechanaci,String avatar)
   {
       Usuario elUsuario = new Usuario(nickname,clave,nombre,apellido,fechanaci,avatar);
       return(Datos.getListadoDeUsuario().BuscarUsuario(elUsuario));
    }

    public static boolean LogearUsuario(String nickname, String clave)
    {
   Usuario elUsuario = new Usuario(nickname,clave);
   return(Datos.getListadoDeUsuario().BuscarUsuario(elUsuario));
    }
   // </Usuario>

    // <Procedimientos de Partidas>

    public static boolean IniciarPartidaNueva(String nickname, String fechainicio) {
        listadeFichasPote.CrearFichas();
        ID++;
        listadeFichasPote.Barajear();
        listadeFichasUsuario = new ListaFicha();
        listadeFichasServidor = new ListaFicha();
        for (int j = 0; j < 7; j++) {
            listadeFichasUsuario.AgregarElemento(listadeFichasPote.getListadeFichas().get(j));
            listadeFichasPote.getListadeFichas().remove(j);
        }
        for (int j = 0; j < 7; j++) {
            listadeFichasServidor.AgregarElemento(listadeFichasPote.getListadeFichas().get(j));
            listadeFichasPote.getListadeFichas().remove(j);
        }
        Partida laPartida = new Partida(nickname,ID,fechainicio, listadeFichasServidor, listadeFichasUsuario, listadeFichasPote);
        listadoDePartidas.AgregarElemento(laPartida);

        return (true);

    }

    // </Procedimientos de Partidas>

      // <Procedimientos de Guardado>
    public static void GuardarArchivoUsuario()
   {
       ArchivoXml.guardarArchivoXML(listadoDeUsuario);
   }
   public static void GuardarArchivoPartida()
   {
        ArchivoXml.guardarArchivoXML(listadoDePartidas, true);
   }

// </Procedimientos de Guardado>



}


    




