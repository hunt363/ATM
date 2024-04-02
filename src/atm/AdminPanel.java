/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package atm;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Kinchit
 */
public class AdminPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminPanel
     */
    public AdminPanel() {
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

        jLabel1 = new javax.swing.JLabel();
        ButtonDeposit = new javax.swing.JButton();
        ButtonWithdraw = new javax.swing.JButton();
        ButtonReport = new javax.swing.JButton();
        ButtonCheck = new javax.swing.JButton();
        ButtonLogOut = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Inter", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administrator");

        ButtonDeposit.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        ButtonDeposit.setText("Deposit");
        ButtonDeposit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonDepositMouseClicked(evt);
            }
        });

        ButtonWithdraw.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        ButtonWithdraw.setText("Withdraw");
        ButtonWithdraw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonWithdrawMouseClicked(evt);
            }
        });

        ButtonReport.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        ButtonReport.setText("Transaction History");
        ButtonReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonReportMouseClicked(evt);
            }
        });

        ButtonCheck.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        ButtonCheck.setText("Check Cash");
        ButtonCheck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonCheckMouseClicked(evt);
            }
        });

        ButtonLogOut.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        ButtonLogOut.setText("Logout");
        ButtonLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonLogOutMouseClicked(evt);
            }
        });
        ButtonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(123, 123, 123))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ButtonLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ButtonReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonDeposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonWithdraw, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(ButtonCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonDeposit, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(ButtonWithdraw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonCheck, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonLogOut)
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonDepositMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonDepositMouseClicked
        // TODO add your handling code here:
        AdminDeposit panel = new AdminDeposit();
        ATM.panelSwap(this, panel);
    }//GEN-LAST:event_ButtonDepositMouseClicked

    private void ButtonCheckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCheckMouseClicked
        try {
            Connection con = DriverManager.getConnection(ATM.url);
            Statement statement = con.createStatement();
            String sql = "select balance from accounts where name='admin'";
            ResultSet result = statement.executeQuery(sql);
            if (result.next()) {
                String balance = Integer.toString(result.getInt(1));
                JOptionPane.showMessageDialog(ButtonCheck, "Balance = " + balance, "Balance", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonCheckMouseClicked

    private void ButtonLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonLogOutMouseClicked
   
    }//GEN-LAST:event_ButtonLogOutMouseClicked

    private void ButtonWithdrawMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonWithdrawMouseClicked
        // TODO add your handling code here:
        AdminWithdraw panel = new AdminWithdraw();
        ATM.panelSwap(this, panel);
    }//GEN-LAST:event_ButtonWithdrawMouseClicked

    private void ButtonReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonReportMouseClicked
        // TODO add your handling code here:
        try {
            Class.forName(ATM.driver);
            try (Connection con = DriverManager.getConnection(ATM.url)) {
                String reportPath = "C:\\Users\\Kinchit\\JaspersoftWorkspace\\MyReports\\Transactions.jrxml";
                JasperReport jr = JasperCompileManager.compileReport(reportPath);
                JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
                JasperViewer jv = new JasperViewer(jp, false);
                jv.setExtendedState(JFrame.MAXIMIZED_BOTH);
                jv.enable();
                jv.setVisible(true);
                ATM.panelSwap(this, new Home());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_ButtonReportMouseClicked

    private void ButtonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLogOutActionPerformed
        // TODO add your handling code here:
        ATM.panelSwap(this, new Home());
    }//GEN-LAST:event_ButtonLogOutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCheck;
    private javax.swing.JButton ButtonDeposit;
    private javax.swing.JButton ButtonLogOut;
    private javax.swing.JButton ButtonReport;
    private javax.swing.JButton ButtonWithdraw;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
