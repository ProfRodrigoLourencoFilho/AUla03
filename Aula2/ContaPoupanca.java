package Aula2;

public class ContaPoupanca extends Conta {
	
	@Override
	public void imprimeExtrato() {
		System.out.println(getSaldo());
		
	}

}
