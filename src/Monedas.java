import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Monedas extends JFrame implements ItemListener,ActionListener{
	// ATRIBUTOS
	private JLabel label;
	private JComboBox combo;
	public static String selectItem= "";
	private JButton botonOk;
	private JButton botonCancelar;
	
	// CONSTRUCTOR
	public Monedas () {
		
		setSize(600,300);
		setTitle("Monedas");
		setLocationRelativeTo(null);// Metodo para que la ventana se posicione en el centro de la pantalla
		getContentPane().setLayout(null);		
		add(crearJlabel());
		add(crearjComboBox());
		agregarBotones();
	}
	
	public  void agregarBotones() {
		
		botonOk = new JButton();
		botonOk.setBounds(120,170, 70, 20);
		botonOk.setText("OK");
		add(botonOk);
		botonOk.addActionListener(this);
		
		botonCancelar = new JButton();
		botonCancelar.setBounds(170, 170, 70, 20);
		botonCancelar.setText("Cancelar");
		botonCancelar.addActionListener(this);
		
	}

	public JLabel crearJlabel() {
		label= new JLabel();
		if(EntradaDeValor.opcionElegidadMP == "Conversor de Moneda") {
			label.setText("Elige la moneda a la que deseas convertir tu dinero");
		}else {
			label.setText("Elija el tipos de temperatura que desea convertir");
		}
		label.setBounds(160, 80, 280, 50);
		
		return label;
	}
	public JComboBox crearjComboBox() {
		// SI 
		if(EntradaDeValor.opcionElegidadMP == "Conversor de Moneda") {
			combo = new JComboBox();
			combo.setBounds(170, 120, 250, 20);
			combo.addItem("Seleccione");
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
			combo = new JComboBox();
			combo.setBounds(170, 120, 250, 20);
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
		
		if(e.getSource()== combo) {
			selectItem = combo.getSelectedItem().toString();
			//System.out.println("Clase Entrada de Valor" +selectItem);
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// METODO QUE SE DISPARA AL PRESIONAR EL BOTON OK
		if(e.getSource() == botonOk) {
			System.out.println("Valor convertido" +EntradaDeValor.valorConvertido);
			System.out.println(EntradaDeValor.opcionElegidadMP);
			setVisible(false);
		}
		
	}

		
}
	
