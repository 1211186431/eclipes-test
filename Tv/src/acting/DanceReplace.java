package acting;

public class DanceReplace extends ReplaceDecorator{
    
	public DanceReplace(ReplaceMan replaceMan) {
    	super(replaceMan);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String replaceSkill() {
		// TODO Auto-generated method stub
		return replaceMan.replaceSkill()+",ÌøÎè";
	}
         
}
