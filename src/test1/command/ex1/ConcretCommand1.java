package test1.command.ex1;

public class ConcretCommand1 extends Command {
	
	private Receiver receiver;

	public ConcretCommand1(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		this.receiver.doSomething();
	}

}
