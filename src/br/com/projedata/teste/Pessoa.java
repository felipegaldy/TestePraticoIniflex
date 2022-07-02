package br.com.projedata.teste;

import java.time.LocalDate;

public class Pessoa implements Comparable<Pessoa> {
	
	private String nome;
	private LocalDate dataNascimento;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	@Override
	public int compareTo(Pessoa o) {
		// TODO Auto-generated method stub
		return this.nome.compareTo(o.getNome());
	}

}
