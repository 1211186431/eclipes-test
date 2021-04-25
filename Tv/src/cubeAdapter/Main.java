package cubeAdapter;

public class Main {
   //指球为方
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Cube cube=new Cube(5);
        BallIf ballIf=new MagicFinger(cube);
        System.out.println("立方体中球体积："+ballIf.calculateVolume());
        System.out.println("立方体中球表面积："+ballIf.calculateArea());
	}

}
