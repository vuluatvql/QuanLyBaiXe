package view;

import javax.swing.JFrame;
import javax.swing.JLabel;

import controller.AcCancel;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DangXuat extends JFrame{
	public DangXuat(TrangChu home) {
		getContentPane().setLayout(null);
		setVisible(true);
		setTitle("Đăng Xuất");
		setBounds(300, 300, 300, 200);
		setResizable(false);
		
		JLabel lblNewLabel = new JLabel("Bạn có muốn đăng xuất?");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(57, 11, 199, 62);
		getContentPane().add(lblNewLabel);
		
		JButton btnOk = new JButton("Có");
		btnOk.setBounds(43, 105, 89, 23);
		getContentPane().add(btnOk);
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				home.disableControl();
				DangXuat.this.dispose();
			}
		});
		
		JButton btnCancel = new JButton("Không");
		btnCancel.setBounds(149, 105, 89, 23);
		getContentPane().add(btnCancel);
		btnCancel.addActionListener(new AcCancel(DangXuat.this));
	}
}
