package responsibility_chain;

public interface IHandler {

	//一个女性(女儿,妻子或者是母亲)要求逛街,你要处理这个请求
	public void handleMessage(IWomen women);
	
}
