package textEditor;

public class CreateCommand implements Command {
	 BoardScreen boradSvreen;
	 public CreateCommand() {
			super();
			this.boradSvreen=new BoardScreen();
		}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
      this.boradSvreen.create();
      this.boradSvreen.save("create");
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("undo create");
		this.boradSvreen.save("undo create");
	}

}
