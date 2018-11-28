package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.AcCancel;
import model.MyQuery;

public class XuatXe extends JFrame{
	
	JLabel lblthongbao;
	JButton btnCancel;
	JPanel panel;
	JButton btnOk;
	JPanel panel_1;
	JLabel lblID;
	JLabel lblLoaixe;
	JLabel lblGiovao;
	JLabel lblBienso;
	JLabel lblGiora;
	JLabel lblNguoinhap;
	JLabel lblBaido;
	JLabel lblGia;
	JPanel panel_2;
	
	int luotguiID;
	JTable table;
	DefaultTableModel model;
	private TrangChu home;
	
	public XuatXe(JTable table, DefaultTableModel model, TrangChu home) {
		this.home = home;
		this.table = table;
		this.model = model;
		initXuatXe();
		setVisible(true);
		try {
			load();
			
		} catch (Exception e) {
			lblthongbao.setText("Chưa chọn xe!");
		}
	}
	public void initXuatXe(){
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		getContentPane().setLayout(null);
		setResizable(false);
		setTitle("Xuất Xe");
		
		panel = new JPanel();
		panel.setBounds(234, 206, 250, 44);
		getContentPane().add(panel);
		
		btnOk = new JButton("OK");
		panel.add(btnOk);
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					MyQuery xuatxe = new MyQuery();
					String sql = "DELETE FROM `luotgui` WHERE `luotgui`.`id` = " + luotguiID;
					xuatxe.ExcuteQueryUpdateDB(sql);
					lblthongbao.setText("Xuất xe thành công!");
					String sql2 = "SELECT * FROM luotgui";
					home.load(sql2);
					XuatXe.this.dispose();
				} catch (Exception e2) {
					lblthongbao.setText("Xuất xe không thành công!");
				}
				
			}
		});
		
		btnCancel = new JButton("Cancel");
		panel.add(btnCancel);
		btnCancel.addActionListener(new AcCancel(XuatXe.this));
		
		panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 474, 195);
		getContentPane().add(panel_1);
		
		lblID = new JLabel("Vé Xe");
		lblID.setForeground(Color.RED);
		lblID.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		lblLoaixe = new JLabel("Loại Xe");
		
		lblGiovao = new JLabel("Giờ Vào");
		
		lblBienso = new JLabel("Biển Số");
		
		lblGiora = new JLabel("Giờ Ra");
		
		lblNguoinhap = new JLabel("Người Nhập");
		
		lblBaido = new JLabel("Bãi Đỗ");
		
		lblGia = new JLabel("Giá :");
		lblGia.setForeground(Color.RED);
		lblGia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(36)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblGiovao)
								.addComponent(lblLoaixe)
								.addComponent(lblNguoinhap))
							.addGap(126)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblBienso)
								.addComponent(lblGiora)
								.addComponent(lblBaido)))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(191)
							.addComponent(lblGia)))
					.addContainerGap(107, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap(130, Short.MAX_VALUE)
					.addComponent(lblID, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
					.addGap(124))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(lblID)
					.addGap(26)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(40)
									.addComponent(lblGiovao))
								.addComponent(lblLoaixe))
							.addGap(29)
							.addComponent(lblNguoinhap))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(40)
									.addComponent(lblGiora))
								.addComponent(lblBienso))
							.addGap(29)
							.addComponent(lblBaido)))
					.addGap(18)
					.addComponent(lblGia)
					.addGap(19))
		);
		panel_1.setLayout(gl_panel_1);
		
		panel_2 = new JPanel();
		panel_2.setBounds(10, 206, 223, 44);
		getContentPane().add(panel_2);
		
		lblthongbao = new JLabel("");
		lblthongbao.setForeground(Color.RED);
		panel_2.add(lblthongbao);
	}
	
	public void load() throws Exception {
		int sr = table.getSelectedRow();
		String sid = (String) model.getValueAt(sr, 0);
		int id = Integer.parseInt(sid);
		luotguiID = id;
		String baidoID = (String) model.getValueAt(sr, 5);
		String nguoinhapID = (String) model.getValueAt(sr, 6);
		
		String baido = "Bãi A";
		switch ( baidoID ) {
		  case "1":
			  baido = "Bãi A";
		   break;
		  case "2":
			  baido = "Bãi B";
		   break;
		  case "3":
			  baido = "Bãi C";
		   break;
		  default:
		}
		String nguoinhap = "Vũ Luật";
		switch ( nguoinhapID ) {
		  case "1":
			  nguoinhap = "Vũ Luật";
		   break;
		  case "2":
			  nguoinhap = "Cao Hiếu";
		   break;
		  case "3":
			  nguoinhap = "Sơn Tùng";
		   break;
		  default:
		}
		
		String sove = (String) model.getValueAt(sr, 3);
		String loaixe = (String) model.getValueAt(sr, 1);
		String bienso = (String) model.getValueAt(sr, 2);
		String giovao = (String) model.getValueAt(sr, 4);
		
		
		//truy van lay ra loai ve.
		MyQuery loaive = new MyQuery();
		String loaivesql = "SELECT `loai` FROM `vexe` WHERE `id` = " + sove;
		ResultSet rsloaive = loaive.ExcuteQueryGetTable(loaivesql);
		String ve = "";
		while(rsloaive.next()) {
			ve = rsloaive.getString("loai");
		}
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		String giora = dateFormat.format(cal.getTime());
		
		int noDay = 0;
		//tính số ngày gửi xe
		try {
			Calendar c1 = Calendar.getInstance();
			Calendar c2 = Calendar.getInstance();
			
			java.util.Date date = dateFormat.parse(giovao);
			java.util.Date date1 = dateFormat.parse(giora);
			
			c1.setTime(date);
			c2.setTime(date1);
			
			noDay = (int) ((c2.getTime().getTime() - c1.getTime().getTime()) / (24 * 3600 * 1000));
			System.out.println(noDay);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		lblID.setText("Số Vé  : " + sove + "   Vé :  " + ve);
		lblLoaixe.setText("Loại Xe  : " + loaixe);
		lblBienso.setText("Biển Số  : " + bienso);
		lblGiovao.setText("Giờ Vào  : " + giovao);
		lblGiora.setText("Giờ Ra  : " + giora);
		lblNguoinhap.setText("Người Nhập  : " + nguoinhap);
		lblBaido.setText("Bãi Đỗ  : " + baido);
		
		int gia = 0;
		if (ve.equals("Thang")) {
			gia = 0;
		}
		else {
			
			if (loaixe.equals("Xe May")) {
				gia = 3000 + noDay*3000;
			}
			if (loaixe.equals("Xe Dap")) {
				gia = 2000 + noDay*2000;
			}
			if (loaixe.equals("O To")) {
				gia = 20000 + noDay*20000;
			}
		}
		System.out.println(gia);
		
		lblGia.setText("Giá  : " + gia);
	}
}

