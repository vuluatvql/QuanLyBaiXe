package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class AcCancel implements ActionListener{
	JFrame cancel;
	
	public AcCancel(JFrame cancel) {
		// TODO Auto-generated constructor stub
		this.cancel = cancel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		cancel.dispose();
	}

}
