/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumptus.view;

import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import sumptus.dao.DataBase;
import sumptus.dao.UserDAO;
import sumptus.model.User;

/**
 *
 * @author jessicadagostini
 */
public class UserLoginFrame extends javax.swing.JFrame {

    private UserDAO userDAO;
    private User user;
    private UserOutlaysFrame outlay;

    /**
     * Creates new form UserLogin
     */
    public UserLoginFrame() {
        initComponents();
        initLogin();
    }
    
    public void initLogin(){
        loginPanel.setVisible(true);
        newUserPanel.setVisible(false);
        try {
            userDAO = new UserDAO(DataBase.connection());
            user = new User();
        } catch (SQLException ex) {
            Logger.getLogger(UserLoginFrame.class.getName()).log(Level.SEVERE, null, ex);
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

        loginPanel = new javax.swing.JPanel();
        inputPassword = new javax.swing.JTextField();
        inputLogin = new javax.swing.JTextField();
        labelLogin = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        newUserButton = new javax.swing.JButton();
        labelTitle = new javax.swing.JLabel();
        newUserPanel = new javax.swing.JPanel();
        inputNewPassword = new javax.swing.JTextField();
        inputNewName = new javax.swing.JTextField();
        inputNewLogin = new javax.swing.JTextField();
        inputNewAdmin = new javax.swing.JRadioButton();
        labelLogin1 = new javax.swing.JLabel();
        labelPassword1 = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        createUserButton = new javax.swing.JButton();
        loginUserButton = new javax.swing.JButton();
        labelTitle1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1080, 720));

        inputPassword.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N

        inputLogin.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N

        labelLogin.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        labelLogin.setText("Login");

        labelPassword.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        labelPassword.setText("Senha");

        loginButton.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        loginButton.setText("Entrar");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        newUserButton.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        newUserButton.setText("Criar Conta");
        newUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUserButtonActionPerformed(evt);
            }
        });

        labelTitle.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        labelTitle.setText("Sumptus");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(435, 435, 435)
                .addComponent(labelTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelLogin)
                            .addComponent(labelPassword))
                        .addGap(89, 89, 89)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(449, 449, 449)
                        .addComponent(newUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 251, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(197, Short.MAX_VALUE)
                .addComponent(labelTitle)
                .addGap(18, 18, 18)
                .addComponent(newUserButton)
                .addGap(64, 64, 64)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLogin)
                    .addComponent(inputLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPassword))
                .addGap(27, 27, 27)
                .addComponent(loginButton)
                .addGap(192, 192, 192))
        );

        inputNewPassword.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N

        inputNewName.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N

        inputNewLogin.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N

        inputNewAdmin.setText("Administrador");
        inputNewAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNewAdminActionPerformed(evt);
            }
        });

        labelLogin1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        labelLogin1.setText("Login");

        labelPassword1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        labelPassword1.setText("Senha");

        labelNome.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        labelNome.setText("Nome");

        createUserButton.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        createUserButton.setText("Criar");
        createUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserButtonActionPerformed(evt);
            }
        });

        loginUserButton.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        loginUserButton.setText("Login");
        loginUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginUserButtonActionPerformed(evt);
            }
        });

        labelTitle1.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        labelTitle1.setText("Sumptus");

        javax.swing.GroupLayout newUserPanelLayout = new javax.swing.GroupLayout(newUserPanel);
        newUserPanel.setLayout(newUserPanelLayout);
        newUserPanelLayout.setHorizontalGroup(
            newUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newUserPanelLayout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addGroup(newUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelLogin1)
                    .addComponent(labelPassword1)
                    .addComponent(labelNome))
                .addGap(24, 24, 24)
                .addGroup(newUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputNewName, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(newUserPanelLayout.createSequentialGroup()
                        .addComponent(inputNewAdmin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(inputNewLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(264, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newUserPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(newUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newUserPanelLayout.createSequentialGroup()
                        .addComponent(loginUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(442, 442, 442))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newUserPanelLayout.createSequentialGroup()
                        .addComponent(labelTitle1)
                        .addGap(428, 428, 428))))
        );
        newUserPanelLayout.setVerticalGroup(
            newUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newUserPanelLayout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addComponent(labelTitle1)
                .addGap(18, 18, 18)
                .addComponent(loginUserButton)
                .addGap(51, 51, 51)
                .addGroup(newUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelNome)
                    .addComponent(inputNewName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(newUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelLogin1)
                    .addComponent(inputNewLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(newUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelPassword1)
                    .addComponent(inputNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(newUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newUserPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(inputNewAdmin))
                    .addGroup(newUserPanelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(createUserButton)))
                .addGap(138, 138, 138))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(newUserPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(newUserPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        try {
            user = userDAO.findByLogin(inputLogin.getText());
            if(inputPassword.getText().equals(user.getPassword())){
                JOptionPane.showMessageDialog(rootPane, "Login realizado com sucesso!");
                this.dispose();
                outlay = new UserOutlaysFrame(user);
                outlay.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Login teve problemas!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserLoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void newUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUserButtonActionPerformed
        // TODO add your handling code here:
        loginPanel.setVisible(false);
        newUserPanel.setVisible(true);
    }//GEN-LAST:event_newUserButtonActionPerformed

    private void inputNewAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNewAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNewAdminActionPerformed

    private void createUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserButtonActionPerformed
        // TODO add your handling code here:
        user.setName(inputNewName.getText());
        user.setLogin(inputNewLogin.getText());
        user.setPassword(inputNewPassword.getText());
        user.setAdmin(inputNewAdmin.isSelected());
        try {
            String saida = userDAO.create(user);
            JOptionPane.showMessageDialog(rootPane, saida);
            newUserPanel.setVisible(false);
            loginPanel.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(UserLoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(UserLoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_createUserButtonActionPerformed

    private void loginUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginUserButtonActionPerformed
        // TODO add your handling code here:
        loginPanel.setVisible(true);
        newUserPanel.setVisible(false);
    }//GEN-LAST:event_loginUserButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UserLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createUserButton;
    private javax.swing.JTextField inputLogin;
    private javax.swing.JRadioButton inputNewAdmin;
    private javax.swing.JTextField inputNewLogin;
    private javax.swing.JTextField inputNewName;
    private javax.swing.JTextField inputNewPassword;
    private javax.swing.JTextField inputPassword;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelLogin1;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelPassword1;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelTitle1;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JButton loginUserButton;
    private javax.swing.JButton newUserButton;
    private javax.swing.JPanel newUserPanel;
    // End of variables declaration//GEN-END:variables
}
