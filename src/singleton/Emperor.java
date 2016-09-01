package singleton;

public class Emperor {

	private static Emperor emperor = null;

	private Emperor() {

	}

	public static Emperor getInstance() {
		if (emperor == null) {
			emperor = new Emperor();
		}
		return emperor;
	}

	// 皇帝叫什么名字呀
	public void emperorInfo() {
		System.out.println("我就是皇帝某某某....");
	}

}
