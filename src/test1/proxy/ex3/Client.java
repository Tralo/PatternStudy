package test1.proxy.ex3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import test1.proxy.ex2.GamePlayer2;
import test1.proxy.ex2.IGamePlayer2;

public class Client {
	public static void main(String[] args) {
		IGamePlayer2 player = new GamePlayer2("张三");
		InvocationHandler  handler = new GamePlayIH(player);
		System.out.println("开始时间: " + System.currentTimeMillis());
		ClassLoader classLoader = player.getClass().getClassLoader();
		IGamePlayer2  proxy = (IGamePlayer2) Proxy.newProxyInstance(classLoader, new Class[]{IGamePlayer2.class}, handler);
		proxy.login("zhangSan", "password");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("结束时间: " + System.currentTimeMillis());
		
		
	}
}
