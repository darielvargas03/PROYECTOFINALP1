package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import logico.BolsaUbicacion;
import logico.Empresa;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;

public class RegistroEmpresa extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textID;
	private JTextField textNombre;
	private JTextField textDireccion;
	private JTextField textTelefono;
	private JTextField textRNC;
	private JTextField textDescripcion;
	private JTextField textPresupuesto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistroEmpresa dialog = new RegistroEmpresa();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistroEmpresa() {
		setBounds(100, 100, 809, 513);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setForeground(new Color(255, 255, 255));
			panel.setBackground(new Color(0, 0, 139));
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Por favor llenar los datos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("ID:");
				lblNewLabel.setBounds(51, 52, 56, 16);
				panel.add(lblNewLabel);
			}
			{
				JLabel lblNewLabel_1 = new JLabel("Nombre:");
				lblNewLabel_1.setBounds(51, 103, 56, 16);
				panel.add(lblNewLabel_1);
			}
			{
				JLabel lblNewLabel_2 = new JLabel("Direccion:");
				lblNewLabel_2.setBounds(51, 162, 84, 16);
				panel.add(lblNewLabel_2);
			}
			{
				JLabel lblNewLabel_3 = new JLabel("Telefono:");
				lblNewLabel_3.setBounds(51, 220, 56, 16);
				panel.add(lblNewLabel_3);
			}
			{
				JLabel lblNewLabel_4 = new JLabel("RNC");
				lblNewLabel_4.setBounds(51, 280, 56, 16);
				panel.add(lblNewLabel_4);
			}
			{
				JLabel lblNewLabel_5 = new JLabel("Descripcion:");
				lblNewLabel_5.setBounds(35, 325, 72, 16);
				panel.add(lblNewLabel_5);
			}
			{
				textID = new JTextField();
				textID.setBounds(118, 49, 158, 22);
				panel.add(textID);
				textID.setColumns(10);
			}
			{
				textNombre = new JTextField();
				textNombre.setColumns(10);
				textNombre.setBounds(118, 100, 158, 22);
				panel.add(textNombre);
			}
			{
				textDireccion = new JTextField();
				textDireccion.setColumns(10);
				textDireccion.setBounds(118, 159, 158, 22);
				panel.add(textDireccion);
			}
			{
				textTelefono = new JTextField();
				textTelefono.setColumns(10);
				textTelefono.setBounds(118, 217, 158, 22);
				panel.add(textTelefono);
			}
			{
				textRNC = new JTextField();
				textRNC.setColumns(10);
				textRNC.setBounds(118, 277, 158, 22);
				panel.add(textRNC);
			}
			{
				textDescripcion = new JTextField();
				textDescripcion.setForeground(new Color(255, 255, 255));
				textDescripcion.setBackground(new Color(0, 0, 139));
				textDescripcion.setColumns(10);
				textDescripcion.setBounds(118, 325, 178, 103);
				panel.add(textDescripcion);
			}
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBackground(Color.WHITE);
				panel_1.setBounds(12, 28, 515, 415);
				panel.add(panel_1);
				panel_1.setLayout(null);
				{
					JButton btnNewButton = new JButton("Registrar");
					btnNewButton.setBounds(330, 350, 95, 25);
					panel_1.add(btnNewButton);
					btnNewButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							Empresa aux = new Empresa(textID.getText(), textNombre.getText(), textDireccion.getText(),textTelefono.getText() ,textRNC.getText(), textDescripcion.getText(), Integer.parseInt(textPresupuesto.getText()));
							BolsaUbicacion.getInstance().AddEmpresa(aux);
							JOptionPane.showMessageDialog(getContentPane(), "Exitoso");
							textNombre.setText("");
							textDescripcion.setText("");
							textDireccion.setText("");
							textID.setText("");
							textPresupuesto.setText("");
							textRNC.setText("");
							textTelefono.setText("");
						}
					});
					btnNewButton.setBackground(Color.WHITE);
				}
				{
					JLabel lblNewLabel_6 = new JLabel("Presupuesto Anual:");
					lblNewLabel_6.setBounds(316, 43, 136, 16);
					panel_1.add(lblNewLabel_6);
				}
				{
					textPresupuesto = new JTextField();
					textPresupuesto.setColumns(10);
					textPresupuesto.setBounds(294, 84, 158, 22);
					panel_1.add(textPresupuesto);
				}
			}
			{
				JButton btnNewButton_1 = new JButton("Volver");
				btnNewButton_1.setBackground(new Color(255, 255, 255));
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				btnNewButton_1.setBounds(672, 418, 97, 25);
				panel.add(btnNewButton_1);
			}
		}
	}

}
