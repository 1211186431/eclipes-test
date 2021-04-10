package textEditor;

import java.util.ArrayList;
import java.util.LinkedList;

public class Menu {
     Command command;
     LinkedList<Command> list;
     public Menu() {
    	 list=new LinkedList<Command>();
     }
     public void setCommand(Command command) {
    	 this.command=command;
     }
     public void startExecute() {
    	 this.command.execute();
    	 this.list.add(command);
     }
     public void updo() {
    	 this.command.undo();
    	 this.list.remove();
     }
}
