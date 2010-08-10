/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;


import Dato.ArchivoXml;
import Dato.Usuario;

/**
 *
 * @author Javy
 */
public class Comunicacion

{
// Todo Las Acciones que tienen que ver con Usuario

   public static void solicitarCargaArchivo()
   {
       ArchivoXml.leerArchivoXML(Datos.getListadoDeUsuario());
    }
    public static void solicitarGuardarArchivo()
   {
       ArchivoXml.guardarArchivoXML(Datos.getListadoDeUsuario());

    }

   public static void solicitarInicializarEstruturas()
   {
       Datos.generarInstancia();
   }

   public static boolean agregarUsuario(String nickname, String clave, String nombre, String apellido,String fechanaci,String avatar)
   {
       Usuario elUsuario = new Usuario(nickname,clave,nombre,apellido,fechanaci,avatar);
       return(Datos.getListadoDeUsuario().AgregarElemento(elUsuario));
          }
    public static void ImprimirListaUsuario(){
        Datos.ImprimirLista();
    }
// </Todo Las Acciones que tienen que ver con Usuario>
       
       
   }



