package unitedNation;

public class America implements Country{
	UnitedNation un;
	@Override
	public void setUnitedNation(UnitedNation un) {
		// TODO Auto-generated method stub
		this.un=un;
		this.un.setCountry(this);
	}

	@Override
	public void declare(String message) {
		// TODO Auto-generated method stub
		this.un.declare(message);
	}

	@Override
	public void declare(String message, Country country) {
		// TODO Auto-generated method stub
		this.un.declare(message, country);
	}

	@Override
	public void getMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println("美国收到信息："+message);
	}

	

}
