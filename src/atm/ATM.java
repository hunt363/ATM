/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atm;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author Kinchit
 */
public class ATM {

    public static void setUIFont(javax.swing.plaf.FontUIResource f) {
        java.util.Enumeration keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            if (value instanceof javax.swing.plaf.FontUIResource) {
                UIManager.put(key, f);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    static String url = "jdbc:mysql://localhost:3306/atm?user=root&password=";
    static String driver = "com.mysql.cj.jdbc.Driver";
    static String regexAcc = "^\\d{9,18}$";
    static String regexPIN = "^\\d{4}$";
    static String regexAmount = "^\\d+$";
    static String regexPAN="[A-Z]{5}[0-9]{4}[A-Z]{1}";
    static String regexAadhaar="^\\d{12}$";
    static void panelSwap(JPanel oldPanel, JPanel newPanel) {
        Container container = oldPanel.getParent();
        container.removeAll();
        container.add(newPanel);
        newPanel.setVisible(true);
        container.setVisible(true);
        container.revalidate();
        container.repaint();
        
    }

    static String getNumericString(int n) {

        // choose a Character random from this String 
        String numericString = "0123456789";

        // create StringBuffer size of AlphaNumericString 
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // generate a random number between 
            // 0 to AlphaNumericString variable length 
            int index = (int) (numericString.length() * Math.random());

            // add Character one by one in end of sb 
            sb.append(numericString.charAt(index));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        // TODO code application logic here
//        if (Detector.isWindowsDarkMode()) {
//            FlatMacDarkLaf.setup();
//        } else {
//            FlatMacLightLaf.setup();
//        }
        FlatMacLightLaf.setup();
        setUIFont(new javax.swing.plaf.FontUIResource("Inter", Font.PLAIN, 12));
        Screen screen = new Screen();
        screen.setTitle("ATM");
        screen.setSize(500, 500);
        screen.setExtendedState(JFrame.MAXIMIZED_BOTH);
        screen.setVisible(true);
    }

}
