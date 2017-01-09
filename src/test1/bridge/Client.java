package test1.bridge;

public class Client {
	public static void main(String[] args) {
		House house = new House();
		System.out.println("------------房地产公司是这样运行-----------");
		HouseCorp houseCorp = new HouseCorp(house);
		houseCorp.makeMoney();
		System.out.println("\n");
		
		System.out.println("------------山寨公司是这样运行-----------");
		ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new IPod());
		shanZhaiCorp.makeMoney();
		
	}
}
