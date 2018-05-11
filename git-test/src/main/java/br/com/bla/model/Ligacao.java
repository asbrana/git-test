package br.com.bla.model;

public class Ligacao {

	private Long id;
	private Long numero;
	private String endere�o;
	
	public Ligacao(Long id, Long numero, String endere�o) {
		super();
		this.id = id;
		this.numero = numero;
		this.endere�o = endere�o;
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

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

}
