package facade;

public class ModernPostOffice {
	private LetterProcess letterProcess = new LetterProcessImpl();
	
	public void sendLetter(String context,String address){
		//帮你写信
		letterProcess.writeContext(context);
		//写好信封
		letterProcess.fillEnvelope(address);
		//把信放到信封中
		letterProcess.letterInotoEnvelope();
		//邮递信件
		letterProcess.sendLetter();
	}
	
}
