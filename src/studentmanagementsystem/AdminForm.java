/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author admin
 */
public class AdminForm extends javax.swing.JFrame {
    
    private QuanLySinhVienPanel quanlysinhvien;
    private QuanLyGiangVienPanel quanlygiangvien;
    private QuanLyHocPhanPanel quanlyhocphan;
    private AdminHuongDanSuDungPanel huongdansudung;

    /**
     * Creates new form AdminForm
     */
    public AdminForm() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(WIDTH, HEIGHT);
        this.pack();
        this.setFocusable(true);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        MainBoardTabbedPane = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        quanLySinhVienButton = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        quanLyGiangVienButton = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        quanLyMonHocButton = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        huongDanSuDungButton = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        gioiThieuButton = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout-icon-32.png"))); // NOI18N
        jButton1.setText("Đăng xuất");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jMenu2.setText("Quản lý");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        quanLySinhVienButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/10207-man-student-light-skin-tone-icon-16.png"))); // NOI18N
        quanLySinhVienButton.setText("Quản lý sinh viên");
        quanLySinhVienButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quanLySinhVienButtonActionPerformed(evt);
            }
        });
        jMenu2.add(quanLySinhVienButton);
        jMenu2.add(jSeparator3);

        quanLyGiangVienButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Person-Male-Light-icon-16.png"))); // NOI18N
        quanLyGiangVienButton.setText("Quản lý giảng viên");
        quanLyGiangVienButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quanLyGiangVienButtonActionPerformed(evt);
            }
        });
        jMenu2.add(quanLyGiangVienButton);
        jMenu2.add(jSeparator1);

        quanLyMonHocButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Actions-document-edit-icon-16.png"))); // NOI18N
        quanLyMonHocButton.setText("Quản lý môn học");
        quanLyMonHocButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quanLyMonHocButtonActionPerformed(evt);
            }
        });
        jMenu2.add(quanLyMonHocButton);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Trợ giúp");

        huongDanSuDungButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Help-icon-16.png"))); // NOI18N
        huongDanSuDungButton.setText("Hướng dẫn sử dụng");
        huongDanSuDungButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huongDanSuDungButtonActionPerformed(evt);
            }
        });
        jMenu3.add(huongDanSuDungButton);
        jMenu3.add(jSeparator4);

        gioiThieuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Actions-help-about-icon-16.png"))); // NOI18N
        gioiThieuButton.setText("Giới thiệu");
        gioiThieuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gioiThieuButtonActionPerformed(evt);
            }
        });
        jMenu3.add(gioiThieuButton);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainBoardTabbedPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainBoardTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void quanLySinhVienButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quanLySinhVienButtonActionPerformed
        if (quanlysinhvien == null) {
            quanlysinhvien = new QuanLySinhVienPanel();
//        ImageIcon icon = new ImageIcon(getClass().getResource(name));
            MainBoardTabbedPane.addTab("Quản lý sinh viên", quanlysinhvien);
        }
        MainBoardTabbedPane.setSelectedComponent(quanlysinhvien);
    }//GEN-LAST:event_quanLySinhVienButtonActionPerformed

    private void quanLyGiangVienButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quanLyGiangVienButtonActionPerformed
        if (quanlygiangvien == null) {
            quanlygiangvien = new QuanLyGiangVienPanel();
//        ImageIcon icon = new ImageIcon(getClass().getResource(name));
            MainBoardTabbedPane.addTab("Quản lý giảng viên", quanlygiangvien);
        }
        MainBoardTabbedPane.setSelectedComponent(quanlygiangvien);
    }//GEN-LAST:event_quanLyGiangVienButtonActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void quanLyMonHocButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quanLyMonHocButtonActionPerformed
        if (quanlyhocphan == null) {
            quanlyhocphan = new QuanLyHocPhanPanel();
//        ImageIcon icon = new ImageIcon(getClass().getResource(name));
            MainBoardTabbedPane.addTab("Quản lý môn học", quanlyhocphan);
        }
        MainBoardTabbedPane.setSelectedComponent(quanlyhocphan);
    }//GEN-LAST:event_quanLyMonHocButtonActionPerformed

    private void huongDanSuDungButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huongDanSuDungButtonActionPerformed
        if (huongdansudung == null){
            huongdansudung = new AdminHuongDanSuDungPanel();
            MainBoardTabbedPane.addTab("Hướng dẫn sử dụng", huongdansudung);
        }
        MainBoardTabbedPane.setSelectedComponent(huongdansudung);
    }//GEN-LAST:event_huongDanSuDungButtonActionPerformed

    private void gioiThieuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gioiThieuButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gioiThieuButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane MainBoardTabbedPane;
    private javax.swing.JMenuItem gioiThieuButton;
    private javax.swing.JMenuItem huongDanSuDungButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem quanLyGiangVienButton;
    private javax.swing.JMenuItem quanLyMonHocButton;
    private javax.swing.JMenuItem quanLySinhVienButton;
    // End of variables declaration//GEN-END:variables
}
