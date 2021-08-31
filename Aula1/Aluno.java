package Aula1;

import Aula2.Pessoa;

public class Aluno implements Pessoa {
	
	private String nome;
	private int idade;
	private int cpf;
	
	@Override
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	

}
