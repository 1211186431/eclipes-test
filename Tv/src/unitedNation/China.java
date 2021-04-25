package unitedNation;

public class China implements Country {
    UnitedNation un;
	@Override
	public void setUnitedNation(UnitedNation un) {
		// TODO Auto-generated method stub
       this.un=un;
       this.un.setCountry(this);
	}

	@Override
	public void declare(String message,Country conuntry) {
		// TODO Auto-generated method stub
        un.declare(message, conuntry);
	}

	@Override
	public void getMessage(String message) {
		// TODO Auto-generated method stub
        System.out.println("中国收到信息："+message);
	}

	@Override
	public void declare(String message) {
		// TODO Auto-generated method stub
		un.declare(message);
	}

}
