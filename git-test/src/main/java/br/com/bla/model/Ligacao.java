package br.com.bla.model;

public class Ligacao {

	private Long id;
	private Long numero;
	private String enderešo;
	
	public Ligacao(Long id, Long numero, String enderešo) {
		super();
		this.id = id;
		this.numero = numero;
		this.enderešo = enderešo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}

}
