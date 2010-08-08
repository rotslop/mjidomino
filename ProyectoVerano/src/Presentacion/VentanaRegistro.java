/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VentanaRegistro.java
 *
 * Created on Jul 29, 2010, 8:37:18 PM
 */

package Presentacion;
import Dato.Usuario;
import Dato.Jcalendar;
import javax.swing.JFrame;
/**
 *
 * @author Isra
 */
public class VentanaRegistro extends javax.swing.JFrame {
private String nickname,clave,nombre,apellido,avatar;
private Jcalendar fechanaci;
    /** Creates new form VentanaRegistro */
    public VentanaRegistro() {
        initComponents();
   

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSeleccionarAvatar = new javax.swing.ButtonGroup();
        jlRegistroNuevousuario = new javax.swing.JLabel();
        jlNickname = new javax.swing.JLabel();
        jtfNickname = new javax.swing.JTextField();
        jlNombre = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jlApellido = new javax.swing.JLabel();
        jtfApellido = new javax.swing.JTextField();
        jlFechaDeNacimiento = new javax.swing.JLabel();
        jlClave = new javax.swing.JLabel();
        jpfPassword = new javax.swing.JPasswordField();
        jrbAvatar1 = new javax.swing.JRadioButton();
        jlSeleccioneImage = new javax.swing.JLabel();
        jbCancelar = new javax.swing.JButton();
        jrbAvatar2 = new javax.swing.JRadioButton();
        jrbAvatar3 = new javax.swing.JRadioButton();
        jrbAvatar4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jlAvatar1 = new javax.swing.JLabel();
        jlAvatar2 = new javax.swing.JLabel();
        jlAvatar3 = new javax.swing.JLabel();
        jlAvatar5 = new javax.swing.JLabel();
        jlAvatar4 = new javax.swing.JLabel();
        jlAvatar6 = new javax.swing.JLabel();
        jlTituloiDomino = new javax.swing.JLabel();
        jbAceptar = new javax.swing.JButton();
        jCalendar1 = new com.toedter.calendar.JCalendar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jlRegistroNuevousuario.setForeground(new java.awt.Color(255, 255, 255));
        jlRegistroNuevousuario.setText("Registro Nuevo Usuario");

        jlNickname.setForeground(new java.awt.Color(255, 255, 255));
        jlNickname.setText("NickName (Nombre de Usuario): ");

        jtfNickname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNicknameActionPerformed(evt);
            }
        });

        jlNombre.setBackground(new java.awt.Color(204, 255, 204));
        jlNombre.setForeground(new java.awt.Color(255, 255, 255));
        jlNombre.setText("Nombre");

        jtfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreActionPerformed(evt);
            }
        });

        jlApellido.setForeground(new java.awt.Color(255, 255, 255));
        jlApellido.setText("Apellido");

        jtfApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfApellidoActionPerformed(evt);
            }
        });

        jlFechaDeNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        jlFechaDeNacimiento.setText("Fecha de Nacimiento");

        jlClave.setForeground(new java.awt.Color(255, 255, 255));
        jlClave.setText("Password( Clave): ");

        jpfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpfPasswordActionPerformed(evt);
            }
        });

        bgSeleccionarAvatar.add(jrbAvatar1);
        jrbAvatar1.setForeground(new java.awt.Color(255, 255, 255));
        jrbAvatar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbAvatar1ActionPerformed(evt);
            }
        });

        jlSeleccioneImage.setBackground(new java.awt.Color(0, 255, 255));
        jlSeleccioneImage.setForeground(new java.awt.Color(255, 255, 255));
        jlSeleccioneImage.setText("Seleccione Una Imagen:");

        jbCancelar.setText("Cancel");

        bgSeleccionarAvatar.add(jrbAvatar2);
        jrbAvatar2.setForeground(new java.awt.Color(255, 255, 255));
        jrbAvatar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbAvatar2ActionPerformed(evt);
            }
        });

        bgSeleccionarAvatar.add(jrbAvatar3);
        jrbAvatar3.setForeground(new java.awt.Color(255, 255, 255));
        jrbAvatar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbAvatar3ActionPerformed(evt);
            }
        });

        bgSeleccionarAvatar.add(jrbAvatar4);
        jrbAvatar4.setForeground(new java.awt.Color(255, 255, 255));
        jrbAvatar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbAvatar4ActionPerformed(evt);
            }
        });

        bgSeleccionarAvatar.add(jRadioButton5);
        jRadioButton5.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        bgSeleccionarAvatar.add(jRadioButton6);
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jlAvatar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/avatar1.png"))); // NOI18N

        jlAvatar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/avatar2.png"))); // NOI18N

        jlAvatar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/avatar3.png"))); // NOI18N

        jlAvatar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/avatar5.png"))); // NOI18N

        jlAvatar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/avatar4.png"))); // NOI18N

        jlAvatar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/avatar6.png"))); // NOI18N

        jlTituloiDomino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/titulotext.png"))); // NOI18N

        jbAceptar.setText("Acept");
        jbAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(30, 30, 30)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jlRegistroNuevousuario)
                        .add(125, 125, 125)
                        .add(jlTituloiDomino))
                    .add(jlSeleccioneImage)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jlNombre)
                            .add(jlApellido)
                            .add(jtfApellido)
                            .add(jtfNombre, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 99, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(14, 14, 14)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jtfNickname, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 145, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jlNickname, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 220, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jlFechaDeNacimiento)
                                    .add(layout.createSequentialGroup()
                                        .add(42, 42, 42)
                                        .add(jbAceptar)))
                                .add(32, 32, 32)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jbCancelar)
                                    .add(jlClave)
                                    .add(jpfPassword, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 135, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jCalendar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createSequentialGroup()
                                .add(jrbAvatar1)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jlAvatar1)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jrbAvatar2)
                                .add(2, 2, 2)
                                .add(jlAvatar2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 90, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jrbAvatar3)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jlAvatar3)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jrbAvatar4)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jlAvatar4)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jRadioButton5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jlAvatar5)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jRadioButton6)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jlAvatar6)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jlTituloiDomino, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 92, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jlRegistroNuevousuario)
                        .add(29, 29, 29)))
                .add(jlSeleccioneImage)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jRadioButton6)
                    .add(jRadioButton5)
                    .add(jlAvatar4)
                    .add(jlAvatar5)
                    .add(jlAvatar2)
                    .add(jlAvatar1)
                    .add(jrbAvatar1)
                    .add(jrbAvatar2)
                    .add(jlAvatar3)
                    .add(jrbAvatar3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jrbAvatar4)
                    .add(jlAvatar6))
                .add(42, 42, 42)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jlNickname)
                    .add(jlNombre)
                    .add(jlClave))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jtfNombre, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jtfNickname, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jpfPassword, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(45, 45, 45)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jlApellido)
                    .add(jlFechaDeNacimiento))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jtfApellido, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(54, 54, 54)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jbCancelar)
                    .add(jbAceptar))
                .add(43, 43, 43)
                .add(jCalendar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNicknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNicknameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNicknameActionPerformed

    private void jtfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreActionPerformed

    private void jrbAvatar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbAvatar1ActionPerformed
        // TODO add your handling code here:
        avatar="1";
    }//GEN-LAST:event_jrbAvatar1ActionPerformed

    private void jrbAvatar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbAvatar4ActionPerformed
        // TODO add your handling code here:
        avatar="4";
    }//GEN-LAST:event_jrbAvatar4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
        avatar="5";
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jrbAvatar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbAvatar2ActionPerformed
        // TODO add your handling code here:
        avatar="2";
    }//GEN-LAST:event_jrbAvatar2ActionPerformed

    private void jrbAvatar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbAvatar3ActionPerformed
        // TODO add your handling code here:
        avatar="3";
    }//GEN-LAST:event_jrbAvatar3ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
        avatar="6";
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jbAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarActionPerformed
        // TODO add your handling code here:
        nickname =jtfNickname.getText();
        clave = jpfPassword.getText();
        nombre = "";
        apellido = "";
        

        //fechanaci = J
    }//GEN-LAST:event_jbAceptarActionPerformed

    private void jpfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpfPasswordActionPerformed

    private void jtfApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfApellidoActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
    Presentacion.VentanaLogin ventana = new Presentacion.VentanaLogin();
    ventana.VentanaPadre();

        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    /**
    * @param args the command line arguments
    */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSeleccionarAvatar;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JButton jbAceptar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlAvatar1;
    private javax.swing.JLabel jlAvatar2;
    private javax.swing.JLabel jlAvatar3;
    private javax.swing.JLabel jlAvatar4;
    private javax.swing.JLabel jlAvatar5;
    private javax.swing.JLabel jlAvatar6;
    private javax.swing.JLabel jlClave;
    private javax.swing.JLabel jlFechaDeNacimiento;
    private javax.swing.JLabel jlNickname;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlRegistroNuevousuario;
    private javax.swing.JLabel jlSeleccioneImage;
    private javax.swing.JLabel jlTituloiDomino;
    private javax.swing.JPasswordField jpfPassword;
    private javax.swing.JRadioButton jrbAvatar1;
    private javax.swing.JRadioButton jrbAvatar2;
    private javax.swing.JRadioButton jrbAvatar3;
    private javax.swing.JRadioButton jrbAvatar4;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfNickname;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables

}
