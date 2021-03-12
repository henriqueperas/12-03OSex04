package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class CarroController implements ActionListener{
	
	private JLabel lblCarro1;
	private JLabel lblCarro2;
	private JButton btnIniciar;
	
	public CarroController(JLabel lblCarro1, JLabel lblCarro2, JButton btnIniciar) {
		this.lblCarro1 = lblCarro1;
		this.lblCarro2 = lblCarro2;
		this.btnIniciar = btnIniciar;
	}
	
	private void botaoBolinha(){
		Thread t1 = new ThreadCarro(lblCarro1, btnIniciar);
		Thread t2 = new ThreadCarro(lblCarro2, btnIniciar);
		t1.start();
		t2.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	botaoBolinha();
	}
}