/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package belajarjavahani;

/**
 *
 * @author giaaa
 */
public class latihan5 extends javax.swing.JFrame {

    /**
     * Creates new form latihan5
     */
    public latihan5() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Btn_Kelamin = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        eNim = new javax.swing.JTextField();
        eNama = new javax.swing.JTextField();
        cbAgama = new javax.swing.JComboBox<>();
        Rb_Pria = new javax.swing.JRadioButton();
        Rb_Wanita = new javax.swing.JRadioButton();
        cbMenyanyi = new javax.swing.JCheckBox();
        cbMenari = new javax.swing.JCheckBox();
        cbRenang = new javax.swing.JCheckBox();
        cbBadminton = new javax.swing.JCheckBox();
        cbMemasak = new javax.swing.JCheckBox();
        cbPuisi = new javax.swing.JCheckBox();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaResume = new javax.swing.JTextArea();
        jButton1clear = new javax.swing.JButton();
        jButton2Exit = new javax.swing.JButton();
        jButton3Proses = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NIM");

        jLabel2.setText("NAMA");

        jLabel3.setText("AGAMA");

        jLabel4.setText("JNS KELAMIN");

        jLabel5.setText("HOBY");

        eNim.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        eNama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cbAgama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ISLAM", "KRISTEN", "BUDHA", "KATOLIK", "HINDU", "KONGHUCU" }));

        Btn_Kelamin.add(Rb_Pria);
        Rb_Pria.setText("Pria");

        Btn_Kelamin.add(Rb_Wanita);
        Rb_Wanita.setText("Wanita");

        cbMenyanyi.setText("Menyanyi");
        cbMenyanyi.setName("cbMenyanyi"); // NOI18N

        cbMenari.setText("Menari");
        cbMenari.setName("cbMenari"); // NOI18N

        cbRenang.setText("Renang");
        cbRenang.setName("cbRenang"); // NOI18N

        cbBadminton.setText("Badminton");
        cbBadminton.setName("cbBadminton"); // NOI18N

        cbMemasak.setText("Memasak");
        cbMemasak.setName("cbMemasak"); // NOI18N

        cbPuisi.setText("Puisi");
        cbPuisi.setName("cbPuisi"); // NOI18N

        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        areaResume.setColumns(20);
        areaResume.setRows(5);
        areaResume.setName("areaResume"); // NOI18N
        jScrollPane2.setViewportView(areaResume);

        jButton1clear.setText("CLEAR");
        jButton1clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1clearActionPerformed(evt);
            }
        });

        jButton2Exit.setText("EXIT");

        jButton3Proses.setText("PROSES");
        jButton3Proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ProsesActionPerformed(evt);
            }
        });

        jLabel6.setText("RESUME");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jButton1clear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eNim, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eNama, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2Exit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3Proses)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbAgama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Rb_Pria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Rb_Wanita))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cbRenang)
                                    .addGap(158, 158, 158))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbMenyanyi)
                                        .addComponent(cbMenari))
                                    .addGap(31, 31, 31)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbMemasak)
                                        .addComponent(cbBadminton)
                                        .addComponent(cbPuisi)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(eNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbAgama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Rb_Pria)
                                .addComponent(Rb_Wanita)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbMenyanyi)
                            .addComponent(cbBadminton)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbMenari)
                            .addComponent(cbMemasak))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbRenang)
                            .addComponent(cbPuisi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1clear)
                            .addComponent(jButton2Exit)
                            .addComponent(jButton3Proses)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1clearActionPerformed
        // TODO add your handling code here:
        areaResume.setText("");
    }//GEN-LAST:event_jButton1clearActionPerformed

    private void jButton3ProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ProsesActionPerformed
        // TODO add your handling code here:
        int IndexCombo;
        String Pilihan;
        char Kelamin;
        String daftarHoby = " ";
        IndexCombo = cbAgama.getSelectedIndex();
        Pilihan = (String) cbAgama.getSelectedItem();
        if (Rb_Pria.isSelected()) {
            Kelamin = 'P';
        }else{
            Kelamin = 'W';
        }
        if (cbMenyanyi.isSelected()) {
            daftarHoby += cbMenyanyi.getText() + "";
        }
        if (cbMenari.isSelected()) {
            daftarHoby += cbMenari.getText() + "";
        }
        if (cbRenang.isSelected()) {
            daftarHoby += cbRenang.getText() + "";
        }
        if (cbBadminton.isSelected()) {
            daftarHoby += cbBadminton.getText() + "";
        }
        if (cbMenyanyi.isSelected()) {
            daftarHoby += cbMenyanyi.getText() + "";
        }
        if (cbPuisi.isSelected()) {
            daftarHoby += cbPuisi.getText() + "";
        }

        areaResume.setText("NIM :\t"+eNim.getText() + "\n"
                + "NAMA :\t" + eNama.getText() + "\n"
                + "AGAMA :\t" + Pilihan + "\n"
                + "KELAMIN:\t" + Kelamin + "\n"
                + "HOBY :\t" + daftarHoby + "\n"
    );
    }//GEN-LAST:event_jButton3ProsesActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(latihan5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(latihan5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(latihan5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(latihan5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new latihan5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Btn_Kelamin;
    private javax.swing.JRadioButton Rb_Pria;
    private javax.swing.JRadioButton Rb_Wanita;
    private javax.swing.JTextArea areaResume;
    private javax.swing.JComboBox<String> cbAgama;
    private javax.swing.JCheckBox cbBadminton;
    private javax.swing.JCheckBox cbMemasak;
    private javax.swing.JCheckBox cbMenari;
    private javax.swing.JCheckBox cbMenyanyi;
    private javax.swing.JCheckBox cbPuisi;
    private javax.swing.JCheckBox cbRenang;
    private javax.swing.JTextField eNama;
    private javax.swing.JTextField eNim;
    private javax.swing.JButton jButton1clear;
    private javax.swing.JButton jButton2Exit;
    private javax.swing.JButton jButton3Proses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
