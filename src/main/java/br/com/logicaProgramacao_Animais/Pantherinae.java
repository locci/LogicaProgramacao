package br.com.logicaProgramacao_Animais;

public class Pantherinae extends Felideos {
	private String porte;
	public String[] animal = {"tigre", "leao", "onca-pintada", "leopardo" };

	public String tipoAnimal(String animal){
		boolean resposta = false ;
		
		for(int i = 0 ; i < this.animal.length;i++){
			if(animal == this.animal[i]){
				resposta = true;
				this.porte = "Grande porte";
				break;
			}else {
				
				resposta = false;
			}
		}
		if(resposta == false){
			return("animal n�o reconhecido como da esp�cie : "+ animal);
		}else{
			return "O"  + animal + " � um(a) animal de "+ this.porte +"\n" + getTipoAnimal() +"\n" +getOrdem()
		+"\n"+ origem() + "\n"+
		"Tipicamente n�o tem conviviu com o homem, por ser um animal selvagem " + "\nAnimal Dom�stico :"+viveComHomem(animal);
		}
		
	}
}
