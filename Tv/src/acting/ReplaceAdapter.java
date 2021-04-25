package acting;

public class ReplaceAdapter implements Star {
    ReplaceMan replaceMan;
    
    public ReplaceAdapter(ReplaceMan r) {
		// TODO Auto-generated constructor stub
    	this.replaceMan=r;
	}
	@Override
	public void contact(String s) {
		// TODO Auto-generated method stub
        System.out.println("替身收到消息"+s);      
	}

	@Override
	public void action(String s) {
		// TODO Auto-generated method stub
        System.out.println("替身可以"+replaceMan.replaceSkill());
        System.out.println("替身开始表演"+s);
	}

}
