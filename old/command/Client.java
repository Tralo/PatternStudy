package command;

public class Client {

	public static void main(String[] args) {
		
		Invoker invoker = new Invoker();
		
		//客户要求增加一项需求
		System.out.println("-------------客户要求增加一项需求-----------------");
		//客户给我们下命令来
		Command command = new AddRequirementCommand();
		//接头人接收到命令
		invoker.setCommand(command);
		//接头人执行命令
		invoker.action();
		
		
		//客户要求增加一项需求
		System.out.println("-------------客户要求删除一个页面-----------------");
		//客户给我们下命令来
		//Command command = new AddRequirementCommand();
		Command command2 = new DeletePageCommand();
		//接头人接收到命令
		invoker.setCommand(command2);
		//接头人执行命令
		invoker.action();
	}
}
