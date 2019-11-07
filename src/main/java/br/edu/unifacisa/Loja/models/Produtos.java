package br.edu.unifacisa.Loja.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Produtos {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String nome;
	
	private double valor;
	
	@ManyToOne
	@JoinColumn
	private Categoria id_categoria;
	
	public Produtos() {
		
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return this.valor;
	}
}
