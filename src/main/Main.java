package main;

import java.awt.Toolkit;

public class Main extends javax.swing.JFrame {

    public Main() {
        super("Wellness-Wave(Sign up)");
        initComponents();
       //setSize(Toolkit.getDefaultToolkit().getScreenSize()); //suitable to certain screen size of device
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelBorder1 = new signupComp.PanelBorder();
        lblFuName = new javax.swing.JLabel();
        txtFieldFuName = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        txtFieldUsername = new javax.swing.JTextField();
        lblConPassword = new javax.swing.JLabel();
        txtFieldEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtFieldConPassword = new javax.swing.JPasswordField();
        btnSignUp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(194, 255, 114));

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        lblFuName.setText("Full Name");
        panelBorder1.add(lblFuName);
        lblFuName.setBounds(90, 110, 60, 16);

        txtFieldFuName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldFuNameActionPerformed(evt);
            }
        });
        panelBorder1.add(txtFieldFuName);
        txtFieldFuName.setBounds(90, 130, 200, 30);

        lblUsername.setText("Username");
        panelBorder1.add(lblUsername);
        lblUsername.setBounds(90, 170, 60, 16);

        txtFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldUsernameActionPerformed(evt);
            }
        });
        panelBorder1.add(txtFieldUsername);
        txtFieldUsername.setBounds(90, 190, 200, 30);

        lblConPassword.setText("Confirm password");
        panelBorder1.add(lblConPassword);
        lblConPassword.setBounds(90, 290, 170, 16);

        txtFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldEmailActionPerformed(evt);
            }
        });
        panelBorder1.add(txtFieldEmail);
        txtFieldEmail.setBounds(90, 250, 200, 30);

        lblEmail.setText("Email");
        panelBorder1.add(lblEmail);
        lblEmail.setBounds(90, 230, 60, 16);

        txtFieldConPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldConPasswordActionPerformed(evt);
            }
        });
        panelBorder1.add(txtFieldConPassword);
        txtFieldConPassword.setBounds(90, 310, 200, 30);

        btnSignUp.setBackground(new java.awt.Color(204, 204, 204));
        btnSignUp.setText("SIGN UP");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        panelBorder1.add(btnSignUp);
        btnSignUp.setBounds(120, 380, 140, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("SIGN UP");
        panelBorder1.add(jLabel1);
        jLabel1.setBounds(100, 20, 220, 60);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                .addGap(100, 100, 100))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addGap(100, 100, 100))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldFuNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldFuNameActionPerformed
        // to be coded...
    }//GEN-LAST:event_txtFieldFuNameActionPerformed

    private void txtFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldUsernameActionPerformed
        // to be coded...
    }//GEN-LAST:event_txtFieldUsernameActionPerformed

    private void txtFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldEmailActionPerformed
        // to be coded...
    }//GEN-LAST:event_txtFieldEmailActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // to be coded...
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void txtFieldConPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldConPasswordActionPerformed
        // to be coded...
    }//GEN-LAST:event_txtFieldConPasswordActionPerformed

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblConPassword;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFuName;
    private javax.swing.JLabel lblUsername;
    private signupComp.PanelBorder panelBorder1;
    private javax.swing.JPasswordField txtFieldConPassword;
    private javax.swing.JTextField txtFieldEmail;
    private javax.swing.JTextField txtFieldFuName;
    private javax.swing.JTextField txtFieldUsername;
    // End of variables declaration//GEN-END:variables
}
