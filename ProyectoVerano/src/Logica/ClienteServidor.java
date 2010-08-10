/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

/**
 *
 * @author Minerva Verdugo Ruiz
 */
public class ClienteServidor  {
 

    
  public void IngresoSistema(String nickname, String ClaveAcceso)
    {

    }
        public void CreaPartida (String nickname, String fechaCreacionPartida)
    {

    }


       public void RegistroUsuario(String nickname,String clave,String nombre,String apellido,String fechaNacimiento,String IDAvatar)
    {

    }

        public void GuardaPartida(String nickname, String clave,String nombre,String apellido,String fechaNacimiento,String IDAvatar)
    {

        }
        public void EnviaJugada(String nickname,String idPartida,String jugadarealizada)

    {

        }
        public void FinPartida(String nickname, String idPartida)
    {

    }

    public void ClienteServidor(int PM){

           ClienteServidor respuesta;
        switch (PM){

        case 1:

        respuesta.IngresoSistema(nickname,ClaveAcceso);
        break;
        case 2:

        respuesta.CreaPartida(nickname, fechaCreacionPartida);
        break;
        case 3:

        // RegistroUsuario R= new RegistroUsuario();
        RegistroUsuario(nickname,clave,nombre,apellido,fechaNacimiento,IDAvatar);
        //R.ValidarRegistro(U);
        break;
        case 4:

        GuardaPartida(nickname, clave,nombre,apellido,fechaNacimiento,IDAvatar);
        break;

        case 5:
        EnviaJugada(nickname,idPartida,jugadarealizada);
        break;
        case 6:
        FinPartida(nickname, idPartida);
        break;

    }

    }






  
}
