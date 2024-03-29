package controller;

import javax.swing.JOptionPane;

public class CalcImpostoPorto implements ICidadeStrategy {

	public CalcImpostoPorto() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcularImposto() {
		float area = Float.parseFloat(JOptionPane.showInputDialog(null, " Digite a area "));
		float areaGaragem = Float.parseFloat(JOptionPane.showInputDialog(null, " Digite a area da garagem "));

		if (areaGaragem <= 0) {
			double imposto = (double) area * 8;
			System.out.println(" o valor do imposto da sua casa de PORTO ALEGRE e " + imposto );
		} else {
		 double	imposto =  (double) ((double) (area * 7.5f) + (areaGaragem * 2.5f));
			System.out.println(" o valor do imposto da sua casa de PORTO ALEGRE e "+   imposto);

		}
	}

}
