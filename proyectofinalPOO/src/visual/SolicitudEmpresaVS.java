package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import logico.BolsaUbicacion;
import logico.Empresa;
import logico.Persona;
import logico.SolicitudEmpresa;
import logico.SolicitudPersona;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

public class SolicitudEmpresaVS extends JFrame {

	private JPanel contentPane;
	private JTextField textCodigoSolicitud;
	private JTextField textCodigo;
	private JTextField textcantEmpleados;
	private JTextField textLocalizacion;
	private JTextField textSalario;
	private JButton btnSolicitar;
	private JTable table;
	private DefaultTableModel model;
	private Object row[];
	private JRadioButton rdbTurismo;
	private JRadioButton rdbSalud;
	private JRadioButton rdbEducacion;
	private JButton btnContratar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SolicitudEmpresaVS frame = new SolicitudEmpresaVS();
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
	public SolicitudEmpresaVS() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 970, 530);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 255));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(12, 13, 918, 184);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		textCodigoSolicitud = new JTextField();
		textCodigoSolicitud.setEnabled(false);
		textCodigoSolicitud.setBounds(401, 0, 116, 22);
		panel_1.add(textCodigoSolicitud);
		textCodigoSolicitud.setColumns(10);
		textCodigoSolicitud.setText("SOLI-"+BolsaUbicacion.getInstance().getCantSolicitudesEmpresa());
		
		JLabel lblNewLabel = new JLabel("Codigo de la empresa:");
		lblNewLabel.setBounds(12, 32, 153, 16);
		panel_1.add(lblNewLabel);
		
		textCodigo = new JTextField();
		textCodigo.setBounds(177, 29, 164, 22);
		panel_1.add(textCodigo);
		textCodigo.setColumns(10);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Empresa aux = null;
				if(BolsaUbicacion.getInstance().BuscarEmpresaByCodigo(textCodigo.getText())!= null){
					aux = BolsaUbicacion.getInstance().BuscarEmpresaByCodigo(textCodigo.getText());
					JOptionPane.showMessageDialog(getContentPane(), "Empresa Encontrada");
					btnSolicitar.setEnabled(true);
				}
				else 
					JOptionPane.showMessageDialog(getContentPane(), "Empresa no existe.");
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(353, 28, 97, 22);
		panel_1.add(btnNewButton);
		
		textcantEmpleados = new JTextField();
		textcantEmpleados.setColumns(10);
		textcantEmpleados.setBounds(177, 64, 164, 22);
		panel_1.add(textcantEmpleados);
		
		textLocalizacion = new JTextField();
		textLocalizacion.setColumns(10);
		textLocalizacion.setBounds(177, 104, 164, 22);
		panel_1.add(textLocalizacion);
		
		textSalario = new JTextField();
		textSalario.setColumns(10);
		textSalario.setBounds(177, 139, 164, 22);
		panel_1.add(textSalario);
		
		JLabel lblNewLabel_1 = new JLabel("Cantidad de empleados:");
		lblNewLabel_1.setBounds(12, 67, 153, 16);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Localizacion:");
		lblNewLabel_2.setBounds(12, 107, 97, 16);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Salario:");
		lblNewLabel_3.setBounds(12, 142, 86, 16);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Tipo de trabajo:");
		lblNewLabel_4.setBounds(613, 49, 105, 16);
		panel_1.add(lblNewLabel_4);
		
		rdbTurismo = new JRadioButton("Turismo");
		rdbTurismo.setBackground(new Color(255, 255, 255));
		rdbTurismo.setBounds(471, 80, 105, 25);
		panel_1.add(rdbTurismo);
		
		rdbSalud = new JRadioButton("Salud");
		rdbSalud.setBackground(new Color(255, 255, 255));
		rdbSalud.setBounds(613, 80, 105, 25);
		panel_1.add(rdbSalud);
		
		rdbEducacion = new JRadioButton("Educacion");
		rdbEducacion.setBackground(new Color(255, 255, 255));
		rdbEducacion.setBounds(735, 80, 127, 25);
		panel_1.add(rdbEducacion);
		
		btnSolicitar = new JButton("Solicitar");
		btnSolicitar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float salario = Float.parseFloat(textSalario.getText());
				String localizacion = textLocalizacion.getText();
				String CampoTrabajo = "Salud";
				if(rdbEducacion.isSelected())
					CampoTrabajo = "Educacion";
				else if(rdbTurismo.isSelected())
					CampoTrabajo = "Turismo";
				loadTable(localizacion,salario,CampoTrabajo);
				btnContratar.setEnabled(true);
			}
		});
		btnSolicitar.setEnabled(false);
		btnSolicitar.setBackground(new Color(255, 255, 255));
		btnSolicitar.setBounds(610, 138, 97, 25);
		panel_1.add(btnSolicitar);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(12, 214, 918, 226);
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_2.add(scrollPane, BorderLayout.CENTER);
		
		{
			String headers[]= {"Cedula","Nombre"};
		    model = new DefaultTableModel();
			model.setColumnIdentifiers(headers);
			table = new JTable();
			table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					if(table.getSelectedRow()>-1) {
						//okButton.setEnabled(true);
					}
				}
			});
			table.setModel(model);
			scrollPane.setViewportView(table);
		}
		
		JButton btnNewButton_2 = new JButton("Volver");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.setBounds(845, 445, 97, 25);
		panel.add(btnNewButton_2);
		
		btnContratar = new JButton("Contratar");
		btnContratar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int fila = table.getSelectedRow();
				String selecionado = table.getValueAt(fila, 0).toString();
				Contratar(selecionado);

				textCodigoSolicitud.setText("SOLI-"+BolsaUbicacion.getInstance().getCantSolicitudesEmpresa());
				JOptionPane.showMessageDialog(getContentPane(), "Contratada");
				textCodigo.setText("");
				textcantEmpleados.setText("");
				textLocalizacion.setText("");
				textSalario.setText("");
			}
		});
		btnContratar.setEnabled(false);
		btnContratar.setBackground(new Color(255, 255, 255));
		btnContratar.setBounds(743, 445, 97, 25);
		panel.add(btnContratar);
	}
	private void loadTable( String ubicacion, float SalarioMaximo,String campoTrabajo) {
		model.setRowCount(0);
		row = new Object[model.getColumnCount()];
		for(int i = 0; i < BolsaUbicacion.getInstance().getCantSolicitudesPersona();i++) {
			Persona aux = BolsaUbicacion.getInstance().getSolipersona().get(i).getPersonaSolicitud();
			if(aux.getDireccion().equalsIgnoreCase(ubicacion) && aux.getSalariobase() == SalarioMaximo && aux.getCampodetrabajo().equalsIgnoreCase(campoTrabajo)) {
		     row[0] =  BolsaUbicacion.getInstance().getMipersona().get(i).getCedula();
		     row[1] =  BolsaUbicacion.getInstance().getMipersona().get(i).getNombre();
		     model.addRow(row);
			}
		 
		}
		}
	private void Contratar(String aux) {
		boolean bilingue = false;
		Persona aux2 = BolsaUbicacion.getInstance().BuscarPersonaByCedula(aux);
		Empresa aux5 = BolsaUbicacion.getInstance().BuscarEmpresaByCodigo(textCodigo.getText());
		String CampoTrabajo = "Salud";
		if(rdbEducacion.isSelected())
			CampoTrabajo = "Educacion";
		else if(rdbTurismo.isSelected())
			CampoTrabajo = "Turismo";	
		SolicitudEmpresa aux3 = new SolicitudEmpresa(textCodigoSolicitud.getText(),CampoTrabajo,Integer.parseInt(textcantEmpleados.getText()),textLocalizacion.getText(),Float.parseFloat(textSalario.getText()),aux5,aux2);
		SolicitudPersona aux6 = BolsaUbicacion.getInstance().BuscarSolicitudByPersona(aux2);
		BolsaUbicacion.getInstance().HacersolicitudEmpresa(aux3,aux6);
		
		
		
		
	}
	
}
