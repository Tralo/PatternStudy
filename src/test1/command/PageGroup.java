package test1.command;

public class PageGroup extends Group {

	@Override
	public void find() {
		System.out.println("找到美工组...");
	}

	@Override
	public void add() {
		System.out.println("客户要求添加一个界面...");
	}

	@Override
	public void delete() {
		System.out.println("客户要求删除一个界面...");
	}

	@Override
	public void change() {
		System.out.println("客户要求修改一个界面...");
	}

	@Override
	public void plan() {
		System.out.println("客户计划修改一个界面...");
	}

}
