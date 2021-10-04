package Interfaz;

import Clases.Cliente;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import milibreria.FuncionesGraficas;
import proyectolibreria.ProyectoLibreria;
import static proyectolibreria.ProyectoLibreria.usuarios;

public class ventalaListadoClientes extends javax.swing.JFrame {

    private ArrayList<Cliente> listaClientes = new ArrayList<>();
    int contador = 0;
    private boolean click = true;

    public ventalaListadoClientes(ArrayList listaClientes) {
        this.listaClientes = listaClientes;

        initComponents();
        campoNumero.setText(String.valueOf(listaClientes.size()));
        cargarClientes();
    }

    private void cargarClientes() {
        String[] cabecera = {"Nombre ", "Dni ", "Email ", "Codigo Postal"};
        String[][] datosClientes = new String[listaClientes.size()][4];
        for (int i = 0; i < listaClientes.size(); i++) {
            datosClientes[i][0] = listaClientes.get(i).getNombreCliente();
            datosClientes[i][1] = listaClientes.get(i).getDni();
            datosClientes[i][2] = listaClientes.get(i).getEmail();
            datosClientes[i][3] = String.valueOf(listaClientes.get(i).getCodPostal());
        }

        tabla.setModel(new javax.swing.table.DefaultTableModel(datosClientes, cabecera));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonEliminar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        campoNumero = new javax.swing.JLabel();
        ordenar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 140, -1));

        modificar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        getContentPane().add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 150, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 378, 185));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("Atrás");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 150, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nº de Clientes:");
        jLabel2.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 267, -1, -1));

        campoNumero.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        campoNumero.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(campoNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 43, 35));

        ordenar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ordenar.setText("Ordenar por nombre");
        ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarActionPerformed(evt);
            }
        });
        getContentPane().add(ordenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 180, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Salva\\Desktop\\fondo-hormigon-color-azul-turquesa-claro-color-suave_190474-297.jpg")); // NOI18N
        jLabel1.setText("Ordenar por nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 500, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        int contador;
        try {
            contador = tabla.getSelectedRow();
            boolean respuesta = FuncionesGraficas.pedirBool("Atención", "Desea borrar al cliente con Dni : " + listaClientes.get(contador).getDni() + "?");
            if (respuesta) {
                listaClientes.remove(contador);
                ProyectoLibreria.escribirFicheroClientes(listaClientes);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un cliente");
        }
        campoNumero.setText(String.valueOf(listaClientes.size()));
        cargarClientes();

    }//GEN-LAST:event_botonEliminarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        String email, nombre, dni;
        int c, cp;
        Cliente aux;
        try {
            c = tabla.getSelectedRow();
            aux = listaClientes.get(c);
            dni = JOptionPane.showInputDialog("Nuevo Dni");
            email = JOptionPane.showInputDialog("Nuevo email");
            nombre = JOptionPane.showInputDialog("Nuevo nombre");
            cp = Integer.parseInt(JOptionPane.showInputDialog(" Nuevo Codigo Postal "));
            aux.setDni(dni);
            aux.setEmail(email);
            aux.setNombreCliente(nombre);
            aux.setCodPostal(cp);
            ProyectoLibreria.escribirFicheroClientes(listaClientes);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Escoge una fila");
        }
        cargarClientes();
    }//GEN-LAST:event_modificarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ordenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarActionPerformed
        if (click) {
            ordenar(listaClientes, 1, 0); //1 - Codigo, 2- Descripcion y 3 - Ruta fichero
            //0 - Ascendente 1- Descendente  
            click = false;
        } else {
            ordenar(listaClientes, 1, 1);
            click = true;
        }
        cargarClientes();
    }//GEN-LAST:event_ordenarActionPerformed

    public void ordenar(ArrayList<Cliente> listaClientes, int campo, int orden) {

        String nombre = new String();
        String email = new String();
        String dni = new String();
        int codPos;

        if (orden == 0) {

            for (int i = 0; i < listaClientes.size(); i++) {
                for (int j = listaClientes.size() - 1; j > i; j--) {
                    if (listaClientes.get(j).getNombreCliente().compareTo(listaClientes.get(i).getNombreCliente()) > 0) {

                        nombre = listaClientes.get(i).getNombreCliente();
                        listaClientes.get(i).setNombreCliente(listaClientes.get(j).getNombreCliente());
                        listaClientes.get(j).setNombreCliente(nombre);

                        email = listaClientes.get(i).getEmail();
                        listaClientes.get(i).setEmail(listaClientes.get(j).getEmail());
                        listaClientes.get(j).setEmail(email);

                        dni = listaClientes.get(i).getDni();
                        listaClientes.get(i).setDni(listaClientes.get(j).getDni());
                        listaClientes.get(j).setDni(dni);

                        codPos = listaClientes.get(i).getCodPostal();
                        listaClientes.get(i).setCodPostal(listaClientes.get(j).getCodPostal());
                        listaClientes.get(j).setCodPostal(codPos);

                    }
                }
            }
        } else {
            for (int i = 0; i < listaClientes.size(); i++) {
                for (int j = listaClientes.size() - 1; j > i; j--) {
                    if (listaClientes.get(j).getNombreCliente().compareTo(listaClientes.get(i).getNombreCliente()) < 0) {

                        nombre = listaClientes.get(i).getNombreCliente();
                        listaClientes.get(i).setNombreCliente(listaClientes.get(j).getNombreCliente());
                        listaClientes.get(j).setNombreCliente(nombre);

                        email = listaClientes.get(i).getEmail();
                        listaClientes.get(i).setEmail(listaClientes.get(j).getEmail());
                        listaClientes.get(j).setEmail(email);

                        dni = listaClientes.get(i).getDni();
                        listaClientes.get(i).setDni(listaClientes.get(j).getDni());
                        listaClientes.get(j).setDni(dni);

                        codPos = listaClientes.get(i).getCodPostal();
                        listaClientes.get(i).setCodPostal(listaClientes.get(j).getCodPostal());
                        listaClientes.get(j).setCodPostal(codPos);

                    }
                }
            }

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminar;
    private javax.swing.JLabel campoNumero;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificar;
    private javax.swing.JButton ordenar;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
