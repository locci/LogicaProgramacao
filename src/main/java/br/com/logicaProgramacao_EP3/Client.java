package br.com.logicaProgramacao_EP3;



public class Client {
    public void testOne(String parameter){
    	if(parameter != null){
    		throw new IllegalArgumentException("Illegal Argument");
    	}
    	
    }
    public void testTwo(String parameter){
    	if(parameter != null){
    		throw new IllegalArgumentException("Illegal Argument");
    	}
    }
    
    public static void main(String[]args){
    	ClientCommon CC = new ClientCommon();
    	CC.register();
    	
    	ClientSpecial CS = new ClientSpecial();
    	CS.register();
    	
    }
}


class ClientCommon extends Client{
	public void register() throws IllegalArgumentException{
		String value = "leonardo";

		testOne("Leonardo");
	}
}


class ClientSpecial extends Client {
	public void register() throws IllegalArgumentException{
		testTwo(null);
		
	}
}