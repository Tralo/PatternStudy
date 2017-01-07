package test1.adapter.ex1;

public class Client {
	public static void main(String[] args) {
		//原有业务逻辑
		Target target = new ConcreteTarget();
		target.request();
		
		//现在增加了适配器角色后的业务逻辑
		Target target2 = new Adapter();
		target.request();
	}
}
