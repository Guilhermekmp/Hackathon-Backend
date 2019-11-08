package br.edu.unifacisa.Loja.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unifacisa.Loja.models.Categoria;
import br.edu.unifacisa.Loja.repository.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(null);
	}
	
	public void setCategoria (Categoria categoria) {
		repo.save(categoria);
	}
	
	public String atualizarCategoria(Categoria categoria, Integer id){
		Optional<Categoria> produtoAntigo = repo.findById(id);
		if(!produtoAntigo.isPresent()) {
			return "Categoria não encontrado";
		}else {
			categoria.setId(id);
			repo.save(categoria);
			return("Categoria atualizada");
		}
	}
}
