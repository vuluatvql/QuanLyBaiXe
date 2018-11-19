package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class XuatXe extends JFrame{
	public XuatXe() {
		initXuatXe();
		setVisible(true);
	}
	public void initXuatXe(){
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setBounds(100, 100, 550, 350);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 217, 514, 33);
		getContentPane().add(panel);
		
		JButton btnOk = new JButton("OK");
		panel.add(btnOk);
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		JButton btnCancel = new JButton("Cancel");
		panel.add(btnCancel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 571, 205);
		getContentPane().add(panel_1);
		
		JLabel lblGia = new JLabel("Gia");
		
		JLabel lblID = new JLabel("Vé Xe");
		
		JLabel lblLoaixe = new JLabel("Loại Xe");
		
		JLabel lblGiovao = new JLabel("Giờ Vào");
		
		JLabel lblBaixe = new JLabel("Bai Xe");
		
		JLabel lblBienso = new JLabel("Bien So");
		
		JLabel lblNguoinhap = new JLabel("Nguoi Nhap");
		
		JLabel lblGiora = new JLabel("Gio Ra");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblGiovao)
						.addComponent(lblBaixe)
						.addComponent(lblLoaixe))
					.addPreferredGap(ComponentPlacement.RELATED, 241, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblBienso, Alignment.LEADING)
						.addComponent(lblNguoinhap, Alignment.LEADING)
						.addComponent(lblGiora, Alignment.LEADING))
					.addGap(217))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(257)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblGia)
						.addComponent(lblID))
					.addContainerGap(287, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(95)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblGiora)
								.addComponent(lblGiovao)))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblID)
							.addGap(30)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblLoaixe)
								.addComponent(lblBienso))))
					.addGap(27)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBaixe)
						.addComponent(lblNguoinhap))
					.addGap(18)
					.addComponent(lblGia)
					.addGap(23))
		);
		panel_1.setLayout(gl_panel_1);
		// TODO Auto-generated constructor stub
	}
}

