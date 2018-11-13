package view;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import java.awt.Component;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.CompoundBorder;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class TrangChu extends JFrame {
	private JTextField txtTimKiem;
	
	public TrangChu() {
		getContentPane().setBackground(Color.WHITE);
		initComponents();
		
	}
	private void initComponents() {
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Bãi Xe");
        setBounds(100, 100, 800, 500);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        setLocation(new java.awt.Point(250, 100));
        setResizable(false);
        
        JPanel menuLeft = new JPanel();
        menuLeft.setBounds(0, 0, 180, 460);
        menuLeft.setBackground(new Color(255, 222, 173));
        
        JPanel tittle = new JPanel();
        tittle.setBounds(180, 0, 600, 60);
        tittle.setBackground(new Color(175, 238, 238));
        
        JPanel content = new JPanel();
        content.setBounds(180, 60, 600, 360);
        
        JPanel tool = new JPanel();
        tool.setBackground(Color.LIGHT_GRAY);
        tool.setBounds(180, 420, 600, 40);
        getContentPane().setLayout(null);
        menuLeft.setLayout(null);
        
        JButton btnDanhSachXe = new JButton("Danh Sách Xe");
        btnDanhSachXe.setForeground(Color.WHITE);
        btnDanhSachXe.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnDanhSachXe.setBackground(new Color(34, 139, 34));
        btnDanhSachXe.setBounds(0, 0, 180, 92);
        menuLeft.add(btnDanhSachXe);
        
        JButton btnThemXe = new JButton("Thêm Xe");
        btnThemXe.setForeground(Color.WHITE);
        btnThemXe.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnThemXe.setBackground(new Color(34, 139, 34));
        btnThemXe.setBounds(0, 92, 180, 92);
        menuLeft.add(btnThemXe);
        
        JButton btnBaiXe = new JButton("Bãi Xe");
        btnBaiXe.setForeground(Color.WHITE);
        btnBaiXe.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnBaiXe.setBackground(new Color(34, 139, 34));
        btnBaiXe.setBounds(0, 184, 180, 92);
        menuLeft.add(btnBaiXe);
        
        JButton btnNewButton = new JButton("New button");
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnNewButton.setBackground(new Color(34, 139, 34));
        btnNewButton.setBounds(0, 276, 180, 92);
        menuLeft.add(btnNewButton);
        
        JButton btnDngXuat = new JButton("Đăng Xuất");
        btnDngXuat.setForeground(Color.WHITE);
        btnDngXuat.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnDngXuat.setBackground(new Color(34, 139, 34));
        btnDngXuat.setBounds(0, 368, 180, 92);
        menuLeft.add(btnDngXuat);
        getContentPane().add(menuLeft);
        getContentPane().add(tittle);
        tittle.setLayout(null);
        
        JLabel lblDanhSchXe = new JLabel("Danh Sách Xe Trong Bãi");
        lblDanhSchXe.setForeground(Color.BLUE);
        lblDanhSchXe.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblDanhSchXe.setBackground(Color.CYAN);
        lblDanhSchXe.setBounds(63, 11, 228, 38);
        tittle.add(lblDanhSchXe);
        
        txtTimKiem = new JTextField();
        txtTimKiem.setText("Tìm kiếm?");
        txtTimKiem.setBounds(332, 17, 257, 26);
        tittle.add(txtTimKiem);
        txtTimKiem.setColumns(10);
        getContentPane().add(content);
        getContentPane().add(tool);
        
        JButton btnXuatXe = new JButton("Xuất Xe");
        tool.add(btnXuatXe);
        
        JButton btnSuaThongTin = new JButton("Sửa Thông Tin");
        tool.add(btnSuaThongTin);
        
        JButton btnBaoMat = new JButton("Báo Mất");
        tool.add(btnBaoMat);
	}
	public static void main(String[] args) {
		TrangChu home = new TrangChu();
		home.setVisible(true);
		
	}
}
