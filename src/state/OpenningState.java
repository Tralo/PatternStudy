package state;

public class OpenningState extends LiftState{

	@Override
	public void open() {
		System.out.println("电梯门开启....");
		
	}

	@Override
	public void close() {
		context.setLiftState(Context.closingState);
		context.getLiftState().close();
		
	}

	@Override
	public void run() {
		//Nothing
	}

	@Override
	public void stop() {
		//Nothing
	}

}
