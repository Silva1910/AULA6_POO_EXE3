package controller;

import javax.swing.JOptionPane;

public class CalcImpostoSP implements ICidadeStrategy {

	public CalcImpostoSP() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcularImposto() {
		float area = Float.parseFloat(JOptionPane.showInputDialog(null," Digite a area "));
		int num = Integer.parseInt(JOptionPane.showInputDialog(null," Digite o  numero de comodos "));
		double imposto = (double) ((area * 10) + (num * 2));
		System.out.println(" o valor do imposto da sua casa de "
				+ "SÃO PAULO e " + imposto);
		
	}

}
