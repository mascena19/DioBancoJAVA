package br.com.desafiojavadio;

import java.util.List;

public class Banco {
	
	private String nome;
	private List<Conta> constas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getConstas() {
		return constas;
	}

	public void setConstas(List<Conta> constas) {
		this.constas = constas;
	}
	
	
}
