
package com.components;

import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import rexonadmin.AdminLogin;
import rexonadmin.Dashboard;

public class Menu extends javax.swing.JPanel {

    public Menu() {
        initComponents();
        setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMoving = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        appointment = new javax.swing.JLabel();
        dashboard = new javax.swing.JLabel();
        projects = new javax.swing.JLabel();
        videochat = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        payment = new javax.swing.JLabel();
        chat = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        setting = new javax.swing.JLabel();

        setBackground(null);
        setPreferredSize(new java.awt.Dimension(215, 312));

        PanelMoving.setBackground(null);
        PanelMoving.setOpaque(false);

        jLabel1.setBackground(null);
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rexonadmin/Assets/icons8_Account_50px.png"))); // NOI18N
        jLabel1.setText("REXON APP");

        javax.swing.GroupLayout PanelMovingLayout = new javax.swing.GroupLayout(PanelMoving);
        PanelMoving.setLayout(PanelMovingLayout);
        PanelMovingLayout.setHorizontalGroup(
            PanelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelMovingLayout.setVerticalGroup(
            PanelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMovingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
        );

        appointment.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        appointment.setForeground(new java.awt.Color(255, 255, 255));
        appointment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rexonadmin/Assets/appointments.png"))); // NOI18N
        appointment.setText("   Appoinments");
        appointment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        dashboard.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dashboard.setForeground(new java.awt.Color(255, 255, 255));
        dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rexonadmin/Assets/dashboards.png"))); // NOI18N
        dashboard.setText("   Dashboard");
        dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        projects.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        projects.setForeground(new java.awt.Color(255, 255, 255));
        projects.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rexonadmin/Assets/progress.png"))); // NOI18N
        projects.setText("   Projects");
        projects.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        projects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showProjects(evt);
            }
        });

        videochat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        videochat.setForeground(new java.awt.Color(255, 255, 255));
        videochat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rexonadmin/Assets/videos.png"))); // NOI18N
        videochat.setText("Video Conference");
        videochat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("My Data");

        payment.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        payment.setForeground(new java.awt.Color(255, 255, 255));
        payment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rexonadmin/Assets/payments.png"))); // NOI18N
        payment.setText("   Payments");
        payment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        chat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chat.setForeground(new java.awt.Color(255, 255, 255));
        chat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rexonadmin/Assets/chats.png"))); // NOI18N
        chat.setText("Chats");
        chat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        logout.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rexonadmin/Assets/logouticon.png"))); // NOI18N
        logout.setText("Logout");
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutUser(evt);
            }
        });

        setting.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        setting.setForeground(new java.awt.Color(255, 255, 255));
        setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rexonadmin/Assets/setting.png"))); // NOI18N
        setting.setText("Settings");
        setting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMoving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(appointment, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projects, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(videochat, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chat, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payment, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setting, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelMoving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(projects, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(appointment, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(payment, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addComponent(chat, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(videochat, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(setting, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void logoutUser(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutUser
        //used to access parent JFrame
        this.getTopLevelAncestor().hide();
        
        AdminLogin login = new AdminLogin();
        login.setVisible(true);
    }//GEN-LAST:event_logoutUser

    private void showProjects(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showProjects
       Dashboard d = new Dashboard();
    }//GEN-LAST:event_showProjects

     @Override
    public void paintComponent(Graphics grphcs){
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0,0,Color.decode("#1CB5E0"),0,getHeight(),Color.decode("#000046"));
        g2.setPaint(g);
        g2.fillRoundRect(0,0,getWidth(),getHeight(),15,15);
        g2.fillRect(getWidth()-20, 0, getWidth(), getHeight());
        super.paintChildren(grphcs);
    }
    
    
    public static void main(String args[]){
        new Menu().setVisible(true);
        Menu menu = new Menu();
        String s[] = {"Daniel","Franc","Junior"};
//        menu.menuList.setOpaque(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMoving;
    private javax.swing.JLabel appointment;
    private javax.swing.JLabel chat;
    private javax.swing.JLabel dashboard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel payment;
    private javax.swing.JLabel projects;
    private javax.swing.JLabel setting;
    private javax.swing.JLabel videochat;
    // End of variables declaration//GEN-END:variables
}
