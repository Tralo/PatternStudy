package test1.command.ex1;

public class ConcreteCommand2 extends Command {

	private Receiver receiver;
	
	public ConcreteCommand2(Receiver receiver) {
		super();
		this.receiver = receiver;
	}
	@Override
	public void execute() {
		this.receiver.doSomething();
	}

}
