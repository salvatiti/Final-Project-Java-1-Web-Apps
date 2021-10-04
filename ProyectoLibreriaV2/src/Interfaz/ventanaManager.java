package Interfaz;


import Clases.Cliente;
import Clases.Libro;
import Clases.Venta;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import proyectolibreria.ProyectoLibreria;

public class ventanaManager extends javax.swing.JFrame {

    private ArrayList<Cliente> listaClientes;
    private ArrayList<Libro> listaLibros;
    private ArrayList<Venta> ventas;
  
    

    public ventanaManager(ArrayList<Cliente> listaClientes, ArrayList<Libro> listaLibros, ArrayList<Venta> ventas) {
        this.listaLibros = listaLibros;
        this.ventas = ventas;
        this.listaClientes = listaClientes;

        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nivel1 = new javax.swing.JLabel();
        usu1 = new javax.swing.JLabel();
        botonCatalogo = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        A = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        alta = new javax.swing.JMenuItem();
        botonListadoClientes = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        Historico = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        generoMasVendido = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        backup = new javax.swing.JMenuItem();
        manualUsu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 12, 104, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nivel:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 58, 82, -1));

        nivel1.setBackground(new java.awt.Color(0, 0, 0));
        nivel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nivel1.setForeground(new java.awt.Color(0, 0, 0));
        nivel1.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(nivel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 50, 30));

        usu1.setBackground(new java.awt.Color(0, 0, 0));
        usu1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        usu1.setForeground(new java.awt.Color(0, 0, 0));
        usu1.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(usu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 12, 78, 24));

        botonCatalogo.setBackground(new java.awt.Color(51, 51, 51));
        botonCatalogo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        botonCatalogo.setForeground(new java.awt.Color(255, 255, 255));
        botonCatalogo.setText("Catálogo de Libros");
        botonCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCatalogoActionPerformed(evt);
            }
        });
        getContentPane().add(botonCatalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 657, 84));

        salir.setBackground(new java.awt.Color(0, 0, 0));
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("Salir de la App");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 140, 40));

        A.setBackground(new java.awt.Color(0, 0, 0));
        A.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        A.setForeground(new java.awt.Color(0, 0, 0));
        A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cielo.jpg"))); // NOI18N
        getContentPane().add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 750, 400));

        jMenu2.setText("Mantenimiento de clientes");

        alta.setText("Alta Cliente");
        alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaActionPerformed(evt);
            }
        });
        jMenu2.add(alta);

        botonListadoClientes.setText("Bajas y Modificacion de Clientes");
        botonListadoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListadoClientesActionPerformed(evt);
            }
        });
        jMenu2.add(botonListadoClientes);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Ventas");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        Historico.setText("Historico ventas diarias");
        Historico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoricoActionPerformed(evt);
            }
        });
        jMenu1.add(Historico);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Estadísticas");

        jMenuItem5.setText("Libro más vendido");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        generoMasVendido.setText("Género más vendido");
        generoMasVendido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoMasVendidoActionPerformed(evt);
            }
        });
        jMenu4.add(generoMasVendido);

        jMenuItem7.setText("Top 5 libros mas vendidos");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Utilidades");

        jMenuItem3.setText("Calculadora");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        backup.setText("Backup");
        backup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backupActionPerformed(evt);
            }
        });
        jMenu3.add(backup);

        manualUsu.setText("Manual de Usuario");
        manualUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manualUsuActionPerformed(evt);
            }
        });
        jMenu3.add(manualUsu);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaActionPerformed
        new altaCliente(listaClientes).setVisible(true);


    }//GEN-LAST:event_altaActionPerformed

    private void botonCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCatalogoActionPerformed
        new ventanaCatalogo(listaLibros).setVisible(true);

    }//GEN-LAST:event_botonCatalogoActionPerformed

    private void botonListadoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListadoClientesActionPerformed

        new ventalaListadoClientes(listaClientes).setVisible(true);
    }//GEN-LAST:event_botonListadoClientesActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        proyectolibreria.ProyectoLibreria.libroMasVendido(listaLibros, ventas);
    }//GEN-LAST:event_jMenuItem5ActionPerformed


    private void backupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backupActionPerformed
        ProyectoLibreria.BackUpClientes();
        ProyectoLibreria.BackUpLibros();
    }//GEN-LAST:event_backupActionPerformed


    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new VentanaCalculadora().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        new salirApp().setVisible(true);
    }//GEN-LAST:event_salirActionPerformed

    private void manualUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manualUsuActionPerformed
        try {
            File archivo = new File("./src/manual/manualUsuario.pdf");
            Desktop.getDesktop().open(archivo);
        } catch (IOException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_manualUsuActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
     
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void HistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoricoActionPerformed
        new ventanaVentas(this.ventas).setVisible(true);
    }//GEN-LAST:event_HistoricoActionPerformed

    private void generoMasVendidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoMasVendidoActionPerformed
        ProyectoLibreria.generoMasVendido(listaLibros, ventas);
    }//GEN-LAST:event_generoMasVendidoActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel A;
    private javax.swing.JMenuItem Historico;
    private javax.swing.JMenuItem alta;
    private javax.swing.JMenuItem backup;
    private javax.swing.JButton botonCatalogo;
    private javax.swing.JMenuItem botonListadoClientes;
    private javax.swing.JMenuItem generoMasVendido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem manualUsu;
    public static javax.swing.JLabel nivel1;
    private javax.swing.JButton salir;
    public static javax.swing.JLabel usu1;
    // End of variables declaration//GEN-END:variables
}
