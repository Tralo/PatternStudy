package state;

public class Client {
	
	public static void main(String[] args) {
		
		//模拟电梯
		Context context = new Context();
		context.setLiftState(new ClosingState());
		context.open();
		context.close();
		context.run();
		context.stop();
	}

}
