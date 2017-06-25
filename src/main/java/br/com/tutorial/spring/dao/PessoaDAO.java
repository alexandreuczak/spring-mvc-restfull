package br.com.tutorial.spring.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.com.tutorial.spring.model.Pessoa;

@Repository
public class PessoaDAO {

	private static final Map<Integer, Pessoa> PESSOAS = new HashMap<>();
	
	static {
		init();
	}

	private static void init() {
		Pessoa pessoa1 = new Pessoa(1, "Alexandre Uczak", "Zak");
		Pessoa pessoa2 = new Pessoa(2, "Bryan Uczak", "Bryan");
		Pessoa pessoa3 = new Pessoa(3, "Marcia", "Marcia");
		
		PESSOAS.put(pessoa1.getCodigo(), pessoa1);
		PESSOAS.put(pessoa2.getCodigo(), pessoa2);
		PESSOAS.put(pessoa3.getCodigo(), pessoa3);
	}
	
	public Pessoa get(Integer codigo){
		return PESSOAS.get(codigo);
	}
	
	public Pessoa add(Pessoa pessoa){
		PESSOAS.put(pessoa.getCodigo(), pessoa);
		return pessoa;
	}
	
	public Pessoa update(Pessoa pessoa){
		PESSOAS.put(pessoa.getCodigo(), pessoa);
		return pessoa;
	}
	
	public List<Pessoa> getAll(){
		Collection<Pessoa> pessoas = PESSOAS.values();
		List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		listaPessoas.addAll(pessoas);
		return listaPessoas;
	}
}
