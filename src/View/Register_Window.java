/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Controller.User_Controller;
import View.LogWindow;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author VRB
 */
public class Register_Window extends javax.swing.JFrame {

    /**
     * Creates new user from a register window
     */
    
    private FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de imagen","jpg");
    private final String defaultavatarpath= "src\\Resources\\DefaultAvatar.jpg";
    private static int rol;
    
    public Register_Window(int rol) {        
        this.rol=rol;
        initComponents();
        
        if (!(TextField_Name.getText().equals("")||TextField_LastName.getText().equals("")||TextField_Mail.getText().equals("")||TextField_Username.getText().equals("")))
            Button_Create.enable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        regPanel = new javax.swing.JPanel();
        Label_Name = new javax.swing.JLabel();
        TextField_Name = new javax.swing.JTextField();
        TextField_LastName = new javax.swing.JTextField();
        Label_Apellido = new javax.swing.JLabel();
        Label_Mail = new javax.swing.JLabel();
        TextField_Mail = new javax.swing.JTextField();
        TextField_Username = new javax.swing.JTextField();
        Label_Username = new javax.swing.JLabel();
        Label_Password = new javax.swing.JLabel();
        Password_Field = new javax.swing.JPasswordField();
        Button_Create = new javax.swing.JButton();
        Label_Registration = new javax.swing.JLabel();
        Label_Id = new javax.swing.JLabel();
        TextField_Id = new javax.swing.JTextField();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("teloTengo: Registration");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setName("reg"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        regPanel.setBackground(new java.awt.Color(255, 255, 255));
        regPanel.setMinimumSize(new java.awt.Dimension(1366, 768));
        regPanel.setPreferredSize(new java.awt.Dimension(1366, 768));
        regPanel.setLayout(new java.awt.GridBagLayout());

        Label_Name.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        Label_Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Name.setText("My name is:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 50, 0, 0);
        regPanel.add(Label_Name, gridBagConstraints);

        TextField_Name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextField_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_NameActionPerformed(evt);
            }
        });
        TextField_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextField_NameKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 224;
        gridBagConstraints.ipady = -3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 0, 476);
        regPanel.add(TextField_Name, gridBagConstraints);

        TextField_LastName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextField_LastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextField_LastNameKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 224;
        gridBagConstraints.ipady = -3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 476);
        regPanel.add(TextField_LastName, gridBagConstraints);

        Label_Apellido.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        Label_Apellido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Apellido.setText("My Last Name is:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 0, 0);
        regPanel.add(Label_Apellido, gridBagConstraints);

        Label_Mail.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        Label_Mail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Mail.setText("My email:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 60, 0, 0);
        regPanel.add(Label_Mail, gridBagConstraints);

        TextField_Mail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextField_Mail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextField_MailKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 224;
        gridBagConstraints.ipady = -3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 476);
        regPanel.add(TextField_Mail, gridBagConstraints);

        TextField_Username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextField_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_UsernameActionPerformed(evt);
            }
        });
        TextField_Username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextField_UsernameKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 224;
        gridBagConstraints.ipady = -3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 476);
        regPanel.add(TextField_Username, gridBagConstraints);

        Label_Username.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        Label_Username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Username.setText("Pick an username:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 0, 0);
        regPanel.add(Label_Username, gridBagConstraints);

        Label_Password.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        Label_Password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Password.setText("Password:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 60, 0, 0);
        regPanel.add(Label_Password, gridBagConstraints);

        Password_Field.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Password_Field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Password_FieldKeyTyped1(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 224;
        gridBagConstraints.ipady = -3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 476);
        regPanel.add(Password_Field, gridBagConstraints);

        Button_Create.setBackground(new java.awt.Color(255, 255, 255));
        Button_Create.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        Button_Create.setForeground(new java.awt.Color(255, 153, 51));
        Button_Create.setText("Create Account");
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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.ipadx = 27;
        gridBagConstraints.ipady = -7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 80, 208, 476);
        regPanel.add(Button_Create, gridBagConstraints);

        Label_Registration.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 24)); // NOI18N
        Label_Registration.setForeground(new java.awt.Color(255, 153, 0));
        Label_Registration.setText("Registration ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(70, 370, 0, 0);
        regPanel.add(Label_Registration, gridBagConstraints);

        Label_Id.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        Label_Id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Id.setText("Id or Passport:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 30, 0, 0);
        regPanel.add(Label_Id, gridBagConstraints);

        TextField_Id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextField_Id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextField_IdKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 224;
        gridBagConstraints.ipady = -3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 476);
        regPanel.add(TextField_Id, gridBagConstraints);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/teloTengo.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = -20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 60, 0, 0);
        regPanel.add(logo, gridBagConstraints);

        getContentPane().add(regPanel);
        regPanel.setBounds(0, 0, 1366, 768);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Button_CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CreateActionPerformed
        // TODO add your handling code here:
        
        char [] password_original = Password_Field.getPassword();
        String password = new String(password_original);
        int letra=0; 
        int num=0;
        Date date = new Date();
        
        for (int i=0;i<password.length();i++)
        {
            if (((password.charAt(i)>='A')&&(password.charAt(i)<='Z'))||((password.charAt(i)>='a')&&(password.charAt(i)<='z')))
            {
                letra++;
            }
            if ((password.charAt(i)=='1')||(password.charAt(i)=='2')||(password.charAt(i)=='3')||(password.charAt(i)=='4')||(password.charAt(i)=='5')||(password.charAt(i)=='6')||(password.charAt(i)=='7')||(password.charAt(i)=='8')||(password.charAt(i)=='9')||(password.charAt(i)=='0'))
            {
                num++;
            }
        }
        
        //La contraseña debe tener tres números y tres letras
        if ((num>=3)&&(letra>=3)){
            boolean reg = false;
        
        //Se cumple la condición de la contraseña
        if (password.length()>=6 && !TextField_Name.getText().equals("") && !TextField_LastName.getText().equals("") && !TextField_Mail.getText().equals("") && !TextField_Username.getText().equals(""))
            reg=true;
        else
            reg=false;
        
        //ManagementPreference.Predetermined();  
         
        if (reg)
        {   
            
            boolean register=User_Controller.regUser(TextField_Name.getText(), TextField_LastName.getText(),TextField_Id.getText(),TextField_Username.getText(),password,TextField_Mail.getText(), date,rol);
            
            if (register)
            {
                if(rol==1){ //Si rol es 1 el usuario es administrador
                    AdminModWindow principal=new AdminModWindow(TextField_Username.getText());
                    principal.setVisible(true);
                    this.dispose();
                }
            }
        }
        else
            JOptionPane.showMessageDialog(this,"Todos los campos deben ser llenador para poder","Campos mal llenados",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
             JOptionPane.showMessageDialog(this,"La contraseña debe poseer 3 números y 3 letras mínimo ","Campos mal llenados",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Button_CreateActionPerformed

    private void TextField_NameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_NameKeyTyped
        // TODO add your handling code here:
        if (((evt.getKeyChar()>= 'A')&&(evt.getKeyChar()<='Z'))|| ((evt.getKeyChar()>='a')&&(evt.getKeyChar()<='z')))
        {
            TextField_Name.setEditable(true);
        }
        else
        {
            evt.consume();
        }
    }//GEN-LAST:event_TextField_NameKeyTyped

    private void TextField_LastNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_LastNameKeyTyped
        // TODO add your handling code here:
        if (((evt.getKeyChar()>= 'A')&&(evt.getKeyChar()<='Z'))|| ((evt.getKeyChar()>='a')&&(evt.getKeyChar()<='z')))
        {
            TextField_LastName.setEditable(true);
        }
        else
        {
            evt.consume();
        }
    }//GEN-LAST:event_TextField_LastNameKeyTyped

    private void TextField_MailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_MailKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_TextField_MailKeyTyped

    private void Password_FieldKeyTyped1(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Password_FieldKeyTyped1
        // TODO add your handling code here:

    }//GEN-LAST:event_Password_FieldKeyTyped1

    private void TextField_UsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_UsernameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_UsernameKeyTyped

    private void TextField_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_NameActionPerformed

    private void TextField_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_UsernameActionPerformed

    private void TextField_IdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_IdKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_IdKeyTyped

    
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
            java.util.logging.Logger.getLogger(Register_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_Window(rol).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Create;
    private javax.swing.JLabel Label_Apellido;
    private javax.swing.JLabel Label_Id;
    private javax.swing.JLabel Label_Mail;
    private javax.swing.JLabel Label_Name;
    private javax.swing.JLabel Label_Password;
    private javax.swing.JLabel Label_Registration;
    private javax.swing.JLabel Label_Username;
    private javax.swing.JPasswordField Password_Field;
    private javax.swing.JTextField TextField_Id;
    private javax.swing.JTextField TextField_LastName;
    private javax.swing.JTextField TextField_Mail;
    private javax.swing.JTextField TextField_Name;
    private javax.swing.JTextField TextField_Username;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel regPanel;
    // End of variables declaration//GEN-END:variables
}
