package br.edu.unifacisa.Loja.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.edu.unifacisa.Loja.models.Categoria;

@RepositoryRestResource(collectionResourceRel = "categoria", path = "categoria")
public interface CategoriaRepository extends PagingAndSortingRepository<Categoria, Integer> {

}
