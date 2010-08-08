package Dato;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.*;
import org.jdom.output.XMLOutputter;



class ArchivoXml{




Vector <Usuario> lecturaXmlUsuario()
    {
            Vector <Usuario> VUsuario= new Vector();
        try {
            SAXBuilder builder=new SAXBuilder(false);
            Document doc = (Document) builder.build("ListaUsuario.xml");
            Element raiz = doc.getRootElement();
            List servicios = raiz.getChildren("Usuario");
            Iterator i = servicios.iterator();

           while (i.hasNext()){
                Element e= (Element)i.next();
                Element Nombre = e.getChild("Nombre");
                Element Apellido = e.getChild("Apellido");
                Element Fechanacimiento = e.getChild("fechanacimiento");
                Element clave = e.getChild("Clave");
                Element nickname= e.getChild("nickname");
                Usuario Aux= new Usuario(Nombre.getValue(),Apellido.getValue(),Fechanacimiento.getValue(),clave.getValue(),nickname.getValue());
                VUsuario.addElement(Aux);


                System.out.println("Datos del Usuario: Nombre "+ Nombre.getValue().toString()+
                " Apellido: "+Apellido.getValue().toString()+" Fechanacimiento: "+Fechanacimiento.getValue().toString()+
                "Clave: "+ clave.getValue().toString()+ "nickname: "+ nickname.getValue().toString());

           }
        }catch (Exception e){
         e.printStackTrace();
       }


            return VUsuario;
   }


}


