package br.com.logicaProgramacao_Animais;
/**Ci�ncia da Computa��o Exerc�cio 1
1. Identifique as classes, a rela��o entre as classes, os atributos das classe e seus
m�todos com base no texto abaixo
a. Os fel�deos (latim cient�fico: Felidae) constituem uma fam�lia de animais
mam�feros digit�grados, da ordem dos carn�voros. A esp�cie mais comum no
mundo hoje � o gato dom�stico, que j� convive com os seres humanos por cerca
de 10 mil anos, no entanto, existem muitas outras esp�cies selvagens, como os
grandes felinos. Existem duas subfam�lias de fel�deos: Pantherinae (que inclui
tigres, le�es, on�aspintadas
e leopardos) e Felinae (que inclui
guepardos,su�uaranas, linces, jaguatiricas e gatos dom�sticos). Os primeiros
exemplares da fam�lia surgiram durante o oligoceno, cerca de 25 milh�es de
anos atr�s. Na pr�hist�ria,
tamb�m existia uma terceira subfam�lia denominada
Machairodontinae, em que faziam parte os fel�deos dentesdesabre
como o
Smilodon. Apesar dassemelhan�as superficiais, os tamb�m extintos
Thylacosmilus e Nimravidae n�o est�o inclu�dos na fam�lia Felidae. (fonte:
https://pt.wikipedia.org/wiki/Felidae )*/

public class Felideos 
{
	
	private String TipoAnimal;
	private String ordem;
	
	public Felideos() {
		this.TipoAnimal = "Mamiferos";
		this.ordem = "Carnivoros";
	}
	
	public String getTipoAnimal() {
		return TipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		TipoAnimal = tipoAnimal;
	}

	public String getOrdem() {
		return ordem;
	}

	public void setOrdem(String ordem) {
		this.ordem = ordem;
	}
	
	public boolean viveComHomem(String animal){
		
		if(animal== "gato"){
			return true;
		}else{
			return false;
		}

	}
	
	public String origem(){
		return "Surgiram durante o oligoceno, cerca de 25 milh�es de anos atr�s";
	}


     
}
