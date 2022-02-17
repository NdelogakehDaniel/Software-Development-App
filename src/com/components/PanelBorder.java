
package com.components;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


public class PanelBorder extends javax.swing.JPanel {

    
    public PanelBorder() {
        initComponents();
        setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 661, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    @Override
    public void paintComponent(Graphics grphcs){
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//        g2.setBackground(getBackground());
        g2.setBackground(Color.WHITE);
        GradientPaint g = new GradientPaint(0,0,Color.decode("#ffffff"),0,getHeight(),Color.decode("#ffffff"));
        g2.setPaint(g);
        g2.fillRoundRect(0,0,getWidth(),getHeight(),15,15);
        super.paintComponent(grphcs);
    }
      public static void main(String args[]) {
//       PanelBorder pb = new PanelBorder(); 
//       pb.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
