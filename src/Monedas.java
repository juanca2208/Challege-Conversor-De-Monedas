import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Monedas extends JFrame implements ItemListener,ActionListener{
	// ATRIBUTOS
	private JLabel label;
	private JComboBox <String> combo;
	public static String selectItem= "";
	private JButton botonOk;
	private JButton botonCancelar;
	private Conversion conversion = new Conversion();
	String valorConvertidoString;
	
	
	// CONSTRUCTOR
	public Monedas () {
		
		setSize(600,300);
		setTitle("Conversor");
		setLocationRelativeTo(null);// Metodo para que la ventana se posicione en el centro de la pantalla
		getContentPane().setLayout(null);		
		add(crearJlabel());
		add(crearjComboBox());
		agregarBotones();
	}
	// Metodo que agrega los botones Ok y Cancelar al JFrame
	public void agregarBotones() {
		// Boton OK
		botonOk = new JButton();
		botonOk.setBounds(145,200, 110, 20);
		botonOk.setText("OK");
		add(botonOk);
		botonOk.addActionListener(this);
		// Botn¿on Cancelar
		botonCancelar = new JButton();
		botonCancelar.setBounds(320, 200, 110, 20);
		botonCancelar.setText("Cancelar");
		add(botonCancelar);
		botonCancelar.addActionListener(this);
		
	}

	public JLabel crearJlabel() {
		label= new JLabel();
		if(MenuPrincipal.tipoDeConversion == "Conversor de Moneda") {
			label.setText("Elige la moneda a la que deseas convertir tu dinero");
			label.setBounds(130, 20, 375, 50);
		}else {
			label.setText("Elija el tipo de temperatura que desea convertir");
			label.setBounds(130, 30, 375, 50);
		}
		return label;
	}
	// Creamos JcomboBox con las opciones de conversion de monedas
	public JComboBox<String> crearjComboBox() {
		 
		if(MenuPrincipal.tipoDeConversion == "Conversor de Moneda") {
			combo = new JComboBox <String>();
			combo.setBounds(170, 65, 250, 20);
			combo.addItem("Seleccione Divisa");
			combo.addItem("De Pesos a Dolar");
			combo.addItem("De Pesos a Euros");
			combo.addItem("De Pesos a Libras");
			combo.addItem("De Pesos a Real");
			combo.addItem("De Pesos a Yen");
			combo.addItem("De Pesos a Won Coreano");
			combo.addItem("De Dolar a Pesos");
			combo.addItem("De Euros a Pesos");
			combo.addItem("De Libras a Pesos");
			combo.addItem("De Real a Pesos");
			combo.addItem("De Won Coreano a Pesos");
			combo.addItemListener(this);
		}else {
			combo = new JComboBox<String>();
			combo.setBounds(170, 90, 250, 20);
			combo.addItem("Seleccione");
			combo.addItem("De Celsius a Fahrenheit");
			combo.addItem("De Celsius a Kelvin");
			combo.addItem("De Fahrenheit a Celsius");
			combo.addItemListener(this);
		}
		return combo;
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// METODO QUE GUARDA LA OPCION DE CONVERSION POR EJEMPLO DE PESOS A DOLAR
		// TAMBIEN GUARDA LA INFORMACION DE CONVERSION DE TEMPERATURA
		if(e.getSource()== combo) {
			selectItem = combo.getSelectedItem().toString();
			}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// METODO QUE SE DISPARA AL PRESIONAR EL BOTON OK
		if(e.getSource() == botonOk) {
				// LLama al metodo de la clase conversion y se le envia un double y el item del tipo de conversion
				/* Por ultimo el metodo realizarConversion Devuelve el resultado solicitado por el usuario en un tipo 
				 * de dato String que es asignado a la variable valorConvertidoString*/
			if(combo.getSelectedIndex()== 0) {
				JOptionPane.showMessageDialog(null,"Debe seleccionar un Item de Conversion","Conversor Challege",JOptionPane.WARNING_MESSAGE);
		}else if(e.getSource()== botonCancelar) {
			setVisible(false);
			System.exit(0);
		}else {
			valorConvertidoString = conversion.relizarConversion(EntradaDeValor.valorConvertido, selectItem); ;
			setVisible(false);
			JOptionPane.showMessageDialog(null, valorConvertidoString.toString(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
			ventanaDeseaContinuar();
		}// MODIFICAR CODIGO HACER FUNCIONAR BOTON CANCELAR
		
	}}
	// VENTANA DE DIALLOGO QUE LE CONSULTA AL USUARIO SI DESEA REALIZAR OTRA CONVERSION O FINALIZAR EL PROGRAMA
	private void ventanaDeseaContinuar() {
		// TODO Auto-generated method stub
		int respuesta;
		respuesta = JOptionPane.showConfirmDialog(null,"¿Desea realizar otra Converison?","Conversor Challege",JOptionPane.YES_NO_CANCEL_OPTION);
		if(respuesta == 0) {
			MenuPrincipal mp = new MenuPrincipal();
			mp.setVisible(true);
		}else if(respuesta == 1) {
			JOptionPane.showMessageDialog(null,"Programa Finalizado","Conversor Challege",JOptionPane.OK_OPTION);
			System.exit(0);
		}else if(respuesta == 2) {
			System.exit(0);
		}
			
		
	}

		
}
	
