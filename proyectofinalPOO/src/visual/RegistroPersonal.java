package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;

import logico.BolsaUbicacion;
import logico.Obrero;
import logico.Persona;
import logico.Tecnico;
import logico.Universatario;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class RegistroPersonal extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textCedula;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textEdad;
	private JTextField textCorreo;
	private JTextField textDireccion;
	private JTextField textTelefono;
	private JTextField textSalario;
	private JRadioButton rdbNoProfesional;
	private JRadioButton rdbSiProfesional;
	private JComboBox boxCampo;
	private JComboBox boxEstado;
	private JTextField textTecnico;
	private JTextField textInstitucion;
	private JTextField textCarrera;
	private JTextField textAreaLaboral;
	private JRadioButton rdbUniversitario;
	private JRadioButton rdbTecnico;
	private JRadioButton rdbObrero;
	private JLabel lblTecnico;
	private JLabel lblInstitucion;
	private JLabel lblCarrera;
	private JLabel lblArea;
	private JComboBox BoxSexo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistroPersonal dialog = new RegistroPersonal();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistroPersonal() {
		setBounds(100, 100, 823, 543);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(0, 0, 139));
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Por favor llena los campos", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("Cedula:");
				lblNewLabel.setBounds(44, 37, 56, 16);
				panel.add(lblNewLabel);
			}
			{
				JLabel lblNewLabel_1 = new JLabel("Nombres:");
				lblNewLabel_1.setBounds(44, 71, 56, 16);
				panel.add(lblNewLabel_1);
			}
			{
				JLabel lblNewLabel_2 = new JLabel("Apellidos:");
				lblNewLabel_2.setBounds(44, 111, 56, 16);
				panel.add(lblNewLabel_2);
			}
			{
				JLabel lblNewLabel_3 = new JLabel("Sexo:");
				lblNewLabel_3.setBounds(44, 155, 56, 16);
				panel.add(lblNewLabel_3);
			}
			{
				JLabel lblNewLabel_4 = new JLabel("Edad:");
				lblNewLabel_4.setBounds(44, 203, 56, 16);
				panel.add(lblNewLabel_4);
			}
			{
				JLabel lblNewLabel_5 = new JLabel("Correo:");
				lblNewLabel_5.setBounds(44, 248, 56, 16);
				panel.add(lblNewLabel_5);
			}
			{
				JLabel lblNewLabel_6 = new JLabel("Direccion");
				lblNewLabel_6.setBounds(44, 291, 56, 16);
				panel.add(lblNewLabel_6);
			}
			{
				JLabel lblNewLabel_7 = new JLabel("Telefono:");
				lblNewLabel_7.setBounds(44, 337, 56, 16);
				panel.add(lblNewLabel_7);
			}
			{
				JLabel lblNewLabel_8 = new JLabel("Salario:");
				lblNewLabel_8.setBounds(44, 390, 56, 16);
				panel.add(lblNewLabel_8);
			}
			{
				textCedula = new JTextField();
				textCedula.setBounds(112, 34, 153, 22);
				panel.add(textCedula);
				textCedula.setColumns(10);
			}
			{
				textNombre = new JTextField();
				textNombre.setColumns(10);
				textNombre.setBounds(112, 68, 153, 22);
				panel.add(textNombre);
			}
			{
				textApellido = new JTextField();
				textApellido.setColumns(10);
				textApellido.setBounds(112, 108, 153, 22);
				panel.add(textApellido);
			}
			{
				textEdad = new JTextField();
				textEdad.setColumns(10);
				textEdad.setBounds(112, 200, 153, 22);
				panel.add(textEdad);
			}
			{
				textCorreo = new JTextField();
				textCorreo.setColumns(10);
				textCorreo.setBounds(112, 245, 153, 22);
				panel.add(textCorreo);
			}
			{
				textDireccion = new JTextField();
				textDireccion.setColumns(10);
				textDireccion.setBounds(112, 288, 153, 22);
				panel.add(textDireccion);
			}
			{
				textTelefono = new JTextField();
				textTelefono.setColumns(10);
				textTelefono.setBounds(112, 334, 153, 22);
				panel.add(textTelefono);
			}
			{
				textSalario = new JTextField();
				textSalario.setColumns(10);
				textSalario.setBounds(112, 387, 153, 22);
				panel.add(textSalario);
			}
			{
				JLabel lblNewLabel_9 = new JLabel(" Es profesional?");
				lblNewLabel_9.setBounds(122, 421, 111, 16);
				panel.add(lblNewLabel_9);
			}
			
			rdbSiProfesional = new JRadioButton("Si");
			rdbSiProfesional.setBackground(Color.WHITE);
			rdbSiProfesional.setBounds(102, 443, 67, 25);
			panel.add(rdbSiProfesional);
			
			rdbNoProfesional = new JRadioButton("No");
			rdbNoProfesional.setBackground(Color.WHITE);
			rdbNoProfesional.setBounds(199, 443, 67, 25);
			panel.add(rdbNoProfesional);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBackground(Color.WHITE);
			panel_1.setBounds(12, 23, 577, 446);
			panel.add(panel_1);
			panel_1.setLayout(null);
			
			JButton btnNewButton = new JButton("Registrar");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String cedula = textCedula.getText();
					String nombre = textNombre.getText();
					String apellido = textApellido.getText();
					String email =  textCorreo.getText();
					String telefono = textTelefono.getText();
					String direccion = textDireccion.getText();
					int edad = Integer.parseInt(textEdad.getText());
					char genero = 'F';
					if(BoxSexo.getSelectedItem().equals("Masculino"))
						genero = 'M';
					String campodetrabajo = (String) boxCampo.getSelectedItem();
					boolean profesional = false;
					if(rdbSiProfesional.isSelected())
						profesional = true;
					int salariobase = Integer.parseInt(textSalario.getText());
					String estadoCivil = (String) boxEstado.getSelectedItem();
					if(rdbObrero.isSelected()) {
						Persona aux = new Obrero(cedula, nombre, apellido, telefono, email, genero, campodetrabajo, profesional, salariobase, estadoCivil,textAreaLaboral.getText(),edad,direccion);
						BolsaUbicacion.getInstance().AddPersona(aux);
					}
					else if(rdbUniversitario.isSelected()) {
						Persona aux = new Universatario(cedula, nombre, apellido, telefono, email, genero, campodetrabajo, profesional, salariobase, estadoCivil, textCarrera.getText(),edad,direccion);
						BolsaUbicacion.getInstance().AddPersona(aux);
					}
					else if(rdbTecnico.isSelected()) {
						Persona aux = new Tecnico(cedula, nombre, apellido, telefono, email, genero, campodetrabajo, profesional, salariobase, estadoCivil, textTecnico.getText(), textInstitucion.getText(),edad,direccion);
						BolsaUbicacion.getInstance().AddPersona(aux);
					}
					JOptionPane.showMessageDialog(getContentPane(), "Exitoso");
					LimpiarTodo();
					
				}
			});
			btnNewButton.setBounds(362, 373, 108, 25);
			panel_1.add(btnNewButton);
			btnNewButton.setBackground(Color.WHITE);
			
			JLabel lblNewLabel_10 = new JLabel("Campo Lab:");
			lblNewLabel_10.setBounds(273, 13, 76, 16);
			panel_1.add(lblNewLabel_10);
			
			boxCampo = new JComboBox();
			boxCampo.setBackground(Color.WHITE);
			boxCampo.setModel(new DefaultComboBoxModel(new String[] {"Turismo", "Salud", "Educacion"}));
			boxCampo.setBounds(361, 10, 97, 22);
			panel_1.add(boxCampo);
			
			JLabel lblNewLabel_11 = new JLabel("Estado Civil:");
			lblNewLabel_11.setBounds(273, 71, 76, 16);
			panel_1.add(lblNewLabel_11);
			
			boxEstado = new JComboBox();
			boxEstado.setModel(new DefaultComboBoxModel(new String[] {"Casado", "Soltero", "Union Libre"}));
			boxEstado.setBounds(361, 68, 97, 22);
			panel_1.add(boxEstado);
			
			BoxSexo = new JComboBox();
			BoxSexo.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Femenino"}));
			BoxSexo.setBounds(98, 128, 156, 22);
			panel_1.add(BoxSexo);
			
			rdbTecnico = new JRadioButton("Tecnico");
			rdbTecnico.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbObrero.setSelected(false);
					rdbUniversitario.setSelected(false);
					lblInstitucion.setVisible(true);
					lblTecnico.setVisible(true);
					textTecnico.setVisible(true);
					textInstitucion.setVisible(true);
					lblCarrera.setVisible(false);
					textCarrera.setVisible(false);
					lblArea.setVisible(false);
					textAreaLaboral.setVisible(false);
					
					
				}
			});
			rdbTecnico.setBackground(Color.WHITE);
			rdbTecnico.setBounds(273, 115, 85, 25);
			panel_1.add(rdbTecnico);
			
			rdbUniversitario = new JRadioButton("Universitario");
			rdbUniversitario.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbObrero.setSelected(false);
					rdbTecnico.setSelected(false);
					rdbUniversitario.setSelected(true);
					lblInstitucion.setVisible(false);
					lblTecnico.setVisible(false);
					textTecnico.setVisible(false);
					textInstitucion.setVisible(false);
					lblCarrera.setVisible(true);
					textCarrera.setVisible(true);
					lblArea.setVisible(false);
					textAreaLaboral.setVisible(false);
					
				}
			});
			rdbUniversitario.setBackground(Color.WHITE);
			rdbUniversitario.setBounds(361, 115, 109, 25);
			panel_1.add(rdbUniversitario);
			
			rdbObrero = new JRadioButton("Obrero");
			rdbObrero.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbObrero.setSelected(true);
					rdbTecnico.setSelected(false);
					rdbUniversitario.setSelected(false);
					lblInstitucion.setVisible(false);
					lblTecnico.setVisible(false);
					textTecnico.setVisible(false);
					textInstitucion.setVisible(false);
					lblCarrera.setVisible(false);
					textCarrera.setVisible(false);
					lblArea.setVisible(true);
					textAreaLaboral.setVisible(true);
					
				}
			});
			rdbObrero.setBackground(Color.WHITE);
			rdbObrero.setBounds(469, 115, 108, 25);
			panel_1.add(rdbObrero);
			
			JPanel panel_2 = new JPanel();
			panel_2.setForeground(new Color(255, 255, 255));
			panel_2.setBackground(new Color(0, 0, 139));
			panel_2.setBounds(273, 170, 292, 190);
			panel_1.add(panel_2);
			panel_2.setLayout(null);
			
			lblTecnico = new JLabel("Tecnico:");
			lblTecnico.setVisible(false);
			lblTecnico.setForeground(new Color(255, 255, 255));
			lblTecnico.setBounds(12, 13, 56, 16);
			panel_2.add(lblTecnico);
			
			lblInstitucion = new JLabel("Nombre Institucion:");
			lblInstitucion.setVisible(false);
			lblInstitucion.setForeground(Color.WHITE);
			lblInstitucion.setBounds(12, 52, 112, 16);
			panel_2.add(lblInstitucion);
			
			textTecnico = new JTextField();
			textTecnico.setVisible(false);
			textTecnico.setBounds(136, 10, 116, 22);
			panel_2.add(textTecnico);
			textTecnico.setColumns(10);
			
			textInstitucion = new JTextField();
			textInstitucion.setVisible(false);
			textInstitucion.setColumns(10);
			textInstitucion.setBounds(136, 49, 116, 22);
			panel_2.add(textInstitucion);
			
			lblCarrera = new JLabel("Carrera:");
			lblCarrera.setVisible(false);
			lblCarrera.setForeground(Color.WHITE);
			lblCarrera.setBounds(12, 52, 112, 16);
			panel_2.add(lblCarrera);
			
			textCarrera = new JTextField();
			textCarrera.setVisible(false);
			textCarrera.setColumns(10);
			textCarrera.setBounds(75, 49, 177, 22);
			panel_2.add(textCarrera);
			
			lblArea = new JLabel("Area laboral:");
			lblArea.setVisible(false);
			lblArea.setForeground(new Color(255, 255, 255));
			lblArea.setBounds(12, 52, 89, 16);
			panel_2.add(lblArea);
			
			textAreaLaboral = new JTextField();
			textAreaLaboral.setVisible(false);
			textAreaLaboral.setColumns(10);
			textAreaLaboral.setBounds(136, 49, 116, 22);
			panel_2.add(textAreaLaboral);
			
			JButton btnNewButton_1 = new JButton("Volver");
			btnNewButton_1.setBackground(new Color(255, 255, 255));
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnNewButton_1.setBounds(698, 461, 97, 25);
			panel.add(btnNewButton_1);
		}
	}
	public void LimpiarTodo() {
		textCedula.setText("");
		textNombre.setText("");
		textApellido.setText("");
		textAreaLaboral.setText("");
		textCarrera.setText("");
		textCorreo.setText("");
		textDireccion.setText("");
		textEdad.setText("");
		textSalario.setText("");
		textTelefono.setText("");
		textTecnico.setText("");
		BoxSexo.setSelectedIndex(1);
		boxCampo.setSelectedIndex(1);
		boxEstado.setSelectedIndex(1);
	}
}
