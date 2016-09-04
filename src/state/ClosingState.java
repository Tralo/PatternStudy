package state;

public class ClosingState extends LiftState {

	@Override
	public void open() {
		context.setLiftState(Context.openningState);
		super.context.getLiftState().open();
	}

	@Override
	public void close() {
		System.out.println("电梯门关闭...");
	}

	@Override
	public void run() {
		super.context.setLiftState(Context.runningState); //设置为运行状态;
		super.context.getLiftState().run();
	}

	@Override
	public void stop() {
		super.context.setLiftState(Context.stoppingState); //设置为停止状态;
		super.context.getLiftState().stop();
	}

}
