package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logico.BolsaUbicacion;
import logico.Persona;
import logico.SolicitudPersona;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SolicitudPersonaVS extends JFrame {

	private JPanel contentPane;
	private JTextField textCodigo;
	private JTextField textCedula;
	private JTextField textNombre;
	private JTextField textEdad;
	private JButton btnSolicitar;
	private JButton btnBuscar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SolicitudPersonaVS frame = new SolicitudPersonaVS();
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
	public SolicitudPersonaVS() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 389);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(12, 13, 508, 306);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		textCodigo = new JTextField();
		textCodigo.setEnabled(false);
		textCodigo.setBounds(161, 13, 185, 22);
		panel_1.add(textCodigo);
		textCodigo.setColumns(10);
		textCodigo.setText("SOLI-"+ BolsaUbicacion.getInstance().getCantSolicitudesPersona());
		
		JLabel lblNewLabel = new JLabel("Persona a Contratar:");
		lblNewLabel.setBounds(183, 54, 138, 16);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cedula:");
		lblNewLabel_1.setBounds(31, 86, 56, 16);
		panel_1.add(lblNewLabel_1);
		
		textCedula = new JTextField();
		textCedula.setBounds(111, 83, 248, 22);
		panel_1.add(textCedula);
		textCedula.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(BolsaUbicacion.getInstance().BuscarPersonaByCedula(textCedula.getText())!= null) {
					Persona aux = BolsaUbicacion.getInstance().BuscarPersonaByCedula(textCedula.getText());
					textNombre.setText(aux.getNombre());
					int edad = aux.getEdad();
					btnSolicitar.setEnabled(true);
					textEdad.setText(String.valueOf(edad));
					JOptionPane.showMessageDialog(getContentPane(), "Personal encontrado con exito.");
				}
				else
					JOptionPane.showMessageDialog(getContentPane(), "Personal no existente.");
			}
		});
		btnBuscar.setBackground(new Color(255, 255, 255));
		btnBuscar.setBounds(383, 82, 97, 25);
		panel_1.add(btnBuscar);
		
		textNombre = new JTextField();
		textNombre.setEnabled(false);
		textNombre.setBounds(111, 132, 248, 22);
		panel_1.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre:");
		lblNewLabel_2.setBounds(31, 135, 56, 16);
		panel_1.add(lblNewLabel_2);
		
		textEdad = new JTextField();
		textEdad.setEnabled(false);
		textEdad.setBounds(111, 177, 248, 22);
		panel_1.add(textEdad);
		textEdad.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Edad:");
		lblNewLabel_3.setBounds(31, 183, 56, 16);
		panel_1.add(lblNewLabel_3);
		
		btnSolicitar = new JButton("Solicitar");
		btnSolicitar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SolicitudPersona aux = new SolicitudPersona(textCodigo.getText(), BolsaUbicacion.getInstance().BuscarPersonaByCedula(textCedula.getText()));
				BolsaUbicacion.getInstance().SolicitarPersonal(aux);
				textCedula.setText("");
				textEdad.setText("");
				textNombre.setText("");
				textCodigo.setText("SOLI-"+ BolsaUbicacion.getInstance().getCantSolicitudesPersona());
				JOptionPane.showMessageDialog(getContentPane(), "Solicitud exitosa!");
			}
		});
		btnSolicitar.setEnabled(false);
		btnSolicitar.setBackground(new Color(255, 255, 255));
		btnSolicitar.setBounds(205, 219, 97, 25);
		panel_1.add(btnSolicitar);
		
		JButton btnNewButton_2 = new JButton("Volver");
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton_2.setBounds(410, 279, 97, 25);
		panel_1.add(btnNewButton_2);
	}
}
