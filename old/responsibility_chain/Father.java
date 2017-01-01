package responsibility_chain;

public class Father extends Handler{

	public Father() {
		super(1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void response(IWomen women) {
		System.out.println("--------女儿向父亲请示-------");
		System.out.println(women.getRequest());
		System.out.println("父亲的答复是:同意\n");
		
	}

}
