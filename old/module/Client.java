package module;

public class Client {

	public static void main(String[] args) {
		// 客户开着H1型号,出去遛弯了
		HummerModel h1 = new HummerH1Model();
		h1.run(); // 汽车跑起来了;
		// 客户开H2型号,出去玩耍了
		HummerModel h2 = new HumerH2Model();
		h2.run();
	}

}
