package Interfaz;
import milibreria.*;
public class VentanaCalculadora extends javax.swing.JFrame {
    //variables

    String num1;
    String num2;
    String signo;

    public VentanaCalculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resul = new javax.swing.JTextField();
        uno = new javax.swing.JButton();
        dos = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        cuatro = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        siete = new javax.swing.JButton();
        ocho = new javax.swing.JButton();
        nueve = new javax.swing.JButton();
        punto = new javax.swing.JButton();
        cero = new javax.swing.JButton();
        suma = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        multi = new javax.swing.JButton();
        divi = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        borra = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        mensaje = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resul.setEditable(false);
        resul.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        resul.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        resul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resulActionPerformed(evt);
            }
        });
        getContentPane().add(resul, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 52, 217, -1));

        uno.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        uno.setText("1");
        uno.setPreferredSize(new java.awt.Dimension(30, 30));
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });
        getContentPane().add(uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 87, 33, -1));

        dos.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        dos.setText("2");
        dos.setPreferredSize(new java.awt.Dimension(30, 30));
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });
        getContentPane().add(dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 87, 43, -1));

        tres.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        tres.setText("3");
        tres.setPreferredSize(new java.awt.Dimension(30, 30));
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });
        getContentPane().add(tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 87, 49, -1));

        cuatro.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        cuatro.setText("4");
        cuatro.setPreferredSize(new java.awt.Dimension(30, 30));
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });
        getContentPane().add(cuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 123, 33, -1));

        cinco.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        cinco.setText("5");
        cinco.setPreferredSize(new java.awt.Dimension(30, 30));
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });
        getContentPane().add(cinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 123, 42, -1));

        seis.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        seis.setText("6");
        seis.setPreferredSize(new java.awt.Dimension(30, 30));
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });
        getContentPane().add(seis, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 123, 49, -1));

        siete.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        siete.setText("7");
        siete.setPreferredSize(new java.awt.Dimension(30, 30));
        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteActionPerformed(evt);
            }
        });
        getContentPane().add(siete, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 159, 33, -1));

        ocho.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        ocho.setText("8");
        ocho.setPreferredSize(new java.awt.Dimension(30, 30));
        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoActionPerformed(evt);
            }
        });
        getContentPane().add(ocho, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 159, 42, -1));

        nueve.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nueve.setText("9");
        nueve.setPreferredSize(new java.awt.Dimension(30, 30));
        nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueveActionPerformed(evt);
            }
        });
        getContentPane().add(nueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 159, 49, -1));

        punto.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        punto.setText(".");
        punto.setPreferredSize(new java.awt.Dimension(30, 30));
        punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoActionPerformed(evt);
            }
        });
        getContentPane().add(punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 203, 44, -1));

        cero.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        cero.setText("0");
        cero.setPreferredSize(new java.awt.Dimension(30, 30));
        cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroActionPerformed(evt);
            }
        });
        getContentPane().add(cero, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 203, 42, -1));

        suma.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        suma.setText("+");
        suma.setPreferredSize(new java.awt.Dimension(40, 40));
        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
            }
        });
        getContentPane().add(suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 95, 50, -1));

        resta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        resta.setText("-");
        resta.setPreferredSize(new java.awt.Dimension(40, 40));
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaActionPerformed(evt);
            }
        });
        getContentPane().add(resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 95, 48, -1));

        multi.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        multi.setText("*");
        multi.setPreferredSize(new java.awt.Dimension(40, 40));
        multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiActionPerformed(evt);
            }
        });
        getContentPane().add(multi, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 141, 50, -1));

        divi.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        divi.setText("/");
        divi.setPreferredSize(new java.awt.Dimension(40, 40));
        divi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diviActionPerformed(evt);
            }
        });
        getContentPane().add(divi, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 141, 47, -1));

        igual.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        igual.setText("=");
        igual.setPreferredSize(new java.awt.Dimension(40, 40));
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });
        getContentPane().add(igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 195, 50, -1));

        borra.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        borra.setText("C");
        borra.setPreferredSize(new java.awt.Dimension(40, 40));
        borra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borraActionPerformed(evt);
            }
        });
        getContentPane().add(borra, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 197, 50, -1));

        salir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        salir.setText("Salir");
        salir.setPreferredSize(new java.awt.Dimension(50, 50));
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 287, 107, -1));

        jLabel1.setBackground(new java.awt.Color(153, 255, 153));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Calculadora");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 6, 140, -1));

        mensaje.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        mensaje.setForeground(new java.awt.Color(255, 51, 0));
        mensaje.setBorder(null);
        getContentPane().add(mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 321, 309, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Salva\\Downloads\\books_library_study_icon_150963 (1).png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 240, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
       dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
        resul.setText(resul.getText() + "1");
    }//GEN-LAST:event_unoActionPerformed

    private void resulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resulActionPerformed

    }//GEN-LAST:event_resulActionPerformed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        resul.setText(resul.getText() + "4");
    }//GEN-LAST:event_cuatroActionPerformed

    private void borraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borraActionPerformed
        resul.setText(" ");
    }//GEN-LAST:event_borraActionPerformed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
        resul.setText(resul.getText() + "2");
    }//GEN-LAST:event_dosActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        resul.setText(resul.getText() + "3");
    }//GEN-LAST:event_tresActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        resul.setText(resul.getText() + "5");
    }//GEN-LAST:event_cincoActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        resul.setText(resul.getText() + "6");
    }//GEN-LAST:event_seisActionPerformed

    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed
        resul.setText(resul.getText() + "7");
    }//GEN-LAST:event_sieteActionPerformed

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoActionPerformed
        resul.setText(resul.getText() + "8");
    }//GEN-LAST:event_ochoActionPerformed

    private void nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueveActionPerformed
        resul.setText(resul.getText() + "9");
    }//GEN-LAST:event_nueveActionPerformed

    private void ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroActionPerformed
        resul.setText(resul.getText() + "0");
    }//GEN-LAST:event_ceroActionPerformed

    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaActionPerformed
        if (!resul.getText().equals(" ")) {
            num1 = resul.getText();
            signo = " + ";
            resul.setText(" ");
           
        }
    }//GEN-LAST:event_sumaActionPerformed

    private void restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaActionPerformed
        if (!resul.getText().equals(" ")) {
            num1 = resul.getText();
            signo = " - ";
            resul.setText(" ");
        }
    }//GEN-LAST:event_restaActionPerformed

    private void multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiActionPerformed
        if (!resul.getText().equals(" ")) {
            num1 = resul.getText();
            signo = " * ";
            resul.setText(" ");
        }
    }//GEN-LAST:event_multiActionPerformed

    private void diviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diviActionPerformed
        if (!resul.getText().equals(" ")) {
            num1 = resul.getText();
            signo = " / ";
            resul.setText(" ");
        }
    }//GEN-LAST:event_diviActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        String resultado;
        num2 = resul.getText();

        if (!num2.equals(" ")) {
            resultado=calcula(num1, num2, signo);
            resul.setText(resultado); 

        }
    }//GEN-LAST:event_igualActionPerformed

    private void puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoActionPerformed
        String texto = resul.getText();

        if (texto.length() == 0) {
            resul.setText(" 0 .");

        } else {
            if (!validaPunto(resul.getText())) {
                resul.setText(resul.getText() + ".");
            }
        }
    }//GEN-LAST:event_puntoActionPerformed

    public boolean validaPunto(String textoResul) {
        boolean validacion = false;

        for (int i = 0; i < textoResul.length(); i++) {
            if (textoResul.substring(i, i + 1).equals(".")) {
                validacion = true;
            }
        }
        return validacion;
    }

    private static String calcula(String numero1, String numero2, String signo) {
        double resultado = 0.0;
        String res; //devolver

        if (signo.equals(" + ")) {
            resultado = Double.parseDouble(numero1) + Double.parseDouble(numero2);
        } else if (signo.equals(" - ")) {
            resultado = Double.parseDouble(numero1) - Double.parseDouble(numero2);
        } else if (signo.equals(" * ")) {
            resultado = Double.parseDouble(numero1) * Double.parseDouble(numero2);
        } else if (signo.equals(" / ")) {
            resultado = Double.parseDouble(numero1) / Double.parseDouble(numero2);
        }
        res = String.valueOf(resultado);
        return res;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borra;
    private javax.swing.JButton cero;
    private javax.swing.JButton cinco;
    private javax.swing.JButton cuatro;
    private javax.swing.JButton divi;
    private javax.swing.JButton dos;
    private javax.swing.JButton igual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JTextField mensaje;
    private javax.swing.JButton multi;
    private javax.swing.JButton nueve;
    private javax.swing.JButton ocho;
    private javax.swing.JButton punto;
    private javax.swing.JButton resta;
    private javax.swing.JTextField resul;
    private javax.swing.JButton salir;
    private javax.swing.JButton seis;
    private javax.swing.JButton siete;
    public static javax.swing.JButton suma;
    private javax.swing.JButton tres;
    private javax.swing.JButton uno;
    // End of variables declaration//GEN-END:variables
}
