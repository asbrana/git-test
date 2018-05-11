package br.com.bla.model;

public class Ligacao {

	private Long id;
	private Long numero;
	private String endereço;
	private Medidor medidor;
	
	public Ligacao(Long id, Long numero, String endereço, Medidor medidor) {
		super();
		this.id = id;
		this.numero = numero;
		this.endereço = endereço;
		this.medidor = medidor;
		
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

	@Override
	public String toString() {
		return "Ligacao [id=" + id + ", numero=" + numero + ", endereço=" + endereço + ", medidor=" + medidor + "]";
	}
	
	
	

}
