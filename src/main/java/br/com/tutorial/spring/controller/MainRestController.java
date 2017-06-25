package br.com.tutorial.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.tutorial.spring.dao.PessoaDAO;
import br.com.tutorial.spring.model.Pessoa;

@RestController
public class MainRestController {

	@Autowired
	private PessoaDAO pessoaDAO;
	
	@RequestMapping("/")
	public String welcome(){
		return "Welcome to RestTemplate example";
	}
	
	@RequestMapping(value = "/pessoas", 
			method = RequestMethod.GET,
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public List<Pessoa> getPessoas(){
		return pessoaDAO.getAll();
	}
	
	@RequestMapping(value = "pessoas/{codigo}",
			method = RequestMethod.GET,
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public Pessoa getPessoa(@PathVariable("codigo") Integer codigo){
		return pessoaDAO.get(codigo);
	}
	
	@RequestMapping(value = "/pessoas",
			method = RequestMethod.POST,
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public Pessoa addPessoa(Pessoa pessoa){
		return pessoaDAO.add(pessoa);
	}
	
	@RequestMapping(value = "/pessoas",
			method = RequestMethod.PUT,
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public Pessoa updatePessoa(Pessoa pessoa){
		return pessoaDAO.add(pessoa);
	}
	
	@RequestMapping(value = "pessoas/{codigo}",
			method = RequestMethod.DELETE,
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public void deletePessoa(@PathVariable("codigo") Integer codigo){
		pessoaDAO.delete(codigo);
	}
}
