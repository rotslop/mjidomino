/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Lista;

/**
 *
 * @author Minerva Verdugo Ruiz
 */
public class Usuario1 {
    private String Nombre;
    private String Apellido;
    private String Apellido;
    private String Apellido;


        public Usuario (){
        this.Nombre = " ";
        this.Apellido = " ";
        this.Fechanacimiento = " ";
        this.Clave=" ";
        this.nickname= " ";
      }
    public void ImprimirUsuario(Vector <Usuario> Usuario){
        int i=0;

        System.out.println("Datos de  los  Usuarios");
        while (i<Usuario.size()){

        System.out.println("Nombre: "+Usuario.elementAt(i).getNombre()+ " Apellido: "+
        Usuario.elementAt(i).getApellido()+ " Fechanacimiento: "+ Usuario.elementAt(i).getFechanacimiento()+
        " Clave:  "+ Usuario.elementAt(i).getClave() + " Nickname " + Usuario.elementAt(i).getNickname());


        i++;
       }

    }


}
