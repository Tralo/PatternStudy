package test1.adapter.ex1;

public class Adapter extends Adaptee implements Target{

	@Override
	public void request() {
		super.doSomething();
		
	}

}
