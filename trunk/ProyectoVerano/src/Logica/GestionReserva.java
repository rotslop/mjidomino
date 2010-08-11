/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package logica;

import ve.edu.ucab.server.logica.LogicaServidor;
/**
 *
 * @author Minerva Verdugo Ruiz
 */

//
//import dominio.Reserva;


public class GestionReserva implements LogicaServidor
{
    public String realizarOperacion(String arg)
    {
        String[] subArg = arg.split(":");
        //Reserva reserva = new Reserva();
       String Opcion=subArg[0];
       String Respuesta=null;
       if (Opcion.equalsIgnoreCase("1")){

        Respuesta= "El servidor Responde:"+this.IniciarSesion(subArg[1], subArg[2]);

       }

       if (Opcion.equalsIgnoreCase("2")){
            Respuesta= "El servidor Responde:"+this.CrearPartida(subArg[1], subArg[2]);
       }

       if (Opcion.equalsIgnoreCase("3")){
             Respuesta= "El servidor Responde:"+this.RegistroUsuario(subArg[1], subArg[2],subArg[3],subArg[4],subArg[5],subArg[6]);
       }
       if (Opcion.equalsIgnoreCase("4")){
           Respuesta= "El servidor Responde:"+this.GuardaPartida(subArg[1], subArg[2]);
       }
       if (Opcion.equalsIgnoreCase("5")){
           Respuesta= "El servidor Responde:"+this.EnviarJugada(subArg[1], subArg[2],subArg[3]);
       }
       if (Opcion.equalsIgnoreCase("6")){
           Respuesta= "El servidor Responde: Salir del sistema";
       }


        System.out.println("El cliente Envia:"+arg);
        return Respuesta;//+realizarReserva(reserva);
    }

    public String realizarReserva(Reserva reserva)//en Reserva seria la instancia del objeto para leer los Xml
    {
    String resultado = "TRUE";
    System.out.println("La reserva " + reserva.getNombre() + " se ha efectuado");
    return resultado;
    }

    public boolean IniciarSesion(String Nick,String Clave){

        if (Nick.equalsIgnoreCase("Mine") && Clave.equalsIgnoreCase("242")){
          return true;
        }
     else
        return false;
    }

    public boolean CrearPartida(String Nick, String fechaCreacionPartida){

        if (Nick.equalsIgnoreCase("Mine") && fechaCreacionPartida.equalsIgnoreCase("24/08/1987")){
          return true;
        }
     else
        return false;
    }

     public boolean RegistroUsuario (String Nick, String clave, String nombre,String apellido, String fechaNacimiento, String IDAvatar){

        if (Nick.equalsIgnoreCase("Mine") && clave.equalsIgnoreCase("24/08/1987") && nombre.equalsIgnoreCase("Mine")&& apellido.equalsIgnoreCase("Mine")&& fechaNacimiento.equalsIgnoreCase("verdugo")&& IDAvatar.equalsIgnoreCase("1234")){
          return true;
        }
     else
        return false;
    }


      public boolean GuardaPartida (String Nick, String idPartida){

        if (Nick.equalsIgnoreCase("Mine") && idPartida.equalsIgnoreCase("123456") ){
          return true;
        }
     else
        return false;
    }

        public boolean EnviarJugada (String Nick,String idPartida, String jugadaservidor){

        if (Nick.equalsIgnoreCase("Mine") && idPartida.equalsIgnoreCase("123456") && jugadaservidor.equalsIgnoreCase("1") ){
          return true;
        }
     else
        return false;
    }





}
