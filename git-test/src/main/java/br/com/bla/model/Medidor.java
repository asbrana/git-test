package br.com.bla.model;

public class Medidor {

	private Long id;
	private String numero;
	
	

	public Medidor(Long id, String numero) {
		super();
		this.id = id;
		this.numero = numero;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Medidor [id=" + id + ", numero=" + numero + "]";
	}
	
	

}
