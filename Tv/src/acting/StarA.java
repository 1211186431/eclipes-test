package acting;

public class StarA implements Star {

	@Override
	public void contact(String s) {
		// TODO Auto-generated method stub
        System.out.println("明星A 同意"+s);
	}

	@Override
	public void action(String s) {
		// TODO Auto-generated method stub
        System.out.println("明星A 出演"+s);
	}

}
