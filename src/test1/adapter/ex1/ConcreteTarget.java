package test1.adapter.ex1;

public class ConcreteTarget implements Target {

	@Override
	public void request() {
		System.out.println("If you need any help, pls call me!");
	}

}
