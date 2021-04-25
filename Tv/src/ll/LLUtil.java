package ll;

import java.util.ArrayList;
import java.util.Map;


public class LLUtil {
	/**
	 * 求first集，应该没问题
	 * 
	 * @param v
	 * @param list
	 */
	public void getFirst(V v, ArrayList<V> list) {
		ArrayList<ArrayList<V>> es = v.getExpression();
		if (es == null) {
			if (!list.contains(v)) {
				list.add(v);
			}
		} else {
			for (int i = 0; i < es.size(); i++) {
				ArrayList<V> e = es.get(i); // 具体某个表达式
				V vi = e.get(0); // 表达式第一个
				getFirst(vi, list); // 递归获取
				if (vi.haveEmpty()) { // 如果为空的话，读取下一个，直到不为空或最后
					for (int j = 1; j < e.size() && (e.get(j).haveEmpty() || e.get(j).isVt()); j++) {
						vi = e.get(j);
						list.remove(new Vt("empty")); // 先删后加
						getFirst(vi, list);
					}
				}
			}
		}

	}

	/**
	 * 求非终结符对应的follow集
	 * @param v
	 * @param map 终结符和终结符的follow集
	 */
	public void getFollow(V v, Map<V, ArrayList<V>> map) { // 所有的非终结符都在map中
		ArrayList<ArrayList<V>> es = v.getExpression();// 获取所有表达式
		for (int i = 0; i < es.size(); i++) {
			ArrayList<V> elist = es.get(i); // 获取每一个表达式
			for (int j = 0; j < elist.size(); j++) {
				if (!elist.get(j).isVt()) { // 如果读取的符号是非终结符
					ArrayList<V> aList = map.get(elist.get(j));
					int t = j + 1;
					while (t <= elist.size()) { // 如果有后面
						if(t==elist.size()) {  //如果读到最后一个
							if (!aList.contains(v) && !elist.get(t-1).equals(v))  //没必要把自己添加去
								aList.add(v);
							break;
						}
						if (elist.get(t).isVt()) {
							if (!aList.contains(elist.get(t)))
								aList.add(elist.get(t));
						} else {
							addFirst(elist.get(t), aList);
						}

						if (elist.get(t).isVt() || !elist.get(t).haveEmpty()) // 如果不能推到为空，或是终结符
							break;
						else
							t++;
					}
				}
			}
		}
	}

	public ArrayList<Vt> getSelect(Vn vn) {
		return null;
	}

	public void addFirst(V v, ArrayList<V> list) {
		ArrayList<V> vfirst = new ArrayList<V>();
		getFirst(v, vfirst);
		for (int i = 0; i < vfirst.size(); i++) {
			if (!list.contains(vfirst.get(i))&& !vfirst.get(i).equals(new Vt("empty"))) {
				list.add(vfirst.get(i));
			}
		}
	}
	
	public void setVnFollow(Map<V, ArrayList<V>> map) {
		for (Map.Entry<V, ArrayList<V>> entry : map.entrySet()) {
			ArrayList<V> lArrayList = entry.getValue();
			V v=entry.getKey();
			for(int i=0;i<lArrayList.size();i++) {  //遍历follow集
				if(!lArrayList.get(i).isVt()) {  //如果是非终结符
					ArrayList<V> viList=map.get(lArrayList.get(i));
					lArrayList.remove(lArrayList.get(i));
					for(int j=0;j<viList.size();j++) {
						if(!viList.get(j).equals(v))  //不把自己加进去形成循环
							lArrayList.add(viList.get(j));
					}
				}
			}
		}
	}

}
