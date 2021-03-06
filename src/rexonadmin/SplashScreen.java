/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rexonadmin;

import javax.swing.JOptionPane;

/**
 *
 * @author daniel
 */
public class SplashScreen extends javax.swing.JFrame {

    /**
     * Creates new form SplashScreen
     */
    public SplashScreen() {
        initComponents();
    }
    
    public void loadSplashScreen(SplashScreen sp){
        try{
            for(int i=0;i<=100;i++){
                Thread.sleep(100);
                sp.percentage.setText(i+"%");
                if(i<10){
                    sp.LaodingText.setText("Loading Modules ...");
                }
                if(i==10){
                    sp.LaodingText.setText("Downloading Modules ...");
                }
                if(i==20){
                    sp.LaodingText.setText("Turning on Modules ...");
                }
                if(i==50){
                    sp.LaodingText.setText("Connecting to database ...");
                }
                if(i==70){
                    sp.LaodingText.setText("Connection Successfull !!! ...");
                }
                if(i==80){
                    sp.LaodingText.setText("Launching Application ...");
                }
                sp.LoadingBar.setValue(i);
            }
            
            sp.setVisible(false);
            AdminLogin login = new AdminLogin();
            login.setVisible(true);
            
        }catch(Exception e){
            System.out.println("Error Message: "+e.getMessage());
            JOptionPane.showMessageDialog(null,e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundPanel = new javax.swing.JPanel();
        BackgroundImage = new javax.swing.JLabel();
        SlideImage = new javax.swing.JLabel();
        LoadingBar = new javax.swing.JProgressBar();
        percentage = new javax.swing.JLabel();
        LaodingText = new javax.swing.JLabel();
        AppName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(900, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundPanel.setMaximumSize(new java.awt.Dimension(900, 700));
        BackgroundPanel.setMinimumSize(new java.awt.Dimension(900, 700));
        BackgroundPanel.setPreferredSize(new java.awt.Dimension(900, 700));

        BackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rexonadmin/Assets/lineargradient2(1).jpg"))); // NOI18N
        BackgroundImage.setIconTextGap(0);
        BackgroundImage.setMaximumSize(new java.awt.Dimension(900, 700));
        BackgroundImage.setMinimumSize(new java.awt.Dimension(900, 700));
        BackgroundImage.setPreferredSize(new java.awt.Dimension(900, 700));

        SlideImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rexonadmin/Assets/slide1.png"))); // NOI18N

        LoadingBar.setBackground(new java.awt.Color(255, 255, 255));
        LoadingBar.setForeground(new java.awt.Color(255, 204, 0));
        LoadingBar.setString("0%");

        percentage.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        percentage.setForeground(new java.awt.Color(255, 255, 255));
        percentage.setText("0%");

        LaodingText.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        LaodingText.setForeground(new java.awt.Color(0, 0, 51));
        LaodingText.setText("Laoding ...");

        AppName.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        AppName.setForeground(new java.awt.Color(255, 51, 0));
        AppName.setText("REXON SOLUTION TO APP MANAGEMENT");

        javax.swing.GroupLayout BackgroundPanelLayout = new javax.swing.GroupLayout(BackgroundPanel);
        BackgroundPanel.setLayout(BackgroundPanelLayout);
        BackgroundPanelLayout.setHorizontalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(SlideImage, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(AppName, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addGap(857, 857, 857)
                .addComponent(percentage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(LoadingBar, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(LaodingText, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(BackgroundImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        BackgroundPanelLayout.setVerticalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(SlideImage, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(AppName, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(percentage, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addGap(490, 490, 490)
                .addComponent(LoadingBar, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addGap(464, 464, 464)
                .addComponent(LaodingText))
            .addComponent(BackgroundImage, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        BackgroundImage.getAccessibleContext().setAccessibleDescription("");
        BackgroundImage.getAccessibleContext().setAccessibleParent(percentage);
        LoadingBar.getAccessibleContext().setAccessibleName("progressBar");
        LoadingBar.getAccessibleContext().setAccessibleDescription("");
        percentage.getAccessibleContext().setAccessibleName("percentageLevel");
        LaodingText.getAccessibleContext().setAccessibleName("loadingText");
        AppName.getAccessibleContext().setAccessibleName("AppName");

        getContentPane().add(BackgroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 502));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppName;
    private javax.swing.JLabel BackgroundImage;
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JLabel LaodingText;
    private javax.swing.JProgressBar LoadingBar;
    private javax.swing.JLabel SlideImage;
    private javax.swing.JLabel percentage;
    // End of variables declaration//GEN-END:variables
}
