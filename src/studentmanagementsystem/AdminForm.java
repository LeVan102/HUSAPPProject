/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class AdminForm extends javax.swing.JFrame implements Runnable{

    /**
     * Creates new form AdminForm
     */
    private AdminQuanLySinhVien quanlysinhvien;
    private AdminQuanLyGiangVien quanlygiangvien;
    private AdminQuanLyHocPhan quanlyhocphan;
    private AdminQuanLyDiem quanlydiem;
    int hour, second, minute, day, month, year;
    String timestr, yearstr;

    private void showPanel(JPanel panel) {
        JPanel childPanel = new JPanel();
        childPanel = panel;
        adminChildPanel.removeAll();
        adminChildPanel.add(childPanel);
        adminChildPanel.validate();
    }

    public AdminForm() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setFocusable(true);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        Thread t = new Thread(this);
        t.start();
    }
    @Override
    public void run(){
        while(true){
            try{
                Calendar c = Calendar.getInstance();
                hour = c.get(Calendar.HOUR_OF_DAY);
                if(hour>12)
                    hour = hour -12;
                minute = c.get(Calendar.MINUTE);
                second = c.get(Calendar.SECOND);
                year = c.get(Calendar.YEAR);
                month = c.get(Calendar.MONTH);
                day = c.get(Calendar.DAY_OF_MONTH);
                SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
                SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                Date dat = c.getTime();
                timestr = sdf.format(dat);
                yearstr = df.format(dat);
                time.setText(timestr);
                date.setText(yearstr);
            }catch(Exception e){
            }
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

        jToolBar1 = new javax.swing.JToolBar();
        logOutButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        quanLySinhVienButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        quanLyGiangVienButton = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        quanLyHocPhanButton = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        quanLyDiem = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        gioiThieuButton = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        adminChildPanel = new javax.swing.JPanel();
        time = new javax.swing.JLabel();
        date = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        logOutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout-icon-32.png"))); // NOI18N
        logOutButton.setText("Đăng xuất");
        logOutButton.setFocusable(false);
        logOutButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logOutButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(logOutButton);
        jToolBar1.add(jSeparator1);

        quanLySinhVienButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/10207-man-student-light-skin-tone-icon-32.png"))); // NOI18N
        quanLySinhVienButton.setText("Quản lý sinh viên");
        quanLySinhVienButton.setFocusable(false);
        quanLySinhVienButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        quanLySinhVienButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        quanLySinhVienButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quanLySinhVienButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(quanLySinhVienButton);
        jToolBar1.add(jSeparator2);

        quanLyGiangVienButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Person-Male-Light-icon-24.png"))); // NOI18N
        quanLyGiangVienButton.setText("Quản lý giảng viên");
        quanLyGiangVienButton.setFocusable(false);
        quanLyGiangVienButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        quanLyGiangVienButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        quanLyGiangVienButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quanLyGiangVienButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(quanLyGiangVienButton);
        jToolBar1.add(jSeparator3);

        quanLyHocPhanButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Red book.png"))); // NOI18N
        quanLyHocPhanButton.setText("Quản lý học phần");
        quanLyHocPhanButton.setFocusable(false);
        quanLyHocPhanButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        quanLyHocPhanButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        quanLyHocPhanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quanLyHocPhanButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(quanLyHocPhanButton);
        jToolBar1.add(jSeparator4);

        quanLyDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/gpa-icon-32.png"))); // NOI18N
        quanLyDiem.setText("Quản lý điểm");
        quanLyDiem.setFocusable(false);
        quanLyDiem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        quanLyDiem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        quanLyDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quanLyDiemActionPerformed(evt);
            }
        });
        jToolBar1.add(quanLyDiem);
        jToolBar1.add(jSeparator5);

        gioiThieuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Actions-help-about-icon-32.png"))); // NOI18N
        gioiThieuButton.setText("Giới thiệu");
        gioiThieuButton.setFocusable(false);
        gioiThieuButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gioiThieuButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gioiThieuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gioiThieuButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(gioiThieuButton);
        jToolBar1.add(jSeparator7);

        adminChildPanel.setLayout(new java.awt.BorderLayout());

        time.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N

        date.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminChildPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(time, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminChildPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        dispose();
        LoginFrame lf = new LoginFrame();
        lf.setVisible(true);
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void quanLySinhVienButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quanLySinhVienButtonActionPerformed
        showPanel(quanlysinhvien = new AdminQuanLySinhVien());
    }//GEN-LAST:event_quanLySinhVienButtonActionPerformed

    private void quanLyGiangVienButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quanLyGiangVienButtonActionPerformed
        showPanel(quanlygiangvien = new AdminQuanLyGiangVien());
    }//GEN-LAST:event_quanLyGiangVienButtonActionPerformed

    private void quanLyHocPhanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quanLyHocPhanButtonActionPerformed
        showPanel(quanlyhocphan = new AdminQuanLyHocPhan());
    }//GEN-LAST:event_quanLyHocPhanButtonActionPerformed

    private void quanLyDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quanLyDiemActionPerformed
        showPanel(quanlydiem = new AdminQuanLyDiem());
    }//GEN-LAST:event_quanLyDiemActionPerformed

    private void gioiThieuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gioiThieuButtonActionPerformed
        JOptionPane.showMessageDialog(adminChildPanel, "Made by Lê Sỹ Văn, Nguyễn Triệu Vương and "
                + "Luyện Thị Quyên.\nNo copyright !");
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adminChildPanel;
    private javax.swing.JLabel date;
    private javax.swing.JButton gioiThieuButton;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton quanLyDiem;
    private javax.swing.JButton quanLyGiangVienButton;
    private javax.swing.JButton quanLyHocPhanButton;
    private javax.swing.JButton quanLySinhVienButton;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
