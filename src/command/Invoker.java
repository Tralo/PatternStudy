package command;

public class Invoker {
	private Command command;

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	// 执行客户的命令
	public void action() {
		this.command.execute();
	}

}
