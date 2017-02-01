package test1.pk_1.factory;

public class SuperManFactory {
	
	public static ISuperMan createSuperMan(String type){
		
		if(type.equalsIgnoreCase("adult")){
			
			return new AdultSuperMan();
		}
		if(type.equalsIgnoreCase("child")){
			return new ChildSuperMan();
		}
		
		return null;
		
	}
	

}
