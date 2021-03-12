package view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.CarroController;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
	
			public void run() {
	
				try {
	
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();

				}

			}

		});

	}
	
	public Principal() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 250, 850, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCarro1 = new JLabel("Carro1");
		lblCarro1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCarro1.setBounds(58, 64, 68, 54);
		contentPane.add(lblCarro1);
		
		JLabel lblCarro2 = new JLabel("Carro2");
		lblCarro2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCarro2.setBounds(58, 64, 68, 234);
		contentPane.add(lblCarro2);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.setBounds(0, 0, 89, 23);
		contentPane.add(btnIniciar);
		
		if(lblCarro1.getX() > lblCarro2.getX()) {
			JLabel lblCarro1G = new JLabel("o Carro 1 ganhou");
			lblCarro1G.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblCarro1G.setBounds(58, 64, 368, 434);
			contentPane.add(lblCarro1G);
		}else {
			JLabel lblCarro2G = new JLabel("o Carro 2 ganhou");
			lblCarro2G.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblCarro2G.setBounds(58, 64, 268, 434);
			contentPane.add(lblCarro2G);
		}
		
		CarroController carroController = new CarroController(lblCarro1, lblCarro2, btnIniciar);
		btnIniciar.addActionListener(carroController);
		
		
	}
	
}
