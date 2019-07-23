package com.br.zup.testes;

import com.br.zup.pais.Continente;

public class TesteContinente {

	public static void main(String[] args) {
		Continente continente = new Continente();

		continente.setNome("MeuContinente");
		continente.adicionaPais();
		System.out.println(continente.getListaPaises());

		System.out.println("A dimensão total do continente : " + continente.dimensaoTotal());
		System.out.println("A população total do continente : " + continente.pupulacaoTotal());

		System.out.println("\nMaior população\n" + continente.maiorPopulacao());
		System.out.println("\nMenor população\n" + continente.menorPopulacao());
		System.out.println("\nMaior dimensão\n" + continente.maiorDimensao());
		System.out.println("\nMenor dimensão\n" + continente.menorDimensao());
		System.out.println("\nDensidade total\n" + continente.densidadeTotal());
		
		
		System.out.println(continente);

	}

}
