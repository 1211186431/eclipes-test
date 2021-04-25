package acting;

public class SongReplace extends ReplaceDecorator{
    
	public SongReplace(ReplaceMan replaceMan) {
    	super(replaceMan);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String replaceSkill() {
		// TODO Auto-generated method stub
		return replaceMan.replaceSkill()+",³ª¸è";
	}
         
}
