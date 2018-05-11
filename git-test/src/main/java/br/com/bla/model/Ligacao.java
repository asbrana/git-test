package br.com.bla.model;

public class Ligacao {

	private Long id;
	private Long numero;
	private String endere�o;
	private Medidor medidor;
	
	public Ligacao(Long id, Long numero, String endere�o, Medidor medidor) {
		super();
		this.id = id;
		this.numero = numero;
		this.endere�o = endere�o;
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

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	@Override
	public String toString() {
		return "Ligacao [id=" + id + ", numero=" + numero + ", endere�o=" + endere�o + ", medidor=" + medidor + "]";
	}
	
	
	

}
