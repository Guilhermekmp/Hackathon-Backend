package br.edu.unifacisa.Loja.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.edu.unifacisa.Loja.models.Produto;

@RepositoryRestResource(collectionResourceRel = "produtos", path = "produtos")
public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {

}
