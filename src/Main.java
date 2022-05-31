import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		
		String altura = JOptionPane.showInputDialog("Insira a sua altura em metros:").replaceAll(",", ".");
		String peso = JOptionPane.showInputDialog("Insira o seu peso em kg:").replaceAll(",", ".");
		
		while(true) {
			
			try {
				float pesoConvertido = Float.parseFloat(peso);
				float alturaConvertida = Float.parseFloat(altura);
				float imc = pesoConvertido / (alturaConvertida * alturaConvertida);
				String imcConvertido = Float.toString(imc);
				
//				Abaixo de 17	Muito abaixo do peso
//				Entre 17 e 18,49	Abaixo do peso
//				Entre 18,50 e 24,99	Peso normal
//				Entre 25 e 29,99	Acima do peso
//				Entre 30 e 34,99	Obesidade I
//				Entre 35 e 39,99	Obesidade II (severa)
//				Acima de 40	Obesidade III (mórbida)
				
				if (imc < 17) {
					//MUITO ABAIXO DO PESO
					JOptionPane.showMessageDialog(null, "IMC = " + imcConvertido + " -- Muito abaixo do peso", "Resultado", 2, null);
				}else if (imc >= 17 && imc <= 18.49) {
					//ABAIXO DO PESO
					JOptionPane.showMessageDialog(null, "IMC = " + imcConvertido + " -- Abaixo do peso", "Resultado", 2, null);
					
				}else if (imc >= 18.50 && imc <= 24.99) {
					//PESO NORMAL
					JOptionPane.showMessageDialog(null, "IMC = " + imcConvertido + " -- Peso Ideal", "Resultado", 1, null);
					
				}else if (imc >= 25 && imc <= 29.99) {
					//ACIMA DO PESO
					JOptionPane.showMessageDialog(null, "IMC = " + imcConvertido + " -- Acima do peso", "Resultado", 2, null);
					
				}else if (imc >= 30 && imc <= 34.99) {
					//OBESIDADE I
					JOptionPane.showMessageDialog(null, "IMC = " + imcConvertido + " -- OBESIDADE I", "Resultado", 2, null);
					
				}else if (imc >= 35 && imc <= 39.99) {
					//OBESIDADE II (SEVERA)
					JOptionPane.showMessageDialog(null, "IMC = " + imcConvertido + " -- OBESIDADE II (SEVERA)", "Resultado", 0, null);
					
				}else {
					//OBESIDADE III (MÓRBIDA)
					JOptionPane.showMessageDialog(null, "IMC = " + imcConvertido + " -- OBESIDADE III (MÓRBIDA)", "Resultado", 0, null);
				}
				
				break;
			} catch(NumberFormatException ex) {
				JOptionPane.showMessageDialog(null,"O VALOR INSERIDO NÃO É UM NUMERO", "ERROR", JOptionPane.ERROR_MESSAGE);
				altura = JOptionPane.showInputDialog("Insira o seu peso em metros:");
				peso = JOptionPane.showInputDialog("Insira o seu peso em kg:");
			}
			
		}
		
	}
}
