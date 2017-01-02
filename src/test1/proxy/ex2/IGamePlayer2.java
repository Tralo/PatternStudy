package test1.proxy.ex2;


public interface IGamePlayer2 {
	
	void login(String user,String password);
	
	void killBoss();
	
	void upgrade();
	
	
	IGamePlayer2 getProxy();
	
	
}
