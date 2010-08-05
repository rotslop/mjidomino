//<<<<<<< .mine
///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package Clase;
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.*;
//
///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package Clase;
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.*;
//
//
//class lectura { //lectura de los datos del Usuario
//public static void main(String[]args)throws IOException {
//
//BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
//String nombre, apellido, nickname;
//int clave;
////JCalendar fechNacimiento;
//>>>>>>> .r23
//
//
//class lectura { //lectura de los datos del Usuario
//public static void main(String[]args)throws IOException {
//
////BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
////String nombre, apellido, nickname;
////int clave;
//////JCalendar fechNacimiento;
////
////System.out.println("Bienvenidos a IDomino");
////System.out.println("Ingrese su nombre: ");
////nombre = lectura.readLine();
////apellido= lectura.readLine();
////nickname= lectura.readLine();
////clave= lectura.readLine();
////fechaNacimiento= lectura.readLine();
//
////
////System.out.println("Ingrese su apellido: ");
////
////System.out.println("Bienvenido "+nombre);
////
////System.out.println("Por favor ");
//
//
//    Vector <Usuario> lecturaXmlUsuario()
//    {
//            Vector <Usuario> VUsuario= new Vector();
//        try {
//            SAXBuilder builder=new SAXBuilder(false);
//            Document doc = (Document) builder.build("ListaUsuario.xml");
//            Element raiz = doc.getRootElement();
//            List servicios = raiz.getChildren("Usuario");
//            Iterator i = servicios.iterator();
//
//           while (i.hasNext()){
//                Element e= (Element)i.next();
//                Element Nombre = e.getChild("Nombre");
//                Element Apellido = e.getChild("Apellido");
//                Element Fechanacimiento = e.getChild("fechanacimiento");
//                Element clave = e.getChild("Clave");
//                Element nickname= e.getChild("nickname");
//                Usuario Aux= new Usuario(Nombre.getValue(),Apellido.getValue(),Fechanacimiento.getValue(),clave.getValue(),nickname.getValue());
//                VUsuario.addElement(Aux);
////                System.out.println("Datos del Usuario: Nombre "+ Nombre.getValue()+
////                " Apellido: "+Apellido.getValue()+" Fechanacimiento: "+Fechanacimiento.getValue()+
////                "Clave: "+ clave.getValue()+ "nickname: "+ nickname.getValue());
//
//           }
//        }catch (Exception e){
//         e.printStackTrace();
//       }
//            return VUsuario;
//   }
//
//
//
//
//}
//}
//
//
//    Vector <Usuario> lecturaXmlUsuario()
//    {
//            Vector <Usuario> VUsuario= new Vector();
//        try {
//            SAXBuilder builder=new SAXBuilder(false);
//            Document doc = (Document) builder.build("ListaUsuario.xml");
//            Element raiz = doc.getRootElement();
//            List servicios = raiz.getChildren("Usuario");
//            Iterator i = servicios.iterator();
//
//           while (i.hasNext()){
//                Element e= (Element)i.next();
//                Element Nombre = e.getChild("Nombre");
//                Element Apellido = e.getChild("Apellido");
//                Element Fechanacimiento = e.getChild("fechanacimiento");
//                Element clave = e.getChild("Clave");
//                Element nickname= e.getChild("nickname");
//                Usuario Aux= new Usuario(Nombre.getValue(),Apellido.getValue(),Fechanacimiento.getValue(),clave.getValue(),nickname.getValue());
//                VUsuario.addElement(Aux);
////                System.out.println("Datos del Usuario: Nombre "+ Nombre.getValue()+
////                " Apellido: "+Apellido.getValue()+" Fechanacimiento: "+Fechanacimiento.getValue()+
////                "Clave: "+ clave.getValue()+ "nickname: "+ nickname.getValue());
//
//           }
//        }catch (Exception e){
//         e.printStackTrace();
//       }
//            return VUsuario;
//   }
//
//
//
//
//}
//}
//
//
