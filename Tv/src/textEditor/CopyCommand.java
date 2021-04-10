package textEditor;

public class CopyCommand implements Command {
    BoardScreen boradSvreen;
    
	public CopyCommand() {
		super();
		this.boradSvreen=new BoardScreen();
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
        this.boradSvreen.copy();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("undo cope");
	}

}
