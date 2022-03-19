/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cateringreservationsystem;

import javax.swing.JOptionPane;

/**
 *
 * @author Edris
 */
public class UserForm extends javax.swing.JFrame {

        
    public UserForm() {
        initComponents();
        
        ResForm ReserveForm = new ResForm();
         try
        {
            
            this.MainPane.add(ReserveForm);
            ReserveForm.setVisible(true);
            ReserveForm.setMaximum(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnReserve = new javax.swing.JMenu();
        btnContact = new javax.swing.JMenu();
        btnAbout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(1343, 770, 770, 770));
        setMaximumSize(new java.awt.Dimension(1343, 638));
        setMinimumSize(new java.awt.Dimension(1343, 639));
        setPreferredSize(new java.awt.Dimension(1343, 639));
        setResizable(false);
        setSize(new java.awt.Dimension(1320, 600));
        getContentPane().setLayout(null);

        MainPane.setMaximumSize(new java.awt.Dimension(1343, 600));
        MainPane.setPreferredSize(new java.awt.Dimension(1325, 800));
        MainPane.setRequestFocusEnabled(false);
        getContentPane().add(MainPane);
        MainPane.setBounds(0, 0, 1325, 650);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 102));
        jMenuBar1.setBorder(null);

        btnReserve.setText("Reserve");
        btnReserve.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                btnReserveMenuSelected(evt);
            }
        });
        btnReserve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReserveMouseClicked(evt);
            }
        });
        btnReserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReserveActionPerformed(evt);
            }
        });
        jMenuBar1.add(btnReserve);

        btnContact.setText("Contact Us");
        btnContact.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                btnContactMenuSelected(evt);
            }
        });
        btnContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnContactMouseClicked(evt);
            }
        });
        btnContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContactActionPerformed(evt);
            }
        });
        jMenuBar1.add(btnContact);

        btnAbout.setText("About Us");
        btnAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAboutMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnAbout);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnReserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReserveActionPerformed

    }//GEN-LAST:event_btnReserveActionPerformed

    private void btnContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContactActionPerformed

    }//GEN-LAST:event_btnContactActionPerformed

    private void btnReserveMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_btnReserveMenuSelected

    }//GEN-LAST:event_btnReserveMenuSelected

    private void btnContactMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_btnContactMenuSelected

    }//GEN-LAST:event_btnContactMenuSelected

    private void btnReserveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReserveMouseClicked
       
        try
        {
            ResForm ReserveForm = new ResForm();
            this.MainPane.add(ReserveForm);
            ReserveForm.setVisible(true);
            ReserveForm.setMaximum(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_btnReserveMouseClicked

    private void btnContactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContactMouseClicked
        try
        {
            ContactForm conForm = new ContactForm();
            this.MainPane.add(conForm);
            conForm.setVisible(true);
            conForm.setMaximum(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_btnContactMouseClicked

    private void btnAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAboutMouseClicked
        try
        {
            AboutForm about = new AboutForm();
            this.MainPane.add(about);
            about.setVisible(true);
            about.setMaximum(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_btnAboutMouseClicked

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
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane MainPane;
    private javax.swing.JMenu btnAbout;
    private javax.swing.JMenu btnContact;
    private javax.swing.JMenu btnReserve;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}