package view;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import controller.AcCancel;
import model.MyQuery;

import javax.swing.JLabel;
import java.awt.Color;

public class SuaThongTin extends JFrame{

	int userID;
	String BienSo;
	int SoVe;
	String LoaiXe;
	int BaiXe;

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

	private JPanel panel_2;
	private JLabel lblthongbao;
	
	private TrangChu home;
	private JTable table;
	private DefaultTableModel model;

	public SuaThongTin(TrangChu home, JTable table, DefaultTableModel model) {
		this.home = home;
		this.table = table;
		this.model = model;
		initThemXe();
		setVisible(true);
		
		try {
			int sr = table.getSelectedRow();
			cbbLoaiXe.setSelectedItem(model.getValueAt(sr, 1));
			txtBienSo.setText((String) model.getValueAt(sr, 2));
			txtSoVe.setText((String) model.getValueAt(sr, 3));
			cbbBaiXe.setSelectedItem(model.getValueAt(sr, 5));
		} catch (Exception e) {
			lblthongbao.setText("Chưa chọn xe!");
		}
	}

	public void initThemXe() {

		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		setResizable(false);
		setTitle("Sửa Thông Tin");

		JPanel panel = new JPanel();

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		btnOk = new JButton("OK");
		panel_1.add(btnOk);
		btnOk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					load();
					lblthongbao.setText("Sửa thông tin thành công!");
					String sql = "SELECT * FROM luotgui";
					home.load(sql);
					SuaThongTin.this.dispose();
				} catch (Exception e2) {
					lblthongbao.setText("Sửa thông tin không thành công!");
				}

			}
		});

		btnCancel = new JButton("Cancel");
		panel_1.add(btnCancel);
		btnCancel.addActionListener(new AcCancel(SuaThongTin.this));

		lblLoiXe = new JLabel("Loại Xe");

		lblBinS = new JLabel("Biển Số");

		lblSV = new JLabel("Số Vé");

		lblBiXe = new JLabel("Bãi Xe");

		cbbLoaiXe = new JComboBox();
		cbbLoaiXe.addItem("Xe May");
		cbbLoaiXe.addItem("Xe Dap");
		cbbLoaiXe.addItem("O To");

		txtBienSo = new JTextField();
		txtBienSo.setColumns(10);

		txtSoVe = new JTextField();
		txtSoVe.setColumns(10);

		cbbBaiXe = new JComboBox();
		cbbBaiXe.addItem("Bãi A");
		cbbBaiXe.addItem("Bãi B");
		cbbBaiXe.addItem("Bãi C");

		panel_2 = new JPanel();

		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
								.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
								.addGap(10))
						.addComponent(panel, 0, 0, Short.MAX_VALUE)).addGap(0)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
								.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));

		lblthongbao = new JLabel("");
		lblthongbao.setForeground(Color.RED);
		panel_2.add(lblthongbao);

		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addGap(48)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup().addComponent(lblBiXe).addGap(69)
										.addComponent(cbbBaiXe, 0, 267, Short.MAX_VALUE))
								.addGroup(gl_panel.createSequentialGroup()
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addComponent(lblLoiXe)
												.addComponent(lblBinS).addComponent(lblSV))
										.addGap(63)
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addComponent(txtSoVe, 267, 267, 267)
												.addComponent(txtBienSo, 267, 267, 267).addComponent(cbbLoaiXe,
														GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE))))
						.addGap(71)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup().addGap(30)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(cbbLoaiXe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblLoiXe))
				.addGap(31)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblBinS).addComponent(txtBienSo,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtSoVe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSV))
				.addGap(23)
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING).addComponent(lblBiXe).addComponent(cbbBaiXe,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(35, Short.MAX_VALUE)));
		panel.setLayout(gl_panel);
		getContentPane().setLayout(groupLayout);
	}

	public void load() throws SQLException {
		int sr = table.getSelectedRow();
		String sid = (String) model.getValueAt(sr, 0);
		int id = Integer.parseInt(sid);
		int luotguiID = id;
		System.out.println("luot gui ID:  " + luotguiID);
		
		int i = 1;
		if (cbbBaiXe.getSelectedItem() == "Bãi A") {
			i = 1;
		} else if (cbbBaiXe.getSelectedItem() == "Bãi B") {
			i = 2;
		} else if (cbbBaiXe.getSelectedItem() == "Bãi C") {
			i = 3;
		}
		BienSo = txtBienSo.getText();
		LoaiXe = (String) cbbLoaiXe.getSelectedItem();
		BaiXe = i;
		SoVe = Integer.parseInt(txtSoVe.getText());
		System.out.println("Bien so : " + BienSo + ", Loai Xe : " + LoaiXe + ", Bai xe : " + BaiXe + ", So ve : " + SoVe);
		
		MyQuery suatt = new MyQuery();
		
		String sql = "UPDATE `luotgui` SET `loaixe` = '"+ LoaiXe +"', `bienso` = '"+ BienSo +"', `vexe_id` = '"+ SoVe +"', `baixe_id` = '"+ BaiXe +"' WHERE `luotgui`.`id` = "+ luotguiID +";";
		suatt.ExcuteQueryUpdateDB(sql);
		
	}
}
