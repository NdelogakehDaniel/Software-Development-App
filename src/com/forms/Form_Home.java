
package com.forms;

import com.model.Model_Card;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.connexion.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Form_Home extends javax.swing.JPanel {
    private float data1 =(float) 0.0;
    private int data2 = 0;
    private int data3 = 0;
    
    public Form_Home() {
        initComponents();
        setOpaque(false);
        
        //get all  ard data using getData() method
        getData();
        
        card1.setData(new Model_Card(new ImageIcon(getClass().getResource("../../rexonadmin/Assets/money.png")),"Total Payment","$"+data1,"Increased by 20%"));
        card2.setData(new Model_Card(new ImageIcon(getClass().getResource("../../rexonadmin/Assets/persons.png")),"All Users",""+data2,"Increased by 30%"));
        card3.setData(new Model_Card(new ImageIcon(getClass().getResource("../../rexonadmin/Assets/meetingss.png")),"My Meetings",""+data3,"All monthly meetings"));
        
        fillTableData();
    }
    
    public void fillTableData(){
         try{
         //get total amount of payments
        String sql = "Select * from users";
        PreparedStatement prep = Connexion.seconnecter().prepareStatement(sql);
        ResultSet rs = prep.executeQuery();
            while(rs.next()){
                String[] columnNames = {String.valueOf(rs.getInt("iduser")), rs.getString("name"),rs.getString("email"),rs.getString("city"),rs.getString("country"),rs.getString("tel"),rs.getString("role") };
                DefaultTableModel tblModel = (DefaultTableModel)this.dataTable.getModel();
                tblModel.addRow(columnNames);
            }
        }catch(Exception e){
              System.out.println("Error Message: "+e.getMessage());   
         }
    }
    
    //function to get all card adata
    public void getData(){
        
        try{
         //get total amount of payments
        String sql = "Select sum(amount) as result from payment";
        PreparedStatement prep = Connexion.seconnecter().prepareStatement(sql);
        ResultSet rs = prep.executeQuery();
        while(rs.next()){
            data1 = rs.getFloat("result");
        }
        
        //count all number of users
        sql = "Select count(iduser) as result from users";
        prep = Connexion.seconnecter().prepareStatement(sql);
        rs = prep.executeQuery();
        while(rs.next()){
            data2 = rs.getInt("result");
        }
        
        //count all number of meetings
        sql = "Select count(idmeetings) as result from meetings";
        prep = Connexion.seconnecter().prepareStatement(sql);
        rs = prep.executeQuery();
        while(rs.next()){
            data3 = rs.getInt("result");
        }
        
        }catch(Exception e){
            System.out.println("Error Message: "+e.getMessage());
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        card1 = new com.components.Card();
        card2 = new com.components.Card();
        card3 = new com.components.Card();
        panelBorder2 = new com.components.PanelBorder();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(1, 0, 10, 0));
        jPanel1.add(card1);
        jPanel1.add(card2);
        jPanel1.add(card3);

        dataTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dataTable.setForeground(new java.awt.Color(0, 51, 102));
        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Email", "City", "Country", "Telephone", "Role"
            }
        ));
        dataTable.setColumnSelectionAllowed(true);
        dataTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dataTable.setGridColor(new java.awt.Color(204, 204, 255));
        dataTable.setIntercellSpacing(new java.awt.Dimension(1, 6));
        dataTable.setOpaque(false);
        dataTable.setRowHeight(35);
        dataTable.setShowHorizontalLines(false);
        dataTable.setSurrendersFocusOnKeystroke(true);
        dataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickTabele(evt);
            }
        });
        jScrollPane1.setViewportView(dataTable);
        dataTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(panelBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void clickTabele(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickTabele
         int row = this.dataTable.rowAtPoint(evt.getPoint());
        int col = this.dataTable.columnAtPoint(evt.getPoint());
         System.out.println("Row: "+row+" Col: "+col);
         System.out.println("Value = "+this.dataTable.getValueAt(row, col));
         System.out.println("User id: "+this.dataTable.getValueAt(row, 0));
        
    }//GEN-LAST:event_clickTabele


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.components.Card card1;
    private com.components.Card card2;
    private com.components.Card card3;
    private javax.swing.JTable dataTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.components.PanelBorder panelBorder2;
    // End of variables declaration//GEN-END:variables
}
