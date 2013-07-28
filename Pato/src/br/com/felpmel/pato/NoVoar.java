package br.com.felpmel.pato;

public  class NoVoar implements IComportamentoVoar {

	@Override
	public void voar() {
		System.out.println("Não posso voar .");
		
	}

}
