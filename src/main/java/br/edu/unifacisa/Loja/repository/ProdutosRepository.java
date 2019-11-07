package br.edu.unifacisa.Loja.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.edu.unifacisa.Loja.models.Produtos;

@RepositoryRestResource(collectionResourceRel = "produtos", path = "produtos")
public interface ProdutosRepository extends PagingAndSortingRepository<Produtos, Integer> {

}
