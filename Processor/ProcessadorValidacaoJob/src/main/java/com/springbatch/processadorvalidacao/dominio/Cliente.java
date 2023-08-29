package com.springbatch.processadorvalidacao.dominio;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Range;

public class Cliente {
	@NotNull
	@Pattern(regexp = "[a-zA-Z\\s]+", message = "Nome deve ser alfabético")
	private String nome;
	@NotNull
	@Range(min = 18, max = 200)
	private Integer idade;
	@NotNull
	@Pattern(regexp = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", message = "Email inválido")
	private String email;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Cliente{" +
                "nome='" + nome + "'" +
                ", idade='" + idade + "'" +
                ", email='" + email + "'" +
                '}';
	}
}
