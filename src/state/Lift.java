package state;

public class Lift implements ILift {

	private int state;

	public void setState(int state) {
		this.state = state;
	}

	public void oper() {
		System.out.println("电梯们开启...");
	}

	public void close() {
		System.out.println("电梯门关闭...");
	}

	public void run() {
		System.out.println("电梯上下跑起来...");
	}

	public void stop() {
		System.out.println("电梯停止了...");
	}

	// 纯粹的电梯关门,不考虑实际的逻辑
	private void closeWithoutLogic() {
		System.out.println("电梯门关闭...");
	}

	// 纯粹的店门开,不考虑任何条件
	private void openWithoutLogic() {
		System.out.println("电梯门开启...");
	}

	// 纯粹的运行,不考虑其他条件
	private void runWithoutLogic() {
		System.out.println("电梯上下跑起来...");
	}

	// 单纯的停止,不考虑其他条件
	private void stopWithoutLogic() {
		System.out.println("电梯停止了...");
	}
}
