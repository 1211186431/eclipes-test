package acting;

import java.util.ArrayList;

public class Main {
    public static void main(String[] arg) {
    	ReplaceMan rA=new ReplaceA();   	
    	ReplaceMan rA1=new SongReplace(rA);
    	ReplaceMan rA2=new DanceReplace(rA1);//包装替身
    	
    	Agent agent=new Agent();
    	ReplaceAdapter rStar=new ReplaceAdapter(rA2); //替身适配
    	agent.contact("在电视中当配角");
    	agent.contact("在电影中当主演");
    	
    	ArrayList<Star> makeMovie=new ArrayList<Star>();
    	makeMovie.add(agent);
    	makeMovie.add(rStar);
    	
    	for(int i=0;i<makeMovie.size();i++)
    		makeMovie.get(i).action("拍电影");
    }
}
