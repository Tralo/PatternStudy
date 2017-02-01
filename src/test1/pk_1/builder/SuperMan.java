package test1.pk_1.builder;

public class SuperMan {
	
	private String body;
	private String specialTalent;
	
	private String specialSymbol;

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getSpecialTalent() {
		return specialTalent;
	}

	public void setSpecialTalent(String specialTalent) {
		this.specialTalent = specialTalent;
	}

	public String getSpecialSymbol() {
		return specialSymbol;
	}

	public void setSpecialSymbol(String specialSymbol) {
		this.specialSymbol = specialSymbol;
	}

	@Override
	public String toString() {
		return "SuperMan [body=" + body + ", specialTalent=" + specialTalent + ", specialSymbol=" + specialSymbol + "]";
	}
	

}
