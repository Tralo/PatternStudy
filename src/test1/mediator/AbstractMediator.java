package test1.mediator;

public abstract class AbstractMediator {
	protected Purchase purchase;
	protected Sale sale;
	protected Stock stock;
	public AbstractMediator() {
		super();
		purchase = new Purchase(this);
		sale = new Sale(this);
		stock = new Stock(this);
	}
	public abstract void execute(String st,Object...objects);
	
}
