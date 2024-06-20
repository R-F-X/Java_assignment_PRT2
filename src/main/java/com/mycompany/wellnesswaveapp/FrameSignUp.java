package com.mycompany.wellnesswaveapp;

public class FrameSignUp extends javax.swing.JFrame {

    public FrameSignUp() {
        initComponents();
        //setSize(Toolkit.getDefaultToolkit().getScreenSize()); //suitable to certain screen size of device
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        formPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblFuName = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblConPassword = new javax.swing.JLabel();
        lblConPassword1 = new javax.swing.JLabel();
        txtFieldFuName = new javax.swing.JTextField();
        txtFieldUsername = new javax.swing.JTextField();
        txtFieldEmail = new javax.swing.JTextField();
        txtFieldConPassword = new javax.swing.JPasswordField();
        txtFieldConPassword1 = new javax.swing.JPasswordField();
        heading = new javax.swing.JLabel();
        signupLBtn = new javax.swing.JLabel();
        errorMessage1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Wellness Wave (Sign Up)");
        setBackground(new java.awt.Color(150, 185, 12));
        setPreferredSize(new java.awt.Dimension(800, 450));
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(47, 59, 4));

        formPanel.setBackground(new java.awt.Color(47, 59, 4));

        jPanel3.setBackground(new java.awt.Color(150, 185, 12));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblFuName.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        lblFuName.setText("Name");

        lblUsername.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        lblUsername.setText("Surname");

        lblEmail.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        lblEmail.setText("Email");

        lblConPassword.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        lblConPassword.setText("Password");

        lblConPassword1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        lblConPassword1.setText("Confirm password");

        txtFieldFuName.setBackground(new java.awt.Color(150, 185, 12));
        txtFieldFuName.setForeground(new java.awt.Color(255, 255, 255));
        txtFieldFuName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtFieldFuName.setCaretColor(new java.awt.Color(255, 255, 255));
        txtFieldFuName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldFuNameActionPerformed(evt);
            }
        });

        txtFieldUsername.setBackground(new java.awt.Color(150, 185, 12));
        txtFieldUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtFieldUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtFieldUsername.setCaretColor(new java.awt.Color(255, 255, 255));
        txtFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldUsernameActionPerformed(evt);
            }
        });

        txtFieldEmail.setBackground(new java.awt.Color(150, 185, 12));
        txtFieldEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtFieldEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtFieldEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        txtFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldEmailActionPerformed(evt);
            }
        });

        txtFieldConPassword.setBackground(new java.awt.Color(150, 185, 12));
        txtFieldConPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtFieldConPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldConPasswordActionPerformed(evt);
            }
        });

        txtFieldConPassword1.setBackground(new java.awt.Color(150, 185, 12));
        txtFieldConPassword1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtFieldConPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldConPassword1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFuName, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConPassword1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFieldUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldFuName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtFieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                        .addComponent(txtFieldConPassword))
                    .addComponent(txtFieldConPassword1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldFuName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFuName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(lblUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFieldConPassword))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblConPassword)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldConPassword1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(lblConPassword1))
                .addGap(19, 19, 19))
        );

        heading.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 48)); // NOI18N
        heading.setForeground(new java.awt.Color(255, 255, 255));
        heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heading.setText("Sign Up");

        signupLBtn.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        signupLBtn.setForeground(new java.awt.Color(255, 255, 255));
        signupLBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signupLBtn.setText("SIGN UP");
        signupLBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        signupLBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        errorMessage1.setForeground(new java.awt.Color(255, 255, 255));
        errorMessage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorMessage1.setText("Already have an account?");
        errorMessage1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        errorMessage1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                errorMessage1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout formPanelLayout = new javax.swing.GroupLayout(formPanel);
        formPanel.setLayout(formPanelLayout);
        formPanelLayout.setHorizontalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formPanelLayout.createSequentialGroup()
                .addGap(0, 61, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(formPanelLayout.createSequentialGroup()
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(signupLBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(errorMessage1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        formPanelLayout.setVerticalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formPanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(heading)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(signupLBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errorMessage1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldConPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldConPasswordActionPerformed
        // to be coded...
    }//GEN-LAST:event_txtFieldConPasswordActionPerformed

    private void txtFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldEmailActionPerformed
        // to be coded...
    }//GEN-LAST:event_txtFieldEmailActionPerformed

    private void txtFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldUsernameActionPerformed
        // to be coded...
    }//GEN-LAST:event_txtFieldUsernameActionPerformed

    private void txtFieldFuNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldFuNameActionPerformed
        // to be coded...
    }//GEN-LAST:event_txtFieldFuNameActionPerformed

    private void txtFieldConPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldConPassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldConPassword1ActionPerformed

    private void errorMessage1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_errorMessage1MouseClicked
        this.dispose();
        new FrameLogin().setVisible(true);
    }//GEN-LAST:event_errorMessage1MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameSignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorMessage1;
    private javax.swing.JPanel formPanel;
    private javax.swing.JLabel heading;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblConPassword;
    private javax.swing.JLabel lblConPassword1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFuName;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel signupLBtn;
    private javax.swing.JPasswordField txtFieldConPassword;
    private javax.swing.JPasswordField txtFieldConPassword1;
    private javax.swing.JTextField txtFieldEmail;
    private javax.swing.JTextField txtFieldFuName;
    private javax.swing.JTextField txtFieldUsername;
    // End of variables declaration//GEN-END:variables
}
