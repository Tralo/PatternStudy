package test1.pk_1.builder;

public class Director {
	private static Builder adultBuilder = new AdultSuperManBuilder();
	
	private static Builder childBuilder = new ChildSuperManBuilder();
	
	public static SuperMan getAdultSuperman() {
		return adultBuilder.getSuperMan();
	}
	
	public static SuperMan getChildSuperman() {
		return childBuilder.getSuperMan();
	}
	

}
