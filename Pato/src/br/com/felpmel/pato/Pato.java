package br.com.felpmel.pato;

public abstract class Pato {

	IComportamentoVoar comportamentoVoar;
	
	IComportamentoGasnar comportamentoGasnar;
	
	public Pato(){
	
	}
	
	public abstract void display();
	
	public void fazerVoar(){
		comportamentoVoar.voar();		
	}
	 
	public void fazerGasnar(){
		comportamentoGasnar.gasnar();
	}
	
	public void nadar(){
		
	}
}
