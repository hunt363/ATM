/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package atm;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.regex.Pattern;

/**
 *
 * @author Kinchit
 */
public class Home extends javax.swing.JPanel {

    /**
     * Creates new form Home
     */
    public Home() {
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

        buttonAdmin = new javax.swing.JButton();
        buttonDeposit = new javax.swing.JButton();
        buttonWithdraw = new javax.swing.JButton();
        buttonTransfer = new javax.swing.JButton();
        buttonBalance = new javax.swing.JButton();
        buttonCreate = new javax.swing.JButton();
        buttonHistory = new javax.swing.JButton();
        buttonBill = new javax.swing.JButton();
        buttonBillHistory = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        buttonAdmin.setBackground(getBackground());
        buttonAdmin.setBorderPainted(false);
        buttonAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonAdminMouseClicked(evt);
            }
        });
        buttonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdminActionPerformed(evt);
            }
        });

        buttonDeposit.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        buttonDeposit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/icons8-deposit-32 (1).png"))); // NOI18N
        buttonDeposit.setText("Deposit");
        buttonDeposit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonDepositMouseClicked(evt);
            }
        });
        buttonDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDepositActionPerformed(evt);
            }
        });

        buttonWithdraw.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        buttonWithdraw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/icons8-withdraw-32.png"))); // NOI18N
        buttonWithdraw.setText("Withdraw");
        buttonWithdraw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonWithdrawMouseClicked(evt);
            }
        });
        buttonWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonWithdrawActionPerformed(evt);
            }
        });

        buttonTransfer.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        buttonTransfer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/icons8-bank-transfer-32.png"))); // NOI18N
        buttonTransfer.setText("Transfer");
        buttonTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTransferActionPerformed(evt);
            }
        });

        buttonBalance.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        buttonBalance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/icons8-sales-balance-1-32.png"))); // NOI18N
        buttonBalance.setText("Check Balance");
        buttonBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBalanceActionPerformed(evt);
            }
        });

        buttonCreate.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        buttonCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/icons8-bank-account-32.png"))); // NOI18N
        buttonCreate.setText("Create Account");
        buttonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCreateActionPerformed(evt);
            }
        });

        buttonHistory.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        buttonHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/icons8-activity-history-32.png"))); // NOI18N
        buttonHistory.setText("View Transaction History");
        buttonHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHistoryActionPerformed(evt);
            }
        });

        buttonBill.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        buttonBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/icons8-bill-32.png"))); // NOI18N
        buttonBill.setText("Pay Bill");
        buttonBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBillActionPerformed(evt);
            }
        });

        buttonBillHistory.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        buttonBillHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/icons8-activity-history-32.png"))); // NOI18N
        buttonBillHistory.setText("Check Bill History");
        buttonBillHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBillHistoryActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Inter", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/icons8-atm-64.png"))); // NOI18N
        jLabel1.setText("Welcome to ATM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonDeposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonWithdraw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonTransfer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonBillHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE))
                .addGap(133, 133, 133))
            .addGroup(layout.createSequentialGroup()
                .addComponent(buttonAdmin)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(buttonAdmin)
                .addGap(13, 13, 13)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addComponent(buttonDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(buttonWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(buttonTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(buttonBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(buttonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(buttonHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(buttonBill, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(buttonBillHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAdminMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAdminMouseClicked

    private void buttonDepositMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDepositMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonDepositMouseClicked

    private void buttonWithdrawMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonWithdrawMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonWithdrawMouseClicked

    private void buttonTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTransferActionPerformed
        // TODO add your handling code here:
        try {
            String acc_no = "";
            while (acc_no.equals("")) {
                acc_no = JOptionPane.showInputDialog("Enter acc_no");
            }
            Connection con = DriverManager.getConnection(ATM.url);
            Statement statement = con.createStatement();
            String sql = "select name, pin from accounts where acc_no='" + acc_no + "'";
            ResultSet res = statement.executeQuery(sql);
            if (!res.next()) {
                JOptionPane.showMessageDialog(buttonAdmin, "Account not found", "", JOptionPane.ERROR_MESSAGE);
            }
            String name = res.getString(1), pin = res.getString(2);
            String inputPin = "";
            while (inputPin.equals("")) {
                inputPin = JOptionPane.showInputDialog("Enter PIN for account: " + name);
            }
            if (!pin.equals(inputPin)) {
                JOptionPane.showMessageDialog(buttonAdmin, "PIN incorrect", "", JOptionPane.ERROR_MESSAGE);
                return;
            } else {
                JOptionPane.showMessageDialog(buttonAdmin, "Login Successful", "", JOptionPane.INFORMATION_MESSAGE);
            }
            ATM.panelSwap(this, new Transfer(acc_no));
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_buttonTransferActionPerformed

    private void buttonWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonWithdrawActionPerformed
        // TODO add your handling code here:
        try {
            String acc_no = "";
            while (acc_no.equals("")) {
                acc_no = JOptionPane.showInputDialog("Enter acc_no");
            }
            Connection con = DriverManager.getConnection(ATM.url);
            Statement statement = con.createStatement();
            String sql = "select name, pin from accounts where acc_no='" + acc_no + "'";
            ResultSet res = statement.executeQuery(sql);
            if (!res.next()) {
                JOptionPane.showMessageDialog(buttonAdmin, "Account not found", "", JOptionPane.ERROR_MESSAGE);
            }
            String name = res.getString(1), pin = res.getString(2);
            String inputPin = "";
            while (inputPin.equals("")) {
                inputPin = JOptionPane.showInputDialog("Enter PIN for account: " + name);
            }
            if (!pin.equals(inputPin)) {
                JOptionPane.showMessageDialog(this, "PIN incorrect", "", JOptionPane.ERROR_MESSAGE);
                return;
            } else {
                JOptionPane.showMessageDialog(this, "Login Successful", "", JOptionPane.INFORMATION_MESSAGE);
            }
            ATM.panelSwap(this, new Withdraw(acc_no));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_buttonWithdrawActionPerformed

    private void buttonDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDepositActionPerformed
        // TODO add your handling code here:
        try {
            String acc_no = "", name;
            int choice;
            do {
                while (!Pattern.matches(ATM.regexAcc, acc_no)) {
                    acc_no = JOptionPane.showInputDialog("Enter acc_no");
                }
                Connection con = DriverManager.getConnection(ATM.url);
                Statement statement = con.createStatement();
                String sql = "select name from accounts where acc_no='" + acc_no + "'";
                ResultSet res = statement.executeQuery(sql);
                if (!res.next()) {
                    JOptionPane.showMessageDialog(this, "Account not found", "", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                name = res.getString(1);
                choice = JOptionPane.showConfirmDialog(this, name, "Account name correct?", JOptionPane.YES_NO_OPTION);
                if (choice == 1) {
                    acc_no = "";
                }
            } while (choice == 1);
            ATM.panelSwap(this, new Deposit(acc_no, name));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_buttonDepositActionPerformed

    private void buttonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdminActionPerformed
        // TODO add your handling code here:
        ATM.panelSwap(this, new Login());
    }//GEN-LAST:event_buttonAdminActionPerformed

    private void buttonBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBalanceActionPerformed
        // TODO add your handling code here:
        ATM.panelSwap(this, new CheckBalance());
    }//GEN-LAST:event_buttonBalanceActionPerformed

    private void buttonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCreateActionPerformed
        // TODO add your handling code here:
        ATM.panelSwap(this, new CreateAccount());
    }//GEN-LAST:event_buttonCreateActionPerformed

    private void buttonHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHistoryActionPerformed
        // TODO add your handling code here:
        ATM.panelSwap(this, new History());
    }//GEN-LAST:event_buttonHistoryActionPerformed

    private void buttonBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBillActionPerformed
        // TODO add your handling code here:
        try {
            String acc_no = "";
            while (acc_no.equals("")) {
                acc_no = JOptionPane.showInputDialog("Enter acc_no");
            }
            Connection con = DriverManager.getConnection(ATM.url);
            Statement statement = con.createStatement();
            String sql = "select name, pin from accounts where acc_no='" + acc_no + "'";
            ResultSet res = statement.executeQuery(sql);
            if (!res.next()) {
                JOptionPane.showMessageDialog(buttonAdmin, "Account not found", "", JOptionPane.ERROR_MESSAGE);
            }
            String name = res.getString(1), pin = res.getString(2);
            String inputPin = "";
            while (inputPin.equals("")) {
                inputPin = JOptionPane.showInputDialog("Enter PIN for account: " + name);
            }
            if (!pin.equals(inputPin)) {
                JOptionPane.showMessageDialog(this, "PIN incorrect", "", JOptionPane.ERROR_MESSAGE);
                return;
            } else {
                JOptionPane.showMessageDialog(this, "Login Successful", "", JOptionPane.INFORMATION_MESSAGE);
            }
            ATM.panelSwap(this, new BillPayment(acc_no));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_buttonBillActionPerformed

    private void buttonBillHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBillHistoryActionPerformed
        // TODO add your handling code here:
        ATM.panelSwap(this, new BillHistory());
    }//GEN-LAST:event_buttonBillHistoryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdmin;
    private javax.swing.JButton buttonBalance;
    private javax.swing.JButton buttonBill;
    private javax.swing.JButton buttonBillHistory;
    private javax.swing.JButton buttonCreate;
    private javax.swing.JButton buttonDeposit;
    private javax.swing.JButton buttonHistory;
    private javax.swing.JButton buttonTransfer;
    private javax.swing.JButton buttonWithdraw;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
