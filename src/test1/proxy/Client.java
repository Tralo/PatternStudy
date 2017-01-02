package test1.proxy;

public class Client {
	public static void main(String[] args) throws Exception {
		GamePlayerProxy proxy = new GamePlayerProxy("呼呼");
		proxy.login("abc", "123456");
		proxy.killBoss();
		proxy.upgrade();
	}
}
