package br.com.tutorial.spring.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "pessoa")
@XmlAccessorType(XmlAccessType.FIELD)
public class Pessoa {

	private Integer codigo;
	
	private String nome;
	
	private String apelido;

	public Pessoa() {
		super();
	}

	public Pessoa(Integer codigo, String nome, String apelido) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.apelido = apelido;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
}
