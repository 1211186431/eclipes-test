package acting;

public class Agent implements Star {
    StarA starA=new StarA();
	@Override
	public void contact(String s) {
		// TODO Auto-generated method stub
        if(s.contains("����")) {
        	this.starA.contact(s);
        }
        else if(s.contains("���")) {
        	System.out.println("��ͬ��");
        }
	}

	@Override
	public void action(String s) {
		// TODO Auto-generated method stub
       this.starA.action(s);
	}

}
