/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cateringreservationsystem;

/**
 *
 * @author Edris
 */
public class AdminForm extends javax.swing.JFrame {

    /**
     * Creates new form AdminForm
     */
    public AdminForm() {
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

        ListCancelled = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        done = new javax.swing.JButton();
        cancelled = new javax.swing.JButton();
        clearall = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        AreaFoods = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        AreaDesserts = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        AreaDrinks = new javax.swing.JTextArea();
        LogOut = new javax.swing.JButton();
        listCancelled = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrator's Form");
        setResizable(false);

        ListCancelled.setBackground(new java.awt.Color(255, 255, 102));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("WELCOME ADMIN");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Address", "Event", "Date", "Tent", "Tables", "Chairs"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(0).setPreferredWidth(110);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(1).setPreferredWidth(100);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(2).setPreferredWidth(50);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(3).setPreferredWidth(100);
            table.getColumnModel().getColumn(4).setResizable(false);
            table.getColumnModel().getColumn(4).setPreferredWidth(10);
            table.getColumnModel().getColumn(5).setResizable(false);
            table.getColumnModel().getColumn(5).setPreferredWidth(10);
            table.getColumnModel().getColumn(6).setResizable(false);
            table.getColumnModel().getColumn(6).setPreferredWidth(10);
        }

        done.setBackground(new java.awt.Color(255, 153, 51));
        done.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        done.setText("Done");
        done.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        done.setBorderPainted(false);

        cancelled.setBackground(new java.awt.Color(255, 153, 51));
        cancelled.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cancelled.setText("Cancelled");
        cancelled.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cancelled.setBorderPainted(false);

        clearall.setBackground(new java.awt.Color(255, 153, 51));
        clearall.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        clearall.setText("Clear All");
        clearall.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        clearall.setBorderPainted(false);

        jLabel3.setText("Foods");

        AreaFoods.setEditable(false);
        AreaFoods.setColumns(20);
        AreaFoods.setRows(5);
        AreaFoods.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane3.setViewportView(AreaFoods);

        AreaDesserts.setEditable(false);
        AreaDesserts.setColumns(20);
        AreaDesserts.setRows(5);
        AreaDesserts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane4.setViewportView(AreaDesserts);

        jLabel4.setText("Deserts");

        jLabel5.setText("Drinks");

        AreaDrinks.setEditable(false);
        AreaDrinks.setColumns(20);
        AreaDrinks.setRows(5);
        AreaDrinks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane5.setViewportView(AreaDrinks);

        LogOut.setBackground(new java.awt.Color(255, 153, 51));
        LogOut.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LogOut.setText("Log Out");
        LogOut.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        LogOut.setBorderPainted(false);

        listCancelled.setBackground(new java.awt.Color(255, 153, 51));
        listCancelled.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        listCancelled.setText("List of all cancelled");
        listCancelled.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        listCancelled.setBorderPainted(false);
        listCancelled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listCancelledActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ListCancelledLayout = new javax.swing.GroupLayout(ListCancelled);
        ListCancelled.setLayout(ListCancelledLayout);
        ListCancelledLayout.setHorizontalGroup(
            ListCancelledLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListCancelledLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(done, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addComponent(cancelled)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clearall)
                .addGap(107, 107, 107))
            .addGroup(ListCancelledLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ListCancelledLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ListCancelledLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(ListCancelledLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ListCancelledLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addContainerGap())
                            .addGroup(ListCancelledLayout.createSequentialGroup()
                                .addGroup(ListCancelledLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addGroup(ListCancelledLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(ListCancelledLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(ListCancelledLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ListCancelledLayout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addGroup(ListCancelledLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(ListCancelledLayout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel4)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ListCancelledLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                                        .addGroup(ListCancelledLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(listCancelled, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(75, 75, 75))))))
                    .addGroup(ListCancelledLayout.createSequentialGroup()
                        .addGroup(ListCancelledLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ListCancelledLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
        );
        ListCancelledLayout.setVerticalGroup(
            ListCancelledLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListCancelledLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(ListCancelledLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(done)
                    .addComponent(cancelled)
                    .addComponent(clearall))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ListCancelledLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ListCancelledLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ListCancelledLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ListCancelledLayout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2))
                    .addGroup(ListCancelledLayout.createSequentialGroup()
                        .addComponent(listCancelled)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LogOut))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ListCancelled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ListCancelled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void listCancelledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listCancelledActionPerformed
        CancelledForm canForm = new CancelledForm();
        canForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_listCancelledActionPerformed

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
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaDesserts;
    private javax.swing.JTextArea AreaDrinks;
    private javax.swing.JTextArea AreaFoods;
    private javax.swing.JPanel ListCancelled;
    private javax.swing.JButton LogOut;
    private javax.swing.JButton cancelled;
    private javax.swing.JButton clearall;
    private javax.swing.JButton done;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton listCancelled;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
