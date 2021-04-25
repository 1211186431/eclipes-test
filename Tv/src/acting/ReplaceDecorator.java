package acting;

public abstract class ReplaceDecorator extends ReplaceMan {
     ReplaceMan replaceMan;
	public ReplaceDecorator(ReplaceMan replaceMan) {
		super();
		this.replaceMan = replaceMan;
	}
     
}
