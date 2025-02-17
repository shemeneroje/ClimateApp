/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package climateapp;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author shemeneroje
 */
public class TipsGUI extends javax.swing.JFrame {
     private ArrayList<String> tips = new ArrayList<>();


    /**
     * Creates new form TipsGUI
     */
    public TipsGUI() {
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

        jPanel1 = new javax.swing.JPanel();
        tips_lbn = new javax.swing.JLabel();
        menu_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ans_ta = new javax.swing.JTextArea();
        ques_lbn = new javax.swing.JLabel();
        add_btn = new javax.swing.JButton();
        display_btn = new javax.swing.JButton();
        save_btn = new javax.swing.JButton();
        delete_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        tips_lbn.setBackground(new java.awt.Color(204, 255, 204));
        tips_lbn.setFont(new java.awt.Font("Chalkduster", 1, 24)); // NOI18N
        tips_lbn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tips_lbn.setText("Share Your own Tips on Climate Change");

        menu_btn.setFont(new java.awt.Font("Chalkduster", 0, 13)); // NOI18N
        menu_btn.setText("Menu");
        menu_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_btnActionPerformed(evt);
            }
        });

        ans_ta.setColumns(20);
        ans_ta.setRows(5);
        jScrollPane1.setViewportView(ans_ta);

        ques_lbn.setFont(new java.awt.Font("Chalkduster", 1, 14)); // NOI18N
        ques_lbn.setText("What are your thoughts on Climate Change and it's effect on the Enviroment ?");

        add_btn.setFont(new java.awt.Font("Chalkduster", 0, 18)); // NOI18N
        add_btn.setText("Add");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        display_btn.setFont(new java.awt.Font("Chalkduster", 0, 18)); // NOI18N
        display_btn.setText("Display");
        display_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                display_btnActionPerformed(evt);
            }
        });

        save_btn.setFont(new java.awt.Font("Chalkduster", 0, 18)); // NOI18N
        save_btn.setText("Save");
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btnActionPerformed(evt);
            }
        });

        delete_btn.setFont(new java.awt.Font("Chalkduster", 0, 18)); // NOI18N
        delete_btn.setText("Delete");
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(menu_btn)
                .addGap(18, 18, 18)
                .addComponent(tips_lbn)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(add_btn)
                        .addGap(91, 91, 91)
                        .addComponent(display_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addComponent(delete_btn)
                        .addGap(94, 94, 94)
                        .addComponent(save_btn))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(ques_lbn))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(81, 81, 81)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu_btn)
                    .addComponent(tips_lbn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ques_lbn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_btn)
                    .addComponent(display_btn)
                    .addComponent(save_btn)
                    .addComponent(delete_btn))
                .addContainerGap(61, Short.MAX_VALUE))
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

    private void menu_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_btnActionPerformed
        // TODO add your handling code here:
       
        Menu2GUI myGUI = new Menu2GUI(); 
        myGUI.setVisible(true);
        this.dispose(); //gets rid of old GUIs to prevent multiple windows at once*/

    }//GEN-LAST:event_menu_btnActionPerformed

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        // TODO add your handling code here:
        String tip = ans_ta.getText().trim();
        if (!tip.isEmpty()) {
            tips.add(tip);
            JOptionPane.showMessageDialog(this, "Tip added successfully!");
            ans_ta.setText(""); // Clear text area
        } else {
            JOptionPane.showMessageDialog(this, "Please enter a tip to add!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_add_btnActionPerformed

    private void display_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_display_btnActionPerformed
        // TODO add your handling code here:
        if (tips.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No tips to display.", "Info", JOptionPane.INFORMATION_MESSAGE);
        } else {
            StringBuilder allTips = new StringBuilder("Your Tips:\n");
            for (int i = 0; i < tips.size(); i++) {
                allTips.append(i + 1).append(". ").append(tips.get(i)).append("\n");
            }
            JOptionPane.showMessageDialog(this, allTips.toString(), "Tips", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_display_btnActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        // TODO add your handling code here:
        String input = JOptionPane.showInputDialog(this, "Enter the tip number to delete:");
        try {
            int index = Integer.parseInt(input) - 1; // Convert to zero-based index
            if (index >= 0 && index < tips.size()) {
                tips.remove(index);
                JOptionPane.showMessageDialog(this, "Tip deleted successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid tip number!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_delete_btnActionPerformed

    private void save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_btnActionPerformed
        // TODO add your handling code here:
         try (FileWriter writer = new FileWriter("tips.txt")) {
            for (String tip : tips) {
                writer.write(tip + "\n");
            }
            JOptionPane.showMessageDialog(this, "Tips saved successfully!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving tips: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_save_btnActionPerformed
    
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
            java.util.logging.Logger.getLogger(TipsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TipsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TipsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TipsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TipsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JTextArea ans_ta;
    private javax.swing.JButton delete_btn;
    private javax.swing.JButton display_btn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton menu_btn;
    private javax.swing.JLabel ques_lbn;
    private javax.swing.JButton save_btn;
    private javax.swing.JLabel tips_lbn;
    // End of variables declaration//GEN-END:variables
}
