package test1.command.ex1;

public class Client {
	public static void main(String[] args) {
		Invoker invoker = new Invoker();
		Receiver receiver = new ConcreteReciver1();
		Command command = new ConcretCommand1(receiver);
		invoker.setCommand(command);
		invoker.action();
		
		
	}
}
