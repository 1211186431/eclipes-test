package textEditor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Command openCommand=new OpenCommand();
		Command createCommand=new CreateCommand();
		Command copyCommand=new CopyCommand();
		Command pasteCommand=new PasteCommand();
        Menu fileMenu=new Menu();
        Menu editMenu=new Menu();
        fileMenu.setCommand(openCommand);
        fileMenu.startExecute();
        
        fileMenu.setCommand(createCommand);
        fileMenu.startExecute();
        fileMenu.updo();
        editMenu.setCommand(copyCommand);
        editMenu.startExecute();
        
        editMenu.setCommand(pasteCommand);
        editMenu.startExecute();
	}

}
