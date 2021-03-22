package test;

public class MyTv {
	Boolean isOpen;
	int channel;

	public MyTv(Boolean isOpen, int channel) {
		super();
		this.isOpen = isOpen;
		this.channel = channel;
	}

	public Boolean getIsOpen() {
		return isOpen;
	}

	public void setIsOpen(Boolean isOpen) {
		this.isOpen = isOpen;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
	

}
