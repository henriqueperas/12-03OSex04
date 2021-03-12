package controller;

import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JLabel;

public class ThreadCarro extends Thread {
	
	private JLabel lblCarro;
	private JButton btnIniciar;
	
	public ThreadCarro(JLabel lblCarro, JButton btnIniciar) {
		this.lblCarro = lblCarro;
		this.btnIniciar = btnIniciar;
	}
	
	private void mexeBolinha() {
		btnIniciar.setEnabled(false);
		
		Rectangle posicao;
		posicao = lblCarro.getBounds();
		lblCarro.setBounds(posicao);
		int arranque = 0;
		for (int i = 0; i < 10; i++) {
			arranque = (int)(Math.random()*50);
			posicao.x += arranque;
			lblCarro.setBounds(posicao);
			try {
			Thread.sleep(500);
			} catch (InterruptedException ex) {
			ex.printStackTrace();
			}
		}
		btnIniciar.setEnabled(true);
	}
	@Override
	public void run() {
	mexeBolinha();
	}
}