package test1.command.ex1;

public class Invoker {
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void action(){
		this.command.execute();
	}

}
