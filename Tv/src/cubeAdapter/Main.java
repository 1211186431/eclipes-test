package cubeAdapter;

public class Main {
   //ָ��Ϊ��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Cube cube=new Cube(5);
        BallIf ballIf=new MagicFinger(cube);
        System.out.println("���������������"+ballIf.calculateVolume());
        System.out.println("����������������"+ballIf.calculateArea());
	}

}
