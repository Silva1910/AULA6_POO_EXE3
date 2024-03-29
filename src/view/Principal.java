package view;
import controller.*;
public class Principal {

	public static void main(String[] args) {
	
	ICidadeStrategy cid = new CalcImpostoSP();
	ICidadeStrategy cid2 = new CalcImpostoCuritiba();
	ICidadeStrategy cid3 = new CalcImpostoBH();
	ICidadeStrategy cid4 = new CalcImpostoPorto();
	
	
	cid.calcularImposto();
	cid2.calcularImposto();
	cid3.calcularImposto();
	cid4.calcularImposto();
	
	}

}
