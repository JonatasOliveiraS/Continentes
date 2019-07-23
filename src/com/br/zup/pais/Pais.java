package com.br.zup.pais;

public class Pais {
	private String codigoIso = "";
	private String nome = "";
	private int populacao = 0;
	private double dimensao = 0;

	public Pais(String codigoIso, String nome, double dimensao) {
		this.codigoIso = codigoIso;
		this.nome = nome;
		this.dimensao = dimensao;
	}
	

	public Pais(String codigoIso, String nome, int populacao, double dimensao) {
		this.codigoIso = codigoIso;
		this.nome = nome;
		this.populacao = populacao;
		this.dimensao = dimensao;
	}


	public String getCodigoIso() {
		return codigoIso;
	}

	public void setCodigoIso(String codigoIso) {
		this.codigoIso = codigoIso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPopulacao() {
		return populacao;
	}

	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}

	public double getDimensao() {
		return dimensao;
	}

	public void setDimensao(double dimensao) {
		this.dimensao = dimensao;
	}

	public String comparaPaises(Pais pais) {
		if (this.getCodigoIso().equalsIgnoreCase(pais.getCodigoIso())) {
			return "Os paises são iguais";

		} else {
			return "Os paises são diferentes";
		}
	}

	public double calculaDensidade(int poulacao, double dimensao) {
		double densidade = poulacao / dimensao;

		return densidade;
	}
	public String toString() {
		String modelo = "\n";
		modelo += "\nCódigo do país : "+ this.getCodigoIso();
		modelo += "\nNome do país : "+ this.getNome();
		modelo += "\nPopulação do país : "+ this.getPopulacao();
		modelo += "\nTamanho do país : "+this.getDimensao()+"\n";
		
		return modelo;
	}

}
