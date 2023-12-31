/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.ConvertSellerToObject;
import com.seller;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class FormDataSeller extends javax.swing.JFrame {

    /**
     * Creates new form FormDataSeller
     */
    public FormDataSeller() {
        initComponents();
        setDataSeller();
    }

    private void setDataSeller() {
        ConvertSellerToObject csto = new ConvertSellerToObject();
        String[][] dataSeller = csto.getSeller();
        tblSeller.setModel(new javax.swing.table.DefaultTableModel(
                dataSeller,
                new String[]{
                    "Seller ID", "Name", "Password", "Gender"
                }
        ));
        jScrollPaneSeller.setViewportView(tblSeller);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPaneSeller = new javax.swing.JScrollPane();
        tblSeller = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        BtnAddSeller = new javax.swing.JButton();
        BtnEditSeller = new javax.swing.JButton();
        BtnDelSeller = new javax.swing.JButton();
        BtnClearSeller = new javax.swing.JButton();
        txtSelId = new javax.swing.JTextField();
        txtSelName = new javax.swing.JTextField();
        txtSelPass = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Gendercb = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 153, 51));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        tblSeller.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Password", "Gender"
            }
        ));
        tblSeller.setRowHeight(30);
        tblSeller.setRowMargin(1);
        tblSeller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSellerMouseClicked(evt);
            }
        });
        jScrollPaneSeller.setViewportView(tblSeller);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setText("SELLER ID");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 0));
        jLabel9.setText("NAME");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 0));
        jLabel11.setText("PASSWORD");

        BtnAddSeller.setBackground(new java.awt.Color(204, 102, 0));
        BtnAddSeller.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        BtnAddSeller.setForeground(new java.awt.Color(255, 255, 255));
        BtnAddSeller.setText("ADD");
        BtnAddSeller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAddSellerMouseClicked(evt);
            }
        });
        BtnAddSeller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddSellerActionPerformed(evt);
            }
        });

        BtnEditSeller.setBackground(new java.awt.Color(204, 102, 0));
        BtnEditSeller.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        BtnEditSeller.setForeground(new java.awt.Color(255, 255, 255));
        BtnEditSeller.setText("EDIT");
        BtnEditSeller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEditSellerMouseClicked(evt);
            }
        });
        BtnEditSeller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditSellerActionPerformed(evt);
            }
        });

        BtnDelSeller.setBackground(new java.awt.Color(204, 102, 0));
        BtnDelSeller.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        BtnDelSeller.setForeground(new java.awt.Color(255, 255, 255));
        BtnDelSeller.setText("DELETE");
        BtnDelSeller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnDelSellerMouseClicked(evt);
            }
        });
        BtnDelSeller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDelSellerActionPerformed(evt);
            }
        });

        BtnClearSeller.setBackground(new java.awt.Color(204, 102, 0));
        BtnClearSeller.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        BtnClearSeller.setForeground(new java.awt.Color(255, 255, 255));
        BtnClearSeller.setText("CLEAR");
        BtnClearSeller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnClearSellerMouseClicked(evt);
            }
        });
        BtnClearSeller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClearSellerActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 102, 0));
        jLabel13.setText("Seller LIST");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 102, 0));
        jLabel12.setText("GENDER");

        Gendercb.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        Gendercb.setForeground(new java.awt.Color(255, 102, 0));
        Gendercb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 102, 0));
        jLabel14.setText("MANAGE SELLER");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneSeller)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 159, Short.MAX_VALUE)
                        .addComponent(BtnAddSeller)
                        .addGap(50, 50, 50)
                        .addComponent(BtnEditSeller)
                        .addGap(53, 53, 53))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSelId, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSelName, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(BtnDelSeller)
                        .addGap(27, 27, 27)
                        .addComponent(BtnClearSeller))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSelPass, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Gendercb, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(136, 136, 136))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(468, 468, 468))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(436, 436, 436))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel9))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSelId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(txtSelPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(txtSelName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5))
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(Gendercb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(78, 78, 78)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAddSeller)
                    .addComponent(BtnClearSeller)
                    .addComponent(BtnDelSeller)
                    .addComponent(BtnEditSeller))
                .addGap(34, 34, 34)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneSeller, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sport-shoe.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setText("X");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblSellerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSellerMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblSeller.getModel();
        int Myindex = tblSeller.getSelectedRow();
        txtSelId.setText(model.getValueAt(Myindex, 0).toString());
        txtSelName.setText(model.getValueAt(Myindex, 1).toString());
        txtSelPass.setText(model.getValueAt(Myindex, 2).toString());
        Gendercb.setSelectedItem(model.getValueAt(Myindex, 3).toString());
        
    }//GEN-LAST:event_tblSellerMouseClicked

    private void BtnAddSellerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAddSellerMouseClicked
        if (txtSelId.getText().isEmpty() || txtSelName.getText().isEmpty() || txtSelPass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information");
        } else {
            String id_seller = txtSelId.getText();
            String name = txtSelName.getText();
            String pass = txtSelPass.getText();
            String gender = Gendercb.getSelectedItem().toString();

            seller slr = new seller(id_seller, name, pass, gender);
            exec.ExecuteSeller eSeller = new exec.ExecuteSeller();
            int hasil = eSeller.insertData(slr);
            if (hasil > 0) {
                JOptionPane.showMessageDialog(null, "Seller Added Successfully");
                setDataSeller();
            } else {
                JOptionPane.showMessageDialog(null, "Seller Added Failed");
            }
        }

    }//GEN-LAST:event_BtnAddSellerMouseClicked

    private void BtnAddSellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddSellerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAddSellerActionPerformed

    private void BtnEditSellerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEditSellerMouseClicked
        if (txtSelId.getText().isEmpty() || txtSelName.getText().isEmpty() || txtSelPass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information");
        } else {
            String id_seller = txtSelId.getText();
            String name = txtSelName.getText();
            String pass = txtSelPass.getText();
            String gender = Gendercb.getSelectedItem().toString(); 
            

            seller slr = new seller(id_seller, name, pass, gender);
            exec.ExecuteSeller eSeller = new exec.ExecuteSeller();
            int hasil = eSeller.editData(slr);
            if (hasil > 0) {
                JOptionPane.showMessageDialog(null, "Seller Updated Successfully");
                setDataSeller();
            } else {
                JOptionPane.showMessageDialog(null,  "Seller Updated Failed");
            }
        }
    }//GEN-LAST:event_BtnEditSellerMouseClicked

    private void BtnEditSellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditSellerActionPerformed

    }//GEN-LAST:event_BtnEditSellerActionPerformed

    private void BtnDelSellerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDelSellerMouseClicked
        if (txtSelId.getText().isEmpty() || txtSelName.getText().isEmpty() || txtSelPass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information");
        } else {
            String id_seller = txtSelId.getText();
            exec.ExecuteSeller eSeller = new exec.ExecuteSeller();
            int hasil = eSeller.deleteData(id_seller);
            if (hasil > 0) {
                JOptionPane.showMessageDialog(null,  "Seller Deleted Successfully");
                setDataSeller();
            } else {
                JOptionPane.showMessageDialog(null,  "Seller Deleted Failed");
            }
        }
    }//GEN-LAST:event_BtnDelSellerMouseClicked

    private void BtnDelSellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDelSellerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnDelSellerActionPerformed

    private void BtnClearSellerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnClearSellerMouseClicked
        txtSelId.setText("");
        txtSelName.setText("");
        txtSelPass.setText("");
    }//GEN-LAST:event_BtnClearSellerMouseClicked

    private void BtnClearSellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClearSellerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnClearSellerActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        new FormDataShoes().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(FormDataSeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDataSeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDataSeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDataSeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDataSeller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAddSeller;
    private javax.swing.JButton BtnClearSeller;
    private javax.swing.JButton BtnDelSeller;
    private javax.swing.JButton BtnEditSeller;
    private javax.swing.JComboBox<String> Gendercb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPaneSeller;
    private javax.swing.JTable tblSeller;
    private javax.swing.JTextField txtSelId;
    private javax.swing.JTextField txtSelName;
    private javax.swing.JTextField txtSelPass;
    // End of variables declaration//GEN-END:variables
}
