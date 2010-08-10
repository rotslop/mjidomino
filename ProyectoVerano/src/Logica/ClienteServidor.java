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
private String nickname;
private String ClaveAcceso;
private String fechaCreacionPartida;
private String clave;
private String apellido;
private String nombre;
private String IDAvatar;
private String idPartida;
private String jugadarealizada;
private String FechaNacimiento;

    public ClienteServidor(String FechaNacimiento, String nickname, String ClaveAcceso, String fechaCreacionPartida, String clave, String apellido, String nombre, String IDAvatar, String idPartida, String jugadarealizada) {
        this.FechaNacimiento= FechaNacimiento;
        this.nickname = nickname;
        this.ClaveAcceso = ClaveAcceso;
        this.fechaCreacionPartida = fechaCreacionPartida;
        this.clave = clave;
        this.apellido = apellido;
        this.nombre = nombre;
        this.IDAvatar = IDAvatar;
        this.idPartida = idPartida;
        this.jugadarealizada = jugadarealizada;
    }

     public ClienteServidor(){

        this.FechaNacimiento= "";
        this.nickname = "";
        this.ClaveAcceso =  "";
        this.fechaCreacionPartida = "";
        this.clave = "";
        this.apellido = "";
        this.nombre = "";
        this.IDAvatar = "";
        this.idPartida = "";
        this.jugadarealizada = "";

     }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getClaveAcceso() {
        return ClaveAcceso;
    }

    public void setClaveAcceso(String ClaveAcceso) {
        this.ClaveAcceso = ClaveAcceso;
    }

    public String getIDAvatar() {
        return IDAvatar;
    }

    public void setIDAvatar(String IDAvatar) {
        this.IDAvatar = IDAvatar;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getFechaCreacionPartida() {
        return fechaCreacionPartida;
    }

    public void setFechaCreacionPartida(String fechaCreacionPartida) {
        this.fechaCreacionPartida = fechaCreacionPartida;
    }

    public String getIdPartida() {
        return idPartida;
    }

    public void setIdPartida(String idPartida) {
        this.idPartida = idPartida;
    }

    public String getJugadarealizada() {
        return jugadarealizada;
    }

    public void setJugadarealizada(String jugadarealizada) {
        this.jugadarealizada = jugadarealizada;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }





    
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

        ClienteServidor respuesta= new ClienteServidor();

        switch (PM){

        case 1:

        respuesta.IngresoSistema(nickname,ClaveAcceso);
        break;
        case 2:

        respuesta.CreaPartida(nickname, fechaCreacionPartida);
        break;
        case 3:

        // RegistroUsuario R= new RegistroUsuario();
        respuesta.RegistroUsuario(nickname,clave,nombre,apellido,FechaNacimiento,IDAvatar);
        //R.ValidarRegistro(U);
        break;
        case 4:

        respuesta.GuardaPartida(nickname, clave,nombre,apellido,FechaNacimiento,IDAvatar);
        break;

        case 5:
        respuesta.EnviaJugada(nickname,idPartida,jugadarealizada);
        break;
        case 6:
        respuesta.FinPartida(nickname, idPartida);
        break;

    }

    }






  
}
