package br.com.bla.model;

public class Ligacao {

	private Long id;
	private Long numero;
	private String endereço;
	
	public Ligacao(Long id, Long numero, String endereço) {
		super();
		this.id = id;
		this.numero = numero;
		this.endereço = endereço;
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

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

}
