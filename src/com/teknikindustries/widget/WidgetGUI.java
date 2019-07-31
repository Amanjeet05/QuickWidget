package com.teknikindustries.widget;

import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class WidgetGUI extends javax.swing.JDialog 
{    
    int width = (Toolkit.getDefaultToolkit().getScreenSize().width/2)-140;
    int xMouse;
    int yMouse;
    LaunchBrawser LB = new LaunchBrawser();
    public WidgetGUI(java.awt.Frame parent, boolean modal) 
    {
        super(parent, modal);
        initComponents();
        //set new start location
        this.setLocation(width, 20);
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        YouTube = new javax.swing.JLabel();
        Amazon = new javax.swing.JLabel();
        Twitter = new javax.swing.JLabel();
        Facebook = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Widget");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        YouTube.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/teknikindustries/widget/YouTube.png"))); // NOI18N
        YouTube.setAutoscrolls(true);
        YouTube.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        YouTube.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                YouTubeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                YouTubeMouseReleased(evt);
            }
        });
        getContentPane().add(YouTube, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 13, 54, 54));

        Amazon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/teknikindustries/widget/Amazon.png"))); // NOI18N
        Amazon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Amazon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AmazonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AmazonMouseReleased(evt);
            }
        });
        getContentPane().add(Amazon, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 13, 54, 54));

        Twitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/teknikindustries/widget/Twitter.png"))); // NOI18N
        Twitter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Twitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TwitterMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TwitterMouseReleased(evt);
            }
        });
        getContentPane().add(Twitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 13, 54, 54));

        Facebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/teknikindustries/widget/Facebook.png"))); // NOI18N
        Facebook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Facebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FacebookMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                FacebookMouseReleased(evt);
            }
        });
        getContentPane().add(Facebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 13, 54, 54));

        Background.setBackground(new java.awt.Color(22, 160, 133));
        Background.setOpaque(true);
        Background.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BackgroundMouseDragged(evt);
            }
        });
        Background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BackgroundMousePressed(evt);
            }
        });
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 75));
        Background.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FacebookMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FacebookMouseReleased
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("Facebook.png"));
        Facebook.setIcon(II);
        LB.LaunchFacebook();
    }//GEN-LAST:event_FacebookMouseReleased

    private void BackgroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_BackgroundMousePressed

    private void BackgroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_BackgroundMouseDragged

    private void FacebookMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FacebookMousePressed
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("FacebookPressed.png"));
        Facebook.setIcon(II);
    }//GEN-LAST:event_FacebookMousePressed

    private void TwitterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TwitterMousePressed
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("TwitterPressed.png"));
        Twitter.setIcon(II);
    }//GEN-LAST:event_TwitterMousePressed

    private void TwitterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TwitterMouseReleased
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("Twitter.png"));
        Twitter.setIcon(II);
        LB.LaunchTwitter();
    }//GEN-LAST:event_TwitterMouseReleased

    private void AmazonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AmazonMousePressed
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("AmazonPressed.png"));
        Amazon.setIcon(II);
    }//GEN-LAST:event_AmazonMousePressed

    private void AmazonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AmazonMouseReleased
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("Amazon.png"));
        Amazon.setIcon(II);
        LB.LaunchAmazon();
    }//GEN-LAST:event_AmazonMouseReleased

    private void YouTubeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YouTubeMousePressed
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("YouTubePressed.png"));
        YouTube.setIcon(II);
    }//GEN-LAST:event_YouTubeMousePressed

    private void YouTubeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YouTubeMouseReleased
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("YouTube.png"));
        YouTube.setIcon(II);
        LB.LaunchYoutube();
    }//GEN-LAST:event_YouTubeMouseReleased

    public static void main(String args[]) 
    {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WidgetGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WidgetGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WidgetGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WidgetGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run() {
                WidgetGUI dialog = new WidgetGUI(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() 
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) 
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Amazon;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Facebook;
    private javax.swing.JLabel Twitter;
    private javax.swing.JLabel YouTube;
    // End of variables declaration//GEN-END:variables
}