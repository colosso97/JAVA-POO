package exemplos;

import javax.swing.JOptionPane;

public class LeituraGrafico {

	public static void main(String[] args) {
		String num1 =	JOptionPane.showInputDialog("Numero1:");
		String num2 =	JOptionPane.showInputDialog("Numero2:");
		
		//double numero1 = Double.parseDouble(num1);
		//double numero2 = Double.parseDouble(num2);
		
		JOptionPane.showMessageDialog(null,
				"Resultado:" + 
		(Double.parseDouble(num1) 
				+ Double.parseDouble(num2)) / 2);
	}

}
