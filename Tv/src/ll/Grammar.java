package ll;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Grammar {
	public Grammar(String s) {
		// TODO Auto-generated constructor stub

	}
	// S->abc|bb

	public static void main(String[] arg) throws IOException {
		String s = "";
		ArrayList<String> list = new ArrayList<String>();
		File file = new File("D://file1.txt");
		Map<String, V> map = new HashMap<String, V>();
		BufferedInputStream bis = null;
		FileInputStream fis = null;
		fis = new FileInputStream(file);
		bis = new BufferedInputStream(fis);
		while (bis.available() > 0) {
			s = s + (char) bis.read();
		}
		fis.close();
		bis.close();
		String[] s2 = s.split("1");   //ÿһ����1�ָ�
		
		
		
		for (int j = 0; j < s2.length; j++) {
			String[] s3 = s2[j].split("->");
			list.add(s3[0]);
			if (!map.containsKey(s3[0]))
				map.put(s3[0], new Vn(s3[0])); // s[0]����ߵķ��ս��
			String[] s4 = s3[1].split(" ");
			ArrayList<ArrayList<V>> list3 = new ArrayList<ArrayList<V>>();
			for (int i = 0; i < s4.length; i++) { // ͬһ�����ս����ÿһ�����ʽ
				ArrayList<V> list2 = new ArrayList<V>(); // �洢һ�����ʽ
				for (int i2 = 0; i2 < s4[i].length(); i2++) { // �����������ʽ
					char c = s4[i].charAt(i2);// ���ַ�
					V v;
					if (!map.containsKey(c + "")) { // ���������
						if (c >= 'A' && c <= 'Z') {
							v = new Vn(c + "");
						} else {
							v = new Vt(c + "");
						}
						map.put(c + "", v);
					} else {
						v = map.get(c + ""); // ����֮���ȡ
					}
					list2.add(v);
				}
				list3.add(list2);
				System.out.println(s4[i]);
			}
			map.get(s3[0]).setExpression(list3);
		}
		
		System.out.println(map.toString());

	}
}
