package br.edu.unifacisa.Loja.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categoria {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String nome;
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	private Set<Produtos> id_produto;
	
	
	public int getId() {
		return this.id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}

}
