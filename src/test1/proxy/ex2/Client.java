package test1.proxy.ex2;

import test1.proxy.IGamePlayer;

public class Client {
	
	public static void main(String[] args) {
		//直接访问
		System.out.println("开始时间是: " + System.currentTimeMillis());
		IGamePlayer2 player = new GamePlayer2("呼呼");
		GamePlayerProxy2 proxy = new GamePlayerProxy2(player);
		proxy.login("abc", "123456");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("结束时间是: " + System.currentTimeMillis());
		
		//通过对象的代理访问
		IGamePlayer2 player2 = new GamePlayer2("啦啦");
		GamePlayerProxy2 proxy2 = (GamePlayerProxy2) player2.getProxy();
		proxy2.login("def", "7890");
		proxy2.killBoss();
		proxy2.upgrade();
		
	}

}
