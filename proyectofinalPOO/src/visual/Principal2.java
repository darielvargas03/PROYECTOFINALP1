package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Principal2 extends JFrame {

	private JPanel contentPane;
	private JButton btnReporte1;
	private JButton btnReporte2;
	private JButton btnReporte3;
	private JPanel panelReportes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal2 frame = new Principal2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal2() {
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 918, 554);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 139));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(70, 60, 767, 423);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registro");
		lblNewLabel.setFont(new Font("Sylfaen", Font.PLAIN, 34));
		lblNewLabel.setBounds(62, 77, 186, 54);
		panel_1.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Personal");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistroPersonal dialog = new RegistroPersonal();
				dialog.setVisible(true);
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(61, 144, 137, 75);
		panel_1.add(btnNewButton);
		
		JButton btnEmpresa = new JButton("Empresa");
		btnEmpresa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistroEmpresa dialog = new RegistroEmpresa();
				dialog.setVisible(true);
			}
		});
		btnEmpresa.setBackground(Color.WHITE);
		btnEmpresa.setBounds(61, 253, 137, 75);
		panel_1.add(btnEmpresa);
		
		JLabel lblNewLabel_1 = new JLabel("Tu informacion esta segura!");
		lblNewLabel_1.setFont(new Font("Script MT Bold", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(286, 377, 194, 33);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblSolicitud = new JLabel("Solicitud");
		lblSolicitud.setFont(new Font("Sylfaen", Font.PLAIN, 34));
		lblSolicitud.setBounds(273, 77, 186, 54);
		panel_1.add(lblSolicitud);
		
		JButton button = new JButton("Personal");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SolicitudPersonaVS frame = new SolicitudPersonaVS();
				frame.setVisible(true);
			}
		});
		button.setBackground(Color.WHITE);
		button.setBounds(259, 144, 137, 75);
		panel_1.add(button);
		
		JButton btnEmpresa_1 = new JButton("Empresa");
		btnEmpresa_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SolicitudEmpresaVS frame = new SolicitudEmpresaVS();
				frame.setVisible(true);
			}
		});
		btnEmpresa_1.setBackground(Color.WHITE);
		btnEmpresa_1.setBounds(259, 253, 137, 75);
		panel_1.add(btnEmpresa_1);
		
		JLabel lblReportes = new JLabel("Reportes");
		lblReportes.setFont(new Font("Sylfaen", Font.PLAIN, 34));
		lblReportes.setBounds(471, 77, 167, 54);
		panel_1.add(lblReportes);
		
		JButton btnNewButton_1 = new JButton("Reportes >");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelReportes.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(463, 185, 114, 75);
		panel_1.add(btnNewButton_1);
		
		panelReportes = new JPanel();
		panelReportes.setVisible(false);
		panelReportes.setBackground(new Color(0, 0, 139));
		panelReportes.setBounds(578, 167, 137, 161);
		panel_1.add(panelReportes);
		panelReportes.setLayout(null);
		
		btnReporte3 = new JButton("Reporte 3");
		btnReporte3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reporte3 dialog = new Reporte3();
				dialog.setVisible(true);
			}
		});
		btnReporte3.setBounds(20, 110, 97, 38);
		panelReportes.add(btnReporte3);
		btnReporte3.setBackground(new Color(255, 255, 255));
		
		btnReporte2 = new JButton("Reporte 2");
		btnReporte2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reporte2 dialog = new Reporte2();
				dialog.setVisible(true);
			}
		});
		btnReporte2.setBounds(20, 59, 97, 38);
		panelReportes.add(btnReporte2);
		btnReporte2.setBackground(new Color(255, 255, 255));
		
		btnReporte1 = new JButton("Reporte 1");
		btnReporte1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reporte1 dialog = new Reporte1();
				dialog.setVisible(true);
			}
		});
		btnReporte1.setBounds(20, 13, 97, 38);
		panelReportes.add(btnReporte1);
		btnReporte1.setBackground(new Color(255, 255, 255));
	}
}
