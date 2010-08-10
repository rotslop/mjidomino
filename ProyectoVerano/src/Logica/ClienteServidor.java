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
    Reserva reserva;


    public void ClienteServidor(int PM){
    switch (PM){

        case 1:
        IngresoSistema(PM);
        break;
        case 2:
        CreaPartida (PM);
        break;
        case 3:
        RegistroUsuario R= new RegistroUsuario();
        RegistroUsuario(PM);
        //R.ValidarRegistro(U);
        break;
        case 4:
        //GuardaPartida(PM);
        break;
        case 5:
        EnviaJugada(PM);
        break;
        case 6:
        FinPartida(PM);
        break;

    }

    }






    public void IngresoSistema(int PM)
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
}
