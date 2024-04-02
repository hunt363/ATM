/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package atm;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Kinchit
 */
public class Deposit extends javax.swing.JPanel {
    private String acc_no, name;

    /**
     * Creates new form Deposit
     */
    public Deposit(String acc_no, String name) {
        this.acc_no=acc_no;
        this.name=name;
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
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel3 = new javax.swing.JLabel();
        TextFieldAmount = new javax.swing.JTextField();
        ButtonDeposit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        jLabel3.setText("Amount");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 127, 0, 0);
        add(jLabel3, gridBagConstraints);

        TextFieldAmount.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 92;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 12, 0, 132);
        add(TextFieldAmount, gridBagConstraints);

        ButtonDeposit.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        ButtonDeposit.setText("Deposit");
        ButtonDeposit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonDepositMouseClicked(evt);
            }
        });
        ButtonDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDepositActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 193, 30, 0);
        add(ButtonDeposit, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/icons8-deposit-32 (1).png"))); // NOI18N
        jLabel4.setText("Deposit");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 0, 0, 0);
        add(jLabel4, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonDepositMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonDepositMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ButtonDepositMouseClicked

    private void ButtonDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDepositActionPerformed
        // TODO add your handling code here:
        if (!Pattern.matches(ATM.regexAmount, TextFieldAmount.getText())) {
            JOptionPane.showMessageDialog(ButtonDeposit, "Please enter a valid amount", "Deposit", JOptionPane.ERROR_MESSAGE);
            return;
        }
        long amount = Long.parseLong(TextFieldAmount.getText());
        try {
            Connection con = DriverManager.getConnection(ATM.url);
            con.setAutoCommit(false);
            String sql = "select balance from accounts where acc_no=" + acc_no;
            Statement statement = con.createStatement();
            ResultSet res = statement.executeQuery(sql);
            res.next();
            long balance = res.getLong(1);
            long newBalance = balance + amount;
            sql = "update accounts set balance=" + newBalance + " where acc_no=" + acc_no;
            int flag = statement.executeUpdate(sql);
            if (flag != 1) {
                JOptionPane.showMessageDialog(ButtonDeposit, "Transaction Failed", "Deposit", JOptionPane.ERROR_MESSAGE);
                return;
            }
            sql = "select balance from accounts where name='admin'";
            res = statement.executeQuery(sql);
            res.next();
            long cash = res.getLong(1);
            cash = cash + amount;
            sql = "update accounts set balance=" + cash + " where name='admin'";
            flag = statement.executeUpdate(sql);
            if (flag != 1) {
                JOptionPane.showMessageDialog(ButtonDeposit, "Transaction Failed", "Deposit", JOptionPane.ERROR_MESSAGE);
                return;
            }
            sql = "select count(*) from transactions";
            ResultSet result = statement.executeQuery(sql);
            result.next();
            int count = result.getInt(1);
            count++;
            sql = "insert into transactions values(?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, count);
            ps.setString(2, acc_no);
            ps.setDate(3, Date.valueOf(LocalDate.now()));
            ps.setTime(4, Time.valueOf(LocalTime.now()));
            ps.setString(5, "debit");
            ps.setString(6, "self");
            ps.setLong(7, amount);
            flag=ps.executeUpdate();
            if (flag != 1) {
                JOptionPane.showMessageDialog(ButtonDeposit, "Transaction Failed", "Deposit", JOptionPane.ERROR_MESSAGE);
                return;
            }con.commit();
            JOptionPane.showMessageDialog(this, "Transaction Successful\nReceipt will be generated", "Deposit", JOptionPane.INFORMATION_MESSAGE);
            String reportPath = "C:\\Users\\Kinchit\\JaspersoftWorkspace\\MyReports\\Receipt.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(reportPath);
            HashMap param = new HashMap();
            param.put("t_id", count);
            JasperPrint jp = JasperFillManager.fillReport(jr, param, con);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setExtendedState(JFrame.MAXIMIZED_BOTH);
            jv.enable();
            jv.setVisible(true);
            ATM.panelSwap(this, new Home());

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (JRException ex) {
            Logger.getLogger(Deposit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonDepositActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonDeposit;
    private javax.swing.JTextField TextFieldAmount;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
