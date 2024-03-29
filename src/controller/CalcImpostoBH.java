package controller;

import javax.swing.JOptionPane;

public class CalcImpostoBH implements ICidadeStrategy {

	public CalcImpostoBH() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcularImposto() {
		float area = Float.parseFloat(JOptionPane.showInputDialog(null," Digite a area "));
		int num = Integer.parseInt(JOptionPane.showInputDialog(null," Digite o  numero de quartos "));
		double imposto =(area * 7) + (num * 4) ; 
		System.out.println(" o valor do imposto da sua casa de BH e "+  imposto);
		
		
		
	}

}