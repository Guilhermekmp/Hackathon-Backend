package br.edu.unifacisa.Loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.unifacisa.Loja.models.Categoria;
import br.edu.unifacisa.Loja.service.CategoriaService;

@Controller
@RequestMapping(name = "/categoria")
public class CategoriaController {

	@Autowired
	private CategoriaService service;
	
	@PostMapping("/categoria")
	public HttpStatus createCategoria(@RequestBody Categoria categoria){
		service.setCategoria(categoria);
		HttpStatus status = HttpStatus.CREATED;
		return status;
	}
	
	@GetMapping("/{id}")
	public HttpStatus findCategoria(@RequestBody Categoria categoria, @PathVariable Integer id) {
		service.find(id);
		return HttpStatus.OK;
	}
	
	@PutMapping("/{id}")
	public HttpStatus updateCategoria(@RequestBody Categoria categoria, @PathVariable Integer id) {
		service.atualizarCategoria(categoria, id);
		return HttpStatus.OK;
	}
}
