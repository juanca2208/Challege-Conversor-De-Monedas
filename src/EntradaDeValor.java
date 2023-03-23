import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EntradaDeValor  extends JFrame implements ActionListener{
	// ATRIBUTOS
	JPanel jPanel;
	JTextField field;
	JLabel jLabel;
	JButton btnOk;
	JButton btnCancelar;
	public static String valorAConvertir= "";
	public static double valorConvertido;
	public static String opcionElegidadMP;
	
	// CONSTRUCTOR
	public EntradaDeValor() {
	   	
		setTitle("Entrada");
		setSize(600,200);
		setLocationRelativeTo(null);
		add(crearMiJapanel());
	}
	
	// JPANEL CONVERSOR DE MONEDA 
	public JPanel crearMiJapanel() {
		jPanel = new JPanel();
		jPanel.setSize(800,700);
		jPanel.setLayout(null);
		jPanel.add(crearMiJLabel());
		jPanel.add(crearJTextField());
		jPanel.add(crearBtnOk());
		jPanel.add(crearBtnCancelar());
	    return jPanel;
	}

	private JTextField crearJTextField() {
		field = new JTextField();
		field.setBounds(140, 80, 350, 30);
		return field;
	}

	private JLabel crearMiJLabel() {
		jLabel = new JLabel();
		jLabel.setBounds(140, 20, 600, 50);
		if (opcionElegidadMP == "Conversor de Moneda") {
			jLabel.setText("Ingrese la cantidad de dinero que deseas convertir");
		}else {
			jLabel.setText("Ingrese el valor de temperatura que deseas convertir");
		}
		return jLabel;
	}
	
	public JButton crearBtnOk() {
		
		btnOk = new JButton();
		btnOk.setText("OK");
		btnOk.setBounds(170, 125, 70, 20);
		btnOk.addActionListener(this);
		return btnOk;
		
	}
	public JButton crearBtnCancelar() {
		
		btnCancelar = new JButton();
		btnCancelar.setText("Cancelar");
		btnCancelar.setBounds(280, 125, 110, 20);
		return btnCancelar;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnOk) {
			// Realizar Excepcion Cuando el usuario ingrese texto o string
			valorAConvertir = field.getText().toString();
			try {
				valorConvertido = Double.parseDouble(valorAConvertir);
				Monedas monedas = new Monedas();
				monedas.setVisible(true);
				setVisible(false);
									
			} catch (Exception e2) {
				
				JOptionPane.showMessageDialog(null,"ERROR SOLO PUEDE INGRESAR NUMEROS","MENSAJE",JOptionPane.ERROR_MESSAGE);
				field.setText(null);
				/*VentanaDeError v = new VentanaDeError();
				v.setVisible(true);*/
				//setVisible(false);
				
			}
		}else if (e.getSource()== btnCancelar) {
			setVisible(false);
		}
		
	}
	
	
		
	

}


