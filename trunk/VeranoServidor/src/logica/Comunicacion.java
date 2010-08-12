/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;





/**
 *
 * @author Javy
 */
public class Comunicacion

{
    public void generarInstancia() {
        Datos.generarInstancia();
    }


// <Procedimientos de Imprimir>
    public static void SolicitarListaUsuario() {
        Datos.ImprimirListaUsuario();
    }

    public static void SolicitarListaPartidas() {
        Datos.ImprimirListaPartidas();
    }

    public static void SolicitarListaFichas(){
        Datos.ImprimirListaFichas();
    }

    // </Procedimientos de Imprimir>

    // <Usuario>
    public static boolean SolicitarRegistrarUsuario(String nickname, String clave, String nombre, String apellido,String fechanaci,String avatar)
   {
       return(Datos.RegistrarUsuario(nickname, clave, nombre, apellido, fechanaci, avatar));
    }

    public static boolean SolicitarLogearUsuario(String nickname, String clave)
    {
        return(Datos.LogearUsuario(nickname, clave));
    }
   // </Usuario>

    // <Procedimientos de Partidas>

    public static boolean SolicitarIniciarPartidaNueva(String nickname, String fechainicio) {
        return (Datos.IniciarPartidaNueva(nickname, fechainicio));
    }

    // </Procedimientos de Partidas>

      // <Procedimientos de Guardado>
    public static void SolicitarGuardarArchivoUsuario()
   {
     Datos.GuardarArchivoPartida();
   }
   public static void SolicitarGuardarArchivoPartida()
   {
        Datos.GuardarArchivoPartida();
   }

// </Procedimientos de Guardados>

}