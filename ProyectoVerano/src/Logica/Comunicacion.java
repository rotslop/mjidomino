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


   public static void solicitarCargaArchivo()
   {
       ArchivoXml.CargarXml(Datos.getListadoDeUsuario());
   }

   public static void solicitarInicializarEstruturas()
   {
       Datos.generarInstancia();
   }

   public static void agregarUsuario(String nickname, String clave, String nombre, String apellido,String avatar)
   {
       Usuario elUsuario = new Usuario(nickname,clave,nombre,apellido,avatar);

       Datos.getListadoDeUsuario().AgregarElemento(elUsuario);
   }
    public static void ImprimirLista(){
        Datos.ImprimirLista();
    }
       
       
       
   }


