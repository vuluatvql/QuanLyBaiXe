package view;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
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

import model.MyQuery;

import javax.swing.border.LineBorder;
import javax.swing.border.CompoundBorder;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;

public class TrangChu extends JFrame {
	
	private JPanel tittle;
	private JLabel lblDanhSachXe;
	private JLabel lblUser;
	private JTextField txtTimKiem;
	private JButton btnTimKim;
	
	private JPanel menuLeft;
	private JButton btnDanhSachXe;
	private JButton btnThemXe;
	private JButton btnBaiXe;
	
	private JPanel content;
	private JTable tableDanhsach;
	private JScrollPane scrollPane;
	
	private JPanel tool;
	private JButton btnXuatXe;
	private JButton btnSuaThongTin;
	private JButton btnBaoMat;
	
	private JButton btnDangNhap;
	private JButton btnDangXuat;
	
	private DefaultTableModel table = null;
	int userID = -1;
	private JPanel panelLogo;
	
	private JLabel label;
	private JLabel ControngA;
	private JLabel DaguiA;
	private JLabel TongchoA;
	private JLabel label_4;
	private JLabel TongchoB;
	private JLabel DaguiB;
	private JLabel ControngB;
	private JLabel label_8;
	private JLabel ControngC;
	private JLabel TongchoC;
	private JLabel DaguiC;
	private JButton btnDsBaiA;
	private JButton btnDsBaiB;
	private JButton btnDsBaiC;
	private JLabel lblTngSXe;
	private JLabel lblOto;
	private JLabel lblXeMy;
	private JLabel lblXedap;
	private JLabel lblTngQuan;
	
