package test1.adapter.ex2;

import test1.adapter.IUserInfo;

public class Client {
	public static void main(String[] args) {
		IOuterUserBaseInfo baseInfo = new OuterUserBaseInfo();
		IOuterUserHomeInfo homeInfo = new OuterUserHomeInfo();
		IOuterUserOfficeInfo officeInfo = new OuterUserOfficeInfo();
		
		IUserInfo youngGirl = new OuterUserInfo(baseInfo, homeInfo, officeInfo);
		for(int i = 0; i < 101; i++){
			youngGirl.getMobileNumber();
		}
	}
}
