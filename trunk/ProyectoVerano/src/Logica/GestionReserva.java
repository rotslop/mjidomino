/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import ve.edu.ucab.server.logica.LogicaServidor;
/**
 *
 * @author Minerva Verdugo Ruiz
 */


public class GestionReserva implements LogicaServidor {

public String realizarOperacion(String arg) {

String[] subArg = arg.split(":");
Reserva reserva = new Reserva();
reserva.setId(Integer.parseInt(subArg[0]));
reserva.setNombre(subArg[1]);

return realizarReserva(reserva);
}
public String realizarReserva(Reserva reserva) {
String resultado = "TRUE";
System.out.println("La reserva " + reserva.getNombre() + " se ha efectuado");
return resultado;
}
}

