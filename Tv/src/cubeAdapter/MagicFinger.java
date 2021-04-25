package cubeAdapter;

public class MagicFinger implements BallIf {
    double radius;
    Cube adaptee;
    
    public MagicFinger(Cube adaptee) {
		// TODO Auto-generated constructor stub
    	this.adaptee=adaptee;
    	this.radius=this.adaptee.width/2;
	}
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return this.radius*this.radius*4*Math.PI;
	}

	@Override
	public double calculateVolume() {
		// TODO Auto-generated method stub
		return (4/3)*this.radius*this.radius*this.radius*Math.PI;
	}

}
