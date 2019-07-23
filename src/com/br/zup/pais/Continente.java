package com.br.zup.pais;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.br.zup.interfaces.InterfaceContinente;

public class Continente implements InterfaceContinente {

	private String nome = "";
	private List<Pais> ListaPaises = null;

	public Continente(String nome, List<Pais> listaPaises) {
		super();
		this.nome = nome;
		ListaPaises = listaPaises;
	}

	public String getNome() {
		return nome;
	}

	public Continente() {

	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Pais> getListaPaises() {
		return ListaPaises;
	}

	public void setListaPaises(List<Pais> listaPaises) {
		ListaPaises = listaPaises;
	}

	public Scanner entrada() {
		Scanner entrada = new Scanner(System.in);
		return entrada;
	}

	@Override
	public void adicionaPais() {
		List<Pais> listaPais = new ArrayList<Pais>();
		int controle = 1;
		int opcao;
		Scanner scan = entrada();

		System.out.println("Deseja adicionar um país para este continente?\n" + "Digite '1' para sim ou '0' para não");
		opcao = scan.nextInt();

		while (controle == 1) {
			Scanner scanWh = entrada();
			if (opcao == 1) {
				Scanner scanIf = entrada();
				System.out.println("Digite o código ISO do país");
				String codigoIso = scanIf.nextLine();

				System.out.println("Digite o nome do país");
				String nome = scanIf.nextLine();

				System.out.println("Insira o número populacional do país");
				int populacao = scanIf.nextInt();

				System.out.println("Insira a dimensão terrestre do país");
				double dimensao = scanIf.nextDouble();

				Pais novoPais = new Pais(codigoIso, nome, populacao, dimensao);
				listaPais.add(novoPais);

			}

			System.out.println("deseja incluir mais um pais?\n" + "Digite '1' para sim ou '0' para não");
			controle = scanWh.nextInt();

		}
		this.setListaPaises(listaPais);

	}

	@Override
	public double dimensaoTotal() {
		double total = 0;

		for (Pais pais : this.getListaPaises()) {
			total += pais.getDimensao();

		}

		return total;

	}

	@Override
	public int pupulacaoTotal() {
		int total = 0;

		for (Pais pais : this.getListaPaises()) {
			total += pais.getPopulacao();

		}

		return total;
	}

	@Override
	public double densidadeTotal() {
		double total = 0;
		for (Pais pais : ListaPaises) {
			total += pais.getPopulacao() / pais.getDimensao();
		}

		return total;
	}

	@Override
	public Pais maiorPopulacao() {
		List<Pais> lista = this.getListaPaises();
		Pais maiorPopulacao = lista.get(0);
		for (Pais pais : lista) {
			if (maiorPopulacao.getPopulacao() < pais.getPopulacao()) {
				maiorPopulacao = pais;
			}
		}
		return maiorPopulacao;
	}

	@Override
	public Pais menorPopulacao() {
		List<Pais> lista = this.getListaPaises();
		Pais menorPopulacao = lista.get(0);
		for (Pais pais : lista) {
			if (menorPopulacao.getPopulacao() > pais.getPopulacao()) {
				menorPopulacao = pais;
			}
		}
		return menorPopulacao;
	}

	@Override
	public Pais maiorDimensao() {
		List<Pais> lista = this.getListaPaises();
		Pais maiorDimensao = lista.get(0);
		for (Pais pais : lista) {
			if (maiorDimensao.getDimensao() < pais.getDimensao()) {
				maiorDimensao = pais;
			}
		}
		return maiorDimensao;
	}

	@Override
	public Pais menorDimensao() {
		List<Pais> lista = this.getListaPaises();
		Pais menorDimensao = lista.get(0);
		for (Pais pais : lista) {
			if (menorDimensao.getDimensao() > pais.getDimensao()) {
				menorDimensao = pais;
			}
		}
		return menorDimensao;
	}

	@Override
	public String toString() {
		String modelo = "";
		modelo += "\nNome do continente : "+ this.getNome();
		modelo += "\n\nPaíses que compõem este continente\n" + this.getListaPaises();
		
		
		return modelo;
	}
	

}
