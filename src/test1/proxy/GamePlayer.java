package test1.proxy;

import java.util.jar.Attributes.Name;

public class GamePlayer implements IGamePlayer{

	private String name = "";
	
	
	public GamePlayer(IGamePlayer _gamePlayer,String name) throws Exception {
		if(_gamePlayer == null){
			throw new Exception("不能创建真实角色");
		}
		this.name = name;
		
	}

	@Override
	public void login(String user, String password) {
		System.out.println("登陆名为" + user + "的用户   "+ this.name + " 登陆成功！");
		
		
	}

	@Override
	public void killBoss() {
		System.out.println("用户名为"+ this.name + "的用户正在对战Boss");
		
	}

	@Override
	public void upgrade() {
		System.out.println("恭喜用户名为"+ this.name + "升级成功！");
	}

}
