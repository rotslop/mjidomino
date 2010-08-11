/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package servidor;
import ve.edu.ucab.server.logica.Servidor;
/**
 *
 * @author Minerva Verdugo Ruiz
 */


public class ServidorApp
{
    public static void main(String[] args)
    {
    String[] parametros = {"7687", "logica.GestionReserva"};
    Servidor.main(parametros);
    }
}
