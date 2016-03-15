/**
 * Uma empresa de micro-ondas pretende lan�ar no mercado tr�s modelos de um novo produto. Os modelos s�o padr�o,
econ�mico e potente. Voc� foi contratado para desenvolver o software que ser� usado nos tr�s modelos. Durante a
reuni�o com o cliente ficou acordado que o modelo econ�mico e potente possuem as mesmas fun��es que o modelo
padr�o (descongelar, cozinhar, timer, fazer pipoca, fazer ch� e grelhar). Por�m, o modelo econ�mico possui uma fun��o
definida como �cozimento baixo� e o potente possui uma fun��o denominada �cozimento alto�. Ambos os modelos,
possuem como caracter�sticas em comum tempo m�ximo de cozimento e pot�ncia m�xima. Tamb�m ficou acordado que,
um conjunto de fun��es novas seria implementada futuramente e atribu�das ao modelo econ�mico, estas fun��es s�o
�pesarCarne�, �pesarPeixe� e �pesarAves�. Destas tr�s a fun��o �pesarPeixe� j� est� implementada. Por sua vez, para o
modelo potente ser� implementado as fun��es �superDescongelante� e �superTostado�. Todas as fun��es recebem uma
string e devolvem um inteiro no valor 1. Construa um c�digo em Java que atenda as especifica��es acima. O c�digo n�o
precisa executar nada, mas necessita ser compilado corretamente.
 */
package br.com.logicaProgramacao_EP4;

public class Cc52253650 {
	public static void main(String[] args) {
        Pattern pattern = new Pattern();
        Economic economic = new Economic();
        PowerFul powerFul = new PowerFul();
        
	}

}

class Pattern{
	Integer timeMax;
	Integer power;
	
	public Integer unfreeze(String a){
		return 1;
	}
	public Integer toCook(String a){
		return 1;
	}
	public Integer time(String a){
		return 1;
	}
	public Integer popCorn(String a){
		return 1;
	}
	public Integer tea(String a){
		return 1;
	}
	public Integer Togrill(String a){
		return 1;
	}
}

class Economic extends WeightFood{
	
	public Integer cookingDown(String a){
		return 1;
	}

	@Override
	public Integer meat(String a) {
		return null;
	}

	@Override
	public Integer birds(String a) {
		return null;
	}
}
class PowerFul extends Pattern implements PowerfulFuntions{
	public Integer highCooking(String a){
		return 1;
	}

	@Override
	public Integer SuperIcer(String a) {
		return 1;
	}

	@Override
	public Integer SuperToasted(String a) {
		
		return 1;
	}
}

abstract class WeightFood extends Pattern{
	
	public abstract Integer meat(String a);
	
	public abstract Integer birds(String a);
	
	public Integer fish(String a){
		return 1;
	}
}
interface PowerfulFuntions{
	public Integer SuperIcer(String a);
	public Integer SuperToasted(String a); 
}
