package test1.template.ex;

public class HummerH1Model extends HummerModel{
	
	private boolean alarmFlag = true;
	
	@Override
	protected void start() {
		System.out.println("悍马h1启动");
	}

	@Override
	protected void stop() {
		System.out.println("悍马h1停车");
	}

	@Override
	protected void alarm() {
		System.out.println("悍马h1鸣笛");
		
	}

	@Override
	protected void engineBoom() {
		System.out.println("悍马h1引擎声是这样在....");
	}
	
	@Override
	protected boolean isAlarm() {
		return alarmFlag;
	}
	
	public void setAlara(boolean isAlarm){
		this.alarmFlag = isAlarm;
	}

}
