package test1.bridge.ex1;


public abstract class Abstraction {
	private Implementor imp;
	public Abstraction(Implementor _imp){
		this.imp = _imp;
	}
	
	public void request(){
		this.imp.doSomething();
	}
	public Implementor getImp(){
		return imp;
	}
	
	
}
