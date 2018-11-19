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
import javax.swing.table.DefaultTableModel;

import controller.AcDanhSachXe;
import model.MyQuery;

import javax.swing.border.LineBorder;
import javax.swing.border.CompoundBorder;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JTable;

public class TrangChu extends JFrame {
	
	private JPanel tittle;
	private JLabel lblDanhSachXe;
	private JLabel lblUser;
	private JTextField txtTimKiem;
	
	private JPanel menuLeft;
	private JButton btnDanhSachXe;
	private JButton btnThemXe;
	private JButton btnBaiXe;
	private JButton btnDangNhap;
	private JButton btnDangXuat;
	
	private JPanel content;
	private JTable tableDanhsach;
	
	private JPanel tool;
	private JButton btnXuatXe;
	private JButton btnSuaThongTin;
	private JButton btnBaoMat;
	
	private DefaultTableModel table = null;
	
	public TrangChu() {
		initComponents();
		load();
		setVisible(true);
		
	}
	private void initComponents() {
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Bãi Xe");
        setBounds(100, 100, 800, 500);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        setLocation(new java.awt.Point(250, 100));
        setResizable(false);
        
        getContentPane().setBackground(Color.WHITE);
        getContentPane().setLayout(null);
        
        menuLeft = new JPanel();
        menuLeft.setBounds(0, 0, 180, 460);
        menuLeft.setBackground(new Color(255, 222, 173));
        menuLeft.setLayout(null);
        getContentPane().add(menuLeft);
        
        tittle = new JPanel();
        tittle.setBounds(180, 0, 600, 60);
        tittle.setBackground(new Color(175, 238, 238));
        tittle.setLayout(null);
        getContentPane().add(tittle);
        
        content = new JPanel();
        content.setBounds(180, 60, 600, 360);
        content.setLayout(null);
        getContentPane().add(content);
        
        tool = new JPanel();
        tool.setBackground(Color.LIGHT_GRAY);
        tool.setBounds(180, 420, 600, 40);
        getContentPane().add(tool);
        
        
        btnDanhSachXe = new JButton("Danh Sách Xe");
        btnDanhSachXe.setForeground(Color.WHITE);
        btnDanhSachXe.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnDanhSachXe.setBackground(new Color(34, 139, 34));
        btnDanhSachXe.setBounds(0, 0, 180, 92);
        menuLeft.add(btnDanhSachXe);
        btnDanhSachXe.addActionListener(new AcDanhSachXe(TrangChu.this));
        
        btnThemXe = new JButton("Thêm Xe");
        btnThemXe.setForeground(Color.WHITE);
        btnThemXe.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnThemXe.setBackground(new Color(34, 139, 34));
        btnThemXe.setBounds(0, 92, 180, 92);
        btnThemXe.setEnabled(false);
        menuLeft.add(btnThemXe);
        btnThemXe.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				ThemXe themxe = new ThemXe();
			}
		});
        
        btnBaiXe = new JButton("Bãi Xe");
        btnBaiXe.setForeground(Color.WHITE);
        btnBaiXe.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnBaiXe.setBackground(new Color(34, 139, 34));
        btnBaiXe.setBounds(0, 184, 180, 92);
        btnBaiXe.setEnabled(false);
        menuLeft.add(btnBaiXe);
        
        btnDangNhap = new JButton("Đăng Nhập");
        btnDangNhap.setForeground(Color.WHITE);
        btnDangNhap.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnDangNhap.setBackground(new Color(34, 139, 34));
        btnDangNhap.setBounds(0, 276, 180, 92);
        menuLeft.add(btnDangNhap);
        btnDangNhap.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				DangNhap dn = new DangNhap(TrangChu.this);
				dn.setVisible(true);
			}
		});
        
        btnDangXuat = new JButton("Đăng Xuất");
        btnDangXuat.setForeground(Color.WHITE);
        btnDangXuat.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnDangXuat.setBackground(new Color(34, 139, 34));
        btnDangXuat.setBounds(0, 368, 180, 92);
        btnDangXuat.setEnabled(false);
        menuLeft.add(btnDangXuat);
        
        
        lblDanhSachXe = new JLabel("Danh Sách Xe Trong Bãi");
        lblDanhSachXe.setForeground(Color.BLUE);
        lblDanhSachXe.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblDanhSachXe.setBackground(Color.CYAN);
        lblDanhSachXe.setBounds(63, 11, 228, 38);
        tittle.add(lblDanhSachXe);
        
        txtTimKiem = new JTextField();
        txtTimKiem.setText("Tìm kiếm?");
        txtTimKiem.setBounds(332, 17, 257, 26);
        txtTimKiem.setColumns(10);
        tittle.add(txtTimKiem);
        
        lblUser = new JLabel("Người dùng khách");
        lblUser.setForeground(Color.RED);
        lblUser.setFont(new Font("Times New Roman", Font.PLAIN, 9));
        lblUser.setBounds(63, 42, 191, 14);
        tittle.add(lblUser);
        
        tableDanhsach = new JTable();
        tableDanhsach.setBounds(5, 5, 590, 350);
        content.add(tableDanhsach);
        
        btnXuatXe = new JButton("Xuất Xe");
        btnXuatXe.setEnabled(false);
        tool.add(btnXuatXe);
        btnXuatXe.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				XuatXe xuat = new XuatXe();
			}
		});
        
        btnSuaThongTin = new JButton("Sửa Thông Tin");
        btnSuaThongTin.setEnabled(false);
        tool.add(btnSuaThongTin);
        
        btnBaoMat = new JButton("Báo Mất");
        btnBaoMat.setEnabled(false);
        tool.add(btnBaoMat);
	}
	
	public void load() {
		table = new DefaultTableModel();
		table.addColumn("ID");
		table.addColumn("Loại Xe");
		table.addColumn("Biển Số");
		table.addColumn("Giờ Vào");
		table.addColumn("Bãi Xe");
		table.addColumn("Người Nhập");
		
		MyQuery ds = new MyQuery();
		String sql = "SELECT * FROM luotgui";
		ResultSet rs = ds.ExcuteQueryGetTable(sql);
		
		try {
			while (rs.next()) {
				
				int id = rs.getInt("id");
				String loaixe = rs.getString("loaixe");
				String bienso = rs.getString("bienso");
				String giovao = String.valueOf(rs.getDate("giovao"));
				int baixe = rs.getInt("baixe_id");
				int nguoinhap = rs.getInt("user_id");
				
				// add to table
				String[] values = new String[6];
				values[0] = String.valueOf(id);
				values[1] = loaixe;
				values[2] = bienso;
				values[3] = giovao;
				values[4] = String.valueOf(baixe);
				values[5] = String.valueOf(nguoinhap);
				
				table.addRow(values);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		tableDanhsach.setModel(table);
		
	}
	
	public void enableControl(String text) {
		
		btnThemXe.setEnabled(true);
		btnBaiXe.setEnabled(true);
		btnDangXuat.setEnabled(true);
		btnXuatXe.setEnabled(true);
		btnSuaThongTin.setEnabled(true);
		btnBaoMat.setEnabled(true);
		lblUser.setText("Admin " + text);
	}
	
	public static void main(String[] args) {
		TrangChu home = new TrangChu();
	}
}
