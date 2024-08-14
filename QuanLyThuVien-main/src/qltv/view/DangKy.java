/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltv.view;

import qltv.dao.Connection_db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import qltv.dao.DocGia_DAO;
import qltv.dao.Docgia_pojo;
import qltv.table.model.tablel_model_Docgia;

/**
 *
 * @author Đông
 */
public class DangKy extends javax.swing.JFrame {
    

    @Override
    public void setDefaultCloseOperation(int operation) {
        super.setDefaultCloseOperation(operation); //To change body of generated methods, choose Tools | Templates.
    }
    DocGia_DAO aDocGia_DAO;
    Connection_db con;
    Docgia_pojo aDocgia_pojo;
    PreparedStatement stm;
    ArrayList<Docgia_pojo> arrayList;
    public DangKy() {
        initComponents();
        con =new Connection_db();
        aDocgia_pojo=new Docgia_pojo();
        aDocGia_DAO=new DocGia_DAO();
        arrayList=new ArrayList<>();
        con.getConnectiontoMSSQL();
        setDefaultCloseOperation(1);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTenDN = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jrdobtnNam = new javax.swing.JRadioButton();
        jrdobtnNu = new javax.swing.JRadioButton();
        jrdoKhac = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        txtHovaTen = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDiachi = new javax.swing.JTextField();
        btnDangky = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtNgaybd = new javax.swing.JTextField();
        txtNgaykt = new javax.swing.JTextField();
        txtMatkhau = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ĐĂNG KÍ");

        jPanel2.setBackground(new java.awt.Color(51, 255, 204));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/student.png"))); // NOI18N
        jLabel9.setText("ĐĂNG KÝ ĐỌC GIẢ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("Tên Đăng Nhập");

        txtTenDN.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setText("Mật Khẩu");

        jrdobtnNam.setBackground(new java.awt.Color(0, 255, 204));
        buttonGroup1.add(jrdobtnNam);
        jrdobtnNam.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jrdobtnNam.setText("Nam");

        jrdobtnNu.setBackground(new java.awt.Color(51, 255, 204));
        buttonGroup1.add(jrdobtnNu);
        jrdobtnNu.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jrdobtnNu.setText("Nữ");

        jrdoKhac.setBackground(new java.awt.Color(51, 255, 204));
        buttonGroup1.add(jrdoKhac);
        jrdoKhac.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jrdoKhac.setText("Khác");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setText("Họ và Tên");

        txtHovaTen.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel13.setText("Địa Chỉ");

        txtDiachi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        btnDangky.setBackground(new java.awt.Color(255, 51, 51));
        btnDangky.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnDangky.setForeground(new java.awt.Color(255, 255, 255));
        btnDangky.setText("ĐĂNG KÝ");
        btnDangky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKy(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Ngày Bắt Đầu");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel15.setText("Ngày Kết Thúc");

        txtNgaybd.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtNgaybd.setText("MM/DD/YYYY");

        txtNgaykt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtNgaykt.setText("MM/DD/YYYY");

        txtMatkhau.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel13))
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtHovaTen)
                                .addComponent(txtTenDN)
                                .addComponent(txtMatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNgaybd, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNgaykt, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDiachi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jrdobtnNam, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jrdobtnNu)
                        .addGap(40, 40, 40)
                        .addComponent(jrdoKhac)))
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDangky, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(51, 51, 51))
                            .addComponent(jLabel11))
                        .addGap(28, 28, 28)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtTenDN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtMatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtHovaTen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrdobtnNam)
                    .addComponent(jrdobtnNu)
                    .addComponent(jrdoKhac))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(23, 23, 23)
                        .addComponent(txtNgaybd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNgaykt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(28, 28, 28)
                .addComponent(btnDangky, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangKy(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKy
        int dem=0;
        if (txtTenDN.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Cần nhập tên Đăng Nhập");
            dem++;
        }
        if (txtMatkhau.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Cần nhập Mật Khẩu");
            dem++;
        }
        if (txtHovaTen.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Cần nhập đầy đủ Họ và Tên");
            dem++;
        }
        if (buttonGroup1.isSelected(null)){
            JOptionPane.showMessageDialog(this, "Cần chọn Giới Tính");
            dem++;
        }
        if (txtDiachi.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Cần nhập Địa Chỉ");
            dem++;
        }
        if (txtNgaybd.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Cần nhập Ngày Bắt Đầu");
            dem++;
        }
        if (txtNgaykt.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Cần nhập Ngày Kết Thúc");
            dem++;
        }
        if (txtTenDN.getText().length()>10) {
            JOptionPane.showMessageDialog(this, "Tên Đăng Nhập không được quá 10 kí tự!");
        }
        if (txtMatkhau.getText().length()>15)
            JOptionPane.showMessageDialog(this, "Mật Khẩu không được quá 15 kí tự!");
        int check=0;
        if (dem==0) {
            aDocgia_pojo.setMadg(txtTenDN.getText());
            aDocgia_pojo.setMatkhau(txtMatkhau.getText());
            aDocgia_pojo.setTendg(txtHovaTen.getText());
            if (jrdobtnNam.isSelected()==true) {
                aDocgia_pojo.setGioitinh("Nam");
            }
            if (jrdobtnNu.isSelected()==true) {
                aDocgia_pojo.setGioitinh("Nữ");
            }
            if (jrdoKhac.isSelected()==true) {
                aDocgia_pojo.setGioitinh("Khác");
            }
            aDocgia_pojo.setDiachi(txtDiachi.getText());
            aDocgia_pojo.setNgaybd(txtNgaybd.getText());
            aDocgia_pojo.setNgaykt(txtNgaykt.getText());
            aDocgia_pojo.setPhicoc(null);
            int a=aDocGia_DAO.themDocGia(aDocgia_pojo);
            if (a==1) {
                JOptionPane.showMessageDialog(this, "Đăng ký thành công...!");
            }
            con.close();
            this.setVisible(false);  
        }
        
    }//GEN-LAST:event_btnDangKy

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangky;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jrdoKhac;
    private javax.swing.JRadioButton jrdobtnNam;
    private javax.swing.JRadioButton jrdobtnNu;
    private javax.swing.JTextField txtDiachi;
    private javax.swing.JTextField txtHovaTen;
    private javax.swing.JPasswordField txtMatkhau;
    private javax.swing.JTextField txtNgaybd;
    private javax.swing.JTextField txtNgaykt;
    private javax.swing.JTextField txtTenDN;
    // End of variables declaration//GEN-END:variables

}
