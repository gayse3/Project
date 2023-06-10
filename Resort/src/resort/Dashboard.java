package resort;

import java.awt.*;
import javax.swing.*;

public class Dashboard extends javax.swing.JFrame {

    
    public Dashboard() 
    {
        initComponents();
        jPanel2.setVisible(false);
        Homepage hp = new Homepage();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(hp).setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        aboutus = new javax.swing.JLabel();
        clr = new javax.swing.JLabel();
        admin = new javax.swing.JLabel();
        facilities = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pools = new javax.swing.JLabel();
        restaurant = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                formComponentMoved(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1.png"))); // NOI18N
        icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconMouseClicked(evt);
            }
        });
        jPanel1.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        aboutus.setFont(new java.awt.Font("Cardo", 1, 30)); // NOI18N
        aboutus.setForeground(new java.awt.Color(255, 255, 255));
        aboutus.setText("About Us");
        aboutus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aboutus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutusMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aboutusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aboutusMouseExited(evt);
            }
        });
        jPanel1.add(aboutus, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        clr.setFont(new java.awt.Font("Cardo", 1, 30)); // NOI18N
        clr.setForeground(new java.awt.Color(255, 255, 255));
        clr.setText("Customer Login & Reservation");
        clr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(clr, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, -1, -1));

        admin.setFont(new java.awt.Font("Cardo", 1, 30)); // NOI18N
        admin.setForeground(new java.awt.Color(255, 255, 255));
        admin.setText("Admin");
        admin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 50, -1, -1));

        facilities.setFont(new java.awt.Font("Cardo", 1, 30)); // NOI18N
        facilities.setForeground(new java.awt.Color(255, 255, 255));
        facilities.setText("Facilities");
        facilities.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        facilities.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                facilitiesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                facilitiesMouseExited(evt);
            }
        });
        jPanel1.add(facilities, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 74, 143));
        jPanel2.setPreferredSize(new java.awt.Dimension(137, 133));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pools.setFont(new java.awt.Font("Cardo", 1, 24)); // NOI18N
        pools.setForeground(new java.awt.Color(255, 255, 255));
        pools.setText("Pools");
        pools.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pools.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                poolsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                poolsMouseEntered(evt);
            }
        });
        jPanel2.add(pools, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        restaurant.setFont(new java.awt.Font("Cardo", 1, 24)); // NOI18N
        restaurant.setForeground(new java.awt.Color(255, 255, 255));
        restaurant.setText("Restaurants");
        restaurant.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        restaurant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                restaurantMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                restaurantMouseEntered(evt);
            }
        });
        jPanel2.add(restaurant, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 170, 180));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/close.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, -10, 40, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/navbar.png"))); // NOI18N
        jLabel1.setFocusable(false);
        jLabel1.setMaximumSize(new java.awt.Dimension(1280, 135));
        jLabel1.setMinimumSize(new java.awt.Dimension(1280, 135));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(1280, 135));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 140));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1280, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void facilitiesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facilitiesMouseEntered
        // When they slide through the facilities
        facilities.setForeground(new java.awt.Color(250, 198, 65));
        jPanel2.setVisible(true);
        restaurant.setForeground(new java.awt.Color(255, 255, 255));
        pools.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_facilitiesMouseEntered

    private void facilitiesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facilitiesMouseExited
        facilities.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_facilitiesMouseExited

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        // TODO add your handling code here:
       
        jPanel2.setVisible(true);
        facilities.setForeground(new java.awt.Color(255, 255, 255));
        restaurant.setForeground(new java.awt.Color(255, 255, 255));
        pools.setForeground(new java.awt.Color(255, 255, 255));
        
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
        // TODO add your handling code here:
        jPanel2.setVisible(false);
    }//GEN-LAST:event_jPanel2MouseExited

    private void aboutusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutusMouseClicked
        // About US
        facilities.setForeground(new java.awt.Color(255, 255, 255));
        AboutUs au1 = new AboutUs(); 
        jDesktopPane1.removeAll();
        jDesktopPane1.add(au1).setVisible(true);
    }//GEN-LAST:event_aboutusMouseClicked

    private void poolsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poolsMouseClicked
        jPanel2.setVisible(false);
        facilities.setForeground(new java.awt.Color(250, 198, 65));
        
    }//GEN-LAST:event_poolsMouseClicked

    private void poolsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poolsMouseEntered
        // magiging color orange yung pool the rest is white
        
        facilities.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.show(true);
        pools.setForeground(new java.awt.Color(250, 198, 65));
        restaurant.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_poolsMouseEntered

    private void restaurantMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restaurantMouseEntered
        // TODO add your handling code here:
        
        facilities.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.show(true);
        restaurant.setForeground(new java.awt.Color(250, 198, 65));
        pools.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_restaurantMouseEntered

    
    private void aboutusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutusMouseEntered
        aboutus.setForeground(new java.awt.Color(250, 198, 65));
    }//GEN-LAST:event_aboutusMouseEntered

    private void aboutusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutusMouseExited
        aboutus.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_aboutusMouseExited

    private void formComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentMoved

    private void restaurantMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restaurantMouseClicked
        facilities.setForeground(new java.awt.Color(250, 198, 65));
    }//GEN-LAST:event_restaurantMouseClicked

    private void iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconMouseClicked
        Homepage hp = new Homepage();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(hp).setVisible(true);
    }//GEN-LAST:event_iconMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    
    public static void main(String args[]) {
        
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aboutus;
    private javax.swing.JLabel admin;
    private javax.swing.JLabel clr;
    private javax.swing.JLabel facilities;
    private javax.swing.JLabel icon;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel pools;
    private javax.swing.JLabel restaurant;
    // End of variables declaration//GEN-END:variables
}
