package textEditor;

public class OpenCommand implements Command {
	 BoardScreen boradSvreen;
	 
	public OpenCommand() {
		super();
		this.boradSvreen=new BoardScreen();
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
       this.boradSvreen.open();
       this.boradSvreen.save("open");
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
         System.out.println("undo open");
         this.boradSvreen.save("undo open");
	}

}
