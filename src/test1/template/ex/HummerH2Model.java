package test1.template.ex;

public class HummerH2Model extends HummerModel{

	@Override
	protected void start() {
		System.out.println("悍马h2启动");
	}

	@Override
	protected void stop() {
		System.out.println("悍马h2停止");
	}

	@Override
	protected void alarm() {
		System.out.println("悍马h2鸣笛");
	}

	@Override
	protected void engineBoom() {
		System.out.println("悍马h2引擎启动声响起...");
	}
	
	protected boolean isAlarm(){
		return false;
	}
}
