/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.GeneroTypes;
import Clases.Libro;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import milibreria.FuncionesGraficas;
import static proyectolibreria.ProyectoLibreria.escribirFicheroLibros;

/**
 *
 * @author Salva
 */
public class ventanaCatalogo extends javax.swing.JFrame {

    int contador = 0;
    private String foto = new String();
    ArrayList<Libro> listaLibros = new ArrayList<>();

    public ventanaCatalogo(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;

        initComponents();
        cargarLibros();

    }

    public void cargarLibros() {
        if (listaLibros.size() != 0) {
            campoIsbn.setText(String.valueOf(listaLibros.get(contador).getIsbn()));
            campoTitulo.setText(String.valueOf(listaLibros.get(contador).getTitulo()));
            campoAutor.setText(String.valueOf(listaLibros.get(contador).getAutor()));
            campoGenero.setText(String.valueOf(listaLibros.get(contador).getGenero()));
            campoPrecio.setText(String.valueOf(listaLibros.get(contador).getPrecio() + " € "));
            ImageIcon icon = new ImageIcon(listaLibros.get(contador).getRutaFoto());
         
            Icon icono = new ImageIcon(icon.getImage().getScaledInstance(campoFoto.getWidth(), campoFoto.getHeight(), Image.SCALE_DEFAULT));
            campoFoto.setIcon(icono);
            registros.setText(String.valueOf(contador + 1) + "/" + String.valueOf(listaLibros.size()));
        } else {
            campoIsbn.setText(null);
            campoTitulo.setText(null);
            campoAutor.setText(null);
            campoGenero.setText(null);
            campoGenero.setText(null);
            campoFoto.setIcon(null);
            registros.setText(String.valueOf(0) + "/" + String.valueOf(listaLibros.size()));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoFoto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Modificar = new javax.swing.JButton();
        campoIsbn = new javax.swing.JLabel();
        botonMas = new javax.swing.JButton();
        botonMenos = new javax.swing.JButton();
        registros = new javax.swing.JLabel();
        añadirLibro = new javax.swing.JButton();
        eliminarLibro = new javax.swing.JButton();
        campoPrecio = new javax.swing.JTextField();
        botonAtras = new javax.swing.JButton();
        listado = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        campoAutor = new javax.swing.JTextField();
        campoGenero = new javax.swing.JTextField();
        campoTitulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoFoto.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(campoFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 194, 181));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("        ISBN");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 35, 79, 22));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("        Autor");
        jLabel2.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 123, 79, 22));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("      Precio");
        jLabel3.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 79, 22));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("        Título");
        jLabel5.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 75, 79, 22));

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        getContentPane().add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 130, -1));

        campoIsbn.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(campoIsbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 35, 85, 22));

        botonMas.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        botonMas.setText("+");
        botonMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMasActionPerformed(evt);
            }
        });
        getContentPane().add(botonMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 58, 58));

        botonMenos.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        botonMenos.setText("-");
        botonMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenosActionPerformed(evt);
            }
        });
        getContentPane().add(botonMenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 58, 58));

        registros.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(registros, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 67, 32));

        añadirLibro.setText("Añadir Libro");
        añadirLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirLibroActionPerformed(evt);
            }
        });
        getContentPane().add(añadirLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 110, -1));

        eliminarLibro.setText("Eliminar Libro");
        eliminarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarLibroActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 130, -1));
        getContentPane().add(campoPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 42, 39));

        botonAtras.setText("Volver a la página principal");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(botonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, -1, -1));

        listado.setText("Lista");
        listado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadoActionPerformed(evt);
            }
        });
        getContentPane().add(listado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 110, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("     Género");
        jLabel6.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 163, 79, 22));
        getContentPane().add(campoAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 120, -1));
        getContentPane().add(campoGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 120, -1));
        getContentPane().add(campoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 140, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Salva\\Desktop\\fondo-hormigon-color-azul-turquesa-claro-color-suave_190474-297.jpg")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 410));

        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Salva\\Desktop\\fondo-hormigon-color-azul-turquesa-claro-color-suave_190474-297.jpg")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 410));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Salva\\Desktop\\fondo-hormigon-color-azul-turquesa-claro-color-suave_190474-297.jpg")); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void añadirLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirLibroActionPerformed
        new ventanaAñadirLibro(listaLibros).setVisible(true);
    }//GEN-LAST:event_añadirLibroActionPerformed

    private void botonMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMasActionPerformed
        if (contador == listaLibros.size() - 1) {
            contador = 0;
        } else {
            contador++;
        }

        cargarLibros();
    }//GEN-LAST:event_botonMasActionPerformed

    private void botonMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenosActionPerformed
        if (contador == listaLibros.size() - 1) {
            contador = 0;
        } else if (contador != 0) {

            contador--;
        }

        cargarLibros();
    }//GEN-LAST:event_botonMenosActionPerformed

    private void eliminarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarLibroActionPerformed
        if (listaLibros.size() > 0) {
            boolean respuesta = FuncionesGraficas.pedirBool("Atención", "Desea borrar : " + listaLibros.get(contador).getTitulo() + "?");
            if (respuesta) {
                listaLibros.remove(contador);
                escribirFicheroLibros(listaLibros);

            }
            contador = 0;
            cargarLibros();
        }
    }//GEN-LAST:event_eliminarLibroActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed

        boolean modificarLibro = FuncionesGraficas.pedirBool("Modificación", "Desea modificar el libro  " + listaLibros.get(contador).getTitulo() + " ?");

        if (modificarLibro) {
            listaLibros.get(contador).setPrecio(Double.parseDouble(campoPrecio.getText().replace("€", "").trim()));
            listaLibros.get(contador).setAutor(campoAutor.getText());
            listaLibros.get(contador).setTitulo(campoTitulo.getText());
            listaLibros.get(contador).setGenero(GeneroTypes.valueOf(campoGenero.getText()));
            JOptionPane.showMessageDialog(null, "Libro modificado correctamente");
              escribirFicheroLibros(listaLibros);
        }

    }//GEN-LAST:event_ModificarActionPerformed

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        dispose();
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void listadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadoActionPerformed
        new ventanaListaLibros(listaLibros).setVisible(true);
    }//GEN-LAST:event_listadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Modificar;
    private javax.swing.JButton añadirLibro;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonMas;
    private javax.swing.JButton botonMenos;
    private javax.swing.JTextField campoAutor;
    private javax.swing.JLabel campoFoto;
    private javax.swing.JTextField campoGenero;
    private javax.swing.JLabel campoIsbn;
    private javax.swing.JTextField campoPrecio;
    private javax.swing.JTextField campoTitulo;
    private javax.swing.JButton eliminarLibro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton listado;
    private javax.swing.JLabel registros;
    // End of variables declaration//GEN-END:variables

}
