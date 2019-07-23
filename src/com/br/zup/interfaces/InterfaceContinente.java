package com.br.zup.interfaces;

import com.br.zup.pais.Pais;

public interface InterfaceContinente {
	
	void adicionaPais();

	double dimensaoTotal();

	int pupulacaoTotal();

	double densidadeTotal();

	Pais maiorPopulacao();

	Pais menorPopulacao();

	Pais maiorDimensao();

	Pais menorDimensao();


}
