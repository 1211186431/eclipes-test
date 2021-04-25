package unitedNation;

import java.util.ArrayList;

public class WTO implements UnitedNation {
    private ArrayList<Country> countryList;
    
    public WTO() {
		// TODO Auto-generated constructor stub
    	countryList=new ArrayList<Country>();
	}
	@Override
	public void declare(String message, Country conuntry) {
		// TODO Auto-generated method stub
        conuntry.getMessage(message);
	}
	@Override
	public void declare(String message) {
		// TODO Auto-generated method stub
		for(int i=0;i<countryList.size();i++) {
			this.countryList.get(i).getMessage(message);
		}
	}
	@Override
	public void setCountry(Country c) {
		// TODO Auto-generated method stub
		this.countryList.add(c);
	}
   

}
