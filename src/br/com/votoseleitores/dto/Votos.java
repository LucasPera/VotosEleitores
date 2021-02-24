package br.com.votoseleitores.dto;

public class Votos {
	
	private Integer total;
	private Integer validos;
	private Integer brancos;
	private Integer nulos;
	
	public Votos(Integer total, Integer validos, Integer brancos, Integer nulos) {
		this.total = total;
		this.validos = validos;
		this.brancos = brancos;
		this.nulos = nulos;
	}

	public Integer getTotal() {
		return total;
	}
	
	public void setTotal(Integer total) {
		this.total = total;
	}
	
	public Integer getValidos() {
		return validos;
	}
	
	public void setValidos(Integer validos) {
		this.validos = validos;
	}
	
	public Integer getBrancos() {
		return brancos;
	}
	
	public void setBrancos(Integer brancos) {
		this.brancos = brancos;
	}
	
	public Integer getNulos() {
		return nulos;
	}
	
	public void setNulos(Integer nulos) {
		this.nulos = nulos;
	}
	
	
}
