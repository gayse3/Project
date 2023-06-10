package resort;

import java.awt.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class AboutUs extends javax.swing.JInternalFrame {

    
    public AboutUs() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null); 
        scroll();

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 0));
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(1280, 580));
        setMinimumSize(new java.awt.Dimension(1280, 580));
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(1280, 580));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel1.setFocusable(false);
        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 1160));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 1160));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 1160));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Leelawadee", 0, 29)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("88 Hot Spring Resort was opened in 2004 and is located at the base of Mount");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 810, -1, -1));

        jLabel5.setFont(new java.awt.Font("Leelawadee", 0, 29)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Makiling, Calamba, Laguna, Philippines. This resort was awarded by the");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 840, -1, -1));

        jLabel6.setFont(new java.awt.Font("Leelawadee", 0, 29)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("department of tourism as the best resort in Laguna in 2007. This 7-hectare resort");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 870, -1, -1));

        jLabel7.setFont(new java.awt.Font("Leelawadee", 0, 29)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("is the number one weekend getaway natural hot spring destination from Metro");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 900, -1, -1));

        jLabel8.setFont(new java.awt.Font("Leelawadee", 0, 29)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Manila only one hour away owned by Korean national and boasts 11 outdoor");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 930, -1, -1));

        jLabel9.setFont(new java.awt.Font("Leelawadee", 0, 29)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("pools with naturally heated spring water coming down from the mountain of");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 960, -1, -1));

        jLabel10.setFont(new java.awt.Font("Leelawadee", 0, 29)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Maria Makiling. Those are mineral rich baths which boost circulation, reduce");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 990, -1, -1));

        jLabel11.setFont(new java.awt.Font("Leelawadee", 0, 29)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("stress, promote sleep, relieve pain and believed to cure several skin diseases. All");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 1020, -1, -1));

        jLabel12.setFont(new java.awt.Font("Leelawadee", 0, 29)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("surrounded by a well manicured landscape of lush greenery and coconut trees.");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 1050, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Leelawadee", 1, 41)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome To 88 Hotspring Resort!");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 650, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/entrance.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1280, 580));
        jLabel1.setMinimumSize(new java.awt.Dimension(1280, 580));
        jLabel1.setPreferredSize(new java.awt.Dimension(1280, 580));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/mga puno.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 1280, 580));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void scroll() 
    {
        jScrollPane1.setWheelScrollingEnabled(false);
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(30);

        jPanel1.addMouseWheelListener((java.awt.event.MouseWheelEvent evt) -> {
            Point scroll = jScrollPane1.getViewport().getViewPosition();
            int dy = -evt.getWheelRotation() * -30;
            int maxScroll = jScrollPane1.getVerticalScrollBar().getMaximum() - jScrollPane1.getVerticalScrollBar().getModel().getExtent();
            if (scroll.y + dy < 0) { // if scrolling would go beyond the top of the panel
                dy = -scroll.y; // adjust dy to only scroll to the top
            } else if (scroll.y + dy > maxScroll) { // if scrolling would go beyond the bottom of the panel
                dy = maxScroll - scroll.y; // adjust dy to only scroll to the bottom
            }
            scroll.y += dy;
            jScrollPane1.getViewport().setViewPosition(scroll);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
