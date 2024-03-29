package controller;

import javax.swing.JOptionPane;

public class CalcImpostoCuritiba implements ICidadeStrategy {

	public CalcImpostoCuritiba() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcularImposto() {
		float area = Float.parseFloat(JOptionPane.showInputDialog(null, " Digite a area "));
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null, " Digite a area da garagem "));

		if (idade > 50) {
			double imposto =  (int) ((area * 5)+ (idade*3)) ;
			System.out.println(" o valor do imposto da sua casa de CURITIBA e " + imposto );
		} else if(idade <20) {
			double imposto =  (area * 5) + (idade * 2);
			System.out.println(" o valor do imposto da sua casa de CURITIBA e " + imposto);

		}else if (idade>20 && idade>50) {
			double imposto = (area * 5) + (idade * 2.5f);
			System.out.println(" o valor do imposto da sua casa de CURITIBA e " + imposto);
		}

}
}