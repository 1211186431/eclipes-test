package test;

public class TvCommand implements Command{
    MyTv tv;
	@Override
	public void openTv() {
		// TODO Auto-generated method stub
		tv.setIsOpen(true);
	}

	@Override
	public void closeTv() {
		// TODO Auto-generated method stub
		tv.setIsOpen(false);
		
	}

	@Override
	public void changeTv(int num) {
		// TODO Auto-generated method stub
		tv.setChannel(num);
		
	}

}
