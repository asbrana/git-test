package br.com.bla.model;

public class Ligacao {

	private Long id;
	private Long numero;
	private String enderešo;
	private Medidor medidor;
	
	public Ligacao(Long id, Long numero, String enderešo, Medidor medidor) {
		super();
		this.id = id;
		this.numero = numero;
		this.enderešo = enderešo;
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

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}

	@Override
	public String toString() {
		return "Ligacao [id=" + id + ", numero=" + numero + ", enderešo=" + enderešo + ", medidor=" + medidor + "]";
	}
	
	
	

}
