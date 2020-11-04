/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.ulpgc.imagecolorfilter;

import java.awt.image.BufferedImage;
import javax.swing.Icon;

/**
 *
 * @author Cristina and Gabriel
 */
public class ImageColorFilter extends javax.swing.JFrame {

    /**
     * Creates new form ImageColorFilter
     */
    public ImageColorFilter() {
        initComponents();
        redCheckBox.setSelected(true);
        greenCheckBox.setSelected(true);
        blueCheckBox.setSelected(true);
        allCheckBox.setSelected(true);
        topLeft.setSelected(false);
        topRight.setSelected(false);
        downLeft.setSelected(false);
        downRight.setSelected(false);

    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoPositionGroup = new javax.swing.ButtonGroup();
        general = new javax.swing.JPanel();
        title = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        setupPanel = new javax.swing.JPanel();
        allCheckBox = new javax.swing.JCheckBox();
        redCheckBox = new javax.swing.JCheckBox();
        greenCheckBox = new javax.swing.JCheckBox();
        blueCheckBox = new javax.swing.JCheckBox();
        previewLabel = new javax.swing.JLabel();
        previewPanel = new javax.swing.JPanel();
        preview1 = new es.ulpgc.imagecolorfilter.preview();
        apply = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        line2 = new javax.swing.JPanel();
        topRight = new javax.swing.JRadioButton();
        topLeft = new javax.swing.JRadioButton();
        downRight = new javax.swing.JRadioButton();
        downLeft = new javax.swing.JRadioButton();
        logoText = new javax.swing.JLabel();
        RGBText = new javax.swing.JLabel();
        line = new javax.swing.JPanel();
        line3 = new javax.swing.JPanel();
        imagePanel = new javax.swing.JPanel();
        canva2 = new es.ulpgc.imagecolorfilter.canva();
        authores = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        general.setBackground(new java.awt.Color(73, 69, 74));

        title.setBackground(new java.awt.Color(73, 69, 74));

        titleLabel.setBackground(new java.awt.Color(204, 204, 204));
        titleLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/title.png"))); // NOI18N

        javax.swing.GroupLayout titleLayout = new javax.swing.GroupLayout(title);
        title.setLayout(titleLayout);
        titleLayout.setHorizontalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        titleLayout.setVerticalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setupPanel.setBackground(new java.awt.Color(73, 69, 74));

        allCheckBox.setBackground(new java.awt.Color(73, 69, 74));
        allCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        allCheckBox.setText("All");
        allCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allCheckBoxActionPerformed(evt);
            }
        });

        redCheckBox.setBackground(new java.awt.Color(73, 69, 74));
        redCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        redCheckBox.setText("Red");
        redCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redCheckBoxActionPerformed(evt);
            }
        });

        greenCheckBox.setBackground(new java.awt.Color(73, 69, 74));
        greenCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        greenCheckBox.setText("Green");
        greenCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenCheckBoxActionPerformed(evt);
            }
        });

        blueCheckBox.setBackground(new java.awt.Color(73, 69, 74));
        blueCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        blueCheckBox.setText("Blue");
        blueCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueCheckBoxActionPerformed(evt);
            }
        });

        previewLabel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        previewLabel.setForeground(new java.awt.Color(255, 255, 255));
        previewLabel.setText("Preview:");

        previewPanel.setBackground(new java.awt.Color(73, 69, 74));
        previewPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout preview1Layout = new javax.swing.GroupLayout(preview1);
        preview1.setLayout(preview1Layout);
        preview1Layout.setHorizontalGroup(
            preview1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 166, Short.MAX_VALUE)
        );
        preview1Layout.setVerticalGroup(
            preview1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );

        previewPanel.add(preview1, "card2");

        apply.setText("APPLY");
        apply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyActionPerformed(evt);
            }
        });

        refresh.setText("REFRESH");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        line2.setBackground(new java.awt.Color(255, 255, 255));
        line2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout line2Layout = new javax.swing.GroupLayout(line2);
        line2.setLayout(line2Layout);
        line2Layout.setHorizontalGroup(
            line2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        line2Layout.setVerticalGroup(
            line2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        topRight.setBackground(new java.awt.Color(73, 69, 74));
        logoPositionGroup.add(topRight);
        topRight.setForeground(new java.awt.Color(255, 255, 255));
        topRight.setText("Top-Right");
        topRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topRightActionPerformed(evt);
            }
        });

        topLeft.setBackground(new java.awt.Color(73, 69, 74));
        logoPositionGroup.add(topLeft);
        topLeft.setForeground(new java.awt.Color(255, 255, 255));
        topLeft.setText("Top-Left");
        topLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topLeftActionPerformed(evt);
            }
        });

        downRight.setBackground(new java.awt.Color(73, 69, 74));
        logoPositionGroup.add(downRight);
        downRight.setForeground(new java.awt.Color(255, 255, 255));
        downRight.setText("Down-Right");
        downRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downRightActionPerformed(evt);
            }
        });

        downLeft.setBackground(new java.awt.Color(73, 69, 74));
        logoPositionGroup.add(downLeft);
        downLeft.setForeground(new java.awt.Color(255, 255, 255));
        downLeft.setText("Down-Left");
        downLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downLeftActionPerformed(evt);
            }
        });

        logoText.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        logoText.setForeground(new java.awt.Color(255, 255, 255));
        logoText.setText("Set logo position:");

        RGBText.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        RGBText.setForeground(new java.awt.Color(255, 255, 255));
        RGBText.setText("Set RGB color filter:");

        javax.swing.GroupLayout setupPanelLayout = new javax.swing.GroupLayout(setupPanel);
        setupPanel.setLayout(setupPanelLayout);
        setupPanelLayout.setHorizontalGroup(
            setupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(line2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(setupPanelLayout.createSequentialGroup()
                .addGroup(setupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setupPanelLayout.createSequentialGroup()
                        .addGroup(setupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(setupPanelLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(setupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RGBText)
                                    .addComponent(blueCheckBox)
                                    .addComponent(greenCheckBox)
                                    .addComponent(redCheckBox)
                                    .addComponent(allCheckBox)
                                    .addComponent(logoText)
                                    .addComponent(downLeft)
                                    .addComponent(downRight)
                                    .addComponent(topLeft)
                                    .addComponent(topRight)))
                            .addGroup(setupPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(previewLabel))
                            .addGroup(setupPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(apply, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(refresh)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(setupPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(previewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        setupPanelLayout.setVerticalGroup(
            setupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setupPanelLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(RGBText)
                .addGap(4, 4, 4)
                .addComponent(allCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(redCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(greenCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(blueCheckBox)
                .addGap(21, 21, 21)
                .addComponent(previewLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(previewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(setupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apply)
                    .addComponent(refresh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(line2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logoText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(topRight)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(topLeft)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(downRight)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(downLeft))
        );

        line.setBackground(new java.awt.Color(255, 255, 255));
        line.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout lineLayout = new javax.swing.GroupLayout(line);
        line.setLayout(lineLayout);
        lineLayout.setHorizontalGroup(
            lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lineLayout.setVerticalGroup(
            lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        line3.setBackground(new java.awt.Color(255, 255, 255));
        line3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout line3Layout = new javax.swing.GroupLayout(line3);
        line3.setLayout(line3Layout);
        line3Layout.setHorizontalGroup(
            line3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        line3Layout.setVerticalGroup(
            line3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        imagePanel.setBackground(new java.awt.Color(73, 69, 74));

        javax.swing.GroupLayout canva2Layout = new javax.swing.GroupLayout(canva2);
        canva2.setLayout(canva2Layout);
        canva2Layout.setHorizontalGroup(
            canva2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        canva2Layout.setVerticalGroup(
            canva2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout imagePanelLayout = new javax.swing.GroupLayout(imagePanel);
        imagePanel.setLayout(imagePanelLayout);
        imagePanelLayout.setHorizontalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagePanelLayout.createSequentialGroup()
                .addComponent(canva2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        imagePanelLayout.setVerticalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(canva2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        authores.setBackground(new java.awt.Color(73, 69, 74));
        authores.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Athores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/authores.png"))); // NOI18N

        javax.swing.GroupLayout authoresLayout = new javax.swing.GroupLayout(authores);
        authores.setLayout(authoresLayout);
        authoresLayout.setHorizontalGroup(
            authoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(authoresLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        authoresLayout.setVerticalGroup(
            authoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout generalLayout = new javax.swing.GroupLayout(general);
        general.setLayout(generalLayout);
        generalLayout.setHorizontalGroup(
            generalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generalLayout.createSequentialGroup()
                .addComponent(setupPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(line3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(line, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(generalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(authores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        generalLayout.setVerticalGroup(
            generalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generalLayout.createSequentialGroup()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(generalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(line3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(setupPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(authores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(general, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void allCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allCheckBoxActionPerformed
        if(!allCheckBox.isSelected()){
            allCheckBox.setSelected(true);
        }else{
            redCheckBox.setSelected(true);
            greenCheckBox.setSelected(true);
            blueCheckBox.setSelected(true);
        }
        preview1.applyFilter();
    }//GEN-LAST:event_allCheckBoxActionPerformed

    private void redCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redCheckBoxActionPerformed
        if(!redCheckBox.isSelected() && !blueCheckBox.isSelected() && !greenCheckBox.isSelected()){
            redCheckBox.setSelected(true);
        }else if(redCheckBox.isSelected() && blueCheckBox.isSelected() && greenCheckBox.isSelected()){
            allCheckBox.setSelected(true);
        }else if(allCheckBox.isSelected()){
            allCheckBox.setSelected(false);
        }
        preview1.applyFilter();
    }//GEN-LAST:event_redCheckBoxActionPerformed

    private void greenCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenCheckBoxActionPerformed
        if(!redCheckBox.isSelected() && !blueCheckBox.isSelected() && !greenCheckBox.isSelected()){
            greenCheckBox.setSelected(true);
        }else if(redCheckBox.isSelected() && blueCheckBox.isSelected() && greenCheckBox.isSelected()){
            allCheckBox.setSelected(true);
        }else if(allCheckBox.isSelected()){
            allCheckBox.setSelected(false);
        }
        preview1.applyFilter();

    }//GEN-LAST:event_greenCheckBoxActionPerformed

    private void blueCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueCheckBoxActionPerformed
        if(!redCheckBox.isSelected() && !blueCheckBox.isSelected() && !greenCheckBox.isSelected()){
            blueCheckBox.setSelected(true);
        }else if(redCheckBox.isSelected() && blueCheckBox.isSelected() && greenCheckBox.isSelected()){
            allCheckBox.setSelected(true);
        }else if(allCheckBox.isSelected()){
            allCheckBox.setSelected(false);
        }
        preview1.applyFilter();
    }//GEN-LAST:event_blueCheckBoxActionPerformed

    private void applyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyActionPerformed
        canva2.applyFilter();
    }//GEN-LAST:event_applyActionPerformed

    private void topRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topRightActionPerformed
        canva2.setLogoPosition(canva2.getWidth()-100,0);
    }//GEN-LAST:event_topRightActionPerformed

    private void topLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topLeftActionPerformed
        canva2.setLogoPosition(0,0);
    }//GEN-LAST:event_topLeftActionPerformed

    private void downRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downRightActionPerformed
        canva2.setLogoPosition(canva2.getWidth()-100,canva2.getHeight()-66);
    }//GEN-LAST:event_downRightActionPerformed

    private void downLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downLeftActionPerformed
        canva2.setLogoPosition(0, canva2.getHeight()-66);
    }//GEN-LAST:event_downLeftActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        allCheckBox.setSelected(true);
        redCheckBox.setSelected(true);
        greenCheckBox.setSelected(true);
        blueCheckBox.setSelected(true);
        preview1.previewInitialStatus(true,true,true);
    }//GEN-LAST:event_refreshActionPerformed

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
            java.util.logging.Logger.getLogger(ImageColorFilter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImageColorFilter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImageColorFilter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImageColorFilter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImageColorFilter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RGBText;
    private javax.swing.JCheckBox allCheckBox;
    private javax.swing.JButton apply;
    private javax.swing.JPanel authores;
    protected static javax.swing.JCheckBox blueCheckBox;
    private es.ulpgc.imagecolorfilter.canva canva2;
    private javax.swing.JRadioButton downLeft;
    private javax.swing.JRadioButton downRight;
    private javax.swing.JPanel general;
    protected static javax.swing.JCheckBox greenCheckBox;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel line;
    private javax.swing.JPanel line2;
    private javax.swing.JPanel line3;
    private javax.swing.ButtonGroup logoPositionGroup;
    private javax.swing.JLabel logoText;
    private es.ulpgc.imagecolorfilter.preview preview1;
    private javax.swing.JLabel previewLabel;
    private javax.swing.JPanel previewPanel;
    protected static javax.swing.JCheckBox redCheckBox;
    private javax.swing.JButton refresh;
    private javax.swing.JPanel setupPanel;
    private javax.swing.JPanel title;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JRadioButton topLeft;
    private javax.swing.JRadioButton topRight;
    // End of variables declaration//GEN-END:variables
}
