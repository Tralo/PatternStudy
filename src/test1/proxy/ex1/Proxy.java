package test1.proxy.ex1;

import javax.swing.JFormattedTextField.AbstractFormatter;

public class Proxy implements Subject {
	
	private Subject readlSubject;
	
	

	public Proxy(Subject readlSubject) {
		super();
		this.readlSubject = readlSubject;
	}
	private void before(){
		
	}
	private void after(){
		
	}


	@Override
	public void request() {
		this.before();
		this.readlSubject.request();
		this.after();
	}

}
