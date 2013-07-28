package br.com.felpmel.pato;

public class PatoReal extends Pato{
	
	public PatoReal(){
		
		comportamentoVoar = new VoarComAsas();
		comportamentoGasnar= new Gasnar();
				
	}
		
	@Override
	public void display() {
		System.out.println("Eu sou o pato real !!!");		
	}
	
}
