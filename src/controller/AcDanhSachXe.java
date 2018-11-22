package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.TrangChu;

public class AcDanhSachXe implements ActionListener{
	
	TrangChu home;
	
	public AcDanhSachXe(TrangChu home) {
		this.home = home;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		home.load();
	}

}
