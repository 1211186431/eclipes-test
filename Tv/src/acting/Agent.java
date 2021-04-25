package acting;

public class Agent implements Star {
    StarA starA=new StarA();
	@Override
	public void contact(String s) {
		// TODO Auto-generated method stub
        if(s.contains("主演")) {
        	this.starA.contact(s);
        }
        else if(s.contains("配角")) {
        	System.out.println("不同意");
        }
	}

	@Override
	public void action(String s) {
		// TODO Auto-generated method stub
       this.starA.action(s);
	}

}