	public TrangChu() {
		initComponents();
		String sql = "SELECT * FROM luotgui";
		load(sql);
		loadBaiXe();
		setVisible(true);
		
	}
	private void initComponents() {
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Bãi Xe");
        setBounds(0, 0, 1028, 650);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        setLocation(new java.awt.Point(250, 100));
        setResizable(false);
        
        getContentPane().setBackground(Color.WHITE);
        getContentPane().setLayout(null);
        
        menuLeft = new JPanel();
        menuLeft.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, null, null, null));
        menuLeft.setBounds(0, 60, 268, 512);
        menuLeft.setBackground(new Color(255, 222, 173));
        menuLeft.setLayout(null);
        getContentPane().add(menuLeft);
        
        tittle = new JPanel();
        tittle.setBounds(268, 0, 744, 60);
        tittle.setBackground(new Color(175, 238, 238));
        tittle.setLayout(null);
        getContentPane().add(tittle);
        
        content = new JPanel();
        content.setBounds(268, 60, 744, 512);
        getContentPane().add(content);
        
        tool = new JPanel();
        tool.setBackground(Color.LIGHT_GRAY);
        tool.setBounds(268, 572, 744, 40);
        getContentPane().add(tool);
        
        
        btnDanhSachXe = new JButton("Danh Sách Xe");
        btnDanhSachXe.setForeground(Color.WHITE);
        btnDanhSachXe.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnDanhSachXe.setBackground(new Color(30, 144, 255));
        btnDanhSachXe.setBounds(0, 0, 268, 40);
        menuLeft.add(btnDanhSachXe);
        btnDanhSachXe.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String sql = "SELECT * FROM luotgui";
				load(sql);
			}
		});
        
        btnBaiXe = new JButton("Bãi Xe");
        btnBaiXe.setForeground(Color.WHITE);
        btnBaiXe.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnBaiXe.setBackground(new Color(30, 144, 255));
        btnBaiXe.setBounds(0, 40, 268, 40);
        menuLeft.add(btnBaiXe);
        
        JPanel panelBaiA = new JPanel();
        panelBaiA.setBackground(SystemColor.inactiveCaption);
        panelBaiA.setForeground(new Color(144, 238, 144));
        panelBaiA.setBorder(new LineBorder(new Color(0, 128, 0), 2, true));
        panelBaiA.setBounds(10, 89, 250, 100);
        menuLeft.add(panelBaiA);
        
        label = new JLabel("Bãi A");
        
        ControngA = new JLabel("Còn trống :  0");
        
        DaguiA = new JLabel("Số xe đã gửi :  0");
        
        TongchoA = new JLabel("Tổng số chỗ :  0");
        
        btnDsBaiA = new JButton(">>");
        btnDsBaiA.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String loadBaiA = "SELECT * FROM `luotgui` WHERE `baixe_id` = 1";
				load(loadBaiA);
			}
		});
        
        btnDsBaiA.setFont(new Font("Tahoma", Font.PLAIN, 10));
        btnDsBaiA.setForeground(new Color(255, 0, 0));
        GroupLayout gl_panelBaiA = new GroupLayout(panelBaiA);
        gl_panelBaiA.setHorizontalGroup(
        	gl_panelBaiA.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panelBaiA.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_panelBaiA.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(TongchoA, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
        				.addComponent(ControngA, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
        				.addComponent(DaguiA, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        			.addPreferredGap(ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
        			.addComponent(btnDsBaiA))
        		.addGroup(gl_panelBaiA.createSequentialGroup()
        			.addGap(96)
        			.addComponent(label, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
        );
        gl_panelBaiA.setVerticalGroup(
        	gl_panelBaiA.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panelBaiA.createSequentialGroup()
        			.addGap(5)
        			.addComponent(label)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(TongchoA)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(DaguiA)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(gl_panelBaiA.createParallelGroup(Alignment.LEADING)
        				.addComponent(btnDsBaiA)
        				.addComponent(ControngA))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBaiA.setLayout(gl_panelBaiA);
        
        JPanel panelBaiB = new JPanel();
        panelBaiB.setBackground(SystemColor.inactiveCaption);
        panelBaiB.setForeground(new Color(65, 105, 225));
        panelBaiB.setBorder(new LineBorder(new Color(0, 0, 255), 2, true));
        panelBaiB.setBounds(10, 200, 250, 100);
        menuLeft.add(panelBaiB);
        
        label_4 = new JLabel("Bãi B");
        
        TongchoB = new JLabel("Tổng số chỗ :  0");
        
        DaguiB = new JLabel("Số xe đã gửi :  0");
        
        ControngB = new JLabel("Còn trống :  0");
        
        btnDsBaiB = new JButton(">>");
        btnDsBaiB.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String loadBaiB = "SELECT * FROM `luotgui` WHERE `baixe_id` = 2";
				load(loadBaiB);
			}
		});
        
        btnDsBaiB.setFont(new Font("Tahoma", Font.PLAIN, 10));
        btnDsBaiB.setForeground(new Color(255, 0, 0));
        GroupLayout gl_panelBaiB = new GroupLayout(panelBaiB);
        gl_panelBaiB.setHorizontalGroup(
        	gl_panelBaiB.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panelBaiB.createSequentialGroup()
        			.addGap(97)
        			.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
        		.addGroup(gl_panelBaiB.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_panelBaiB.createParallelGroup(Alignment.TRAILING, false)
        				.addComponent(TongchoB, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(DaguiB, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(ControngB, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
        			.addPreferredGap(ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
        			.addComponent(btnDsBaiB))
        );
        gl_panelBaiB.setVerticalGroup(
        	gl_panelBaiB.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panelBaiB.createSequentialGroup()
        			.addGap(6)
        			.addComponent(label_4)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(TongchoB)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(DaguiB)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(gl_panelBaiB.createParallelGroup(Alignment.BASELINE)
        				.addComponent(ControngB)
        				.addComponent(btnDsBaiB))
        			.addContainerGap(16, Short.MAX_VALUE))
        );
        panelBaiB.setLayout(gl_panelBaiB);
        
        JPanel panelBaiC = new JPanel();
        panelBaiC.setBackground(SystemColor.inactiveCaption);
        panelBaiC.setForeground(new Color(255, 160, 122));
        panelBaiC.setBorder(new LineBorder(new Color(255, 0, 0), 2, true));
        panelBaiC.setBounds(10, 307, 250, 100);
        menuLeft.add(panelBaiC);
        
        label_8 = new JLabel("Bãi C");
        
        ControngC = new JLabel("Còn trống :  0");
        
        TongchoC = new JLabel("Tổng số chỗ :  0");
        
        DaguiC = new JLabel("Số xe đã gửi :  0");
        
        btnDsBaiC = new JButton(">>");
        btnDsBaiC.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String loadBaiC = "SELECT * FROM `luotgui` WHERE `baixe_id` = 3";
				load(loadBaiC);
			}
		});
        
        btnDsBaiC.setFont(new Font("Tahoma", Font.PLAIN, 10));
        btnDsBaiC.setForeground(new Color(255, 0, 0));
        GroupLayout gl_panelBaiC = new GroupLayout(panelBaiC);
        gl_panelBaiC.setHorizontalGroup(
        	gl_panelBaiC.createParallelGroup(Alignment.TRAILING)
        		.addGroup(gl_panelBaiC.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_panelBaiC.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_panelBaiC.createSequentialGroup()
        					.addGroup(gl_panelBaiC.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(DaguiC, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(TongchoC))
        					.addGap(83))
        				.addGroup(gl_panelBaiC.createSequentialGroup()
        					.addComponent(ControngC, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.RELATED)))
        			.addComponent(btnDsBaiC))
        		.addGroup(Alignment.LEADING, gl_panelBaiC.createSequentialGroup()
        			.addGap(99)
        			.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(101, Short.MAX_VALUE))
        );
        gl_panelBaiC.setVerticalGroup(
        	gl_panelBaiC.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panelBaiC.createSequentialGroup()
        			.addGap(4)
        			.addComponent(label_8)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(TongchoC)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(DaguiC)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(gl_panelBaiC.createParallelGroup(Alignment.LEADING)
        				.addComponent(btnDsBaiC)
        				.addComponent(ControngC))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBaiC.setLayout(gl_panelBaiC);
        
        JPanel panelTongquan = new JPanel();
        panelTongquan.setBackground(new Color(255, 182, 193));
        panelTongquan.setBounds(0, 418, 268, 94);
        menuLeft.add(panelTongquan);
        
        lblTngSXe = new JLabel("Tổng số xe :");
        
        lblOto = new JLabel("Ô tô :");
        
        lblXeMy = new JLabel("Xe máy :");
        
        lblXedap = new JLabel("Xe đạp :");
        
        lblTngQuan = new JLabel("Tổng quan");
        lblTngQuan.setFont(new Font("Tahoma", Font.BOLD, 12));
        GroupLayout gl_panelTongquan = new GroupLayout(panelTongquan);
        gl_panelTongquan.setHorizontalGroup(
        	gl_panelTongquan.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panelTongquan.createSequentialGroup()
        			.addGroup(gl_panelTongquan.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_panelTongquan.createSequentialGroup()
        					.addGap(27)
        					.addGroup(gl_panelTongquan.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblOto, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblTngSXe, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
        					.addGap(35)
        					.addGroup(gl_panelTongquan.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblXeMy, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
        						.addComponent(lblXedap, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)))
        				.addGroup(gl_panelTongquan.createSequentialGroup()
        					.addGap(93)
        					.addComponent(lblTngQuan)))
        			.addContainerGap())
        );
        gl_panelTongquan.setVerticalGroup(
        	gl_panelTongquan.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panelTongquan.createSequentialGroup()
        			.addGap(6)
        			.addComponent(lblTngQuan)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(gl_panelTongquan.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblTngSXe)
        				.addComponent(lblXeMy))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(gl_panelTongquan.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblOto)
        				.addComponent(lblXedap))
        			.addContainerGap(24, Short.MAX_VALUE))
        );
        panelTongquan.setLayout(gl_panelTongquan);
        btnBaiXe.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				loadBaiXe();
			}
		});
        
        
        lblDanhSachXe = new JLabel("Danh Sách Xe Trong Bãi");
        lblDanhSachXe.setForeground(Color.BLUE);
        lblDanhSachXe.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblDanhSachXe.setBackground(Color.CYAN);
        lblDanhSachXe.setBounds(63, 11, 228, 38);
        tittle.add(lblDanhSachXe);
        
        txtTimKiem = new JTextField();
        txtTimKiem.setBounds(400, 18, 200, 25);
        txtTimKiem.setColumns(10);
        tittle.add(txtTimKiem);
        
        lblUser = new JLabel("Người dùng khách");
        lblUser.setBounds(10, 45, 125, 12);
        tittle.add(lblUser);
        lblUser.setForeground(Color.RED);
        lblUser.setFont(new Font("Times New Roman", Font.PLAIN, 9));
        
        btnTimKim = new JButton("Tìm kiếm");
        btnTimKim.setBounds(620, 18, 80, 25);
        tittle.add(btnTimKim);
        content.setLayout(new BorderLayout(0, 0));
        btnTimKim.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				loadTimkiem();
			}
		});
        
        scrollPane = new JScrollPane();
        content.add(scrollPane, BorderLayout.CENTER);
        
        tableDanhsach = new JTable();
        scrollPane.setViewportView(tableDanhsach);
        
        btnThemXe = new JButton("Thêm Xe");
        btnThemXe.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnThemXe.setEnabled(false);
        btnThemXe.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ThemXe themxe = new ThemXe(userID, TrangChu.this);
			}
		});
        
        btnXuatXe = new JButton("Xuất Xe");
        btnXuatXe.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnXuatXe.setEnabled(false);
        btnXuatXe.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				XuatXe xuat = new XuatXe(tableDanhsach, table, TrangChu.this);
			}
		});
        
        btnSuaThongTin = new JButton("Sửa Thông Tin");
        btnSuaThongTin.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnSuaThongTin.setEnabled(false);
        btnSuaThongTin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				SuaThongTin sua = new SuaThongTin(TrangChu.this, tableDanhsach, table);
			}
		});
        
        btnBaoMat = new JButton("Báo Mất");
        btnBaoMat.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnBaoMat.setEnabled(false);
        tool.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        tool.add(btnThemXe);
        tool.add(btnXuatXe);
        tool.add(btnSuaThongTin);
        tool.add(btnBaoMat);
        
        JPanel Loginout = new JPanel();
        Loginout.setBounds(0, 572, 268, 40);
        getContentPane().add(Loginout);
        
        btnDangXuat = new JButton("Đăng Xuất");
        btnDangXuat.setBounds(141, 5, 117, 30);
        btnDangXuat.setForeground(Color.WHITE);
        btnDangXuat.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnDangXuat.setEnabled(false);
        btnDangXuat.setBackground(SystemColor.textHighlight);
        Loginout.setLayout(null);
        Loginout.add(btnDangXuat);
        btnDangXuat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				DangXuat dangxuat = new DangXuat(TrangChu.this);
				dangxuat.setVisible(true);
			}
		});
        
        btnDangNhap = new JButton("Đăng Nhập");
        btnDangNhap.setBounds(10, 5, 117, 30);
        Loginout.add(btnDangNhap);
        btnDangNhap.setForeground(Color.WHITE);
        btnDangNhap.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnDangNhap.setBackground(SystemColor.textHighlight);
        btnDangNhap.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				DangNhap dangnhap = new DangNhap(TrangChu.this);
				dangnhap.setVisible(true);
			}
		});
        
        panelLogo = new JPanel();
        panelLogo.setBackground(new Color(152, 251, 152));
        panelLogo.setBounds(0, 0, 268, 60);
        getContentPane().add(panelLogo);
        panelLogo.setLayout(null);
        
        JLabel lblHixe = new JLabel("HI XE");
        lblHixe.setForeground(new Color(139, 0, 0));
        lblHixe.setFont(new Font("SansSerif", Font.BOLD, 20));
        lblHixe.setBounds(100, 15, 70, 30);
        panelLogo.add(lblHixe);
        
        JLabel lblLogo = new JLabel("logo");
        lblLogo.setIcon(new ImageIcon("C:\\Users\\HP\\Pictures\\Logo Bike\\logo2.png"));
        lblLogo.setBounds(20, 10, 50, 40);
        panelLogo.add(lblLogo);
        btnBaoMat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(TrangChu.this, "Vui lòng liên hệ ban quản lý", "Báo Mất", JOptionPane.INFORMATION_MESSAGE);
			}
		});
	}
	
	public void load(String sql) {
		table = new DefaultTableModel();
		table.addColumn("ID");
		table.addColumn("Loại Xe");
		table.addColumn("Biển Số");
		table.addColumn("Số Vé");
		table.addColumn("Giờ Vào");
		table.addColumn("Bãi Xe");
		table.addColumn("Người Nhập");
		
		MyQuery ds = new MyQuery();
		ResultSet rs = ds.ExcuteQueryGetTable(sql);
		int count = 0;
		int countOto = 0;
		int countXemay = 0;
		int countXedap = 0;
		
		try {
			
			while (rs.next()) {
				
				int id = rs.getInt("id");
				String loaixe = rs.getString("loaixe");
				if(loaixe.equals("O To")) {
					countOto++;
				}
				else if(loaixe.equals("Xe May")) {
					countXemay++;
				}
				else {
					countXedap++;
				}
				String bienso = rs.getString("bienso");
				String sove = String.valueOf(rs.getInt("vexe_id"));
				String giovao = String.valueOf(rs.getDate("giovao"));
				int baixe = rs.getInt("baixe_id");
				int nguoinhap = rs.getInt("user_id");
				
				// add to table
				String[] values = new String[7];
				values[0] = String.valueOf(id);
				values[1] = loaixe;
				values[2] = bienso;
				values[3] = sove;
				values[4] = giovao;
				switch (baixe) {
				case 1:
					values[5] = "Bãi A";
					break;
				case 2:
					values[5] = "Bãi B";
					break;
				case 3:
					values[5] = "Bãi C";
					break;

				default:
					break;
				}
				switch (nguoinhap) {
				case 1:
					values[6] = "Vũ Luật";
					break;
				case 2:
					values[6] = "Cao Hiếu";
					break;
				case 3:
					values[6] = "Sơn Tùng";
					break;

				default:
					break;
				}
				table.addRow(values);
				
				count++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		tableDanhsach.setModel(table);
		
		if(count == 0) {
			JOptionPane.showMessageDialog(TrangChu.this, "Không tìm thấy xe", "Danh sách xe", JOptionPane.ERROR_MESSAGE);
			
		}
		else {
			lblTngSXe.setText("Tổng số xe :  " + count);
	        
	        lblOto.setText("Ô tô :  " + countOto);
	        
	        lblXeMy.setText("Xe máy :  " + countXemay);
	        
	        lblXedap.setText("Xe đạp :  " + countXedap);
		}
		
	}
	
	public void enableControl(String text, int id) {
		
		btnThemXe.setEnabled(true);
		btnDangXuat.setEnabled(true);
		btnXuatXe.setEnabled(true);
		btnSuaThongTin.setEnabled(true);
		btnBaoMat.setEnabled(true);
		lblUser.setText("Admin " + text);
		userID = id;
	}
	
	public void disableControl() {
		btnThemXe.setEnabled(false);
		btnDangXuat.setEnabled(false);
		btnXuatXe.setEnabled(false);
		btnSuaThongTin.setEnabled(false);
		btnBaoMat.setEnabled(false);
		lblUser.setText("Người dùng khách");
		userID = -1;
	}
	
	public void setBaiA() throws SQLException {
		int socho = 0;
		int dagui = 0;
		MyQuery baixe = new MyQuery();
		String sql = "SELECT * FROM `baixe` WHERE `id` = 1";
		String sql2 = "SELECT * FROM `luotgui` WHERE `baixe_id` = 1";
		ResultSet rs = baixe.ExcuteQueryGetTable(sql);
		ResultSet rs2 = baixe.ExcuteQueryGetTable(sql2);
		while(rs.next()) {
			socho = rs.getInt("socho");
		}
		while(rs2.next()) {
			dagui++;
		}
		System.out.println("So cho "+ socho);
		System.out.println("Da gui : " + dagui);
		int controng = socho - dagui;
		TongchoA.setText("Tổng số chỗ :  " + socho);
		DaguiA.setText("Số xe đã gửi :  " + dagui);
		ControngA.setText("Còn trống :  " + controng);
	}
	public void setBaiB() throws SQLException {
		int socho = 0;
		int dagui = 0;
		MyQuery baixe = new MyQuery();
		String sql = "SELECT * FROM `baixe` WHERE `id` = 2";
		String sql2 = "SELECT * FROM `luotgui` WHERE `baixe_id` = 2";
		ResultSet rs = baixe.ExcuteQueryGetTable(sql);
		ResultSet rs2 = baixe.ExcuteQueryGetTable(sql2);
		while(rs.next()) {
			socho = rs.getInt("socho");
		}
		while(rs2.next()) {
			dagui++;
		}
		System.out.println("So cho "+ socho);
		System.out.println("Da gui : " + dagui);
		int controng = socho - dagui;
		TongchoB.setText("Tổng số chỗ :  " + socho);
		DaguiB.setText("Số xe đã gửi :  " + dagui);
		ControngB.setText("Còn trống :  " + controng);
	}
	public void setBaiC() throws SQLException {
		int socho = 0;
		int dagui = 0;
		MyQuery baixe = new MyQuery();
		String sql = "SELECT * FROM `baixe` WHERE `id` = 3";
		String sql2 = "SELECT * FROM `luotgui` WHERE `baixe_id` = 3";
		ResultSet rs = baixe.ExcuteQueryGetTable(sql);
		ResultSet rs2 = baixe.ExcuteQueryGetTable(sql2);
		while(rs.next()) {
			socho = rs.getInt("socho");
		}
		while(rs2.next()) {
			dagui++;
		}
		System.out.println("So cho "+ socho);
		System.out.println("Da gui : " + dagui);
		int controng = socho - dagui;
		TongchoC.setText("Tổng số chỗ :  " + socho);
		DaguiC.setText("Số xe đã gửi :  " + dagui);
		ControngC.setText("Còn trống :  " + controng);
	}
	
	public void loadBaiXe(){
		try {
			setBaiA();
			setBaiB();
			setBaiC();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Load bai xe loi!");
		}
	}
	
	public void loadTimkiem() {
		String txt = txtTimKiem.getText();
		int ve_bien = Integer.parseInt(txt);
		String sql = "SELECT * FROM `luotgui` WHERE `vexe_id` = " + ve_bien + " OR `bienso` = " + ve_bien + "";
		load(sql);
		
	}
	
	public static void main(String[] args) {
		TrangChu home = new TrangChu();
	}
}
