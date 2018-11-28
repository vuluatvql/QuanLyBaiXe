package view;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

import controller.AcCancel;
import model.MyQuery;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import java.awt.Color;

public class DangKy extends JFrame{
	private JTextField textPass;
	private JTextField textFullname;
	private JTextField textSDT;
	private JTextField textAddress;
	private JTextField textUsername;
	private JTextField textID;
	private JLabel labelThongbao;
	
	private DangNhap dk;
	
	public DangKy(DangNhap dk) {
		
		this.dk = dk;
		initComponent();
		setVisible(true);
	}
	public void initComponent() {
		
		setResizable(false);
		getContentPane().setBackground(new Color(255, 228, 225));
		setTitle("Đăng Ký");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setBounds(250, 100, 362, 450);
		JLabel lblngK = new JLabel("Đăng Ký");
		lblngK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblUsername = new JLabel("Username");
		
		JLabel lblPassword = new JLabel("Password");
		
		JLabel lblFullName = new JLabel("Full Name");
		
		JLabel lblSt = new JLabel("SĐT");
		
		JLabel lblAddress = new JLabel("Address");
		
		textPass = new JTextField();
		textPass.setColumns(10);
		
		textFullname = new JTextField();
		textFullname.setColumns(10);
		
		textSDT = new JTextField();
		textSDT.setColumns(10);
		
		textAddress = new JTextField();
		textAddress.setColumns(10);
		
		textUsername = new JTextField();
		textUsername.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					
					int id = Integer.parseInt(textID.getText());
					String user = textUsername.getText();
					int pass = Integer.parseInt(textPass.getText());
					String fullname = textFullname.getText();
					String sdt = textSDT.getText();
					String address = textAddress.getText();
					
					MyQuery insert = new MyQuery();
					String sql = "INSERT INTO `user` (`id`, `username`, `password`, `fullname`, `numberphone`, `address`, `quyen`)"
							+ " VALUES ('"+ id +"', '"+ user +"', '"+ pass +"', '"+ fullname +"', '"+ sdt +"', '"+ address +"', 'admin');";
					insert.ExcuteQueryUpdateDB(sql);
					dk.thongbao.setText("Đăng ký thành công!");
					DangKy.this.dispose();
				} catch (Exception e) {
					labelThongbao.setText("Thông tin chưa hợp lệ!");
					e.printStackTrace();
				}
			}
		});
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new AcCancel(DangKy.this));
		
		JLabel lblId = new JLabel("ID");
		
		textID = new JTextField();
		textID.setColumns(10);
		
		labelThongbao = new JLabel("Điền đầy đủ thông tin!");
		labelThongbao.setForeground(new Color(255, 0, 0));
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(labelThongbao, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnOk)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCancel))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(143)
							.addComponent(lblngK))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(21)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblPassword)
									.addGap(18)
									.addComponent(textPass))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblFullName)
										.addComponent(lblSt)
										.addComponent(lblAddress))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(textAddress, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
										.addComponent(textSDT, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
										.addComponent(textFullname)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblUsername)
										.addComponent(lblId))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(textID, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
										.addComponent(textUsername))))))
					.addContainerGap(24, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblngK)
					.addGap(34)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblId)
						.addComponent(textID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUsername)
						.addComponent(textUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPassword)
						.addComponent(textPass, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(37)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFullName)
						.addComponent(textFullname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(34)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSt)
						.addComponent(textSDT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(35)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAddress)
						.addComponent(textAddress, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(labelThongbao, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnOk)
						.addComponent(btnCancel))
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);
	}
}
