package proxy;

public class WangPo implements KindWomen{
	private KindWomen kindWomen;
	
	

	public WangPo() {
		kindWomen = new PanJinLian();
	}
	
	

	public WangPo(KindWomen kindWomen) {
		this.kindWomen = kindWomen;
	}



	public void makeEyesWithMan() {
		kindWomen.makeEyesWithMan();
		
	}

	public void happyWithMan() {
		kindWomen.happyWithMan();
		
	}
	

}
