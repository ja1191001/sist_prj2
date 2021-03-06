package kr.co.sist.market.vo;

public class MsgListVO {
	private String id, item, msgDate;
	private boolean flag;
	
	public MsgListVO(String id, String item, String msgDate, boolean flag) {
		super();
		this.id = id;
		this.item = item;
		this.msgDate = msgDate;
		this.flag = flag;
	}

	public MsgListVO() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getMsgDate() {
		return msgDate;
	}

	public void setMsgDate(String msgDate) {
		this.msgDate = msgDate;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	
}
