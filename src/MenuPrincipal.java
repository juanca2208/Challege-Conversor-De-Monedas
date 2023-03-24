import java.awt.GridBagLayout;
import javax.swing.*;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.BorderLayout;

public class MenuPrincipal extends JFrame implements ActionListener,ItemListener{
	
	JComboBox<String> box;
	JComboBox<String> Entrada;
	String seleccion;
	JButton btnOk;
	JButton btnCancelar;
	public static String tipoDeConversion = "";

	public MenuPrincipal() {
		//JFrame miJFrame = new JFrame("Menu");
		   setSize(600,300);
		   setTitle("Menu");
		   setLocationRelativeTo(null);// Metodo para que la ventana se posicione en el centro de la pantalla
		   add(crearMiJapanel());
			
		}
		      
	    // componente JPanel`
		public JPanel crearMiJapanel() {
			JPanel miJPanel = new JPanel();
		    miJPanel.setSize(700,600);
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
		    miJLabel.setText("Seleccione un opcion de Conversion ");
		    miJLabel.setBounds(150, 20, 600, 50);
		    return miJLabel;
		}
	    // COMPONENTE JCOMOBOBOX ES EL MENU DE OPCIONES DE CONVERSION
		public JComboBox<String> crearJComboBox() {
			box = new JComboBox<String>();//<>
    	    box.setBounds(160, 70, 240, 25);
    	    box.addItem("Seleccione");
    	    box.addItem("Conversor de Moneda");
    	    box.addItem("Conversor de Temperatura");
    	    
    	    box.addItemListener(this);
    	    
    	    return box;
		}
		
		
		public JButton crearBtnOk() {
			
			btnOk = new JButton();
			btnOk.setText("OK");
			btnOk.setBounds(170, 160, 70, 20);
			btnOk.addActionListener(this);
			
			return btnOk;
			
		}
		public JButton crearBtnCancelar() {
			
			btnCancelar = new JButton();
			btnCancelar.setText("Cancelar");
			btnCancelar.setBounds(280, 160, 110, 20);
			btnCancelar.addActionListener(this);
			return btnCancelar;
			
		}
		// Metodo que se dispara cuando se presiona el boton ok
				@Override
				public void actionPerformed(ActionEvent e ) {
					if (e.getSource() == btnOk) {
						/*seleccion =  box.getSelectedItem().toString();
						setTitle(seleccion);*/
						EntradaDeValor entrada = new EntradaDeValor();
						entrada.setVisible(true);
						setVisible(false);
						
					}else if (e.getSource()== btnCancelar) {
						setVisible(false);
						System.exit(0);
					}
				}

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getSource()== box) {
				//tipoDeConversion = box.getSelectedItem().toString();
				EntradaDeValor.opcionElegidadMP = box.getSelectedItem().toString();
				
			}
			
		}
		
		
		
		
		
		
	    	    
	    	    
	    	    
	    	    
	    	        
	    	
		//miJFrame.setLayout(null);//Este metodo sirve para indicarle al sistema que nosotros eligiremos las coordendas de los componentes
		//   1-Eje x, 2-Eje y, 3- Ancho 4- Alto             
		//miJFrame.setBounds(360, 300, 500, 300);
		//miJFrame.setBounds(0,0,600, 300);
		//crearMiJapanel();

	    // hacer visible JFrame
		/*public void hacerVisibleJFrame() {
			miJFrame.add(miJPanel);
		    miJFrame.setVisible(true);
		    miJFrame.setLocationRelativeTo(null);// Metodo que sirve para que nuestra ventana se ubique en el centro de la pantalla
		} */
	    

	  
}
