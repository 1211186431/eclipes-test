package textEditor;

public class PasteCommand implements Command {
	 BoardScreen boradSvreen;
	 public PasteCommand() {
			super();
			this.boradSvreen=new BoardScreen();
		}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
       this.boradSvreen.paste();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("undo paste");
	}

}
