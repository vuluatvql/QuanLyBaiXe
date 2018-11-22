package view;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

import controller.AcCancel;
import model.MyQuery;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class BaiXe extends JFrame{
	
	JLabel lblControngC;
	JLabel lblDaguiC;
	JLabel lblTongchoC;
	
	JLabel lblControngB;
	JLabel lblDaguiB;
	JLabel lblTongchoB;
	
	JLabel lblTongchoA;
	JLabel lblDaguiA;
	JLabel lblControngA;
	
	
	public BaiXe() {
		initBaiXe();
		setVisible(true);
		try {
			setBaiA();
			setBaiB();
			setBaiC();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void initBaiXe() {
		setBounds(200, 200, 550, 363);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		getContentPane().setForeground(new Color(216, 191, 216));
		setTitle("Bãi Xe");
		setResizable(false);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 128, 0), 2, true));
		panel.setForeground(new Color(144, 238, 144));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 255), 2, true));
		panel_1.setForeground(new Color(65, 105, 225));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(255, 0, 0), 2, true));
		panel_2.setForeground(new Color(255, 160, 122));
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new AcCancel(BaiXe.this));
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(14, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(389, Short.MAX_VALUE)
					.addComponent(btnOk)
					.addGap(56))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
					.addComponent(btnOk)
					.addContainerGap())
		);
		
		JLabel lblBiC = new JLabel("Bãi C");
		
		lblControngC = new JLabel("Còn trống:");
		
		lblDaguiC = new JLabel("Số xe đã gửi:");
		
		lblTongchoC = new JLabel("Tổng số chỗ:");
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(90)
					.addComponent(lblBiC, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lblControngC, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblTongchoC, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblDaguiC, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(9)
					.addComponent(lblBiC)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblTongchoC)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblDaguiC)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblControngC)
					.addContainerGap(46, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		JLabel lblBiB = new JLabel("Bãi B");
		
		lblControngB = new JLabel("Còn trống:");
		
		lblDaguiB = new JLabel("Số xe đã gửi:");
		
		lblTongchoB = new JLabel("Tổng số chỗ:");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(108)
					.addComponent(lblBiB, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblTongchoB, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
						.addComponent(lblDaguiB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblControngB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(9)
					.addComponent(lblBiB)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblTongchoB)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblDaguiB)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblControngB)
					.addContainerGap(46, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JLabel lblBiA = new JLabel("Bãi A");
		
		lblTongchoA = new JLabel("Tổng số chỗ:");
		
		lblDaguiA = new JLabel("Số xe đã gửi:");
		
		lblControngA = new JLabel("Còn trống:");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(90)
							.addComponent(lblBiA, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblControngA, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
								.addComponent(lblDaguiA, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblTongchoA, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
					.addContainerGap(40, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(9)
					.addComponent(lblBiA)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblTongchoA)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblDaguiA)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblControngA)
					.addContainerGap(41, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		getContentPane().setLayout(groupLayout);
	}
	
//	public void load(int baixeID, int socho, int dagui) throws SQLException {
//		
//		MyQuery baixe = new MyQuery();
//		String sql = "SELECT * FROM `baixe` WHERE `id` = "+ baixeID;
//		String sql2 = "SELECT * FROM `luotgui` WHERE `baixe_id` = "+ baixeID;
//		ResultSet rs = baixe.ExcuteQueryGetTable(sql);
//		ResultSet rs2 = baixe.ExcuteQueryGetTable(sql2);
//		while(rs.next()) {
//			socho = rs.getInt("socho");
//		}
//		while(rs2.next()) {
//			dagui++;
//		}
//		System.out.println("So cho "+ socho);
//		System.out.println("Da gui : " + dagui);
//	}
//	
	
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
		lblTongchoA.setText("Tổng số chỗ :  " + socho);
		lblDaguiA.setText("Số xe đã gửi :  " + dagui);
		lblControngA.setText("Còn trống :  " + controng);
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
		lblTongchoB.setText("Tổng số chỗ :  " + socho);
		lblDaguiB.setText("Số xe đã gửi :  " + dagui);
		lblControngB.setText("Còn trống :  " + controng);
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
		lblTongchoC.setText("Tổng số chỗ :  " + socho);
		lblDaguiC.setText("Số xe đã gửi :  " + dagui);
		lblControngC.setText("Còn trống :  " + controng);
	}

}
