package br.com.desafiojavadio;

public class main {

	public static void main(String[] args) {
		
		Cliente rodrigo = new Cliente();
		
		rodrigo.setNome("Rodrigo");
		
		Conta cc = new ContaCorrente(rodrigo);
		cc.depositar(90);
		
		
		Conta poupanca = new ContaPoupanca(rodrigo);
		
		cc.transferir(poupanca, 30);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
