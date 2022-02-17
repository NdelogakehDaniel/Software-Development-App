
package com.components;

import com.model.Model_Card;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;

public class Card extends javax.swing.JPanel {

    private Color color1;
    private Color color2;
    
    public Card() {
        initComponents();
        setOpaque(false);
        
        color1 = new Color(142,142,250);
        color2 = new Color(123,123,245);
    }

    public Card(Color color1, Color color2, JLabel ibDescription, JLabel ibIcon, JLabel ibTitle, JLabel ibValue) {
        this.color1 = color1;
        this.color2 = color2;
        this.ibDescription = ibDescription;
        this.ibIcon = ibIcon;
        this.ibTitle = ibTitle;
        this.ibValue = ibValue;
    }
    
    
    
    public void setData(Model_Card data){
        this.ibIcon.setIcon(data.getIcon());
        this.ibTitle.setText(data.getTitle());
        this.ibValue.setText(data.getValues());
        this.ibDescription.setText(data.getDescription());
    }
    
   @Override
   protected void paintComponent(Graphics grphcs){
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0,0,color1,0,getHeight(),color2);
        g2.setPaint(g);
        g2.fillRoundRect(0,0,getWidth(),getHeight(),15,15);
        g2.setColor(color1);
        g2.fillOval(getWidth()- (getHeight()/2), 10, getHeight(), getHeight());
        g2.fillOval(getWidth()- (getHeight()/2)-20,getHeight() / 2 + 20, getHeight(), getHeight());
       super.paintComponent(grphcs);
   }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ibIcon = new javax.swing.JLabel();
        ibTitle = new javax.swing.JLabel();
        ibValue = new javax.swing.JLabel();
        ibDescription = new javax.swing.JLabel();

        ibIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rexonadmin/Assets/chats.png"))); // NOI18N

        ibTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ibTitle.setForeground(new java.awt.Color(255, 255, 255));
        ibTitle.setText("Title");

        ibValue.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ibValue.setForeground(new java.awt.Color(255, 255, 255));
        ibValue.setText("Value");

        ibDescription.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ibDescription.setForeground(new java.awt.Color(255, 255, 255));
        ibDescription.setText("description");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ibIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ibValue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addComponent(ibTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(ibDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ibIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ibTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ibValue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ibDescription)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ibDescription;
    private javax.swing.JLabel ibIcon;
    private javax.swing.JLabel ibTitle;
    private javax.swing.JLabel ibValue;
    // End of variables declaration//GEN-END:variables

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }
}
