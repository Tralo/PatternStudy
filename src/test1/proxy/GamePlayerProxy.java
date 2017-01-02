package test1.proxy;

public class GamePlayerProxy implements IGamePlayer{

	private IGamePlayer gamePlayer;
	private String name = "";
	
	public GamePlayerProxy(String _name) throws Exception {
		try {
			gamePlayer = new GamePlayer(this,_name);
		} catch (Exception e) {
		}
		
	}
	
	/*public GamePlayerProxy(IGamePlayer gamePlayer) {
		super();
		this.gamePlayer = gamePlayer;
	}*/

	@Override
	public void login(String user, String password) {
		this.gamePlayer.login(user, password);
	}

	@Override
	public void killBoss() {
		this.gamePlayer.killBoss();
	}

	@Override
	public void upgrade() {
		this.gamePlayer.upgrade();
	}
	

}
