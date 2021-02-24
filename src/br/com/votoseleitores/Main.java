package br.com.votoseleitores;

import br.com.votoseleitores.dto.Votos;
import br.com.votoseleitores.service.CalcularPorcentagem;

public class Main {

	public static void main(String[] args) {
		
		Votos votos = new Votos(1000, 800, 150, 50);
		
		CalcularPorcentagem calcularPorcentagem = new CalcularPorcentagem();
		
		System.out.println("Votos validos em relação ao total de eleitores: " + calcularPorcentagem.votosValidosPercentual(votos) + "%");
		
		System.out.println("Votos brancos em relação ao total de eleitores: " + calcularPorcentagem.votosBrancosPercentual(votos) + "%");
		
		System.out.println("Votos nulos em relação ao total de eleitores: " + calcularPorcentagem.votosNulosPercentual(votos) + "%");
		
	}

}
