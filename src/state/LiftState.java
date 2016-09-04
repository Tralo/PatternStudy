package state;

public abstract class LiftState {

	// 定义一个环境变量，也就是封装状态的变换引起的功能变化
	protected Context context;

	public void setContext(Context _context) {
		this.context = _context;
	}

	public abstract void open();

	public abstract void close();

	public abstract void run();

	public abstract void stop();

}
