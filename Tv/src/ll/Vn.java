package ll;

import java.util.ArrayList;

/**
 * ·ÇÖÕ½á·û A
 * @author dy-xx
 *
 */
public class Vn extends V{
    ArrayList<ArrayList<V>> vlist;
    int row;
    boolean empty=false;
	public Vn(String vn,  ArrayList<ArrayList<V>> vlist) {
		super();
		this.v = vn;
		this.vlist = vlist;
	}
	
	public Vn(String vn) {
		super();
		this.v=vn;
	}

	@Override
	public  ArrayList<ArrayList<V>> getExpression() {
		// TODO Auto-generated method stub
		return this.vlist;
	}
	@Override
	public boolean isVt() {
		// TODO Auto-generated method stub
		return false;
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
		return empty;
	}
	
	public void setEmpty(Boolean em) {
		this.empty=em;
	}

	public void setVlist(ArrayList<ArrayList<V>> vlist) {
		this.vlist = vlist;
	}

	@Override
	public void setExpression(ArrayList<ArrayList<V>> arrayList) {
		// TODO Auto-generated method stub
		this.vlist=arrayList;
	}

	
	
}
