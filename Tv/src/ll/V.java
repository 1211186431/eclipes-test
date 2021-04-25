package ll;

import java.util.ArrayList;

public abstract class V {
	String v;
	int position;

	public abstract ArrayList<ArrayList<V>> getExpression();
	public abstract void setExpression(ArrayList<ArrayList<V>> arrayList);
	
	public abstract boolean isVt();
	
	public abstract boolean haveEmpty();
    
	public String getV() {
		return v;
	}

	public void setV(String v) {
		this.v = v;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

}
