package acting;

import java.util.ArrayList;

public class Main {
    public static void main(String[] arg) {
    	ReplaceMan rA=new ReplaceA();   	
    	ReplaceMan rA1=new SongReplace(rA);
    	ReplaceMan rA2=new DanceReplace(rA1);//��װ����
    	
    	Agent agent=new Agent();
    	ReplaceAdapter rStar=new ReplaceAdapter(rA2); //��������
    	agent.contact("�ڵ����е����");
    	agent.contact("�ڵ�Ӱ�е�����");
    	
    	ArrayList<Star> makeMovie=new ArrayList<Star>();
    	makeMovie.add(agent);
    	makeMovie.add(rStar);
    	
    	for(int i=0;i<makeMovie.size();i++)
    		makeMovie.get(i).action("�ĵ�Ӱ");
    }
}
