/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

import Hus.Giangvien;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import JDBC.GiangvienModify;
import java.util.List;
import javax.swing.JOptionPane;

public class AdminQuanLyGiangVien extends javax.swing.JPanel {

    File file = new File("ListGiangVien.csv");
    ArrayList<Giangvien> gvList = new ArrayList<>();
    List<Giangvien> giangvienList = new ArrayList<>();
    DefaultTableModel model;
    private int currentIdx;
    Scanner sc;
    Giangvien gv;
    int selectedIndex;

    public AdminQuanLyGiangVien() {
        initComponents();
        this.currentIdx = -1;
        model = (DefaultTableModel) giangVienTable.getModel();
        taoBangGV();
        showGiangVien();
    }

    private void showGiangVien() {
        giangvienList = GiangvienModify.findAll();
        model.setRowCount(0);
        giangvienList.forEach((giangvien) -> {
            model.addRow(new Object[]{giangvien.getID(), giangvien.getName(),
                giangvien.getEmail(), giangvien.getGender()});
        });
    }

    private void displayGiangVien() {
        this.ID.setText(this.gv.getName());
        this.ten.setText(this.gv.getID());
        this.email.setText(this.gv.getEmail());
    }

    public void ghiGV(ArrayList<Giangvien> list) {
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(gvList);
            oos.close();
        } catch (Exception e) {
        }
    }

    boolean ktraTrungMaGv(String a) {
        boolean ok = true;
        for (Giangvien i : giangvienList) {
            if (i.getID().equals(ID.getText())) {
                ok = false;
            }
        }
        return ok;
    }

    boolean ktraTrungEmail(String a) {
        boolean ok = true;
        for (Giangvien i : giangvienList) {
            if (i.getEmail().equals(email.getText())) {
                ok = false;
            }
        }
        return ok;
    }

    public void taoBangGV() {
        DefaultTableModel m = (DefaultTableModel) giangVienTable.getModel();
        m.getDataVector().removeAllElements();
        m.fireTableDataChanged();
        TableRowSorter sorter = new TableRowSorter(m);
        giangVienTable.setRowSorter(sorter);
        for (Giangvien i : gvList) {
            m.addRow(i.toArray());
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        ten = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        nam = new javax.swing.JRadioButton();
        nu = new javax.swing.JRadioButton();
        createButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        giangVienTable = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        searchButton = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        notification = new javax.swing.JLabel();
        dsgv = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Quản lý giảng viên");

        jLabel2.setText("Mã giảng viên");

        jLabel3.setText("Họ và tên");

        jLabel4.setText("Email");

        jLabel6.setText("Giới tính");

        ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                IDKeyPressed(evt);
            }
        });

        buttonGroup1.add(nam);
        nam.setSelected(true);
        nam.setText("Nam");

        buttonGroup1.add(nu);
        nu.setText("Nu");

        createButton.setBackground(new java.awt.Color(0, 255, 51));
        createButton.setForeground(new java.awt.Color(255, 255, 255));
        createButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/new-icon-16.png"))); // NOI18N
        createButton.setText("Tạo mới");
        createButton.setBorderPainted(false);
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        saveButton.setBackground(new java.awt.Color(153, 153, 0));
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Save-icon.png"))); // NOI18N
        saveButton.setText("Lưu");
        saveButton.setBorderPainted(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(0, 153, 255));
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Actions-document-edit-icon-16.png"))); // NOI18N
        updateButton.setText("Cập nhật");
        updateButton.setBorderPainted(false);
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(255, 0, 0));
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Actions-edit-delete-icon-16.png"))); // NOI18N
        deleteButton.setText("Xoá");
        deleteButton.setBorderPainted(false);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        giangVienTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Họ và tên", "Mã giảng viên", "Email", "Giới tính"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        giangVienTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                giangVienTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(giangVienTable);

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search-icon-16.png"))); // NOI18N
        searchButton.setText("Tìm kiếm");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        notification.setForeground(new java.awt.Color(255, 0, 0));
        notification.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        dsgv.setBackground(new java.awt.Color(204, 0, 204));
        dsgv.setForeground(new java.awt.Color(255, 255, 255));
        dsgv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Person-Male-Light-icon-16.png"))); // NOI18N
        dsgv.setText("DSGV");
        dsgv.setBorderPainted(false);
        dsgv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsgvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel6))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(55, 55, 55)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                                    .addComponent(ten)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(nam)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(nu))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(48, 48, 48)
                                        .addComponent(searchButton))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(createButton)
                                .addGap(18, 18, 18)
                                .addComponent(saveButton)
                                .addGap(25, 25, 25)
                                .addComponent(updateButton)
                                .addGap(28, 28, 28)
                                .addComponent(deleteButton)
                                .addGap(18, 18, 18)
                                .addComponent(dsgv, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(230, 230, 230)
                                .addComponent(jLabel1)))
                        .addGap(163, 163, 163))))
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(notification, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchButton)
                            .addComponent(jLabel2))
                        .addGap(4, 4, 4)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nam)
                    .addComponent(nu))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createButton)
                    .addComponent(saveButton)
                    .addComponent(updateButton)
                    .addComponent(deleteButton)
                    .addComponent(dsgv, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(notification, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        DefaultTableModel m = (DefaultTableModel) giangVienTable.getModel();
        m.fireTableDataChanged();
        TableRowSorter sorter = new TableRowSorter(m);
        giangVienTable.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(ID.getText()));
    }//GEN-LAST:event_searchButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        String gender;
        boolean gd;
        if (nam.isSelected()) {
            gender = "nam";
            gd = false;
        } else {
            gender = "nu";
            gd = true;
        }
        try {
            if (ID.getText().equals("") || ten.getText().equals("") || email.getText().equals("")) {
                notification.setText("Bạn không được bỏ sót thông tin nào");
            } else {
                if (ktraTrungMaGv(ID.getText()) && ktraTrungEmail(email.getText())) {
                    notification.setText("Giảng viên đã được tạo");
                    Giangvien gv = new Giangvien(ID.getText(), ten.getText(), email.getText(), gender);
                    gvList.add(gv);
                    taoBangGV();
                    GiangvienModify.insert(gv);
                } else {
                    notification.setText("ID hoặc email bị trùng");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_createButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try {
            FileWriter writer = new FileWriter("ListGiangVien.csv", true);
            for (Giangvien gv : gvList) {
                writer.write(gv.toGiangVien() + "\n");
                notification.setText("Giảng viên đã được lưu");
            }
            writer.close();
        } catch (IOException e) {
            notification.setText("Có lỗi xảy ra");
            e.printStackTrace();
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        try {
            Giangvien gv = new Giangvien();
            gv.setID(ID.getText());
            gv.setName(ten.getText());
            gv.setEmail(email.getText());
            String gender;
            if (nam.isSelected()) {
                gender = "nam";
            } else if (nu.isSelected()) {
                gender = "nu";
            } else {
                gender = null;
            }
            gv.setGender(gender);
            GiangvienModify gvm = new GiangvienModify();
            if (gvm.update(gv)) {
                notification.setText("Giảng viên đã được cập nhật");
            } else {
                notification.setText("Bạn không thể cập nhật");
            }
        } catch (Exception e) {
            e.printStackTrace();
            notification.setText("Lỗi");
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        try {
            GiangvienModify gvm = new GiangvienModify();
            int option = JOptionPane.showConfirmDialog(this, "Bạn có muốn xoá giảng viên này không ?");

            if (option == 0) {
                if (gvm.delete(ID.getText())) {
                    showGiangVien();
                    notification.setText("Giảng viên đã được xoá");
                    ID.setText("");
                    ten.setText("");
                    email.setText("");
                    nam.setSelected(true);
                } else {
                    notification.setText("Bạn không thể xoá giảng viên");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            notification.setText("Lỗi");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void dsgvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dsgvActionPerformed
        // TODO add your handling code here:
        this.removeAll();
        new DSGV().setVisible(true);
    }//GEN-LAST:event_dsgvActionPerformed

    private void IDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDKeyPressed
        DefaultTableModel m = (DefaultTableModel) giangVienTable.getModel();
        m.fireTableDataChanged();
        TableRowSorter sorter = new TableRowSorter(m);
        giangVienTable.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(ID.getText()));
    }//GEN-LAST:event_IDKeyPressed

    private void giangVienTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_giangVienTableMouseClicked
        try {
            int row = giangVienTable.getSelectedRow();
            if (row >= 0) {
                String id = (String) giangVienTable.getValueAt(row, 0);
                GiangvienModify gvm = new GiangvienModify();
                Giangvien gv = gvm.findByID(id);
                if (gv != null) {
                    ID.setText(gv.getID());
                    ten.setText(gv.getName());
                    email.setText(gv.getEmail());
                if(gv.getGender().equals("nam")){
                    nam.setSelected(true);
                }
                else {
                    nu.setSelected(true);
                }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            notification.setText("Lỗi");
        }    }//GEN-LAST:event_giangVienTableMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton createButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton dsgv;
    private javax.swing.JTextField email;
    private javax.swing.JTable giangVienTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JRadioButton nam;
    private javax.swing.JLabel notification;
    private javax.swing.JRadioButton nu;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField ten;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
