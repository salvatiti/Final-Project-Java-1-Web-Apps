/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.Cliente;
import java.util.ArrayList;
import java.util.Set;
import milibreria.FuncionesGraficas;
import milibreria.GestionUsuarios;
import proyectolibreria.ProyectoLibreria;

import static proyectolibreria.ProyectoLibreria.escribirFicheroClientes;

public class altaCliente extends javax.swing.JFrame {

    private ArrayList<Cliente> listaClientes = new ArrayList<>();

    public altaCliente(ArrayList listaC) {

        listaClientes = listaC;
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombreAlta = new javax.swing.JTextField();
        dniAlta = new javax.swing.JTextField();
        emailAlta = new javax.swing.JTextField();
        cpAlta = new javax.swing.JTextField();
        confirmarAlta = new javax.swing.JButton();
        cancelarAlta = new javax.swing.JButton();
        mensajeAlta = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(null);
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 96, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(null);
        jLabel2.setText("Dni");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 58, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(null);
        jLabel3.setText("Email");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(null);
        jLabel4.setText("Codigo Postal");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));
        getContentPane().add(nombreAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 166, -1));
        getContentPane().add(dniAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 166, -1));
        getContentPane().add(emailAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 166, -1));
        getContentPane().add(cpAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 91, -1));

        confirmarAlta.setText("Confirmar");
        confirmarAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarAltaActionPerformed(evt);
            }
        });
        getContentPane().add(confirmarAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 132, -1));

        cancelarAlta.setText("Atrás");
        cancelarAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarAltaActionPerformed(evt);
            }
        });
        getContentPane().add(cancelarAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 90, -1));

        mensajeAlta.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(mensajeAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 368, 19));

        jLabel5.setBackground(new java.awt.Color(51, 255, 204));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(null);
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Salva\\Desktop\\fondo-hormigon-color-azul-turquesa-claro-color-suave_190474-297.jpg")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 388, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents
// Deuvelve true si el DNI del ciente ya existe,false en caso contrario
    private boolean existeCliente(Cliente c, ArrayList<Cliente> listaClientes){
        for (int i = 0; i < listaClientes.size(); i++) {
            if(c.getDni().toUpperCase().equals(listaClientes.get(i).getDni().toUpperCase())){
                return true;
            }
        }
        return false;
    }
    
    private boolean comprobarCampos() {
        if ((nombreAlta.getText().isEmpty()) || (nombreAlta.getText().isBlank())) {
            mensajeAlta.setText("Campo obligatorio");
            return false;
        } else if ((dniAlta.getText().isEmpty()) || (dniAlta.getText().isBlank())) {
            mensajeAlta.setText("Campo obligatorio");
            return false;
        } else if ((emailAlta.getText().isEmpty()) || (emailAlta.getText().isBlank())) {
            mensajeAlta.setText("Campo obligatorio");
            return false;
        } else if ((cpAlta.getText().isEmpty()) || (cpAlta.getText().isBlank())) {
            mensajeAlta.setText("Campo obligatorio");
            return false;
        } else {
            return true;
        }
    }
    private void confirmarAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarAltaActionPerformed
    // sE CPOPRUEBA ASDFOASDNF ASDOF ASOIDNFDIASOD
       if(comprobarCampos() == true){
               Cliente nuevoCliente = new Cliente(dniAlta.getText(), emailAlta.getText(), nombreAlta.getText(), Integer.parseInt(cpAlta.getText()));

            if(existeCliente(nuevoCliente, listaClientes) == true){
                FuncionesGraficas.mostrarDatos("Atencion", "Este dni ya existe, prueba otra vez");
                mensajeAlta.setText("");
            }else{
                        listaClientes.add(nuevoCliente);
                        mensajeAlta.setText("Cliente dado de alta con exito");
                        nombreAlta.setText(null);
                        dniAlta.setText(null);
                        emailAlta.setText(null);
                        cpAlta.setText(null);
                       nuevoCliente.setUsuario(nuevoCliente.getDni());
                        nuevoCliente.setContraseña("123");
                        ProyectoLibreria.usuarios.AñadirUsuario(nuevoCliente.getUsuario(), nuevoCliente.getContraseña(), 1);
                        escribirFicheroClientes(listaClientes);
            } 
    }//GEN-LAST:event_confirmarAltaActionPerformed
    }
    private void cancelarAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarAltaActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarAltaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarAlta;
    private javax.swing.JButton confirmarAlta;
    private javax.swing.JTextField cpAlta;
    private javax.swing.JTextField dniAlta;
    private javax.swing.JTextField emailAlta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel mensajeAlta;
    private javax.swing.JTextField nombreAlta;
    // End of variables declaration//GEN-END:variables
}
