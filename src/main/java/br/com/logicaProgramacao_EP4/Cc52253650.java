/**
 * Uma empresa de micro-ondas pretende lançar no mercado três modelos de um novo produto. Os modelos são padrão,
econômico e potente. Você foi contratado para desenvolver o software que será usado nos três modelos. Durante a
reunião com o cliente ficou acordado que o modelo econômico e potente possuem as mesmas funções que o modelo
padrão (descongelar, cozinhar, timer, fazer pipoca, fazer chá e grelhar). Porém, o modelo econômico possui uma função
definida como “cozimento baixo” e o potente possui uma função denominada “cozimento alto”. Ambos os modelos,
possuem como características em comum tempo máximo de cozimento e potência máxima. Também ficou acordado que,
um conjunto de funções novas seria implementada futuramente e atribuídas ao modelo econômico, estas funções são
“pesarCarne”, “pesarPeixe” e “pesarAves”. Destas três a função “pesarPeixe” já está implementada. Por sua vez, para o
modelo potente será implementado as funções “superDescongelante” e “superTostado”. Todas as funções recebem uma
string e devolvem um inteiro no valor 1. Construa um código em Java que atenda as especificações acima. O código não
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
