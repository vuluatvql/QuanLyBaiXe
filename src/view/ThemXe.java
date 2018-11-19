package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import model.MyQuery;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.awt.GridBagConstraints;
import javax.swing.BoxLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.FlowLayout;

public class ThemXe extends JFrame{
	
	public int vexe = 1;
	String BienSo;
	String LoaiXe;
	String BaiXe;
	int NguoiThem;
	
	private JTextField txtBienSo;
	private JTextField txtSoVe;
	private JComboBox cbbLoaiXe;
	private JComboBox cbbBaiXe;
	
	private JButton btnOk;
	private JButton btnCancel;
	private JLabel lblLoiXe;
	private JLabel lblBinS;
	private JLabel lblSV;
	private JLabel lblBiXe;
	
	
	
	public ThemXe() {
		initThemXe();
		setVisible(true);
	}
	
	public void initThemXe() {
		
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setBounds(100, 100, 550, 350);

		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnOk = new JButton("OK");
		panel_1.add(btnOk);
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				MyQuery themxe = new MyQuery();
				load();
				
			}
		});
		
		btnCancel = new JButton("Cancel");
		panel_1.add(btnCancel);
		
		lblLoiXe = new JLabel("Loại Xe");
		
		lblBinS = new JLabel("Biển Số");
		
		lblSV = new JLabel("Số Vé");
		
		lblBiXe = new JLabel("Bãi Xe");
		
		cbbLoaiXe = new JComboBox();
		cbbLoaiXe.addItem("Xe Máy");
		cbbLoaiXe.addItem("Xe Đạp");
		cbbLoaiXe.addItem("Ô Tô");
		
		txtBienSo = new JTextField();
		txtBienSo.setColumns(10);
		
		txtSoVe = new JTextField();
		txtSoVe.setColumns(10);
		
		cbbBaiXe = new JComboBox();
		cbbBaiXe.addItem("Bãi A");
		cbbBaiXe.addItem("Bãi B");
		cbbBaiXe.addItem("Bãi C");
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
						.addComponent(panel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 534, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(72)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblBiXe)
							.addGap(69)
							.addComponent(cbbBaiXe, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblLoiXe)
								.addComponent(lblBinS)
								.addComponent(lblSV))
							.addGap(63)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(txtSoVe)
								.addComponent(txtBienSo)
								.addComponent(cbbLoaiXe, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(97, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(23)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(cbbLoaiXe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblLoiXe))
					.addGap(31)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBinS)
						.addComponent(txtBienSo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtSoVe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSV))
					.addGap(23)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblBiXe)
						.addComponent(cbbBaiXe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(42))
		);
		panel.setLayout(gl_panel);
		getContentPane().setLayout(groupLayout);
	}
	
	public void load() {
		BienSo = txtBienSo.getText();
		LoaiXe = (String) cbbLoaiXe.getSelectedItem();
		BaiXe = (String) cbbBaiXe.getSelectedItem();
		SoVe = Integer.parseInt(txtSoVe.getText());
		
//		long millis = System.currentTimeMillis();  
//		java.sql.Date date = new java.sql.Date(millis);
//		System.out.println(date);  
//		GioVao = date;
		
// 		long millis = System.currentTimeMillis();  
// 		java.sql.Timestamp date=new java.sql.Timestamp(millis);
// 		System.out.println(date);
		
		MyQuery ds = new MyQuery();
		String sql1 = "INSERT INTO vexe (id, loai) VALUES (" + String.valueOf(vexe) + ", Ngay)";
		String sql2 = "INSERT INTO baixe (id, tenbai) VALUES (" + BaiXe + ", Bai A)";
		String sql3 = "INSERT INTO luotgui (id, giovao, loaixe, bienso, vexe_id, baixe_id, user_id) VALUES (" + String.valueOf(vexe) + "NOW(), " + LoaiXe + ", " + BienSo + ", " + String.valueOf(vexe++) + ", " + BaiXe + ", 1)"; 
		
		ResultSet rs = ds.ExcuteQueryGetTable(sql1);
		ResultSet rs = ds.ExcuteQueryGetTable(sql2);
		ResultSet rs = ds.ExcuteQueryGetTable(sql3);
	}
}
