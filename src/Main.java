import java.awt.GridBagLayout;

import javax.swing.*;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.BorderLayout;
public class Main {

	public static void main(String[] args) {
		
		JFrame miJFrame = new JFrame("Ejemplo - Java Swing");
	    miJFrame.setSize(500,300);

	    // componente JPanel`

	    JPanel miJPanel = new JPanel();

	    miJPanel.setSize(300, 300);

	    // usamos este diseño para centrar los componentes de JPanel`

	    miJPanel.setLayout(new GridBagLayout());

	    // componente JTextField`

	    JLabel miJLabel = new JLabel();

	    miJLabel.setText("Dime tu opinión acerca de Java Swing:  ");

	    // componente JTextArea

	    JTextArea miJTextArea = new JTextArea(5,20);

	    // conecta los componentes JLabel y JTextField en JPanel`

	    GridBagConstraints gbc_miJLabel = new GridBagConstraints();
	    gbc_miJLabel.insets = new Insets(0, 0, 5, 5);
	    gbc_miJLabel.gridx = 0;
	    gbc_miJLabel.gridy = 0;
	    miJPanel.add(miJLabel, gbc_miJLabel);

	    GridBagConstraints gbc_miJTextArea = new GridBagConstraints();
	    gbc_miJTextArea.insets = new Insets(0, 0, 5, 0);
	    gbc_miJTextArea.gridx = 1;
	    gbc_miJTextArea.gridy = 0;
	    miJPanel.add(miJTextArea, gbc_miJTextArea);

	    // conectar Jpanel a JFrame`

	    miJFrame.getContentPane().add(miJPanel, BorderLayout.CENTER);
	    
	    JToggleButton tglbtnAceptar = new JToggleButton("Aceptar");
	    GridBagConstraints gbc_tglbtnAceptar = new GridBagConstraints();
	    gbc_tglbtnAceptar.insets = new Insets(0, 0, 0, 5);
	    gbc_tglbtnAceptar.gridx = 0;
	    gbc_tglbtnAceptar.gridy = 2;
	    miJPanel.add(tglbtnAceptar, gbc_tglbtnAceptar);

	    // hacer visible JFrame

	    miJFrame.setVisible(true);
	    
	    JButton button = new JButton("Aceptar");

	  }

	

}
