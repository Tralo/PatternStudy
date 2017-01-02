package test1.proxy.ex2;

public class GamePlayer2 implements IGamePlayer2{
	
	private String name;
	
	

	public GamePlayer2(String name) {
		this.name = name;
	}

	private IGamePlayer2 proxy = null;
	
	private boolean isProxy(){
		if(this.proxy == null){
			return false;
		} else{
			return true;
		}
	}
	

	@Override
	public void login(String user, String password) {
		if(this.isProxy()){
			System.out.println("登陆名为" + user + "的用户   "+ this.name + " 登陆成功！");
			
		} else {
			System.out.println("请使用指定的代理访问");
		}
	}

	@Override
	public void killBoss() {
		if(this.isProxy()){
			System.out.println("用户名为"+ this.name + "的用户正在对战Boss");
		} else {
			System.out.println("请使用指定的代理访问");
		}
	}

	@Override
	public void upgrade() {
		if(this.isProxy()){
			System.out.println("恭喜用户名为"+ this.name + "升级成功！");
		} else {
			System.out.println("请使用指定的代理访问");
		}
	}

	@Override
	public IGamePlayer2 getProxy() {
		proxy = new GamePlayerProxy2(this);
		return proxy;
	}

}
