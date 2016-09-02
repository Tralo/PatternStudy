package facade;

public interface LetterProcess {
	
	void writeContext(String content);
	
	void fillEnvelope(String address);
	
	void letterInotoEnvelope();
	
	void sendLetter();
	
	
}
