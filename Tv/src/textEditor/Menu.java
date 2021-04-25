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
    	 this.list.add(command);
    	 this.command=command;
     }
     public void startExecute() {
    	 for(int i=0;i<list.size();i++) {
    		 list.get(i).execute();
    	 } 	 
     }
     public void updo() {
    	 this.list.remove(this.list.size()-1).undo();
     }
	public LinkedList<Command> getList() {
		return list;
	}
     
}
