package unitedNation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnitedNation wto = new WTO();
		Country china = new China();
		Country us = new America();
		china.setUnitedNation(wto);
		us.setUnitedNation(wto);
		china.declare("1111");
		us.declare("2222");
		china.declare("123",us);

	}

}
