import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class MenuPrincipal extends JFrame implements ActionListener,ItemListener{
	
	JComboBox<String> box;
	JComboBox<String> Entrada;
	String seleccion;
	JButton btnOk;
	JButton btnCancelar;
	public static String tipoDeConversion = "";
	

	public MenuPrincipal() {
		//JFrame miJFrame = new JFrame("Menu");
		   setSize(630,300);
		   setTitle("Conversor Menu Principal");
		   setLocationRelativeTo(null);// Metodo para que la ventana se posicione en el centro de la pantalla
		   setResizable(false);
		   add(crearMiJapanel());
		}
		// componente JPanel`
		public JPanel crearMiJapanel() {
			JPanel miJPanel = new JPanel();
		    miJPanel.setSize(670,600);
		    miJPanel.setLayout(null);
		    miJPanel.add(crearMiJLabel());
    	    miJPanel.add(crearJComboBox());
    	    miJPanel.add(crearBtnOk());
    	    miJPanel.add(crearBtnCancelar());
    	    return miJPanel;
		}
	    // componente JTextField`
		public JLabel crearMiJLabel() {
			JLabel miJLabel = new JLabel();
		    miJLabel.setText("Conversor de Monedas y Temperaturas");
		    miJLabel.setBounds(150, 20, 660, 50);
		    return miJLabel;
		}
	    // COMPONENTE JCOMOBOBOX ES EL MENU DE OPCIONES DE CONVERSION
		public JComboBox<String> crearJComboBox() {
			box = new JComboBox<String>();//<>
    	    box.setBounds(155, 70, 264, 25);
    	    box.addItem("Seleccione Opcion de Conversion");
    	    box.addItem("Conversor de Moneda");
    	    box.addItem("Conversor de Temperatura");
    	    box.addItemListener(this);
    	    
    	    return box;
		}
				
		public JButton crearBtnOk() {
			
			btnOk = new JButton();
			btnOk.setText("OK");
			btnOk.setBounds(170, 160, 110, 20);
			btnOk.addActionListener(this);
			
			return btnOk;
			
		}
		public JButton crearBtnCancelar() {
			
			btnCancelar = new JButton();
			btnCancelar.setText("Cancelar");
			btnCancelar.setBounds(300, 160,110, 20);
			btnCancelar.addActionListener(this);
			return btnCancelar;
			
		}
		// Metodo que se dispara cuando se presiona el boton ok
				@Override
		public void actionPerformed(ActionEvent e ) {
			if (e.getSource() == btnOk) {
							
					if(box.getSelectedIndex()== 0) {
						JOptionPane.showMessageDialog(null,"Debe seleccionar un tipo de Conversion","Conversor Challege",JOptionPane.WARNING_MESSAGE);
					}else {
						EntradaDeValor entrada = new EntradaDeValor();
						entrada.setVisible(true);
						setVisible(false);
					}
			}else if(e.getSource()== btnCancelar) {
					setVisible(false);
					System.exit(0);
		
			}}

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getSource()== box) {
				 tipoDeConversion = box.getSelectedItem().toString();
			}
					
	}
}
