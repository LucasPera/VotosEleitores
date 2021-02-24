package br.com.votoseleitores.service;

import br.com.votoseleitores.dto.Votos;

public class CalcularPorcentagem {
	
	public Integer votosValidosPercentual(Votos votos) {

		return (votos.getValidos() * 100) / votos.getTotal();
		
	}
	
	public Integer votosBrancosPercentual(Votos votos) {
		
		return (votos.getBrancos() * 100) / votos.getTotal();
		
	}
	
	public  Integer votosNulosPercentual(Votos votos) {
		
		return (votos.getNulos() * 100) / votos.getTotal();
		
	}
	
}
