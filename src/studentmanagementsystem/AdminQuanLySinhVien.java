/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

import Hus.Sinhvien;
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
import JDBC.SinhvienModify;
import java.util.List;
import javax.swing.JOptionPane;

public class AdminQuanLySinhVien extends javax.swing.JPanel {

    File file = new File("ListSinhVien.csv");
    ArrayList<Sinhvien> svList = new ArrayList<>();
    List<Sinhvien> sinhvienList = new ArrayList<>();
    DefaultTableModel model;
    private int currentIdx;
    Scanner sc;
    Sinhvien sv;
    int selectedIndex;

    public AdminQuanLySinhVien() {
        initComponents();
        this.currentIdx = -1;
        model = (DefaultTableModel) sinhVienTable.getModel();
        taoBangSV();
        showSinhVien();
    }

    private void displaySinhVien() {
        ID.setText(this.sv.getID());
        ten.setText(this.sv.getName());
        email.setText(this.sv.getEmail());
        lopHocCheckBox.setSelectedItem(this.sv.getLophoc());
    }

    public void ghiSV(ArrayList<Sinhvien> list) {
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(svList);
            oos.close();
        } catch (Exception e) {
        }
    }

    boolean ktraTrungMaSv(String a) {
        boolean ok = true;
        for (Sinhvien i : sinhvienList) {
            if (i.getID().equals(ID.getText())) {
                ok = false;
            }
        }
        return ok;
    }

    boolean ktraTrungEmail(String a) {
        boolean ok = true;
        for (Sinhvien i : sinhvienList) {
            if (i.getEmail().equals(email.getText())) {
                ok = false;
            }
        }
        return ok;
    }

    private void showSinhVien() {
        sinhvienList = SinhvienModify.findAll();
        model.setRowCount(0);
        sinhvienList.forEach((sinhvien) -> {
            model.addRow(new Object[]{sinhvien.getID(), sinhvien.getName(),
                sinhvien.getEmail(), sinhvien.getGender(), sinhvien.getLophoc()});
        });
    }

    public void taoBangSV() {
        DefaultTableModel m = (DefaultTableModel) sinhVienTable.getModel();
        m.getDataVector().removeAllElements();
        m.fireTableDataChanged();
        TableRowSorter sorter = new TableRowSorter(m);
        sinhVienTable.setRowSorter(sorter);
        for (Sinhvien i : svList) {
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
        sinhVienTable = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        searchButton = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        notification = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dssv = new javax.swing.JButton();
        lopHocCheckBox = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Quản lý sinh viên");

        jLabel2.setText("Mã sinh viên");

        jLabel3.setText("Họ và tên");

        jLabel4.setText("Email");

        jLabel6.setText("Giới tính");

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

        sinhVienTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sinh viên", "Họ và tên", "Email", "Giới tính", "Lớp học"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        sinhVienTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sinhVienTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(sinhVienTable);

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search-icon-16.png"))); // NOI18N
        searchButton.setText("Tìm kiếm");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        notification.setForeground(new java.awt.Color(255, 0, 0));
        notification.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel7.setText("Lớp học");

        dssv.setBackground(new java.awt.Color(204, 0, 204));
        dssv.setForeground(new java.awt.Color(255, 255, 255));
        dssv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Person-Male-Light-icon-16.png"))); // NOI18N
        dssv.setText("DSSV");
        dssv.setBorderPainted(false);
        dssv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dssvActionPerformed(evt);
            }
        });

        lopHocCheckBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ky thuat dien tu va tin hoc", "May tinh va khoa hoc thong tin", "Khoa hoc du lieu", "Toan-Tin" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(createButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(saveButton)
                                        .addGap(25, 25, 25)
                                        .addComponent(updateButton)
                                        .addGap(28, 28, 28)
                                        .addComponent(deleteButton)))
                                .addGap(18, 18, 18)
                                .addComponent(dssv, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lopHocCheckBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                            .addComponent(ten)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(nam)
                                                .addGap(18, 18, 18)
                                                .addComponent(nu)))))
                                .addGap(48, 48, 48)
                                .addComponent(searchButton)))
                        .addGap(163, 164, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(197, 197, 197)
                                .addComponent(notification, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(249, 249, 249)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lopHocCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createButton)
                    .addComponent(saveButton)
                    .addComponent(updateButton)
                    .addComponent(deleteButton)
                    .addComponent(dssv, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(notification, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        DefaultTableModel m = (DefaultTableModel) sinhVienTable.getModel();
        m.fireTableDataChanged();
        TableRowSorter sorter = new TableRowSorter(m);
        sinhVienTable.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(ID.getText()));
    }//GEN-LAST:event_searchButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        String gender;
        if (nam.isSelected()) {
            gender = "nam";
        } else if (nu.isSelected()) {
            gender = "nu";
        } else {
            gender = "khong xac dinh";
        }
        try {
            if (ID.getText().equals("") || ten.getText().equals("") || email.getText().equals("")) {
                notification.setText("Bạn không được bỏ sót thông tin nào");
            } else {
                if (ktraTrungMaSv(ID.getText()) && ktraTrungEmail(email.getText())) {
                    notification.setText("Sinh viên đã được tạo");
                    Sinhvien a = new Sinhvien(ID.getText(), ten.getText(), email.getText(), gender,
                            lopHocCheckBox.getSelectedItem().toString());
                    svList.add(a);
                    taoBangSV();
                    SinhvienModify.insert(a);
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
            FileWriter writer = new FileWriter("ListSinhVien.csv", true);
            for (Sinhvien sv : svList) {
                writer.write(sv.toSinhVien() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            notification.setText("Có lỗi xảy ra");
            e.printStackTrace();
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        try {
            Sinhvien sv = new Sinhvien();
            sv.setID(ID.getText());
            sv.setName(ten.getText());
            sv.setEmail(email.getText());
            String gender;
            if (nam.isSelected()) {
                gender = "nam";
            } else if (nu.isSelected()) {
                gender = "nu";
            } else {
                gender = null;
            }
            sv.setGender(gender);
            sv.setLophoc(lopHocCheckBox.getSelectedItem().toString());
            sv.setID(ID.getText());
            SinhvienModify svm = new SinhvienModify();
            if (svm.update(sv)) {
                notification.setText("Sinh viên đã được cập nhật");
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
            SinhvienModify svm = new SinhvienModify();
            int option = JOptionPane.showConfirmDialog(this, "Bạn có muốn xoá sinh viên này không ?");

            if (option == 0) {
                if (svm.delete(ID.getText())) {
                    showSinhVien();
                    ID.setText("");
                    ten.setText("");
                    email.setText("");
                    nam.setSelected(true);
                    notification.setText("Sinh viên đã được xoá");
                } else {
                    notification.setText("Bạn không thể xoá sinh viên");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            notification.setText("Lỗi");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void dssvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dssvActionPerformed
        this.removeAll();
        new DSSV().setVisible(true);
    }//GEN-LAST:event_dssvActionPerformed

    private void sinhVienTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sinhVienTableMouseClicked
        try {
            int row = sinhVienTable.getSelectedRow();
            if (row >= 0) {
                String id = (String) sinhVienTable.getValueAt(row, 0);
                SinhvienModify svm = new SinhvienModify();
                Sinhvien sv = svm.findByID(id);
                if (sv != null) {
                    ID.setText(sv.getID());
                    ten.setText(sv.getName());
                    email.setText(sv.getEmail());
                    lopHocCheckBox.setSelectedItem(sv.getLophoc());
                    if(sv.getGender().equals("nam")){
                        nam.setSelected(true);
                    }
                    else{
                        nu.setSelected(true);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showInputDialog("Lỗi");
        }
    }//GEN-LAST:event_sinhVienTableMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton createButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton dssv;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JComboBox<String> lopHocCheckBox;
    private javax.swing.JRadioButton nam;
    private javax.swing.JLabel notification;
    private javax.swing.JRadioButton nu;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTable sinhVienTable;
    private javax.swing.JTextField ten;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
