/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Dato;
import ve.edu.ucab.cliente.ClienteSocket;
/**
 *
 * @author Minerva Verdugo Ruiz
 */
public class ClienteText {
public static void main(String[] args) {
ClienteSocket cliente = new ClienteSocket();
String resultado = cliente.ejecutarPeticion("1:gerardo", "localhost",7687);
System.out.println(resultado);

}
}



