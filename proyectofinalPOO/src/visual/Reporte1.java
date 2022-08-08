package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import logico.BolsaUbicacion;
import logico.Obrero;
import logico.Tecnico;
import logico.Universatario;

import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Reporte1 extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private DefaultTableModel model;
	private Object row[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Reporte1 dialog = new Reporte1();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Reporte1() {
		setBounds(100, 100, 779, 465);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(new BorderLayout(0, 0));
			{
				JScrollPane scrollPane = new JScrollPane();
				panel.add(scrollPane, BorderLayout.CENTER);
				{
					JTabbedPane Jtable = new JTabbedPane(JTabbedPane.TOP);
					scrollPane.setViewportView(Jtable);
					{
						String headers[]= {"Tecnicos","Universitarios","Obreros"};
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
				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		loadTable();
	}
	private void loadTable() {
		model.setRowCount(0);
		row = new Object[model.getColumnCount()];
		for(int i = 0; i < BolsaUbicacion.getInstance().getCantSolicitudesPersona();i++) {
			if(BolsaUbicacion.getInstance().getSolipersona().get(i).isEstaContratada() == true && BolsaUbicacion.getInstance().getSolipersona().get(i)
					.getPersonaSolicitud() instanceof Universatario)
			{
				row[1] = BolsaUbicacion.getInstance().getSolipersona().get(i).getPersonaSolicitud().getNombre();
			}
			if(BolsaUbicacion.getInstance().getSolipersona().get(i).isEstaContratada() == true && BolsaUbicacion.getInstance().getSolipersona().get(i)
					.getPersonaSolicitud() instanceof Tecnico)
			{
				row[0] = BolsaUbicacion.getInstance().getSolipersona().get(i).getPersonaSolicitud().getNombre();
			}
			if(BolsaUbicacion.getInstance().getSolipersona().get(i).isEstaContratada() == true && BolsaUbicacion.getInstance().getSolipersona().get(i)
					.getPersonaSolicitud() instanceof Obrero)
			{
				row[2] = BolsaUbicacion.getInstance().getSolipersona().get(i).getPersonaSolicitud().getNombre();
			}
	      
		 model.addRow(row);
			}
		}
}
