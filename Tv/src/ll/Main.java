package ll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreateGrammar c = new CreateGrammar();
		LLUtil llUtil = new LLUtil();
		ArrayList<V> vlList = c.create2();
		System.out.println("first:");
		for (int i = 0; i < vlList.size(); i++) {
			ArrayList<V> result = new ArrayList<V>();
			llUtil.getFirst(vlList.get(i), result);
			System.out.print(vlList.get(i).v + " : ");
			for (int j = 0; j < result.size(); j++)
				System.out.print(result.get(j).v + " ");
			System.out.println();
		}

		System.out.println("-------\nfollow:");
		Map<V, ArrayList<V>> map = new HashMap<V, ArrayList<V>>();
		for (int j = 0; j < vlList.size(); j++) {    //ÏÈ½¨±í
			map.put(vlList.get(j), new ArrayList<V>());
		}
		V emptyV=new Vt("#");
		map.get(c.EV).add(emptyV);
		for (int j = 0; j < vlList.size(); j++) {
			llUtil.getFollow(vlList.get(j), map);
		}
		
		for (int j = 0; j < vlList.size(); j++) {
			llUtil.setVnFollow(map);
		}

		for (Map.Entry<V, ArrayList<V>> entry : map.entrySet()) {
			ArrayList<V> lArrayList = entry.getValue();
			System.out.print(entry.getKey().v + " : ");
			for (int i = 0; i < lArrayList.size(); i++)
				System.out.print(lArrayList.get(i).v + " ");
			System.out.println();
		}
	}

}
