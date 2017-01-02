package test1.proxy.ex2;

import java.util.jar.Attributes.Name;

public class GamePlayerProxy2 implements IGamePlayer2{
	
	private IGamePlayer2 player2 = null;
	
	
	public GamePlayerProxy2(IGamePlayer2 player2) {
		this.player2 = player2;
	}

	@Override
	public void login(String user, String password) {
		this.player2.login(user, password);
	}

	@Override
	public void killBoss() {
		this.player2.killBoss();
	}

	@Override
	public void upgrade() {
		this.player2.upgrade();
	}

	@Override
	public IGamePlayer2 getProxy() {
		// TODO Auto-generated method stub
		return null;
	}
	
	


}
