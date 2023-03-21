import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaDeError extends JFrame{
	
	JLabel label;
	JButton btnOK;
	public VentanaDeError() {
		
		setSize(400,300);
		setLocationRelativeTo(null);
		iniciarComponentes();
		getContentPane().setLayout(null);
	}
	
	public void iniciarComponentes() {
		
		label = new JLabel("ERROR SOLO PUEDE INGRESAR NUMEROS");
		label.setBounds(100, 100, 280, 50);
		add(label);
		// Creamos el Boton OK
		btnOK = new JButton();
		btnOK.setBounds(110, 200, 70, 20);
		btnOK.setText("OK");
		add(btnOK);
	}

}
