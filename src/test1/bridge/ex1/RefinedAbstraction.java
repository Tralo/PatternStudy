package test1.bridge.ex1;

public class RefinedAbstraction extends Abstraction {

	public RefinedAbstraction(Implementor _imp) {
		super(_imp);
	}
	
	@Override
	public void request() {
		super.request();
		super.getImp().doAnything();
	}

}
