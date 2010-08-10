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
        public void CreaPartida (int PM)
    {

    }


       public void RegistroUsuario(int PM)
    {

    }

        public void GuardaPartida(int PM)
    {

        }
        public void EnviaJugada(int PM)

    {

        }
        public void FinPartida(int PM)
    {

    }

    public void ClienteServidor(int PM){

           ClienteServidor respuesta;
        switch (PM){

        case 1:

        respuesta.IngresoSistema(nickname,ClaveAcceso);
        break;
        case 2:

        CreaPartida (nickname,fechaCreacionPartida);
        break;
        case 3:

        RegistroUsuario R= new RegistroUsuario();
        RegistroUsuario(PM);
        //R.ValidarRegistro(U);
        break;
        case 4:

        //GuardaPartida(nickname, clave,nombre,apellido,fechaNacimiento,IDAvatar);
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
