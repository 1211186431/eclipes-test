package cubeAdapter;

public class Cube {
	double width;

	public Cube(double width) {
		// TODO Auto-generated constructor stub
		this.width = width;
	}
	public double calculateVolume() {
		return this.width*this.width*this.width;
	}
	public double calculateFaceArea() {
		return this.width*this.width*6;
	}
}
