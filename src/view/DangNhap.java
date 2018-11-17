package view;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.MyQuery;
import model.User;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;

public class DangNhap extends javax.swing.JFrame {
	
	 private javax.swing.JButton btnDangNhap;
	    private javax.swing.JButton btnĐangKy;
	    private javax.swing.JCheckBox chkbNhoMatKhau;
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JLabel lblPassword;
	    private javax.swing.JLabel lblRegisterTitle;
	    private javax.swing.JLabel lblUserName;
	    private javax.swing.JPanel pnlRegisterInfo;
	    private javax.swing.JPasswordField txtPassword;
	    private javax.swing.JTextField txtUserName;
	    private JPanel panelthongbao;
	    private JLabel thongbao;

    public DangNhap() {
        initComponents();
        String tendangnhap = "";
        String matkhau = "";
        this.setLocation(300, 200);
        
        txtUserName.setText(tendangnhap);
        txtPassword.setText(matkhau);
        if(!tendangnhap.equals("")){
             chkbNhoMatKhau.setSelected(rootPaneCheckingEnabled);
             System.out.println("checked lưu mật khẩu");
         }else
             System.out.println("đã bỏ checkbox lưu mật khẩu\n\n");
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlRegisterInfo = new javax.swing.JPanel();
        lblRegisterTitle = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        chkbNhoMatKhau = new javax.swing.JCheckBox();
        btnĐangKy = new javax.swing.JButton();
        btnDangNhap = new javax.swing.JButton();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng Nhập Đăng Ký");
        setResizable(false);

        pnlRegisterInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        lblRegisterTitle.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblRegisterTitle.setForeground(new java.awt.Color(51, 102, 255));
        lblRegisterTitle.setText("QUẢN LÝ BÃI XE");

        lblUserName.setText("Tên đăng nhập");

        lblPassword.setText("Mật khẩu");

        chkbNhoMatKhau.setForeground(new java.awt.Color(102, 153, 255));
        chkbNhoMatKhau.setText("nhớ Mật Khẩu");

        btnĐangKy.setForeground(new java.awt.Color(255, 153, 51));
        btnĐangKy.setText("Đăng ký");
        btnĐangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnĐangKyActionPerformed(evt);
            }
        });

        btnDangNhap.setForeground(new java.awt.Color(255, 153, 51));
        btnDangNhap.setText("Đăng Nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRegisterInfoLayout = new javax.swing.GroupLayout(pnlRegisterInfo);
        pnlRegisterInfo.setLayout(pnlRegisterInfoLayout);
        pnlRegisterInfoLayout.setHorizontalGroup(
            pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegisterInfoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUserName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegisterInfoLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUserName)
                            .addComponent(txtPassword)
                            .addGroup(pnlRegisterInfoLayout.createSequentialGroup()
                                .addComponent(chkbNhoMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnlRegisterInfoLayout.createSequentialGroup()
                                .addComponent(btnĐangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33))
                    .addGroup(pnlRegisterInfoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblRegisterTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlRegisterInfoLayout.setVerticalGroup(
            pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegisterInfoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblRegisterTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addGap(18, 18, 18)
                .addComponent(chkbNhoMatKhau)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnĐangKy)
                    .addComponent(btnDangNhap))
                .addGap(31, 31, 31))
        );
        
        panelthongbao = new JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false)
        				.addComponent(panelthongbao, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(pnlRegisterInfo, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addComponent(pnlRegisterInfo, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(panelthongbao, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        			.addContainerGap())
        );
        
        thongbao = new JLabel("");
        panelthongbao.add(thongbao);
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    public static int quyen=0;
    public static String fullname="",username="";
    private void btnĐangKyActionPerformed(java.awt.event.ActionEvent evt) {

        frmDangKy frmDK=new frmDangKy();
        frmDK.show();
        this.dispose();
    }

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {
    	
        String strUsername = txtUserName.getText().trim();
        String strPassword = String.valueOf(txtPassword.getPassword()).trim();
        System.out.println("username = " + strUsername + " Password = " + strPassword);

        String luumk="",luutdn="";
        if(chkbNhoMatKhau.isSelected()){
        luutdn  =strUsername;
        luumk=strPassword;
        System.out.println("lưu mật khẩu");
        }
        else{
        	luutdn  = "";
        	luumk = "";
        	System.out.println("không lưu mật khẩu");
        }
        
        
        try {
            File file = new File("luumk.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(luutdn+"\n"+luumk);
            bw.close();
            if( chkbNhoMatKhau.isSelected())
            System.out.println("lưu phiên đăng nhập thành công");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
     
       if(KiemTra(strUsername, strPassword)){
    	   System.out.println("login complete");
           this.dispose();
        } else {
            thongbao.setText("Bạn nhập sai tài khoản hoặc mật khẩu" + ", Lỗi đăng nhập");
        }
    }

      private boolean KiemTra(String tdn, String mk) {
        boolean kq = false;

        String cautruyvan = "SELECT * FROM user WHERE user =" + tdn + " , password =" + mk;
        System.out.println(cautruyvan);
        
        
        try {
        	MyQuery query= new MyQuery();
        	ResultSet rs = query.excuteQuery(cautruyvan);
            if (rs.next()) {
                kq = true;
                quyen = rs.getInt("quyen");
                fullname=rs.getString("fullname");
                username=rs.getString("username");
                System.out.println(" " + quyen);
            }
        } catch (SQLException ex) {
            System.out.println("lỗi đăng nhập SQL");
        } catch (ClassNotFoundException ex) {
        	System.out.println("lỗi đăng nhập CNF");
		}

        return kq;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }
}
