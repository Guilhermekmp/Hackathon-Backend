package br.edu.unifacisa.Loja.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unifacisa.Loja.models.Produto;
import br.edu.unifacisa.Loja.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repo;
	
	public Produto find(Integer id) {
		Optional<Produto> obj = repo.findById(id);
		return obj.orElseThrow(null);
	}
	
	public void setProdutos (Produto produto) {
		repo.save(produto);
	}
	
	public String atualizarProduto(Produto produto, Integer id){
		Optional<Produto> produtoAntigo = repo.findById(id);
		if(!produtoAntigo.isPresent()) {
			return "Produto não encontrado";
		}else {
			produto.setId(id);
			repo.save(produto);
			return("Produto Atualizado");
		}
	}
}
