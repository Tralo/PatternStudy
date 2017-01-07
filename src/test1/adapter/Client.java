package test1.adapter;

public class Client {
	public static void main(String[] args) {
		IUserInfo youngGirl = new OuterUserInfo();
		for(int i = 0;i  < 101; i++){
			youngGirl.getMobileNumber();
		}
		
	}
}
