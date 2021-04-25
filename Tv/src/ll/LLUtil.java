package ll;

import java.util.ArrayList;
import java.util.Map;


public class LLUtil {
	/**
	 * ��first����Ӧ��û����
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
				ArrayList<V> e = es.get(i); // ����ĳ�����ʽ
				V vi = e.get(0); // ���ʽ��һ��
				getFirst(vi, list); // �ݹ��ȡ
				if (vi.haveEmpty()) { // ���Ϊ�յĻ�����ȡ��һ����ֱ����Ϊ�ջ����
					for (int j = 1; j < e.size() && (e.get(j).haveEmpty() || e.get(j).isVt()); j++) {
						vi = e.get(j);
						list.remove(new Vt("empty")); // ��ɾ���
						getFirst(vi, list);
					}
				}
			}
		}

	}

	/**
	 * ����ս����Ӧ��follow��
	 * @param v
	 * @param map �ս�����ս����follow��
	 */
	public void getFollow(V v, Map<V, ArrayList<V>> map) { // ���еķ��ս������map��
		ArrayList<ArrayList<V>> es = v.getExpression();// ��ȡ���б��ʽ
		for (int i = 0; i < es.size(); i++) {
			ArrayList<V> elist = es.get(i); // ��ȡÿһ�����ʽ
			for (int j = 0; j < elist.size(); j++) {
				if (!elist.get(j).isVt()) { // �����ȡ�ķ����Ƿ��ս��
					ArrayList<V> aList = map.get(elist.get(j));
					int t = j + 1;
					while (t <= elist.size()) { // ����к���
						if(t==elist.size()) {  //����������һ��
							if (!aList.contains(v) && !elist.get(t-1).equals(v))  //û��Ҫ���Լ����ȥ
								aList.add(v);
							break;
						}
						if (elist.get(t).isVt()) {
							if (!aList.contains(elist.get(t)))
								aList.add(elist.get(t));
						} else {
							addFirst(elist.get(t), aList);
						}

						if (elist.get(t).isVt() || !elist.get(t).haveEmpty()) // ��������Ƶ�Ϊ�գ������ս��
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
			for(int i=0;i<lArrayList.size();i++) {  //����follow��
				if(!lArrayList.get(i).isVt()) {  //����Ƿ��ս��
					ArrayList<V> viList=map.get(lArrayList.get(i));
					lArrayList.remove(lArrayList.get(i));
					for(int j=0;j<viList.size();j++) {
						if(!viList.get(j).equals(v))  //�����Լ��ӽ�ȥ�γ�ѭ��
							lArrayList.add(viList.get(j));
					}
				}
			}
		}
	}

}
