/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoverano;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.*;


class lectura { //lectura de los datos del Usuario
public static void main(String[]args)throws IOException {

BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
String nombre, apellido, nickname;
int clave;
//JCalendar fechNacimiento;

System.out.println("Bienvenidos a IDomino");
System.out.println("Ingrese su nombre: ");
nombre = lectura.readLine();
apellido= lectura.readLine();
nickname= lectura.readLine();
//clave= lectura.readLine();
//fechaNacimiento= lectura.readLine();


System.out.println("Ingrese su apellido: ");

System.out.println("Bienvenido "+nombre);

System.out.println("Por favor ");




}
}


