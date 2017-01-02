package test1.builder;

public class BenzModel extends CarModel{

	@Override
	protected void start() {
		System.out.println("奔驰车启动");
	}

	@Override
	protected void stop() {
		System.out.println("奔驰车停止");
	}

	@Override
	protected void alarm() {
		System.out.println("奔驰车的鸣笛是这样子的...");
	}

	@Override
	protected void engineBoom() {
		System.out.println("奔驰车的引擎声音是这个样子的...");
	}

}
