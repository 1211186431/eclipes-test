package test;

public class Invoker {
	Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void OpenCommand() {
		command.openTv();
	}

	public void CloseCommand() {
		command.closeTv();
	}

	public void ChangeCommand(int num) {
		command.changeTv(num);
	}

}
