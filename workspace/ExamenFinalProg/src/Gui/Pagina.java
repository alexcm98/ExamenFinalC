package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import Models.Vehiculo;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class Pagina {

	private JFrame frame;
	private static JTextField txtMatricula;
	private static JButton btnRegistrar;
	private JButton btnCajaDelDia;
	private JButton btnPagoYSalida;
	private JButton btnEntradaVehiculo;
	private ArrayList<Vehiculo> listav = new ArrayList<Vehiculo>();
	private static int hora = 0;
	private static int minuto = 0;
	
	private Calendar fecha = Calendar.getInstance();
	private static JTextField txtMatricula_1;
	private static JTextField txtHoraEntrada;
	private static JTextField txtHoraSalida;
	private static JButton btnPagar;
	private static JTextField txtImporteEntregado;
	private static JLabel lblTotalAPagar;
	private static JLabel lblCambio;
	private static JButton btnBuscar;
	private static float importe = 0f;
	private static float importeTotal = 0f;
	private static JLabel lblImporteTotalObtenido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pagina window = new Pagina();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pagina() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 853, 439);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		btnEntradaVehiculo = new JButton("Entrada Vehiculo");
		btnEntradaVehiculo.setBounds(15, 20, 157, 61);
		frame.getContentPane().add(btnEntradaVehiculo);

		btnPagoYSalida = new JButton("Pago y Salida de Vehiculo");
		btnPagoYSalida.setBounds(263, 20, 153, 61);
		frame.getContentPane().add(btnPagoYSalida);

		btnCajaDelDia = new JButton("Caja del Dia");
		btnCajaDelDia.setBounds(504, 20, 153, 61);
		frame.getContentPane().add(btnCajaDelDia);

		txtMatricula = new JTextField();
		txtMatricula.setForeground(Color.LIGHT_GRAY);
		txtMatricula.setText("Matricula");
		txtMatricula.setBounds(30, 135, 142, 37);
		frame.getContentPane().add(txtMatricula);
		txtMatricula.setColumns(10);
	

		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(65, 213, 107, 61);
		frame.getContentPane().add(btnRegistrar);

		txtMatricula_1 = new JTextField();
		txtMatricula_1.setText("Matricula");
		txtMatricula_1.setForeground(Color.LIGHT_GRAY);
		txtMatricula_1.setBounds(182, 135, 153, 37);
		frame.getContentPane().add(txtMatricula_1);
		txtMatricula_1.setColumns(10);
		

		txtHoraEntrada = new JTextField();
		txtHoraEntrada.setForeground(Color.LIGHT_GRAY);
		txtHoraEntrada.setText("Hora Entrada");
		txtHoraEntrada.setBounds(182, 183, 153, 37);
		frame.getContentPane().add(txtHoraEntrada);
		txtHoraEntrada.setColumns(10);
		

		txtHoraSalida = new JTextField();
		txtHoraSalida.setText("Hora Salida");
		txtHoraSalida.setForeground(Color.LIGHT_GRAY);
		txtHoraSalida.setBounds(182, 233, 153, 41);
		frame.getContentPane().add(txtHoraSalida);
		txtHoraSalida.setColumns(10);
	

		btnPagar = new JButton("Pagar y Salir del Parking");
		btnPagar.setBounds(182, 285, 153, 61);
		frame.getContentPane().add(btnPagar);
		

		lblTotalAPagar = new JLabel("Total a Pagar:");
		lblTotalAPagar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblTotalAPagar.setBounds(354, 126, 142, 48);
		frame.getContentPane().add(lblTotalAPagar);
		

		txtImporteEntregado = new JTextField();
		txtImporteEntregado.setText("Importe Entregado");
		txtImporteEntregado.setForeground(Color.LIGHT_GRAY);
		txtImporteEntregado.setBounds(364, 183, 107, 28);
		frame.getContentPane().add(txtImporteEntregado);
		txtImporteEntregado.setColumns(10);
	

		lblCambio = new JLabel("Cambio:");
		lblCambio.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCambio.setBounds(364, 236, 107, 38);
		frame.getContentPane().add(lblCambio);
		

		btnBuscar = new JButton("Buscar");
		btnBuscar.setToolTipText("");
		btnBuscar.setBounds(182, 285, 153, 61);
		frame.getContentPane().add(btnBuscar);

		lblImporteTotalObtenido = new JLabel("Importe Total Obtenido:");
		lblImporteTotalObtenido.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblImporteTotalObtenido.setBounds(518, 143, 249, 29);
		frame.getContentPane().add(lblImporteTotalObtenido);
		
		txtMatricula.setVisible(false);
		txtHoraSalida.setVisible(false);
		btnPagar.setVisible(false);
		lblTotalAPagar.setVisible(false);
		txtImporteEntregado.setVisible(false);
		lblCambio.setVisible(false);
		lblImporteTotalObtenido.setVisible(false);
		btnRegistrar.setVisible(false);
		btnBuscar.setVisible(false);
		txtHoraEntrada.setVisible(false);
		txtMatricula_1.setVisible(false);

		/**
		 * EVENTOS
		 */
		txtImporteEntregado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				txtImporteEntregado.setText(null);
			}
		});

		btnPagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				boolean caso = VerificarPago(txtImporteEntregado.getText());

				if (caso) {
					JOptionPane.showMessageDialog(null, "El pago es correcto");

					for (Vehiculo v : listav) {

						if (v.getMatricula().equals(txtMatricula_1.getText())) {

							listav.remove(v);
						}

					}

				}

			}
		});

		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				for (Vehiculo v : listav) {

					if (v.getMatricula().equals(txtMatricula_1.getText())) {
					 
						BuscarVi();
						
						int hora1 = fecha.get(Calendar.HOUR_OF_DAY);
						int minuto1 = fecha.get(Calendar.MINUTE);

						txtHoraEntrada.setText("Entrada a las " + v.getHora() + " y " + v.getMinuto());
						txtHoraSalida.setText("Salida a las " + hora1 + " y " + minuto1);

						CalcularImporte(hora1,minuto1);

					} else {
						JOptionPane.showMessageDialog(null, "Esa matricula no esta registrada en la base de datos");
					}

				}

			}
		});

		txtMatricula.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				txtMatricula.setText(null);
			}
		});

		txtMatricula_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				txtMatricula_1.setText(null);
			}
		});

		btnEntradaVehiculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				EntradaVi();

			}
		});

		btnPagoYSalida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				SalidaVi();

			}
		});

		btnCajaDelDia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CajaVi();

				lblImporteTotalObtenido.setText("Importe Total Obtenido :" + importeTotal + "$");
			}
		});

		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String cadena = ValidarMatricula(txtMatricula.getText());

				if (!cadena.equals("") || cadena.equals(null)) {
					JOptionPane.showMessageDialog(null, cadena);
				} else {

					hora = fecha.get(Calendar.HOUR_OF_DAY);
					minuto = fecha.get(Calendar.MINUTE);

					String matricula = txtMatricula.getText();

					Vehiculo v = new Vehiculo(matricula, hora, minuto);
					
					listav.add(v);
					JOptionPane.showMessageDialog(null, "El vehiculo ha sido introducido a la lista");
				}

			}
		});

	}

	/**
	 * METODOS
	 */
	
	private static void BuscarVi(){
		
		
		lblTotalAPagar.setVisible(true);
		txtImporteEntregado.setVisible(true);
		lblCambio.setVisible(true);
		btnBuscar.setVisible(false);
		btnPagar.setVisible(true);
	}

	private static boolean VerificarPago(String pago) {

		boolean caso = false;

		float num = Integer.parseInt(pago);
		if (importe < num) {
			caso = true;
		} else {
			caso = false;
		}

		return caso;

	}

	private static void CalcularImporte(int hora1,int minuto1) {

		int tiempoh = hora1 - hora;
		tiempoh = tiempoh * 60;
		int tiempom = minuto1 - minuto;
		int Totalt = tiempom + tiempoh;
		importe = 0f;

		if (Totalt >= 721) {

			importe = (float) (30 * 0.0492);
			importe += (float) (30 * 0.0056);
			importe += (float) (660 * 0.0270);
			importe += (float) ((Totalt - 720) * 0.15);

		} else if (Totalt > 60) {

			importe = (float) (30 * 0.0492);
			importe += (float) (30 * 0.0056);
			importe += (float) ((Totalt - 60) * 0.0270);

		} else if (Totalt > 30) {

			importe = (float) (30 * 0.0492);
			importe += (float) ((Totalt - 30) * 0.0056);

		} else {

			importe += (float) (Totalt * 0.0492);

		}

		importeTotal += importe;

		lblTotalAPagar.setText("Total a pagar : " + importe + "$");

		importe = 0f;

	}

	private static void EntradaVi() {
		txtMatricula.setVisible(true);
		btnRegistrar.setVisible(true);
		txtMatricula_1.setVisible(false);
		txtHoraEntrada.setVisible(false);
		txtHoraSalida.setVisible(false);
		btnPagar.setVisible(false);
		lblTotalAPagar.setVisible(false);
		txtImporteEntregado.setVisible(false);
		lblCambio.setVisible(false);
		btnBuscar.setVisible(false);
		lblImporteTotalObtenido.setVisible(false);
	}

	private static void SalidaVi() {
		txtMatricula.setVisible(false);
		btnRegistrar.setVisible(false);
		txtMatricula_1.setVisible(true);
		txtHoraEntrada.setVisible(true);
		txtHoraSalida.setVisible(true);
		btnPagar.setVisible(false);
		lblTotalAPagar.setVisible(false);
		txtImporteEntregado.setVisible(false);
		lblCambio.setVisible(false);
		btnBuscar.setVisible(true);
		lblImporteTotalObtenido.setVisible(false);

	}

	private static void CajaVi() {
		txtMatricula_1.setVisible(false);
		txtHoraEntrada.setVisible(false);
		txtHoraSalida.setVisible(false);
		btnPagar.setVisible(false);
		lblTotalAPagar.setVisible(false);
		txtImporteEntregado.setVisible(false);
		lblCambio.setVisible(false);
		btnBuscar.setVisible(false);
		txtMatricula.setVisible(false);
		btnRegistrar.setVisible(false);
		lblImporteTotalObtenido.setVisible(true);
	}

	private static String ValidarMatricula(String matricula) {

		String mensaje = "";
		Pattern pat = Pattern.compile("^[A-Z]{0,1}([A-Z]-){0,1}[0-9]{4}-[A-Z]{1,3}$");
		Matcher mat = pat.matcher(matricula);

		if (mat.matches()) {
			mensaje = "";
		} else {
			mensaje = "[ERROR] No has introducido correctamente la matrícula\n";
		}

		return mensaje;
	}
}
