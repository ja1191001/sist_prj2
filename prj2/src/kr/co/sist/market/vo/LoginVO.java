package kr.co.sist.market.vo;

public class LoginVO {
	String id,pass;
	
	//�⺻������
	public LoginVO() {
	}
	
	//�����ִ� ������
	public LoginVO(String id, String pass) {
		super();
		this.id = id;
		this.pass = pass;
	}

	//getter,setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
}//class
