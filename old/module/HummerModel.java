package module;

public abstract class HummerModel {

	protected abstract void start();
	
	protected abstract void stop();
	
	protected abstract void alarm();
	
	protected abstract void engineBoom();
	
	public final void run(){
		//先发动汽车
		this.start();
		//引擎开始轰鸣
		this.engineBoom();
		//然后就开始跑了,跑的过程中遇到一条狗挡路,就按喇叭
		this.alarm();
		//到达目的地就停车
		this.stop();
	}
	
	
}
