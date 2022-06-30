package br.com.desafiojavadio;

public interface IConta {
	
    void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(Conta contaDestinho, double valor);
	
	void imprimirExtrato();
	
}
