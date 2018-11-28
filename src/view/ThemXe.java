package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import controller.AcCancel;
import model.MyQuery;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.SQLException;
import java.awt.GridBagConstraints;
import javax.swing.BoxLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.FlowLayout;
import java.awt.Color;

public class ThemXe extends JFrame {

	int userID;
	String BienSo;
	int SoVe;
	String LoaiXe;
	int BaiXe;
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

	private JPanel panel_2;
	private JLabel lblthongbao;
	
	private TrangChu home;

	public ThemXe(int id, TrangChu home) {
		this.home = home;
		this.userID = id;
		initThemXe();
		setVisible(true);
	}

	public void initThemXe() {

		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		setResizable(false);
		setTitle("Thêm Xe");

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
					lblthongbao.setText("Thêm xe thành công!");
					String sql = "SELECT * FROM luotgui";
					home.load(sql);
				} catch (Exception e2) {
					lblthongbao.setText("Thêm xe không thành công! Thông tin không hợp lệ");
				}

			}
		});

		btnCancel = new JButton("Cancel");
		panel_1.add(btnCancel);
		btnCancel.addActionListener(new AcCancel(ThemXe.this));

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
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
							.addGap(10))
						.addComponent(panel, 0, 0, Short.MAX_VALUE))
					.addGap(0))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);

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
		NguoiThem = userID;
		
		MyQuery themxe = new MyQuery();
		String sql = "INSERT INTO `luotgui` (`id`, `giovao`, `loaixe`, `bienso`, `vexe_id`, `baixe_id`, `user_id`)"
				+ " VALUES (NULL, NOW(), '" + LoaiXe + "', '" + BienSo + "', '"
				+ SoVe + "', '" + BaiXe + "', '" + NguoiThem + "');";
		themxe.ExcuteQueryUpdateDB(sql);
		
		txtBienSo.setText("");
		txtSoVe.setText("");
	}
}
