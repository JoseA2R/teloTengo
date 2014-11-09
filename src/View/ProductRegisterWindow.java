/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Controller.ProductRegisterWindowController;

/**
 *
 * @author LaMitologica
 */
public class ProductRegisterWindow extends javax.swing.JFrame {

    /**
     * Creates new form ProductRegisterWindow
     */
    public ProductRegisterWindow() {
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

        regPanel = new javax.swing.JPanel();
        Button_Create = new javax.swing.JButton();
        Label_Registration = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        regPanel.setBackground(new java.awt.Color(255, 255, 255));
        regPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Create.setBackground(new java.awt.Color(255, 255, 255));
        Button_Create.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        Button_Create.setForeground(new java.awt.Color(255, 153, 51));
        Button_Create.setText("Create Product");
        Button_Create.setBorderPainted(false);
        Button_Create.setContentAreaFilled(false);
        Button_Create.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Create.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Button_Create.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Button_Create.setMargin(new java.awt.Insets(2, 14, 2, 0));
        Button_Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CreateActionPerformed(evt);
            }
        });
        regPanel.add(Button_Create, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 540, 150, 20));

        Label_Registration.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        Label_Registration.setForeground(new java.awt.Color(255, 153, 0));
        Label_Registration.setText("Registration ");
        regPanel.add(Label_Registration, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 230, 146, 40));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/teloTengo.png"))); // NOI18N
        regPanel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 30, 400, 130));

        getContentPane().add(regPanel);
        regPanel.setBounds(0, 0, 1366, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CreateActionPerformed
        // TODO add your handling code here:        
    }//GEN-LAST:event_Button_CreateActionPerformed

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
            java.util.logging.Logger.getLogger(ProductRegisterWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductRegisterWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductRegisterWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductRegisterWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductRegisterWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Create;
    private javax.swing.JLabel Label_Registration;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel regPanel;
    // End of variables declaration//GEN-END:variables
    private ProductRegisterWindowController controller= new ProductRegisterWindowController();

}
