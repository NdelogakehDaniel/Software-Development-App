/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rexonadmin;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author daniel
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        setBackground(new Color(0,0,0));
        
//        Component[] components = this.varyPanel.getComponents();
//
//        for (Component component : components) {
//            this.varyPanel.remove(component);
//        }
            //this.hideComponent();
//            JPanel p = new JPanel();
//            p.setBackground(Color.red);
//            p.setSize(400, 500);
//            p.setOpaque(true);
//            JLabel label = new JLabel("Test Label");
//            JButton btn = new JButton("Click Me");
//            p.add(label);
//            p.add(btn);
//            
//            this.addComponent(p);
            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new com.components.PanelBorder();
        searchIcon = new javax.swing.JLabel();
        menu1 = new com.components.Menu();
        closeBtn = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        varyPanel = new javax.swing.JPanel();
        form_Home2 = new com.forms.Form_Home();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setResizable(false);

        panelBorder1.setForeground(new java.awt.Color(255, 255, 255));

        searchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rexonadmin/Assets/search.png"))); // NOI18N
        searchIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rexonadmin/Assets/closesbtn.png"))); // NOI18N
        closeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeDashboard(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setText("Search here");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        varyPanel.setOpaque(false);

        javax.swing.GroupLayout varyPanelLayout = new javax.swing.GroupLayout(varyPanel);
        varyPanel.setLayout(varyPanelLayout);
        varyPanelLayout.setHorizontalGroup(
            varyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(varyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(form_Home2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        varyPanelLayout.setVerticalGroup(
            varyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, varyPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(form_Home2, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchIcon)
                        .addGap(0, 0, 0)
                        .addComponent(jTextField1)
                        .addGap(0, 0, 0)
                        .addComponent(closeBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(varyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(closeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(varyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeDashboard(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeDashboard
        //used to hide parent frame
        //this.closeBtn.getTopLevelAncestor().hide();
        System.exit(0);
    }//GEN-LAST:event_closeDashboard

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    //function to hide current component in varyPanel
    public void hideComponent(){
        this.varyPanel.removeAll();
        this.revalidate();
    }
    
    ///function to set a new component in varyPanel
    public void addComponent(JPanel panel){
        this.varyPanel.add(panel);
        this.varyPanel.revalidate();
        validate();
    }
    
    
    //main function to launch dashboard
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closeBtn;
    private com.forms.Form_Home form_Home2;
    private javax.swing.JTextField jTextField1;
    private com.components.Menu menu1;
    private com.components.PanelBorder panelBorder1;
    private javax.swing.JLabel searchIcon;
    private javax.swing.JPanel varyPanel;
    // End of variables declaration//GEN-END:variables
}
