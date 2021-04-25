package ll;

import java.util.ArrayList;



/**
 * жу╫А╥Ш a
 * @author dy-xx
 *
 */
public class Vt extends V{
    
	public Vt(String vt) {
		super();
		this.v = vt;
	}

	@Override
	public  ArrayList<ArrayList<V>> getExpression() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean isVt() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean equals(Object o) {
		String b=((V) o).getV();
		if(b.equals(this.v))
			return true;
		else {
			return false;
		}
	}


	@Override
	public boolean haveEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setExpression(ArrayList<ArrayList<V>> arrayList) {
		// TODO Auto-generated method stub
		
	}

}
