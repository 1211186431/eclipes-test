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
        System.out.println("�����յ���Ϣ"+s);      
	}

	@Override
	public void action(String s) {
		// TODO Auto-generated method stub
        System.out.println("�������"+replaceMan.replaceSkill());
        System.out.println("����ʼ����"+s);
	}

}
